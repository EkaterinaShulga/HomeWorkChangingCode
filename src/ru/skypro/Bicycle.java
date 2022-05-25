package ru.skypro;

public class Bicycle extends TransportVehicle implements ServicesWheelsAndTrailer {

    private final int requiredWheelsСountBicycle = 2;

    Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void check() {
        if (getModelName() != null) {
            System.out.println("Обслуживаем велосипед -  " + getModelName() + ".");
        } else {
            System.out.println("Велосипед исправен, ремонт не требуется.");
        }

    }

    public void updateTyre() {
        if (getModelName() != null && getWheelsCount() < requiredWheelsСountBicycle) {
            System.out.println("Меняем покрышку велосипеда - " + getModelName() + ".");
        } else if (getModelName() == null) {
            System.out.println("Колеса велосипеда исправны, замена не требуется.");
        } else if (getModelName() != null && getWheelsCount() > requiredWheelsСountBicycle) {
            System.out.println("К нам приехал велосипед не стандартной комплектации.");
        }
    }
}
