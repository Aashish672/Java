public class Box {
    double h;
    double l;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }
}
