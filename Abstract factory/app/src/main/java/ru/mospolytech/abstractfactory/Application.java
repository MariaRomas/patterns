package ru.mospolytech.abstractfactory;

import ru.mospolytech.abstractfactory.Doctors.Doctor;
import ru.mospolytech.abstractfactory.Factories.DepartamentFactory;
import ru.mospolytech.abstractfactory.Patients.Patient;

public class Application {
    private Doctor doctor;
    private Patient patient;
    public Application(DepartamentFactory factory){
        doctor = factory.createDoctor();
        patient = factory.createPatient();
    }
    public void create(){
        doctor.create();
        patient.create();
    }
}
