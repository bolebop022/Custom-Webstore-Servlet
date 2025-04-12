package org.blindustries.dispatcher;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.blindustries.controllers.ProductController;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@WebServlet
public class Dispatcher extends HttpServlet {
    private Map<String, Method> routeMappings = new HashMap<>();

    @Override
    public void init() {
        scanControllers();
    }

    private void scanControllers(){
        try{
            routeMappings.put("/products", ProductController.class.getMethod("listProducts",
                    HttpServletRequest.class, HttpServletResponse.class));
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
