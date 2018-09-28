import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {
    private List<Todo> todoList=new ArrayList<Todo>();
    public void add(Todo todo) {
        todoList.add(todo);
    }

    public Todo find(String title) {
        Todo todo = null;
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getTitle() == title) {
                todo = todoList.get(i);
            }
        }
        return todo;
    }

    public List<Todo> showAll() {
        return todoList;
    }

    public List<Todo> showDones() {
        List<Todo> list = new ArrayList<Todo>();
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).isDone()) {
                list.add(todoList.get(i));
            }
        }
        return list;
    }

    public List<Todo> showNotDones() {
        List<Todo> list = new ArrayList<Todo>();
        for (int i = 0; i < todoList.size(); i++) {
            if (!todoList.get(i).isDone()) {
                list.add(todoList.get(i));
            }
        }
        return list;
    }

    public List<Todo> showPastDue(){
        List<Todo> list = new ArrayList<Todo>();
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getDue().compareTo(new Date()) < 0) {
                list.add(todoList.get(i));
            }
        }
        return list;
    }

    public void removeDones(){
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).isDone()) {
                todoList.remove(todoList.get(i));
            }
        }
    }

    public int size() {
        return todoList.size();
    }
}
