import java.util.*;

public class TodoList {
    private List<Todo> todoLists = new ArrayList<>();
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
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < todoLists.size(); i++) {
            if (todoLists.get(i).isDone()) {
                list.add(todoLists.get(i));
            }
        }
        return list;
    }

    public List<Todo> showNotDones() {
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < todoLists.size(); i++) {
            if (!todoLists.get(i).isDone()) {
                list.add(todoLists.get(i));
            }
        }
        return list;
    }

    public List<Todo> showPastDue(){
        List<Todo> list = new ArrayList<>();
        for (int i = 0; i < todoLists.size(); i++) {
            if (todoLists.get(i).getDue().compareTo(new Date()) < 0 && !todoLists.get(i).isDone()) {
                list.add(todoLists.get(i));
            }
        }
        return list;
    }

    public void removeDones(){
        Iterator iterator = todoLists.iterator();
        while (iterator.hasNext()) {
            Todo todo = (Todo) iterator.next();
            if (todo.isDone()) {
                iterator.remove();
            }
        }
    }

    public int size() {
        return todoLists.size();
    }
}
