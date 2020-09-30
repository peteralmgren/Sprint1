package Sprint1;

/**
 * Created by Peter Almgren
 * Date: 2020-09-30
 * Time: 08:16
 * Project: ObjectorientedJava
 * Copyright: MIT
 */
public class Animals implements Food{

    //Skapar Enum konstanter
    public enum animalFood {
        HUNDFODER("Hundmat"),
        KATTFODER("Kattmat"),
        ORMPELLETS("Ormpellets");
        public final String matnamn;
        animalFood (String namn){
            matnamn=namn;
        }
    }

    //Inkapslade variabler för superklassen
    protected String name;
    protected int weight;

    public Animals(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public void getFood() {

    }
}
