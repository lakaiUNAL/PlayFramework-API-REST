package models;

import java.util.Date;

import io.ebean.Model;
import io.ebean.Finder;

import javax.persistence.Id;
import javax.persistence.Entity;
import play.data.format.*;

@Entity
public class Prestamo extends Model {
    
    @Id
    public int id;
    public int student_id;
    public int bici_id;
    
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date solicitud;

    public static final Finder<Integer, Prestamo> find = new Finder<>(Prestamo.class);

}
