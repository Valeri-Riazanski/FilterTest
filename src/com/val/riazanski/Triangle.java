package com.val.riazanski;

import java.util.Objects;

class Triangle {
    //fields
    int a;
    int b;
    int c;
    //constructors
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "triangle [a=" + this.a + " b=" + this.b + " c=" + this.c + "]" + "\n";
    }

}
