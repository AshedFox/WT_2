package bsuir.wt.lab2.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
    private final String categoryName;
    private final Map<String, Object> critters = new HashMap<>();

    public Criteria(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void add(String searchCriteria, Object value) {
        critters.put(searchCriteria, value);
    }

    public Map<String, Object> getCritters() {
        return critters;
    }
}
