package ru.mospolytech.abstractfactory.Factories;

import ru.mospolytech.abstractfactory.Doctors.Doctor;
import ru.mospolytech.abstractfactory.Patients.Patient;

public interface DepartamentFactory {
    Doctor createDoctor();
    Patient createPatient();
}
