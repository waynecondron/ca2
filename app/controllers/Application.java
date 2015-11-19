package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Application extends Controller {


    public static Result index() {

        return ok(index.render());
    }

    public static Result join() {

        return ok(join.render());
    }

    public static Result classes() {

        return ok(classes.render());
    }

    public static Result gallery() {

        return ok(gallery.render());
    }

    public static Result about() {

        return ok(about.render());
    }

}
