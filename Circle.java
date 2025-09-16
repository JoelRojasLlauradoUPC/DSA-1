class Circle implements Shape
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
}