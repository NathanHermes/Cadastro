package br.edu.ifsp.ads.cadastro;

public class Formulario {
    private String fullName;
    private String phone;
    private String mail;
    private Boolean receiveMail;
    private String sex;
    private String city;
    private String uf;

    public Formulario(String fullName, String phone, String mail, Boolean receiveMail, String sex, String city, String uf) {
        this.fullName = fullName;
        this.phone = phone;
        this.mail = mail;
        this.receiveMail = receiveMail;
        this.sex = sex;
        this.city = city;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", receiveMail=" + receiveMail +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
