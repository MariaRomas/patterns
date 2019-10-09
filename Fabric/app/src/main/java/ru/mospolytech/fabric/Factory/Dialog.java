package ru.mospolytech.fabric.Factory;

import ru.mospolytech.fabric.Doctors.Doctor;
//базовыйй класс фабрики
public abstract class Dialog {
    public void renderDoctor(){
        Doctor okDoctor = createDoctor();
        okDoctor.render();
    }
    public abstract Doctor createDoctor();
}
