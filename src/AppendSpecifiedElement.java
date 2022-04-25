import java.util.ArrayList;
import java.util.LinkedList;

public class AppendSpecifiedElement {

    public static void main(String[] args) {

        LinkedList<String> namesLinkList = new LinkedList<>();
namesLinkList.add("John");

        System.out.println(namesLinkList);

        namesLinkList.offerLast("V");
        System.out.println(namesLinkList);
    }

}
