package com.val.riazanski;

import java.util.ArrayList;

class IsoscelesFilterTest {
    @FunctionalInterface
    interface Predicate {
        boolean test(IsoscelesTriangle abc, IsoscelesTriangle pqr);
    }

    public static void main(String[] args) {
    IsoscelesTriangle filterTriangle = new IsoscelesTriangle(1, 2, 1);
    final int n = 10;
    ArrayList<IsoscelesTriangle> triangleList = new ArrayList<IsoscelesTriangle>();
    int a;
    int b;
    int c;
    for (int i = 0; i < n; i++) {
        a = (int) (Math.random() * 1) + 1;
        b = (int) (Math.random() * 2) + 2;
        c = (int) (Math.random() * 5) + 3;
        triangleList.add(new IsoscelesTriangle(a, b, c));
    }
    System.out.println(triangleList.toString());
    System.out.println("filter" + filterTriangle.toString());
    Predicate predicate = (IsoscelesTriangle abc, IsoscelesTriangle pqr) -> abc.equals(pqr);
    triangleList.removeIf(triangle ->  ! predicate.test(filterTriangle,triangle));
    System.out.print(triangleList.toString());
    }
}
