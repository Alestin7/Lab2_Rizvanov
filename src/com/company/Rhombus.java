package com.company;

public class Rhombus extends Quadrangle {
    public Rhombus(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public static Rhombus generate(){
        return new Rhombus(Point.generate(), Point.generate(), Point.generate(), Point.generate());
    }

    public boolean Check(){
        boolean check = false;
        if (Side1() == Side2() && Side2() == Side3() && Side3() == Side4()){
            check = true;
        }
        return check;
    }

    @Override
    public String toString() {
        return "\n\nРомб{\n" +
                "Точка 1: \nx: " + super.getP1().getX() + "\ty: " + super.getP1().getY() +
                "\nТочка 2: \nx: " + super.getP2().getX() + "\ty: " + super.getP2().getY() +
                "\nТочка 3: \nx: " + super.getP3().getX() + "\ty: " + super.getP3().getY() +
                "\nТочка 4: \nx: " + super.getP4().getX() + "\ty: " + super.getP4().getY() +

                "\n\nСторона 1: " + Side1() +
                "\nСторона 2: " + Side2() +
                "\nСторона 3: " + Side3() +
                "\nСторона 4: " + Side4() +

                "\nДиагональ 1: " + Diagonal1() +
                "\nДиагональ 2: " + Diagonal2() +
                "\nПериметр: " + Perimetr() +
                "\nПлощадь: " + Area() +
                "\n}";
    }
}
