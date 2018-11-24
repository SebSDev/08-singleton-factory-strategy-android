package de.fhro.inf.prg3.a08.filtering;

import de.fhro.inf.prg3.a08.model.Meal;

public class VegetarianStrategy extends FilterBase
{
    @Override
    protected boolean include(Meal m)
    {
        boolean isInclude = true;

        for (String s : m.getNotes())
        {
            if (s.contains("fleisch") || s.contains("Fleisch") || s.contains("fisch") || s.contains("Fisch"))
            {
                isInclude = false;
            }
        }

        return isInclude;
    }
}
