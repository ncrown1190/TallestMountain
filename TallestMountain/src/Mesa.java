public class Mesa implements Formation{

    private int height;
    private String name;
    private double area;
    
    //getter and setter
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    //constructor
    public Mesa(int height, String name, double area) {
        this.height = height;
        this.name = name;
        this.area = area;
    }
    
    //Method
    public String getInfo() {        
        return "Type: Mesa, Name: " + name + ", Height: " + height + " meters, Surface area: " + area + " square kilometers";
        
    }
}
