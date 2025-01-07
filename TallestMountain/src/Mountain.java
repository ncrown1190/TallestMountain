public class Mountain implements Formation {

    private int height;
    private String name;
    
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

    //constructor
    public Mountain(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    //Method
    public String getInfo() {
        return "Type: Mountain, Name: " + name + ", Height: " + height + " meters";
    }

    
}
