package ru.mospolytech.abstractfactory.Patients;

public class SurgPatient implements Patient {
    public void create(){
        System.out.println("New patient of surgery");
    }
}
