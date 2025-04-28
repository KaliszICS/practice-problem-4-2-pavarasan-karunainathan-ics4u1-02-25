/**
 * Definition of the Car class
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */
class Car{
    String make;
    String model;
    int year;
    double price;

    /**
     * Constructor of the Car class
     * @param _make The make of the car
     * @param _model The model of the car
     * @param _year The year of the car
     * @param _price The price of the car
     */
    public Car(String _make, String _model, int _year, double _price){
        make = _make;
        model = _model;
        year = _year;
        price = _price;
    }

    /**
     * Gets the make of the car
     * @return The make of the car
     */
    public String getMake(){return make;}
    
    /**
     * Gets the model of the car
     * @return The model of the car
     */
    public String getModel(){return model;}
    
    /**
     * Gets the year of the car
     * @return The year of the car
     */
    public int getYear(){return year;}
    
    /**
     * Gets the price of the car
     * @return The price of the car
     */
    public double getPrice(){return price;}

    /**
     * Sets the make of the Car
     * @param _make The make to be set
     */
    public void setMake(String _make){make = _make;}
    
    /**
     * Sets the model of the Car
     * @param _model The model to be set
     */
    public void setModel(String _model){model = _model;}
    
    /**
     * Sets the year of the Car
     * @param _year The year to be set
     */
    public void setYear(int _year){year = _year;}
    
    /**
     * Sets the price of the Car
     * @param _price The price to be set
     */
    public void setPrice(double _price){price = _price;}
    
}
