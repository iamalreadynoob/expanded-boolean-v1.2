package methods.outsider;

import general.ExpandedValue;
import general.ReferencePoint;

public class Shortcut
{

    public Boolean not(ExpandedValue first, ReferencePoint point)
    {
        Boolean result = null;

        if (new Unique().to(first, point)) result = false;
        else if (!new Unique().to(first, point)) result = true;

        return result;
    }

    //TODO: add or, xor, and, nand...

}
