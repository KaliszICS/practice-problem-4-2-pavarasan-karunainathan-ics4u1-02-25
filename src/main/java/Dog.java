/**
 * Definition of the D.A.W.G Class (Directed Acyclic Weighted Graph)
 * @author Pavarasan Karunainathan
 * @version 0.0.0
 */

class Dog{
    static String name;
    static String breed;
    static int weight;

    /**
     * Constructor of class Dog
     * @param _name Name of the Dog
     * @param _breed Breed of the Dog
     * @param _weight Weight of the Dog
     */
    public Dog(String _name, String _breed, int _weight){
        name = _name;
        breed = _breed;
        weight = _weight;
    }

    /**
     * Gets the name of the Dog
     * @return The name of the Dog
     */
    static String getName(){return name;}
    
    /**
     * Gets the breed of the Dog
     * @return The breed of the Dog
     */
    static String getBreed(){return breed;}
    
    /**
     * Gets the weight of the Dog
     * @return The weight of the Dog
     */
    static int getWeight(){return weight;}
    

    /**
     * Sets the name of the Dog
     * @param _name The name to be set
     */
    public static void setName(String _name){name = _name;}
    
    /**
     * Sets the breed of the Dog
     * @param _breed The breed to be set
     */
    public static void setBreed(String _breed){breed = _breed;}
    
    /**
     * Sets the weight of the Dog
     * @param _weight The weight to be set
     */
    public static void setWeight(int _weight){weight = _weight;}
}