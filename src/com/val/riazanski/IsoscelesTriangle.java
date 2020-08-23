package com.val.riazanski;

import java.util.Objects;

class IsoscelesTriangle {
    //fields
    int a;
    int b;
    int c;
    //constructors
    public IsoscelesTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsoscelesTriangle that = (IsoscelesTriangle) o;
        return a == that.a &&
                b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "triangle [a=" + this.a + " b=" + this.b + " c=" + this.c + "]" + "\n";
    }
}
