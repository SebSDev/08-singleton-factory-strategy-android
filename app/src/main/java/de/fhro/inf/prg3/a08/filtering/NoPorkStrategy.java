package de.fhro.inf.prg3.a08.filtering;

import de.fhro.inf.prg3.a08.model.Meal;

public class NoPorkStrategy extends FilterBase
{
    @Override
    protected boolean include(Meal m)
    {
        boolean isInclude = true;

        for (String s : m.getNotes())
        {
            if (s.contains("schwein") || s.contains("Schwein"))
            {
                isInclude = false;
            }
        }

        return isInclude;
    }
}
