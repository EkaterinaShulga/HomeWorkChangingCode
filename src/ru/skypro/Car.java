package ru.skypro;

public class Car extends TransportVehicle implements ServicesWheelsAndTrailer, ServicesEngine {

    private final int requiredWheelsСountCar = 4;


    Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        if (getModelName() != null) {
            System.out.println("Обслуживаем машину -  " + getModelName() + ".");
        } else {
            System.out.println("Машина исправна, ремонт не требуется.");
        }

    }

    public void updateTyre() {
        if (getModelName() != null && getWheelsCount() < requiredWheelsСountCar) {
            System.out.println("Меняем покрышку автомобиля - " + getModelName() + ".");
        } else if (getModelName() == null) {
            System.out.println("Колеса машины исправны, замена не требуется.");
        } else if (getModelName() != null && getWheelsCount() > requiredWheelsСountCar) {
            System.out.println("К нам приехал автомобиль не стандартной комплектации.");
        }
    }

    public void checkEngine() {
        if (getModelName() != null) {
            System.out.println("Проверяем двигатель машины - " + getModelName() + ".");
        } else {
            System.out.println("Машина исправна, ремонт не требуется.");
        }

    }
}

