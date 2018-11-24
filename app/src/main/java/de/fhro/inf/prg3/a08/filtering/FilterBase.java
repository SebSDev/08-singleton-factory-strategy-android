package de.fhro.inf.prg3.a08.filtering;

import java.util.LinkedList;
import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

public abstract class FilterBase implements MealsFilter
{
    @Override
    public List<Meal> filter(List<Meal> meals)
    {
        List<Meal> filteredMeals = new LinkedList<>();

        for (Meal m : meals)
        {
            if (include(m))
            {
                filteredMeals.add(m);
            }
        }

        return filteredMeals;
    }

    protected boolean include(Meal m)
    {
        return true;
    }
}
