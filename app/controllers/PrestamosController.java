package controllers;

import java.util.List;
import java.util.Date;

import play.mvc.*;
import models.*;

public class PrestamosController extends Controller {

    public Result index() {
        List<Prestamo> ans = Prestamo.getAll();
        return ok( ans.toString() );
    }

    public Result create() {
        
        Prestamo p = new Prestamo();
        p.student_id = 12;
        p.bici_id = 34;
        p.solicitud = new Date();

        Prestamo.add(p);
        return ok( "create" );
    }

    public Result show(Integer id) {
        Prestamo ans = Prestamo.get(id);
        return ok( prestamoToString(ans) );
    }

    public Result update(Integer id) {
        return ok( "update" );
    }

    public Result destroy(Integer id) {
        Prestamo.delete(id);
        return ok( "destroy" );
    }

    private static String prestamoToString(Prestamo ans){
        if(ans != null)
            return ans.toCharacter();
        else
            return "{}";
    }
}