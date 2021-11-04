package bsuir.wt.lab2.entity;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products implements Serializable {

    @XmlElements({
            @XmlElement(name = "product", type = Product.class),
            @XmlElement(name = "oven", type = Oven.class),
            @XmlElement(name = "laptop", type = Laptop.class),
            @XmlElement(name = "refrigerator", type = Refrigerator.class),
            @XmlElement(name = "vacuumcleaner", type = VacuumCleaner.class),
            @XmlElement(name = "tabletpc", type = TabletPC.class),
            @XmlElement(name = "speakers", type = Speakers.class)
    })

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
