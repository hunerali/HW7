package com.company.Abstracts.Pets;

import com.company.Abstracts.Pet;
import com.company.Abstracts.Species;
import com.company.Abstracts.interfaces.FoulAble;

public class RoboCat extends Pet implements FoulAble {
    public RoboCat(String nickName) {
        super(nickName);
        super.setSpecies(Species.RoboCat);
    }
    public RoboCat(  String nickName, int age, int trickLevel, String[] habits) {
        super(nickName,age,trickLevel,habits);
        super.setSpecies(Species.RoboCat);
    }
    @Override
    public void respond() {

    }

    @Override
    public void Foul() {

    }
}
