import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Todo todo_1 = new Todo();
        todo_1.setTitle("Bài tập về nhà");
        todo_1.setDescription("Làm bài tập số 1");
        todo_1.setDone(true);
        todo_1.setDue(new Date());
        Todo todo_2 = new Todo();
        todo_2.setTitle("Bài tập về nhà");
        todo_2.setDescription("Làm bài tập số 2");
        todo_2.setDone(true);
        todo_2.setDue(new Date());
        Todo todo_3 = new Todo();
        todo_3.setTitle("Bài tập về nhà");
        todo_3.setDescription("Làm bài tập số 3");
        todo_3.setDone(false);
        todo_3.setDue("28/05/2018");
        Todo todo_4 = new Todo();
        todo_4.setTitle("Bài tập về nhà");
        todo_4.setDescription("Làm bài tập số 4");
        todo_4.setDone(true);
        todo_4.setDue(new Date());
        Todo todo_5 = new Todo();
        todo_5.setTitle("Bài tập về nhà");
        todo_5.setDescription("Làm bài tập số 5");
        todo_5.setDone(false);
        todo_5.setDue("14/07/2018");
        TodoList todoLists = new TodoList();
        todoLists.add(todo_1);
        todoLists.add(todo_2);
        todoLists.add(todo_3);
        todoLists.add(todo_4);
        todoLists.add(todo_5);


        System.out.println(todoLists.find("Bài tập về nhà").getDescription());

        System.out.println(todoLists.showDones().get(1).getDescription());

        System.out.println(todoLists.showPastDue().get(1).getDescription());

        todoLists.removeDones();

        System.out.println(todoLists.size());
        System.out.println(todoLists.showAll().get(1).getDescription());
    }
}
