package Macro;

import java.util.Random;

public class NutAllergyDiet extends Diet {
    @Override
    public Diet makeDiet() {
        NutAllergyDiet diet = new NutAllergyDiet();
        diet.chooseCarb();
        diet.chooseProtein();
        diet.chooseFat();

        return diet;
    }

    @Override
    public void chooseCarb() {
        int PISTACHIO_INDEX = 3;

        Random random = new Random();
        int index;

        //keep looping until you don't get pistachio
        do {
            index = random.nextInt(carbs.size());
        } while (index == PISTACHIO_INDEX);

        chosenCarb = carbs.get(index);
    }

    @Override
    public void chooseProtein() {
        Random random = new Random();
        int index = random.nextInt(protein.size());
        chosenProtein = protein.get(index);
    }

    @Override
    public void chooseFat() {
        int PEANUT_INDEX = 3;

        Random random = new Random();
        int index;

        //keep looping until you don't get peanut
        do {
            index = random.nextInt(fats.size());
        } while (index == PEANUT_INDEX);

        chosenFat = fats.get(index);
    }
}
