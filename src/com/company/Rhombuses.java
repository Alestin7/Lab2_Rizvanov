package com.company;

import java.util.ArrayList;
import java.util.List;

public class Rhombuses {
    private final List<Rhombus> rhombuses;

    public Rhombuses(){
        rhombuses = new ArrayList<>();
    }

    public List<Rhombus> getRhombuses() {
        return rhombuses;
    }

    public void add(Rhombus rhombus) {
        this.rhombuses.add(rhombus);
    }

    public void remove(Rhombus rhombus) {
        this.rhombuses.remove(rhombus);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            rhombuses.add(Rhombus.generate());
        }
    }

    public void MediumArea(){
        int medium = 0;
        for (Rhombus rhombus : this.rhombuses){

        }
    }

    @Override
    public String toString() {
        return "\n\n\nРомбы " + rhombuses + "; ";
    }
}
