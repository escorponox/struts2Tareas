package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Carlos Coves Prieto on 11/23/14.
 */
public class Ejercicio2Action extends ActionSupport {

	private String name;
	private int age;

	public String agregar() {
			return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
