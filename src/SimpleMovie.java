import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMovie {
    private String title;
    private String actorsData;
    private ArrayList<String> actors;
    private ArrayList<SimpleMovie> movies = new ArrayList<SimpleMovie>();

    public SimpleMovie(String t, String a) {
        title = t;
        actorsData = a;
        actors = new ArrayList<String>();
        String[] tempActors = actorsData.split(":");
        for (int i = 0; i < tempActors.length; i++) {
            actors.add(tempActors[i]);
        }

    }

    public String toString() {
        return "Title: " + title + "\n" + "Actors: " + actors + "\n";
    }
    public void sixDegree(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the actor you want to know about: ");
        String name = scan.nextLine();
        ArrayList<String> userEnter = new ArrayList<String>();
        for(String n:actors){
            if(n.indexOf(name)!=-1){
                userEnter.add(n);
            }
        }
        int x=0;
        for(int i =1;i<userEnter.size();i++) {
            System.out.println(x + "." + userEnter.get(i));
            x++;
        }
        System.out.println("Type the number of the actor you want to know more about: ");

    }
}