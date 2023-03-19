package methods.outsider;

import general.ExpandedValue;
import general.ReferencePoint;
import precision.PolarTruth;

public class Unique
{
    public Boolean to(ExpandedValue expandedValue, ReferencePoint reference)
    {
        Boolean converted = null;

        if (expandedValue.getExpandedValue() > reference.getReferencePoint()) converted = true;
        else if (expandedValue.getExpandedValue() < reference.getReferencePoint()) converted = false;
        else if (expandedValue.getExpandedValue() == reference.getReferencePoint())
        {
            switch (reference.getBehaviour())
            {
                case TO_TRUE: converted = true; break;
                case TO_FALSE: converted = false; break;
                case NEITHER: converted = null; break;
            }
        }

        return converted;
    }

    public Boolean comp(char type, ExpandedValue first, ExpandedValue second)
    {
        Boolean result = null;

        switch (type)
        {
            case '+':
                if (first.getExpandedValue() > second.getExpandedValue()) result = true;
                else result = false;
                break;
            case '-':
                if (first.getExpandedValue() < second.getExpandedValue()) result = true;
                else result = false;
                break;
            case '0':
                if (first.getExpandedValue() == second.getExpandedValue()) result = true;
                else result = false;
                break;
        }


        return result;
    }

    public Boolean comp(PolarTruth first, PolarTruth second)
    {
        Boolean result = null;

        if (first.getExpandedValue() == second.getExpandedValue())
        {
            if (first.getSpin() > second.getSpin()) result = true;
            else result = false;
        }

        return result;
    }


}
