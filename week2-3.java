class Rectangle {
	static java.util.Scanner sc=new java.util.Scanner(System.in);
    private double length;
    private double width; 
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    } 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    } 
    public double calculateArea() {
        return length * width;
    } 
    public double calculateArea(double height) {
        return length * width * height;
    } 
	public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }


 
    public static void main(String[] args) {
         
		Rectangle obj1 = new Rectangle(sc.nextDouble());
	    Rectangle obj2 = new Rectangle(sc.nextDouble(), sc.nextDouble()); 
        obj1.displayDimensions();
        System.out.println("Area: " + obj1.calculateArea());
        obj2.displayDimensions();
        System.out.println("Area: " + obj1.calculateArea());
        System.out.println("Volume:" + obj2.calculateArea(sc.nextDouble()));
    }
}
