import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<Note> notebook = new ArrayList<>();

    public void add(String note) {
        Note new_note = new Note(note);
        notebook.add(new_note);
    }

    public void remove(int index) {
        notebook.remove(index);
    }

    public List<Note> getAll() {
        return notebook;
    }
}
