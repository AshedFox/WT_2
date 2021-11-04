package bsuir.wt.lab2.dao;

import bsuir.wt.lab2.dao.impl.XmlProductDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final ProductDAO productDAO = new XmlProductDAO();

    public static DAOFactory getInstance() {
        return instance;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }
}
