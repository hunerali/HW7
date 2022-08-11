package com.company.Abstracts.Pets;

import com.company.Abstracts.Pet;
import com.company.Abstracts.Species;
import com.company.Abstracts.interfaces.FoulAble;

public class Dog extends Pet implements FoulAble {
    public Dog(String nickName) {
        super(nickName);
        super.setSpecies(Species.DOG);
    }
    public Dog(  String nickName, int age, int trickLevel, String[] habits) {
       super(nickName,age,trickLevel,habits);
       super.setSpecies(Species.DOG);
    }
    @Override
    public void respond() {

    }

    @Override
    public void Foul() {

    }
}
