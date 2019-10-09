package ru.mospolytech.abstractfactory.Factories;

import ru.mospolytech.abstractfactory.Doctors.Doctor;
import ru.mospolytech.abstractfactory.Doctors.Surgeon;
import ru.mospolytech.abstractfactory.Patients.Patient;
import ru.mospolytech.abstractfactory.Patients.SurgPatient;

public class SurgFactory implements DepartamentFactory {

    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }

    @Override
    public Patient createPatient() {
        return new SurgPatient();
    }
}
