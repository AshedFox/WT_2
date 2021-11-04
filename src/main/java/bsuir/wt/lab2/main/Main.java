package bsuir.wt.lab2.main;

import bsuir.wt.lab2.entity.Speakers;
import bsuir.wt.lab2.entity.criteria.Criteria;
import bsuir.wt.lab2.entity.criteria.SearchCriteria;
import bsuir.wt.lab2.service.ServiceFactory;
import bsuir.wt.lab2.service.exception.ServiceException;

public class Main {
    public static void main(String[] args) {
        var productService = ServiceFactory.getInstance().getProductService();

        Criteria criteria = new Criteria(Speakers.class.getSimpleName());
        criteria.add(SearchCriteria.Speakers.CORD_LENGTH.toString(), 2);

        try {
            var products = productService.ReadList(criteria);
            System.out.println(products);

            var cheapest = productService.FindCheapest(null);
            System.out.println(cheapest);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
