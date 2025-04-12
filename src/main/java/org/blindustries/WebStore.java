package org.blindustries;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.blindustries.dispatcher.Dispatcher;

import java.io.File;

public class WebStore {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9000);
        tomcat.getConnector();

        Context context = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());

//        Tomcat.addServlet(context,"Store", new Dispatcher());
//        context.addServletMappingDecoded("/store","Store");


        tomcat.start();
        tomcat.getServer().await();
    }
}
