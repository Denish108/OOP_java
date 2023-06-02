import java.time.LocalDate;
import java.util.List;

public class NotePresenter {
        private Notebook model;
        private NoteView view;

        public NotePresenter(Notebook model, NoteView view) {
            this.model = model;
            this.view = view;
        }

        public void start() {
            int choice = -1;
            while (choice != 0) {
                view.showMenu();
                choice = view.getChoice();
                switch (choice) {
                    case 1:
                        addNote();
                        break;
                    case 2:
                        removeNote();
                        break;
                    case 3:
                        viewNotes();
                        break;
                    case 0:
                        view.showMessage("До новых встреч!");
                        break;
                    default:
                        view.showMessage("Неправильный выбор.");
                        break;
                }
            }
        }

        private void addNote() {
            String note = view.getNote();
            model.add(note);
            view.showMessage("Заметка добавлена.");
        }

        private void removeNote() {
            List<Note> notes = model.getAll();
            if (notes.isEmpty()) {
                view.showMessage("Заметок нет.");
                return;
            }
            view.showNotes(notes);
            System.out.print("\nКакую заметку удалить?: ");
            int index = view.getChoice();
            if (index >= 0 && index < notes.size()) {
                model.remove(index);
                view.showMessage("Заметка удалена.");
            } else {
                view.showMessage("Такой заметки нет.");
            }
        }

        private void viewNotes() {
            List<Note> notes = model.getAll();
            if (notes.isEmpty()) {
                view.showMessage("Заметок нет.");
                return;
            }
            view.showNotes(notes);
        }
}
