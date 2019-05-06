import java.util.ArrayList;

public class UserOfInsertionSort{

  public static ArrayList<String> unsorted = new ArrayList<String>();

  public static void main(String[] commandLine) {
    unsorted.add("f");
    unsorted.add("d");
    unsorted.add("a");
    unsorted.add("z");
    unsorted.add("w");
    unsorted.add("m");
    //populating the unsorted list
    System.out.println(unsorted + System.lineSeparator());

    insertAll(unsorted);
    System.out.println(unsorted);

    System.out.println("Expecting [a,d,f,m,w,z]");
    /*
    String currentElement = unsorted.get(0);
    unsorted.set(0, unsorted.get(1));
    unsorted.set(1, currentElement);
    System.out.println(unsorted);
    */
  }
  public static String insertOne(ArrayList<String> list, int positionToSort) {
    String elementToSort = list.get(positionToSort);
    if (list.size() == 0 || list.size() == 1) return "Already sorted";

    for (int index = positionToSort - 1; index >= 0; index--) {

      if (index == 0 && list.get(0).compareTo(elementToSort) > 0) {
        //exception for if elementToSort belongs as first element
        String currentElement = list.get(0);
        list.set(0, list.get(1));
        list.set(1, currentElement);
      }

      else if (list.get(index).compareTo(elementToSort) > 0) {
        String currentElement = list.get(index);
        list.set(index, list.get(index+1));
        list.set(index+1, currentElement);
        //shifts the element to the right
        //value of where the element once was can be ignored
      }

      else {
        return elementToSort;
        //the letters are already sorted by the time this occurs
      }
        //inserts the element to be sorted in its correct location
    }
    return elementToSort;
  }

  public static void insertAll(ArrayList<String> unsortedList) {
    int index;
    for (index = 1; index < unsortedList.size(); index++){
      insertOne(unsortedList, index);
      System.out.println( "debug:"
        + "after inserting element " + unsortedList.get(index)
        + " at " + index
        + System.lineSeparator()
        + " elements: " + unsortedList
      );
    }
  }

}
