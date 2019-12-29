package com.samjones.ThymeleafCrud.controllers;

import com.samjones.ThymeleafCrud.model.Product;
import com.samjones.ThymeleafCrud.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping({"","/","/index","/products"})
    public String seeHomePage(Model model){
        List<Product> listOfProducts = service.listAll();
        model.addAttribute("products", listOfProducts);
        return "index";
    }

    @GetMapping("/new")
    public String showNewProductForm(Model model){
        Product p = new Product();
        model.addAttribute("product", p);
        return "createproduct";
    }

        @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product p){
        service.save(p);

        return "redirect:/";
    }

}
