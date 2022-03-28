// Write a ThreeDPoint class that:
// Extends Point
// Defines a new int instance variable named z
// Has a constructor that accepts and sets all instance variables (label, x, y, and z)
// Similar to Point, two ThreeDPoint objects are considered “equal” if their x, y, and z values are equal, although their labels can be different;
// for example, Point D at (12, -3, 8) and Point E also at (12, -3, 8) are considered “equal points” because they are at the same location in space.

public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint (String label, int x, int y, int z)
    {
        super (label, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + this.z;
    }

    @Override
    public boolean equals (Object other)
    {
        if (other == null)
        {
            return false;
        }

        if (other instanceof ThreeDPoint == false)
        {
            return false;
        }

        ThreeDPoint threeDPoint = (ThreeDPoint) other;

        return super.equals(threeDPoint) && this.z == threeDPoint.z;
    }
}