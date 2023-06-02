public class Main {
    public static void main(String[] args) {
        Notebook model = new Notebook();
        NoteView view = new NoteView();
        NotePresenter presenter = new NotePresenter(model, view);
        presenter.start();
    }
}
