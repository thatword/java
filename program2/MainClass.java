
class CalcArea {
    void area(int radius) {
        System.out.println("Calling area method with one arguments");
        System.out.println("Area of circle is " + (3.14 * radius * radius));
    }
    void area(int length, int breadth) {
        System.out.println("Calling area method with two arguments");
        System.out.println("Area of rectangle is " + (length * breadth));
    }
}

class MainClass {
    public static void main(String[] args) {
        CalcArea obj = new CalcArea();
        obj.area(5);
        obj.area(5, 10);
    }
}
