package actions;

import com.opensymphony.xwork2.ActionSupport;

import java.util.*;

/**
 * Created by Carlos Coves Prieto on 11/23/14.
 */
public class Ejercicio2Action extends ActionSupport {

    static final String ID = "usuario";
    static final String PASS = "password";

    private String userId;
    private String password;
    private String name;
    private String sex;
    private int age;
    private Date birthday;
    private String email;
    private String phone;
    private String url;
    private String presentation;
    private boolean wireFan;
    private String saga;
    private Map<String,String> sagas;
    private Map<String,String> subSagas;
    private Map<String,String> sexes;

    public Ejercicio2Action() {
        this.sagas = new LinkedHashMap<>();
        this.sagas.put("SW", "Star Wars");
        this.sagas.put("E", "Ender");
        this.sagas.put("LotR", "Lord of the Rings");
        this.sagas.put("T", "Terminator");

        this.subSagas = new LinkedHashMap<>();
        this.subSagas.put("C", "Crepusculo");
        this.subSagas.put("LJH", "Los Juegos del Hambre");
        this.subSagas.put("ECL", "El Corredor del Laberinto");

        this.sexes = new LinkedHashMap<>();
        this.sexes.put("M", "Man");
        this.sexes.put("W", "Woman");
    }

    public String init() throws Exception {
        return "success";
    }

    public String agregar() {
        if (ID.equals(userId) && PASS.equals(password)) {
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

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public boolean isWireFan() {
        return wireFan;
    }

    public void setWireFan(boolean wireFan) {
        this.wireFan = wireFan;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public Map<String,String> getSagas() {
        return sagas;
    }

    public void setSagas(Map<String,String> sagas) {
        this.sagas = sagas;
    }

    public String getDefaultSagas() {
        return "T";
    }

    public Map<String, String> getSubSagas() {
        return subSagas;
    }

    public void setSubSagas(Map<String, String> subSagas) {
        this.subSagas = subSagas;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<String, String> getSexes() {
        return sexes;
    }

    public void setSexes(Map<String, String> sexes) {
        this.sexes = sexes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
