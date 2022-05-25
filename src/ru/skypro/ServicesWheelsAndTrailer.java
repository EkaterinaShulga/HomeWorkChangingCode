package ru.skypro;

public interface ServicesWheelsAndTrailer {

    public void updateTyre();

    public default void checkTrailer() {
        System.out.println("Проверяем прицеп.");
    }
}

