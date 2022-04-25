import java.util.LinkedList;
import java.util.Iterator;
public class IterateLinkedListAtSpecificLocation {

    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Ryan");
        l_list.add("Tiffany");
        l_list.add("Megan");

        Iterator x = l_list.listIterator(1);

        while (x.hasNext()) {
            System.out.println(x.next());
        }

    }
}
