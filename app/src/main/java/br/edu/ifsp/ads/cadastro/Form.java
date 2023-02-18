package br.edu.ifsp.ads.cadastro;

import androidx.annotation.NonNull;

public class Form {
    private final String fullName;
    private final String phone;
    private final String mail;
    private final Boolean receiveMail;
    private final String sex;
    private final String city;
    private final String estate;

    public Form(String fullName, String phone, String mail, Boolean receiveMail, String sex, String city, String estate) {
        this.fullName = fullName;
        this.phone = phone;
        this.mail = mail;
        this.receiveMail = receiveMail;
        this.sex = sex;
        this.city = city;
        this.estate = estate;
    }

    @NonNull
    @Override
    public String toString() {
        return "FORMULÁRIO \n" +
                "Nome completo: " + fullName + ",\n" +
                "Telefone: " + phone + ",\n" +
                "E-mail: " + mail + ",\n" +
                "Está na lista de e-mails: " + (receiveMail ? "Sim" : "Não") + ",\n" +
                "Sexo: " + sex + ",\n" +
                "Cidade: " + city + ",\n" +
                "Estado: " + estate + ",\n";
    }
}
