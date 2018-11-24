package de.fhro.inf.prg3.a08.filtering;

import java.util.List;

import de.fhro.inf.prg3.a08.model.Meal;

public class AllMealsStrategy implements MealsFilter
{
    @Override
    public List<Meal> filter(List<Meal> meals)
    {
        return meals;
    }
}
