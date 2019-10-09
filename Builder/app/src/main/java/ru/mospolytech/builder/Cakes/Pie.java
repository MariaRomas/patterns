package ru.mospolytech.builder.Cakes;

public class Pie {
    private final int korzhes;
    private final TypeCream typeCream;
    private final Jam jam;
    private final Chocolate chocolate;
    private final Fruit fruit;
    public Pie(int korzhes, TypeCream typeCream, Jam jam, Chocolate chocolate, Fruit fruit){
        this.korzhes = korzhes;
        this.typeCream = typeCream;
        this.jam = jam;
        this.chocolate = chocolate;
        this.fruit = fruit;
    }
    public int getKorzhes(){
        return korzhes;
    }

    public TypeCream getTypeCream() {
        return typeCream;
    }

    public Jam getJam() {
        return jam;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public Fruit getFruit() {
        return fruit;
    }
}
