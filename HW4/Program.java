public class Program {
    public static void main(String[] args) {
        Integer[] values = {60, 18, 72, 32, 8, 220, 40, 50};
        DArray<Integer> myArray = new DArray<>(values);

        System.out.print("Начальный массив: ");
        myArray.print();

        System.out.println("Массив содержит значение 500? " + myArray.contains(500));
        System.out.println("Массив содержит значение 220? " + myArray.contains(220));
        System.out.println("Длина массива: " + myArray.getLength());
        System.out.println("Сумма элементов массива: " + myArray.sum());
        System.out.println("Произведение элементов массива: " + myArray.product());
        System.out.println("Индекс элемента со значением 220: " + myArray.getIndex(220));
        System.out.println("Максимальное значение: " + myArray.getMax());
        System.out.println("Минимальное значение: " + myArray.getMin());
        System.out.println("Элемент по индексу 2: " + myArray.get(2));

        myArray.removeByIndex(1);
        System.out.print("Массив после удаления элемента по индексу 2: ");
        myArray.print();

        myArray.removeByValue(220);
        System.out.print("Массив после удаления элемента со значением 220: ");
        myArray.print();

        myArray.insert(1000);
        System.out.print("Массив после добавления элемента со значением 1000: ");
        myArray.print();
        myArray.set(2, 2000);
        System.out.print("Массив после изменения элемента по индексу 2 на 2000: ");
        myArray.print();

        myArray.bubbleSort();
        System.out.print("Массив после сортировки пузырьком: ");
        myArray.print();
        System.out.print("\n");

        DArray<Integer> newArray = new DArray<>(values);
        System.out.print("Начальный массив: ");
        newArray.print();
        newArray.selectionSort();
        System.out.print("Массив после сортировки выбором:");
        newArray.print();
        System.out.print("\n");

        DArray<Integer> array = new DArray<>(values);
        System.out.print("Начальный массив: ");
        array.print();
        array.insertionSort();
        System.out.print("Массив после сортировки вставками: ");
        array.print();
        System.out.print("\n");

        String[] array2 = {"G", "e", "e", "k", "B", "r", "a", "i", "n", "s"};
        DArray<String> strArray = new DArray<>(array2);
        System.out.println("Массив из букв");
        strArray.print();
        System.out.println("Конкатенация строк: " + strArray.sum());
    }
}
