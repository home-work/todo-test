import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {
    private List<Todo> todoLists = new ArrayList<Todo>();
    public void add(Todo todo) {
        todoLists.add(todo);
    }

    public Todo find(String title) {
        Todo todo = null;
        for (int i = 0; i < todoLists.size(); i++) {
            if (todoLists.get(i).getTitle().compareTo(title) == 0) {
                todo = todoLists.get(i);
            }
        }
        return todo;
    }

    public List<Todo> showAll() {
        return todoLists;
    }

    public List<Todo> showDones() {
        List<Todo> list = new ArrayList<Todo>();
        for (int i = 0; i < todoLists.size(); i++) {
            if (todoLists.get(i).isDone()) {
                list.add(todoLists.get(i));
            }
        }
        return list;
    }

    public List<Todo> showNotDones() {
        List<Todo> list = new ArrayList<Todo>();
        for (int i = 0; i < todoLists.size(); i++) {
            if (!todoLists.get(i).isDone()) {
                list.add(todoLists.get(i));
            }
        }
        return list;
    }

    public List<Todo> showPastDue(){
        List<Todo> list = new ArrayList<Todo>();
        for (int i = 0; i < todoLists.size(); i++) {
            if (todoLists.get(i).getDue().compareTo(new Date()) < 0 && !todoLists.get(i).isDone()) {
                list.add(todoLists.get(i));
            }
        }
        return list;
    }

    public void removeDones(){
        for (int i = 0; i < todoLists.size(); i++) {
            if (todoLists.get(i).isDone()) {
                todoLists.remove(todoLists.get(i));
            }
        }
    }

    public int size() {
        return todoLists.size();
    }
}
