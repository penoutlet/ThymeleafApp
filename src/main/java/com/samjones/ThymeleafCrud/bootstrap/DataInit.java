package com.samjones.ThymeleafCrud.bootstrap;

import com.samjones.ThymeleafCrud.model.Product;
import com.samjones.ThymeleafCrud.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {

    private final ProductService productService;

    public DataInit(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        Product p = new Product();
        p.setName("Code Gud Book");
        p.setBrand("CodeGud");
        p.setPrice(30F);

        productService.save(p);
    }
}
