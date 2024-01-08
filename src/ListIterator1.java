import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIterator1 {
    public static void main(String[] args) {

String s = "madam";
List<Character> list = new LinkedList<>();
for (char ch: s.toCharArray()){
    list.add(ch);
}

ListIterator <Character> iterator = list.listIterator();
ListIterator <Character> reverseIterator = list.listIterator(list.size());
boolean isPolidrome = true;
    while (iterator.hasNext() && reverseIterator.hasPrevious()) {
if (iterator.next() != reverseIterator.previous()){
    isPolidrome = false;
    break;
      }
    }
    if (isPolidrome){
        System.out.println("Polidrom");
    }

    else{
        System.out.println("Nu este Polidrom");

      }
    }
}