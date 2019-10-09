package ru.mospolytech.builder.Builders;

import java.lang.reflect.Type;
/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setKorzhes (int korzhes);
    void setTypeCream(TypeCream typeCream);
    void setJam(Jam jam);
    void setChocolate(Chocolate chocolate);
    void setFruit(Fruit fruit);

}
