package org.blindustries;

import org.blindustries.controllers.ProductController;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@WebServlet
public class Dispatcher extends HttpServlet{
    private Map<String, Method> routeMappings = new HashMap<>();

    @Override
    public void init() {
        scanControllers();
    }

    private void scanControllers(){
        try{
            routeMappings.put("/products", ProductController.class.getMethod("listProducts",
                    HttpServeletRequest.class, HttpServeletResponse.class));
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
