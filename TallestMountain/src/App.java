import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        ArrayList<Formation> formations = new ArrayList<>();
        Mountain everest = new Mountain(8848, "Mount Everest");
        Mountain kilamjaro = new Mountain(5895, "Mount Kilamjaro");
        Mesa grand = new Mesa(3425, "Grand Mesa",5613);
        Mesa  verde = new Mesa(2600, "Mesa Verde", 212);

        formations.add(verde);
        formations.add(everest);
        formations.add(kilamjaro);
        formations.add(grand);

        //calling Methods here
        showInfo(formations);

        Formation tallest = findTallest(formations);
        System.out.println("Here is the tallest formation");
        System.out.println(tallest.getInfo());
    }

    public static void showInfo(ArrayList<Formation> list){
        for(Formation formation: list){
            System.out.println(formation.getInfo());
        }
    }

    public static Formation findTallest(ArrayList<Formation> list){
        Formation tallest = list.get(0);

        for(Formation formation: list){
            if(formation.getHeight() > tallest.getHeight()){
                tallest = formation;
            }
        }
        return tallest;
    }
}
