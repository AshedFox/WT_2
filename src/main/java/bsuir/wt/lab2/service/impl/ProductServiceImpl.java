package bsuir.wt.lab2.service.impl;

import bsuir.wt.lab2.dao.DAOFactory;
import bsuir.wt.lab2.dao.ProductDAO;
import bsuir.wt.lab2.dao.exception.DAOException;
import bsuir.wt.lab2.entity.Product;
import bsuir.wt.lab2.entity.criteria.Criteria;
import bsuir.wt.lab2.service.ProductService;
import bsuir.wt.lab2.service.exception.ServiceException;
import bsuir.wt.lab2.service.validation.Validator;

import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> ReadList(Criteria criteria) throws ServiceException {
        if (criteria != null && !Validator.ValidateCriteria(criteria)) {
            return null;
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        ProductDAO productDAO = daoFactory.getProductDAO();

        try {
            return productDAO.ReadList(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Product FindCheapest(Criteria criteria) throws ServiceException {
        if (!Validator.ValidateCriteria(criteria)){
            return null;
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        ProductDAO productDAO = daoFactory.getProductDAO();

        try {
            return productDAO.FindCheapest(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
