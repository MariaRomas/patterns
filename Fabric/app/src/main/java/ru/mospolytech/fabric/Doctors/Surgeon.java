package ru.mospolytech.fabric.Doctors;
//создание конкретного доктора
public class Surgeon implements Doctor {

    public void render() {

        System.out.println("New surgeon");
        onClick();
    }


    public void onClick() {
        System.out.println("You are the first");
    }
}
