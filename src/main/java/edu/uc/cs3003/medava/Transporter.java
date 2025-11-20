package edu.uc.cs3003.medava;

import java.util.List;
import java.util.ArrayList;

public class Transporter {

    private String mTransporterName;
    private double mLowTemperature, mHighTemperature;

    private List<Shippable> goods;

    {
        goods = new ArrayList<Shippable>();
    }

    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    public String getTransporterName() {
        return mTransporterName;
    }

    public boolean isEmpty() {
        return goods.isEmpty();
    }

    public Shippable unload() {
        return goods.remove(0);
    }

    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(
                Double.valueOf(mLowTemperature),
                Double.valueOf(mHighTemperature))) {
            return goods.add(itemToLoad);
        }
        return false;
    }

    public void ship() {
        // no-op for this simulation
    }
}
