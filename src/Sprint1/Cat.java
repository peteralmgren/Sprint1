package Sprint1;

import javax.swing.*;

/**
 * Created by Peter Almgren
 * Date: 2020-09-30
 * Time: 08:17
 * Project: ObjectorientedJava
 * Copyright: MIT
 */
public class Cat extends Animals {
    //Instans av Enum KATTFODER
    animalFood catFood = animalFood.KATTFODER;

    public Cat(String name, int weight) {
        super(name, weight);

    }

    @Override
    public void getFood() {

        String s = (this.weight * 1000) /150 + " gram " + catFood.matnamn;
        JOptionPane.showMessageDialog(null,s);

    }
}
