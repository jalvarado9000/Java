package com.company;

public class Roll {
    private int array_size = 7;
    private int employeeId[] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int hour[] = new int[array_size];
    private double payrate[] = new double[array_size];
    private double wage[] = new double[array_size];
    private static int count = 0;

    public Roll(int hours, double prate){
        hour[count] = hours;
        payrate[count] = prate;
        wage[count] = hours*prate;
        count++;

    }

    public Roll() {

    }

    public int getEmployeeId(int i) {
        return employeeId[i];
    }

    public int getHour(int i) {
        return hour[i];
    }

    public double getPayrate(int i) {
        return payrate[i];
    }

    public double getWage(int i) {
        return wage[i];
    }
}
