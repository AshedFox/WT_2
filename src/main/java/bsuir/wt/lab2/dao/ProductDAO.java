package bsuir.wt.lab2.dao;

import bsuir.wt.lab2.dao.exception.DAOException;
import bsuir.wt.lab2.entity.Product;
import bsuir.wt.lab2.entity.criteria.Criteria;

import java.util.List;
import java.util.UUID;

public interface ProductDAO {
    List<Product> ReadList(Criteria criteria) throws DAOException;
    Product FindCheapest(Criteria criteria) throws DAOException;
}
