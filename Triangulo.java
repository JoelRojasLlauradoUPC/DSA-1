class Triangulo implements Figura
{
    double base;
    double altura;

    Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }
}