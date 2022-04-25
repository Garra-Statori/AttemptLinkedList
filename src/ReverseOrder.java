import java.util.Iterator;
import java.util.LinkedList;

public class ReverseOrder {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("Torrent");
        linkedlist.add("Viper");
        linkedlist.add("Sin");



        Iterator reverse = linkedlist.descendingIterator();

      while(reverse.hasNext()) {
          System.out.println(reverse.next());

        }
    }

}
