package com.co.sena.models;

public class DatesBuy {
    private String name;
    private String surname;
    private String zip_code;

    public DatesBuy(String name, String surname, String zip_code) {
        this.name = name;
        this.surname = surname;
        this.zip_code = zip_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}
