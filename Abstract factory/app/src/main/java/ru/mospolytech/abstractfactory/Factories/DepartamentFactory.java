package ru.mospolytech.abstractfactory.Factories;

import ru.mospolytech.abstractfactory.Doctors.Doctor;
import ru.mospolytech.abstractfactory.Patients.Patient;
//Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
public interface DepartamentFactory {
    Doctor createDoctor();
    Patient createPatient();
}
