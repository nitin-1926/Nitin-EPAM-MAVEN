package org.example;
import java.util.*;
public class Gift {
    Vector<Sweets> mainSweet;
    String message;
    int weight;

    public Gift(Vector<Sweets> mainSweet,String message) {
        this.mainSweet = mainSweet;
        this.message=message;
    }
    public int totalWeight()
    {
        for(Sweets sweet1:mainSweet)
        {
            weight+=sweet1.weight;
        }
        return weight;
    }
}