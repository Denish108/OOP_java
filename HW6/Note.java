import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Note {
    private final LocalDate date;
    private final String note;

    public Note(String note) {
        this.date = LocalDate.now();
        this.note = note;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate = this.date.format(formatter);
        return String.format("%s: %s", formattedDate, note);
    }
}
