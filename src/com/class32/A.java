package com.class32;
abstract class Mark {
    abstract void getPercentage();
}
class A extends Mark {
    int math, science, coding;
    void studentA(int math, int science, int coding) {
        this.math = math;
        this.science = science;
        this.coding = coding;
    }
    @Override
    void getPercentage() {
        int a = (math + science + coding) / 3;
        System.out.println(a);
    }
}
class B extends Mark {
    int math, science, coding, english;
    void studentB(int math, int science, int coding, int english) {
        this.math = math;
        this.science = science;
        this.coding = coding;
        this.english = english;
    }
    @Override
    void getPercentage() {
        int b = (math + science + coding + english) / 4;
        System.out.println(b);
    }
}
