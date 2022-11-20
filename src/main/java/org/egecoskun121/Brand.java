package org.egecoskun121;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter@Setter
public class Brand {

    private Long id;
    private String name;
    private List<Product> productList;

    public Brand(Long id, String name, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.productList = productList;
    }
}
