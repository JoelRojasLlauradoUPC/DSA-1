class Triangle implements Shape
{
    double base;
    double altura;

    Triangle(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }
}