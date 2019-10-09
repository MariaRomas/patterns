package ru.mospolytech.adapter.Small;

public class SmallHole {
    private int length;
    public SmallHole(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public boolean fits (SmallDoor door){
        boolean result;
        result = (this.getLength() >= door.getLength());
        return result;
    }
}
