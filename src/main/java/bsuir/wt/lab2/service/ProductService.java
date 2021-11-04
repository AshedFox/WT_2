package bsuir.wt.lab2.service;

import bsuir.wt.lab2.entity.Product;
import bsuir.wt.lab2.entity.criteria.Criteria;
import bsuir.wt.lab2.service.exception.ServiceException;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<Product> ReadList(Criteria criteria) throws ServiceException;
    Product FindCheapest(Criteria criteria) throws ServiceException;
}
