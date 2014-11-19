package controllers;

import mymodels.User;
import play.mvc.Controller;
import play.mvc.Result;

public class ModuleApplication extends Controller {

    public static Result index() {
        User user = new User();
        user.name = "1";
        user.test = "1";
        user.save("test");
        return ok("Done");
    }

}
