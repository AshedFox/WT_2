package bsuir.wt.lab2.service;

import bsuir.wt.lab2.service.impl.ProductServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ProductService productService = new ProductServiceImpl();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ProductService getProductService() {
        return productService;
    }
}
