package controllers;

import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

import models.*;

import java.util.List;

public class PrestamosController extends Controller {

    public Result index() {
        List<Prestamo> prestamos = Prestamo.find.all();
        return ok( Json.toJson(prestamos) );
    }

    public Result create() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").textValue();
        if(name == null) {
            return badRequest("Missing parameter [name]");
        } else {
            return ok("Hello " + name);
        }
        // return ok( "create" );
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