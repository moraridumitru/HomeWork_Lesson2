package Company_Array;

public class Company_Array {
    public static void main(String[] args) {
        String[] company = {"MAIB", "Orange", "Moldtelecom", "Endava", "Moldcell","Unite"};  /** In this example, the company array contains six elements.**/

        int size = company.length;                      /**  check the size of the array.**/
        System.out.println("Размер массива: " + size);

        if (size >= 2) {                                    /** Если размер больше или равен 2, то выводим последний элемент массива (size - 1) **/
            System.out.println("Последний элемент: " + company[size - 1]); /** Java индексация массивов начинается с 0. [.length - 1] - Это позволяет получить доступ к последнему элементу массива независимо от его длины.**/
            System.out.println("Первый элемент: " + company[0]);   /** выводим первый (1) элемент массива  **/
            System.out.println("Второй элемент: " + company[1]);   /** выводим  второй (2) элемент массива **/
        } else if (size == 1) {                            /** Если размер  равен 1, то выводим Единственный элемент **/
            System.out.println("Единственный элемент: " + company[0]);
        } else {
            System.out.println("Массив пуст.");
        }
    }
}

