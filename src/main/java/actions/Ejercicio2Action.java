package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Carlos Coves Prieto on 11/23/14.
 */
public class Ejercicio2Action extends ActionSupport {

    private String nombre;
    private String age;

    public String execute() {
            return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
