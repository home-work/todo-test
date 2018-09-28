import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
    private String title = "";
    private String description = "";
    private boolean done = true;
    private Date due;

    public Todo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(String dateString) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            due = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setDue(Date due) {
        this.due = due;
    }

}
