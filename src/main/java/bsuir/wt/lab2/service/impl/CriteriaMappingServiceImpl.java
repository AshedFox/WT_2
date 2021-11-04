package bsuir.wt.lab2.service.impl;

import bsuir.wt.lab2.entity.Product;
import bsuir.wt.lab2.entity.criteria.Criteria;
import bsuir.wt.lab2.service.CriteriaMappingService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CriteriaMappingServiceImpl implements CriteriaMappingService {
    @Override
    public String getGetterName(String name) {
        StringBuilder result = new StringBuilder("get" + name.substring(0, 1).toUpperCase());

        for (int i = 1; i < name.length(); i++){
            if (name.charAt(i) == '_') {
                i++;
                result.append(name.charAt(i));
            }
            else {
                result.append(Character.toLowerCase(name.charAt(i)));
            }
        }

        return result.toString();
    }

    @Override
    public Object getGetter(String name, Product product) {
        try {
            return product.getClass().getDeclaredMethod(name).invoke(product);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
