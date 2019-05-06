import java.util.ArrayList;

public class InsertionSort{
  //uses a UserOfInsertionSort class to run the code
  public static ArrayList<String> list;

  public InsertionSort() {
    list = new ArrayList<String>();
  }
  public String add(String s){
    list.add(s);
    return s;
  }

  public String insertOne(ArrayList<String> list, int positionToSort) {
    String elementToSort = list.get(positionToSort);
    for (int index = positionToSort - 1; index >= 0; index--) {
      if (index == 0 && list.get(0).compareTo(elementToSort) > 0) {
        //exception for if elementToSort belongs as first element
        list.set(0, elementToSort);
      }
      else if (list.get(index).compareTo(elementToSort) > 0) {
        list.set(index+1, list.get(index));
        //shifts the element to the right
        //value of where the element once was can be ignored
      }
      else
        list.set(index, elementToSort);
        //inserts the element to be sorted in its correct location
    }
    return elementToSort;
  }

  public void insertAll(ArrayList<String> unsortedList) {
    int index;
    for (index = 1; index < unsortedList.size(); index++){
      insertOne(unsortedList, index);
    }
    // for debugging, from hw ap page
    System.out.println( "debug:"
      + "after inserting element " + index
      + System.lineSeparator()
      + " elements: " + list
    );
  }

}
