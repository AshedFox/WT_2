package bsuir.wt.lab2.dao.impl;

import bsuir.wt.lab2.dao.ProductDAO;
import bsuir.wt.lab2.dao.exception.DAOException;
import bsuir.wt.lab2.entity.Product;
import bsuir.wt.lab2.entity.Products;
import bsuir.wt.lab2.entity.criteria.Criteria;
import bsuir.wt.lab2.service.CriteriaMappingService;
import bsuir.wt.lab2.service.impl.CriteriaMappingServiceImpl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.*;

public class XmlProductDAO implements ProductDAO {


    @Override
    public List<Product> ReadList(Criteria criteria) throws DAOException {
        File file = new File("src/main/resources/example.xml");

        List<Product> result = new ArrayList<>();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Products productsXml = (Products) jaxbUnmarshaller.unmarshal(file);
            result = productsXml.getProducts();
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }

        if (criteria != null) {
            result.removeIf(product -> !product.getClass().getSimpleName().equals(criteria.getCategoryName()));

            Map<String, Object> critters = criteria.getCritters();
            CriteriaMappingService criteriaMappingService = new CriteriaMappingServiceImpl();

            var removeBuff = new ArrayList<Product>();
            for (Product product : result) {
                for (String key : critters.keySet()) {
                    var value = criteriaMappingService.getGetter(criteriaMappingService.getGetterName(key), product);
                    if (value == null || !value.equals(critters.get(key))) {
                        removeBuff.add(product);
                    }
                }
            }
            result.removeAll(removeBuff);
        }

        return result;
    }

    @Override
    public Product FindCheapest(Criteria criteria) throws DAOException {
        var products = ReadList(criteria);
        if (products.size() > 0) {
            products.sort(Comparator.comparingInt(Product::getPrice));
            return products.get(0);
        }
        else {
            return null;
        }
    }
}
