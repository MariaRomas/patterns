package ru.mospolytech.adapter.Adapters;

import ru.mospolytech.adapter.Big.BigDoor;
import ru.mospolytech.adapter.Small.SmallDoor;

public class Adapter extends SmallDoor {
    private BigDoor bigDoor;
    public Adapter (BigDoor bigDoor){
        this.bigDoor = bigDoor;
    }
    @Override
    public int getLength(){
        int result;
        result = bigDoor.getLength()/3;
        return result;
    }
}
