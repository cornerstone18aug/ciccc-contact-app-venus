package model;

/**
 * Created by katayama on 2018/10/26.
 */
public class Contact {
    private String userName;
    private String email;

    public Contact(){}

    public Contact(String userName, String email) {
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
}
