package model;

public class Model2 {
    private double beratButet;

    public Model2(double beratButet) {
        this.beratButet = beratButet;
    }

    public double getBeratButet() {
        return beratButet;
    }

    public double getBeratUcok() {
        return 1.5 * beratButet;
    }

    public double getTotalBerat() {
        return beratButet + getBeratUcok();
    }
}