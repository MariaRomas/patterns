package ru.mospolytech.builder.Director;

import ru.mospolytech.builder.Builders.Builder;
import ru.mospolytech.builder.Cakes.Chocolate;
import ru.mospolytech.builder.Cakes.Fruit;
import ru.mospolytech.builder.Cakes.Jam;
import ru.mospolytech.builder.Cakes.TypeCream;

/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
public class Director {
    public void constructChocolateCake(Builder builder){
        builder.setChocolate(Chocolate.YES);
        builder.setKorzhes(2);
        builder.setFruit(Fruit.NO);
        builder.setJam(Jam.NO);
        builder.setTypeCream(TypeCream.PROTEIN_CREAM);
    }
    public void constructFruitCake(Builder builder){
        builder.setChocolate(Chocolate.NO);
        builder.setKorzhes(3);
        builder.setFruit(Fruit.YES);
        builder.setJam(Jam.YES);
        builder.setTypeCream(TypeCream.BUTTER_CREAM);
    }
    public void constructPie(Builder builder){
        builder.setChocolate(Chocolate.NO);
        builder.setKorzhes(1);
        builder.setFruit(Fruit.YES);
        builder.setJam(Jam.YES);
        builder.setTypeCream(TypeCream.PROTEIN_CREAM);
    }

}
