package models;

import io.ebean.Model;
import io.ebean.Finder;

import java.math.BigInteger;
import javax.persistence.Id;
import javax.persistence.Entity;
import play.data.format.*;

@Entity
public class Prestamo extends Model {
    
    @Id
    public BigInteger id;
    public BigInteger student_id;
    public BigInteger bici_id;
    
    @Formats.DateTime(pattern="dd/MM/yyyy")
    public String solicitud;

    public static final Finder<Integer, Prestamo> find = new Finder<>(Prestamo.class);

}
