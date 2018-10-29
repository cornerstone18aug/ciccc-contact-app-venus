package model;

/**
 * Created by katayama on 2018/10/26.
 */
public class Contact {
    private int id;
    private String userName;
    private String email;

    public Contact(){}

    public Contact(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
