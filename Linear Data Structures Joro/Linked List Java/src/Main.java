import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String>people = new LinkedList<>();

        people.add("joro");
        people.add("gosho");
        people.add("ivo");

        for (String person : people) {
            System.out.println(person);
        }

        System.out.println();


        Iterator<String> iterator = people.iterator();
        while (iterator.hasNext()){
            String person = iterator.next();
            if (person.equals("gosho")){
                iterator.remove();
            }else{
                System.out.println(person);
            }
        }
        
        System.out.println();

        for (String person : people) {
            System.out.println(person);
        }

    }
}
