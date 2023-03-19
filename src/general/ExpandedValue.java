package general;

public class ExpandedValue extends Valider
{

    private double expandedValue = 0;

    public ExpandedValue(double expandedValue)
    {
        if (isValid(expandedValue)) this.expandedValue = expandedValue;
    }

    public void setExpandedValue(double expandedValue)
    {
        if (isValid(expandedValue)) this.expandedValue = expandedValue;
    }

    public double getExpandedValue() {return expandedValue;}



}
