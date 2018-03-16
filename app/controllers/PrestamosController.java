package controllers;

import play.mvc.*;
import models.*;

public class PrestamosController extends Controller {

    public Result index() {
        return ok( "getAll" );
    }

    public Result create() {
        return ok( "create" );
    }

    public Result show(Integer id) {
        return ok( "show " + id );
    }

    public Result update(Integer id) {
        return ok( "update" );
    }

    public Result destroy(Integer id) {
        return ok( "destroy" );
    }
}