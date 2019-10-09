package ru.mospolytech.fabric.Doctors;
//создание конкретного доктора
public class Cardiologist implements Doctor {
    public void render() {

        System.out.println("New cardiologist");
        onClick();
    }


    public void onClick() {
        System.out.println("Your heart is mine");
    }
}
