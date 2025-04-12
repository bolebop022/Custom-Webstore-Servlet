package org.blindustries.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.blindustries.models.Product;
import org.blindustries.service.ProductService;


import java.util.List;

public class ProductController {
    private ProductService productService = new ProductService();

    public String listProducts(HttpServletRequest req, HttpServletResponse res) {
        List<Product> products = productService.getAllProducts();
        req.setAttribute("products", products);
        return "products";
    }
}
