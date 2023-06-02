import java.util.List;
import java.util.Scanner;

public class NoteView {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\nГлавное Меню:");
        System.out.println("1. Добавить заметку");
        System.out.println("2. Удалить заметку");
        System.out.println("3. Посмотреть все заметки");
        System.out.println("0. Выход");
    }

    public int getChoice() {
        System.out.print("\nВыберите действие:\n");
        return scanner.nextInt();
    }

    public String getNote() {
        scanner.nextLine();
        System.out.print("Напишите заметку:\n");
        return scanner.nextLine();
    }

    public void showNotes(List<Note> notes) {
        System.out.println("\nВсе заметки:");
//        for (Note item: notes) {
//            System.out.println();
//        }

        for (int i = 0; i < notes.size(); i++) {
            System.out.println(i + ". " + notes.get(i).toString());
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
