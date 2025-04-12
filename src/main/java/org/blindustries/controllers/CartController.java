package org.blindustries.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.blindustries.service.CartService;

import java.util.List;

public class CartController {
    private CartService cart = new CartService();
    public String viewCart(HttpServletRequest req, HttpServletResponse res){

        return "items";
    }
}
