package controllers;

import com.avaje.ebean.EbeanServer;
import models.User;
import play.mvc.Controller;
import play.mvc.Result;

public class ModuleApplication extends Controller {

    private static EbeanServer server;

    public static Result index() {
        User user = new User();
        user.name = "1";
        user.test = "1";
        user.save("test");
        int size = User.find.all().size();
        return ok(String.valueOf(size));
    }

    public static void onStart(){
        /*
        System.out.println("1 - START!!!!");

        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriver("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/module2?characterEncoding=UTF-8");
        dsc.setUsername("root");
        dsc.setPassword("");

        System.out.println("2 - START!!!!");

        ServerConfig c = new ServerConfig();
        c.setName("test");
        c.setDataSourceConfig(dsc);

        // read the ebean.properties and load
        // those settings into this serverConfig object
        //c.loadFromProperties();

        // generate DDL and run it
        //c.setDdlGenerate(true);
        //c.setDdlRun(true);

        // add any classes found in the app.data package


        // add the names of Jars that contain entities
        c.addJar("testmodule/testmodule_2.10/1.0-SNAPSHOT/jars/testmodule_2.10.jar");
        c.addPackage("mymodels");

        System.out.println("3 - START!!!!");

        server = EbeanServerFactory.create(c);

        System.out.println("FINISH!!!!");
*/
    }

}
