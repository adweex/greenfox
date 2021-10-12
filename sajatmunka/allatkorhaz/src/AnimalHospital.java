import java.sql.Array;
import java.util.ArrayList;

public class AnimalHospital {

    ArrayList<Animal> animals = new ArrayList<>();

    public void list(){
        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).name + " " + animals.get(i).age);
        }
    }
}
