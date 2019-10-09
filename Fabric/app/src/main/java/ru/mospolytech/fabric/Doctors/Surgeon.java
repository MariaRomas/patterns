package ru.mospolytech.fabric.Doctors;
//создание конкретного доктора
public class Surgeon implements Doctor {

    public void render() {

        System.out.println("<a>New surgeon</a>");
        onClick();
    }


    public void onClick() {
        System.out.println("You are the first");
    }
}
