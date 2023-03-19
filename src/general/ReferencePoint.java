package general;

public class ReferencePoint extends Valider
{

    private double referencePoint;
    private ReferenceBehaviour behaviour;

    public ReferencePoint(double referencePoint)
    {
        if (isValid(referencePoint)) this.referencePoint = referencePoint;
    }

    public void setReferencePoint(double referencePoint)
    {
        if (isValid(referencePoint)) this.referencePoint = referencePoint;
    }

    public void setBehaviour(ReferenceBehaviour behaviour)
    {
        this.behaviour = behaviour;
    }

    public double getReferencePoint() {return referencePoint;}
    public ReferenceBehaviour getBehaviour() {return behaviour;}

}
