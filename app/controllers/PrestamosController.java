package controllers;

import play.mvc.*;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

import models.*;

import java.util.List;
import java.util.Date;

public class PrestamosController extends Controller {

    public Result index() {
        List<Prestamo> prestamos = Prestamo.find.all();
        return ok( Json.toJson(prestamos) );
    }

    public Result create() {
        JsonNode json = request().body().asJson();

        Prestamo prestamo = new Prestamo();
        prestamo.student_id = json.findValue("student_id").bigIntegerValue();
        prestamo.bici_id = json.findValue("bici_id").bigIntegerValue();
        prestamo.solicitud =  json.findValue("solicitud").textValue();

        prestamo.save();

        return ok(Json.toJson(prestamo));
    }

    public Result show(Integer id) {
        Prestamo prestamo = Prestamo.find.byId(id);
        return ok( Json.toJson(prestamo) );
    }

    public Result update(Integer id) {
        return ok( "update" );
    }

    public Result destroy(Integer id) {
        return ok( "destroy" );
    }
}