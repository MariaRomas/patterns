package ru.mospolytech.abstractfactory;

import ru.mospolytech.abstractfactory.Doctors.Doctor;
import ru.mospolytech.abstractfactory.Factories.DepartamentFactory;
import ru.mospolytech.abstractfactory.Patients.Patient;
/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
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
