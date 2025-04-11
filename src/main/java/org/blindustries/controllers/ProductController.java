package org.blindustries.controllers;

import org.blindustries.dtos.Product;
import org.blindustries.service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService productService = new ProductService();

    public ModelAndView listProducts(HttpServletRequest req, HttpServletResponse res) {
        List<Product> products = productService.getAllProducts();
        ModelAndView mv = new ModelAndView("products");
        mv.addObject("products", products);
        return mv;
    }
}
