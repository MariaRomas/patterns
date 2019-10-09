package ru.mospolytech.fabric.Doctors;
//создание конкретного доктора
public class Cardiologist implements Doctor {
    public void render() {

        System.out.println("<a>New cardiologist</a>");
        onClick();
    }


    public void onClick() {
        System.out.println("Your heart is mine");
    }
}
