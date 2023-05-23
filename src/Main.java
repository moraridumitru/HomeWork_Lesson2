public class Main {
    /** это простое количество элементов в классе Java Company_Array с использованием циклов if и else if**/
    public static void main(String[] args) {
        String[] company = {"MAIB", "Orange", "Moldtelecom", "Endava", "Moldcell","Unite"};

        // Подсчет количества элементов массива
        int arrayLength = company.length;

        // Вывод последнего элемента массива
        String lastElement = company[arrayLength - 1];

        // Вывод первого элемента массива
        String firstElement = company[0];

        // Вывод второго элемента массива
        String secondElement = company[1];

        // Вывод размера массива
        System.out.println("Количество элементов массива: " + arrayLength);
        System.out.println("Последний элемент: " + lastElement);
        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Второй элемент: " + secondElement);
    }
}
