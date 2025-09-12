public class Test {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Triangulo(120,200);

        double res = sum(v);

        System.out.println("sum: " + res);

        print(v);

        sort(v);

        print(v);
    }

}

