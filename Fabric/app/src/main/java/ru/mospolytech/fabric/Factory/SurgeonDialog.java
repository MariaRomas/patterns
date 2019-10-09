package ru.mospolytech.fabric.Factory;

import ru.mospolytech.fabric.Doctors.Doctor;
import ru.mospolytech.fabric.Doctors.Surgeon;
// Конкретные фабрики переопределяют фабричный метод и
// возвращают из него собственные продукты.
public class SurgeonDialog extends Dialog {
    @Override
    public Doctor createDoctor() {
        return new Surgeon();
    }
}
