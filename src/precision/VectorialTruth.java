package precision;

import java.util.ArrayList;

public class VectorialTruth
{

    private ArrayList<Double> compounds = new ArrayList<>();

    public VectorialTruth(ArrayList<Double> compounds)
    {
        this.compounds = compounds;
    }

    public void setCompound(int index, Double compound)
    {
        compounds.set(index, compound);
    }

    public void addCompound(Double compound)
    {
        compounds.add(compound);
    }

    public ArrayList<Double> getCompounds() {return compounds;}

    public double getExpandedValue()
    {
        double total = 0;
        for (Double c: compounds) total += Math.pow(c, 2);
        double result = Math.pow(total, 1 / compounds.size());

        if (result >= 1) return 1;
        else return result;
    }



}
