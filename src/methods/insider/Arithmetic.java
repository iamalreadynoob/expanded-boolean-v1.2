package methods.insider;

import general.ExpandedValue;

public class Arithmetic
{

    public double sum(ExpandedValue first, ExpandedValue second)
    {
        if (first.getExpandedValue() + second.getExpandedValue() >= 1) return 1;
        else return first.getExpandedValue() + second.getExpandedValue();
    }

    public double minus(ExpandedValue first, ExpandedValue second)
    {
        if (first.getExpandedValue() - second.getExpandedValue() <= 0) return 0;
        else return first.getExpandedValue() - second.getExpandedValue();
    }

    public double times(ExpandedValue first, ExpandedValue second)
    {
        return first.getExpandedValue() * second.getExpandedValue();
    }

    public double over(ExpandedValue first, ExpandedValue second)
    {
        if (first.getExpandedValue() / second.getExpandedValue() >= 1) return 1;
        else return first.getExpandedValue() / second.getExpandedValue();
    }

    public double exp(ExpandedValue value, double power)
    {
        if (Math.pow(value.getExpandedValue(), power) >= 1) return 1;
        else return Math.pow(value.getExpandedValue(), power);
    }

    public double root(ExpandedValue value, double root)
    {
        if (Math.pow(value.getExpandedValue(), 1 / root) >= 1) return 1;
        else return Math.pow(value.getExpandedValue(), 1 / root);
    }

}
