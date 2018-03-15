package models;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;

public class Prestamo {
    
    public int id;
    public int student_id;
    public int bici_id;
    public Date solicitud;

    private static int current = 1;
    private static TreeMap<Integer, Prestamo> prestamos = new TreeMap<Integer, Prestamo>();

    public String toCharacter() {
        String ans = "{" + 
            "\"id\": " + this.id + "," +
            "\"student_id\": " + this.student_id + ',' +
            "\"bici_id\": " + this.bici_id + ',' +
            "\"solicitud\": \"" + this.solicitud + "\"}";
        return ans;
    }

    public static List<Prestamo> getAll(){
        List<Prestamo> ans = new ArrayList<Prestamo>();
        ans.addAll(0,prestamos.values());
        return ans;
    }

    public static void add(Prestamo p){
        p.id = Prestamo.current ++;
        prestamos.put(p.id, p);
    }

    public static Prestamo get(int i){
        return prestamos.get(i);
    }

    public static void delete(int i){
        prestamos.remove(i);
    }

    public static boolean edit(Prestamo p){
        if( prestamos.containsKey(p.id) ){
            prestamos.put(p.id, p);
            return true;
        } else 
            return false;
    }
}
