package com.example.deeprecorderrebirth.controller;

import com.example.deeprecorderrebirth.entity.Product;
import com.example.deeprecorderrebirth.models.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller

public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/listProduct")
    public String list(Model model){
        model.addAttribute("name", "List product");
        model.addAttribute("product", productService.findAll());
        return "listProduct";

    }

    @GetMapping(value = "/createProduct")
    public String addProduct(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("title","Create product");
        return "createProduct";

    }
    @PostMapping(value = "/createProduct")
    public String saveProduct(@Valid Product product, BindingResult result, Model model){
        if (result.hasErrors()){
            return "createProduct";
        }
        productService.save(product);
        return "redirect:/listProduct";
    }
}
