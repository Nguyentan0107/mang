public class Trapezoid {
    double cdl, cdn, h, cb1, cb2;

    public Trapezoid() {
    }

    public Trapezoid (double cdl, double cdn ,double h, double cb1, double cb2) {
        this.cdl = cdl;
        this.cdn = cdn;
        this.h = h;
        this.cb1 = cb1;
        this.cb2 = cb2;
    }
    public double getCv() {
        return (cdl + cdn + cb1 + cb2);
    }
    public double gettDt() {
        return ((cdl + cdn) / 2) * h;
    }
}