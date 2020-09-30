package Sprint1;

import javax.swing.*;

/**
 * Created by Peter Almgren
 * Date: 2020-09-30
 * Time: 08:17
 * Project: ObjectorientedJava
 * Copyright: MIT
 */
public class Snake extends Animals{

    //Inkapslad variabel
    protected final int amount= 20;
    //Instans av Enum ORMPELLETS
    animalFood snakeFood = animalFood.ORMPELLETS;

    public Snake(String name, int weight) {
        super(name, weight);

    }

    @Override
    public void getFood() {

        String s = (amount + " gram " + snakeFood.matnamn);
        JOptionPane.showMessageDialog(null,s);

    }
}
