package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Carlos Coves Prieto on 11/23/14.
 */
public class Ejercicio2Action extends ActionSupport {

	private String nombre;
	private int age;

	public String agregar() {
		if ("".equals(this.nombre)) {
			return INPUT;
		}
		else {
			return SUCCESS;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
