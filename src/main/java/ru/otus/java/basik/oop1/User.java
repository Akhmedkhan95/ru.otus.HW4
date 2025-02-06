package ru.otus.java.basik.oop1;

public class User {
    public String surname;
    public String name;
    public String patronymic;
    public int birthYear;
    public String email;

    public User (String surname, String name, String patronymic, int BirthDate, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = BirthDate;
        this.email = email;
    }


    public void info() {
        System.out.println(( "ФИО: " + surname + " " + name + " " + patronymic + "\nГод рождения: "  + birthYear + "\nemail: " + email));
    }
}



