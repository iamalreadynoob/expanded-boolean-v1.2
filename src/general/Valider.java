package general;

abstract class Valider
{

    protected boolean isValid(double value)
    {
        if (value >= 0 && value <= 1) return true;
        else return false;
    }

}
