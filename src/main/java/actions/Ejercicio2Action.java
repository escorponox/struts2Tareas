package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Carlos Coves Prieto on 11/23/14.
 */
public class Ejercicio2Action extends ActionSupport {

    static final String id = "usuario";
    static final String pass = "password";

    private String userId;
    private String password;
    private String name;
    private int age;

    public String agregar() {
        if (id.equals(userId) && pass.equals(password)) {
            return SUCCESS;
        } else {
            addActionError("User and password Error");
            return INPUT;
        }
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
