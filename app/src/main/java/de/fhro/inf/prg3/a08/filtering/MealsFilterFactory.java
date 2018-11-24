package de.fhro.inf.prg3.a08.filtering;

public abstract class MealsFilterFactory
{
    public static MealsFilter getStrategy(String key)
    {
        MealsFilter mf = null;

        switch (key)
        {
            case "All":
                mf = new AllMealsStrategy();
                break;
            case "Vegetarian":
                mf =  new VegetarianStrategy();
                break;
            case "No pork":
                mf =  new NoPorkStrategy();
                break;
            case "No soy":
                mf =  new NoSoyStrategy();
                break;
            default:
                mf =  new AllMealsStrategy();
                break;
        }

        return mf;
    }
}
