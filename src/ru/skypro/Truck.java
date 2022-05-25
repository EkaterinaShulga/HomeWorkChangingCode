package ru.skypro;

public class Truck extends TransportVehicle implements ServicesWheelsAndTrailer, ServicesEngine {

    private final int requiredWheelsСountTruck = 8;

    Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        if (getModelName() != null) {
            System.out.println("Обслуживаем грузовик -  " + getModelName() + ".");
        } else {
            System.out.println("Грузовик исправен, ремонт не требуется.");
        }
    }

    public void updateTyre() {
        if (getModelName() != null && getWheelsCount() < requiredWheelsСountTruck) {
            System.out.println("Меняем покрышку грузовика - " + getModelName() + ".");
        } else if (getModelName() == null) {
            System.out.println("Колеса рузовика исправны, замена не требуется.");
        } else if (getModelName() != null && getWheelsCount() > requiredWheelsСountTruck) {
            System.out.println("К нам приехал рузовик не стандартной комплектации.");
        }
    }


    public void checkEngine() {
        if (getModelName() != null) {
            System.out.println("Проверяем двигатель грузовика - " + getModelName() + ".");
        }
    }

}

