package ru.mospolytech.builder.Builders;

import ru.mospolytech.builder.Cakes.Chocolate;
import ru.mospolytech.builder.Cakes.Fruit;
import ru.mospolytech.builder.Cakes.Pie;
import ru.mospolytech.builder.Cakes.Jam;
import ru.mospolytech.builder.Cakes.TypeCream;

public class PieBuilder implements Builder {
    private int korzhes;
    private TypeCream typeCream;
    private Jam jam;
    private Chocolate chocolate;
    private Fruit fruit;

    @Override
    public void setKorzhes(int korzhes) {
        this.korzhes = korzhes;
    }

    @Override
    public void setTypeCream(TypeCream typeCream) {
        this.typeCream = typeCream;
    }

    @Override
    public void setJam(Jam jam) {
        this.jam = jam;

    }

    @Override
    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;

    }

    @Override
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    public Pie getResult(){
        return new Pie(korzhes, typeCream, jam, chocolate, fruit);
    }
}
