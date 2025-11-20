package edu.uc.cs3003.medava;

public class Jarvik implements Shippable {

    private String serialNumber;

    Jarvik(String deviceSerialNumber) {
        serialNumber = deviceSerialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String getMedicineName() {
        return "Jarvik Artificial Heart";
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }

    @Override
    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        if (30.0 <= lowTemperature && highTemperature <= 90.0) {
            return true;
        }
        return false;
    }
}
