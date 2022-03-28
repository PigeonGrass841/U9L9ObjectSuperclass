// Write a Point class that has:
// Two int instance variables named x and y
// A String instance variable named label
// A constructor that accepts and sets all three instance variables
// Let’s say that two Point objects are considered “equal” if their x and y values are equal, although their labels can be different;
// for example, Point A at (5, -7) and Point B also at (5, -7) are considered “equal points” because they are at the same location in space.

public class Point
{
    private String label;
    private int x;
    private int y;

    public Point (String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point " + this.label + " is at x = " + this.x + ", y = " + this.y;
    }

    @Override
    public boolean equals (Object other)
    {
        if (other == null)
        {
            return false;
        }

        if (other instanceof Point == false)
        {
            return false;
        }

        Point point = (Point) other;

        return this.x == point.x && this.y == point.y;
    }
}