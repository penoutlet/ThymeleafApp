package com.samjones.ThymeleafCrud.controllers;

import com.samjones.ThymeleafCrud.model.Product;
import com.samjones.ThymeleafCrud.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
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
    public String saveProduct(@Valid @ModelAttribute("product") Product p, BindingResult result){
        if(result.hasErrors()){
            return "createproduct";
        }
        service.save(p);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editProduct(@PathVariable("id") Long id){
        ModelAndView mav = new ModelAndView("editproduct");
        Product p = service.get(id);
        mav.addObject("product", p);

//        service.save(p);

        return mav;
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        service.delete(id);
        return "redirect:/";
    }

}
