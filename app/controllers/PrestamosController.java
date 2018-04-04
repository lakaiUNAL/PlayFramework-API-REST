package controllers;

import play.mvc.*;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;

import models.*;
import io.ebean.Model;

import java.util.List;
import java.util.HashMap;
import java.util.Date;

import java.math.BigInteger;

public class PrestamosController extends Controller {

    public Result index() {
        List<Prestamo> prestamos = Prestamo.find.all();
        return ok( Json.toJson(prestamos) );
    }

    public Result create() {
        Prestamo prestamo = new Prestamo();

        getRequests(prestamo);

        if(!prestamoValido(prestamo))
            return status(406, Json.toJson(ErrorResponse.NOT_ACCEPTABLE) );

        prestamo.save();

        return ok(Json.toJson(prestamo));
    }
    
    public Result show(Integer id) {
        Prestamo prestamo = Prestamo.find.byId(id);
        
        if(prestamo == null)
            return notFound( Json.toJson(ErrorResponse.NOT_FOUND) );

        return ok( Json.toJson(prestamo) );
    }
    
    public Result update(Integer id) {
        Prestamo prestamo = Prestamo.find.byId(id);
        
        if(prestamo == null)
            return notFound( Json.toJson(ErrorResponse.NOT_FOUND) );

        getRequests(prestamo).update();

        if(!prestamoValido(prestamo))
            return status(406, Json.toJson(ErrorResponse.NOT_ACCEPTABLE) );

        return ok();
    }

    public Result destroy(Integer id) {
        Prestamo.find.deleteById(id);
        return ok();
    }

    private Prestamo getRequests(Prestamo prestamo) {
        JsonNode json = request().body().asJson();
        
        if(json.has("student_id"))
            prestamo.setStudentId( json.findValue("student_id").bigIntegerValue() );
        if(json.has("bici_id"))
            prestamo.setBiciId( json.findValue("bici_id").bigIntegerValue() );
        if(json.has("solicitud"))
            prestamo.setSolicitud ( json.findValue("solicitud").textValue() );

        return prestamo;
    }

    private boolean prestamoValido(Prestamo prestamo){
        if(prestamo.student_id == null 
            || prestamo.student_id.signum() < 1 )
            return false;

        if(prestamo.bici_id == null 
            || prestamo.bici_id.signum() < 1 )
            return false;

        return true;
    }
}