/**
 * Definition of the D.A.W.G Class (Directed Acyclic Word Graph)
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */

class Dog{
    String name;
    String breed;
    int weight;

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
    public String getName(){return name;}
    
    /**
     * Gets the breed of the Dog
     * @return The breed of the Dog
     */
    public String getBreed(){return breed;}
    
    /**
     * Gets the weight of the Dog
     * @return The weight of the Dog
     */
    public int getWeight(){return weight;}
    

    /**
     * Sets the name of the Dog
     * @param _name The name to be set
     */
    public void setName(String _name){name = _name;}
    
    /**
     * Sets the breed of the Dog
     * @param _breed The breed to be set
     */
    public void setBreed(String _breed){breed = _breed;}
    
    /**
     * Sets the weight of the Dog
     * @param _weight The weight to be set
     */
    public void setWeight(int _weight){weight = _weight;}
}
