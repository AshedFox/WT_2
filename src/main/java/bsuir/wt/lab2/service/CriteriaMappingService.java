package bsuir.wt.lab2.service;

import bsuir.wt.lab2.entity.Product;
import bsuir.wt.lab2.entity.criteria.Criteria;

import java.lang.reflect.Method;

public interface CriteriaMappingService {
    String getGetterName(String name);
    Object getGetter(String name, Product product);
}
