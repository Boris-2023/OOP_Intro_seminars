package Domen;

public class HotDrink extends Product {
    // Fields
    private int temperature;

    private int minTemp = 30;
    private int maxTemp = 80;

    private int tempDefault = (int) ((minTemp + maxTemp) / 2);
    private String byDefault = "";

    // constructors
    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);

        // check if the temperature goes beyond min/max bounds
        if (temperature > maxTemp) {
            temperature = maxTemp;
        } else if (temperature < minTemp) {
            temperature = minTemp;
        }
        this.temperature = temperature;
    }

    public HotDrink(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.temperature = tempDefault;
        byDefault = " (default)";
    }

    // methods
    /**
     * @return Temperature of the drink to dispense
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * allows to set the temperature for hot drink
     * 
     * @param temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "Temperature = " + temperature + byDefault + "\n";
    }

}
