package methods.insider;

import general.ExpandedValue;
import general.ReferenceBehaviour;
import general.ReferencePoint;
import general.TruthLevels;

import java.util.HashMap;
import java.util.Map;

public class General
{

    public TruthLevels to(ExpandedValue expandedValue, ReferencePoint referencePoint)
    {
        TruthLevels level = null;

        if (expandedValue.getExpandedValue() == 1) level = TruthLevels.TRUE;
        else if (expandedValue.getExpandedValue() > referencePoint.getReferencePoint() && expandedValue.getExpandedValue() < 1) level = TruthLevels.ALMOST_TRUE;
        else if (expandedValue.getExpandedValue() == referencePoint.getReferencePoint())
        {
            switch (referencePoint.getBehaviour())
            {
                case TO_TRUE: level = TruthLevels.NEUTRAL_TRUE; break;
                case TO_FALSE: level = TruthLevels.NEUTRAL_FALSE; break;
                case NEITHER: level = TruthLevels.TIRESIAS; break;
            }
        }
        else if (expandedValue.getExpandedValue() < referencePoint.getReferencePoint() && expandedValue.getExpandedValue() > 0) level = TruthLevels.ALMOST_FALSE;
        else if (expandedValue.getExpandedValue() == 0) level = TruthLevels.FALSE;

        return level;
    }

    public Map<Double, Boolean> getRange(ReferencePoint point, TruthLevels requested)
    {
        //boolean refers to the last/first number is included (true) or excluded (false).
        Map<Double, Boolean> range = new HashMap<>();

        if (requested == TruthLevels.TRUE || requested == TruthLevels.T)
        {
            range.put((double)1, true);
        }
        else if (requested == TruthLevels.ALMOST_TRUE || requested == TruthLevels.AT)
        {
            range.put(point.getReferencePoint(), false);
            range.put((double)1, false);
        }
        else if (requested == TruthLevels.NEUTRAL_TRUE || requested == TruthLevels.NT || requested == TruthLevels.TIRESIAS || requested == TruthLevels.TS || requested == TruthLevels.NEUTRAL_FALSE || requested == TruthLevels.NF)
        {
            range.put(point.getReferencePoint(), true);
        }
        else if (requested == TruthLevels.ALMOST_FALSE || requested == TruthLevels.AF)
        {
            range.put((double)0, false);
            range.put(point.getReferencePoint(), false);
        }
        else if (requested == TruthLevels.FALSE || requested == TruthLevels.F)
        {
            range.put((double)0, true);
        }

        return range;
    }

}
