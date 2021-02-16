package classes;

import java.util.Comparator;

public class ComparatorPeople implements Comparator<Contact> {
    public int compare(Contact arg0,Contact arg1){
        return arg0.getName().compareTo(arg1.getName());
    }
}
