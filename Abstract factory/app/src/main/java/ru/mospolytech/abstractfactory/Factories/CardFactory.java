package ru.mospolytech.abstractfactory.Factories;

import ru.mospolytech.abstractfactory.Doctors.Cardiologist;
import ru.mospolytech.abstractfactory.Doctors.Doctor;
import ru.mospolytech.abstractfactory.Patients.CardPatient;
import ru.mospolytech.abstractfactory.Patients.Patient;

public class CardFactory implements DepartamentFactory {
    @Override
    public Doctor createDoctor() {
        return new Cardiologist();
    }

    @Override
    public Patient createPatient() {
        return new CardPatient();
    }
}
