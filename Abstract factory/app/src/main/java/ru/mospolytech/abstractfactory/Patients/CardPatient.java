package ru.mospolytech.abstractfactory.Patients;

public class CardPatient implements Patient {
    public void create(){
        System.out.println("New patient of cardiology");
    }
}
