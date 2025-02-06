import java.util.ArrayList;
import java.util.List;

public class ArrayListPrac {
    public static void main (String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(initialCapacity:5);
        ArrayList<Person> PersonList = new ArrayList<>();

        list1.add(e:"Sarah");
        list1.add(e:Noah);

        PersonsList.add(new Person(fn:"Stephen", ln: "Badcock"));
        PersonsList.add(new Person(fn:"Laura", ln: "Wiseman"));

        System.out.println(list1);
        System.out.println(PersonList);

        list1.add(index:0, element:"Ainee");
        System.out.println(list1);
    }
}
