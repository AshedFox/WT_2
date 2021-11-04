package bsuir.wt.lab2.service.validation;

import bsuir.wt.lab2.entity.criteria.Criteria;
import bsuir.wt.lab2.entity.criteria.SearchCriteria;

import java.util.Map;

public class Validator {
    public static boolean ValidateCriteria(Criteria criteria) {
        if (criteria == null){
            return true;
        }

        var categoryName = criteria.getCategoryName();

        boolean result = ValidateProductCritters(criteria.getCritters());

        if (categoryName.equals(SearchCriteria.Oven.class.getSimpleName())){
            result = ValidateOvenCritters(criteria.getCritters());
        }
        else if (categoryName.equals(SearchCriteria.Laptop.class.getSimpleName())){
            result = ValidateLaptopCritters(criteria.getCritters());
        }
        else if (categoryName.equals(SearchCriteria.Refrigerator.class.getSimpleName())){
            result = ValidateRefrigeratorCritters(criteria.getCritters());
        }
        else if (categoryName.equals(SearchCriteria.VacuumCleaner.class.getSimpleName())){
            result = ValidateVacuumCleanerCritters(criteria.getCritters());
        }
        else if (categoryName.equals(SearchCriteria.TabletPC.class.getSimpleName())){
            result = ValidateTabletPCCritters(criteria.getCritters());
        }
        else if (categoryName.equals(SearchCriteria.Speakers.class.getSimpleName())){
            result = ValidateSpeakersCritters(criteria.getCritters());
        }
        else {
            result = false;
        }

        return result;
    }

    private static boolean ValidateProductCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();

            if (key.equals(SearchCriteria.Product.NAME.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Product.CATEGORY.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Product.PRICE.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean ValidateOvenCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();

            if (key.equals(SearchCriteria.Oven.CAPACITY.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Oven.DEPTH.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Oven.HEIGHT.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Oven.WEIGHT.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Oven.WIDTH.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean ValidateLaptopCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();

            if (key.equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Laptop.CPU.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Laptop.OS.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Laptop.DISPLAY_INCHES.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean ValidateRefrigeratorCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();
            
            if (key.equals(SearchCriteria.Refrigerator.HEIGHT.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Refrigerator.WEIGHT.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }            
            else if (key.equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Refrigerator.WIDTH.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean ValidateVacuumCleanerCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();

            if (key.equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
                if (!(value instanceof Boolean)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean ValidateTabletPCCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();

            if (key.equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.TabletPC.COLOR.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean ValidateSpeakersCritters(Map<String, Object> crittersMap) {
        for (var criteria: crittersMap.entrySet()) {
            var key = criteria.getKey();
            var value = criteria.getValue();

            if (key.equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
                if (!(value instanceof Integer)) {
                    return false;
                }
            }
            else if (key.equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
                if (!(value instanceof String)) {
                    return false;
                }
            }
        }

        return true;
    }
}