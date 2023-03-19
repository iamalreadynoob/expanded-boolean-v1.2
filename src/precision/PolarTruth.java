package precision;

public class PolarTruth
{

    Double expandedValue = null;
    Double spin = null;

    public PolarTruth(double expandedValue, double spin)
    {
        if (expandedValue >= 0 && expandedValue <= 1 && spin <= 360 && spin >= 0)
        {
            this.expandedValue = expandedValue;
            this.spin = spin;
        }
    }

    public void setExpandedValue(double expandedValue)
    {
        if (expandedValue >= 0 && expandedValue <= 1) this.expandedValue = expandedValue;
    }

    public void setSpin(double spin)
    {
        if (spin >= 0 && spin <= 360) this.spin = spin;
    }

    public Double getExpandedValue() {return expandedValue;}
    public Double getSpin() {return spin;}

}
