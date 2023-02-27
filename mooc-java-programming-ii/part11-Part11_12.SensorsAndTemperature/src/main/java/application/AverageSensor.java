package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors = new ArrayList<>();
    private final List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() { // returns all executed readings
        return this.readings;
    }
    @Override
    public boolean isOn() {
        boolean allOn = true;
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                allOn = false;
            }
        }
        return allOn;
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("There are no sensors or they are turned off!");
        }
        double average = sensors.stream().mapToInt(Sensor::read).average()
                .orElseThrow(() -> new IllegalStateException("There are no sensors or they are turned off!"));
        int roundedAverage = (int) Math.floor(average);
        readings.add(roundedAverage);
        return roundedAverage;
    }
}
