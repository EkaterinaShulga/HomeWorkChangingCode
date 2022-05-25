package ru.skypro;

public abstract class  TransportVehicle implements Services {

    private String modelName;
    private int wheelsCount;

    TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    public abstract void check();
}



