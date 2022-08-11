package com.company.Abstracts.Pets;

import com.company.Abstracts.Pet;
import com.company.Abstracts.Species;
import com.company.Abstracts.interfaces.FoulAble;

public class DomesticCat extends Pet implements FoulAble {
    public DomesticCat(String nickName) {
        super(nickName);
        super.setSpecies(Species.DomesticCat);
    }

    public DomesticCat(String nickName, int age, int trickLevel, String[] habits) {
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.DomesticCat);
    }

    @Override
    public void respond() {

    }

    @Override
    public void Foul() {

    }
}

