import java.util.ArrayList;

public class ToDoFunction {
  private  ArrayList<String> toDoList = new ArrayList<String>();

  // add list item

    public void addToDo(String toDo){
        toDoList.add(toDo);
    }

    // remove list item
    public void removeToDo(int index){
        //   String itemToDelete = toDoList.get(index);
        toDoList.remove(index);
    }

    //print the entire list
    public void displayAllToDo(){
        System.out.println("Your list has : " + toDoList.size() + "items");
        for (int i=0; i<toDoList.size() ; i++){
            System.out.println( "(" + i+1 + "). " + toDoList.get(i) );
        }
    }

}
