package Macro;

public class MacroNutrientFactory {
    public Diet getMacroNutrientMeal(String dietType) {
        switch (dietType) {
            case "No Restrictions":
                NoRestrictionsDiet noRestrictionsDiet = new NoRestrictionsDiet();
                noRestrictionsDiet.makeDiet();
                return noRestrictionsDiet;
            case "Paleo":
                PaleoDiet paleoDiet = new PaleoDiet();
                paleoDiet.makeDiet();
                return paleoDiet;
            case "Vegan":
                VeganDiet veganDiet = new VeganDiet();
                veganDiet.makeDiet();
                return veganDiet;
            case "Nut Allergy":
                NutAllergyDiet nutAllergyDiet = new NutAllergyDiet();
                nutAllergyDiet.makeDiet();
                return nutAllergyDiet;
            default:
                return null;
        }
    }
}
