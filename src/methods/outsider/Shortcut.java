package methods.outsider;

import general.ExpandedValue;
import general.ReferencePoint;

public class Shortcut
{
    private Boolean primary = null;
    private Boolean secondary = null;


    public Shortcut(ExpandedValue first, ReferencePoint point)
    {
        primary = new Unique().to(first, point);
    }

    public Shortcut(ExpandedValue first, ExpandedValue second, ReferencePoint point)
    {
        new Shortcut(first, point);
        secondary = new Unique().to(second, point);
    }

    public Boolean not()
    {

        if (primary) return false;
        else return true;

    }

    public Boolean and()
    {
        if (primary && secondary) return true;
        else return false;
    }

    public Boolean or()
    {
        if (!primary && !secondary) return false;
        else return true;
    }

    public Boolean xor()
    {
        if (primary != secondary) return true;
        else return false;
    }

    public Boolean ifThen()
    {
        if (primary && !secondary) return false;
        else return true;
    }

    public Boolean ifAndOnlyIf()
    {
        if (primary == secondary) return true;
        else return false;
    }

    public Boolean nand()
    {
        if (primary && secondary) return false;
        else return true;
    }

    public Boolean xnor()
    {
        return ifAndOnlyIf();
    }



}
