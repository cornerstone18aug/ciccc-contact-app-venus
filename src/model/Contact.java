package model;

/**
 * Created by katayama on 2018/10/26.
 */
public class Contact {
    private int id;
    private String userName;
    private String email;
    private String cellphone;
    private String address;

    public Contact(){}

    public Contact(int id, String userName, String email, String cellphone, String address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.cellphone = cellphone;
        this.address = address;
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
        return id+1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}