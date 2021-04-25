package lesson1;

public class Compare {
    public static void main(String[] args) {
//    Задание 1.1
//    Приготовление чая:
//    Вскипятить чайник, налить заварку, положить сахар, размешать, дать остыть и настояться.
//    Задание 1.2
//    Написание кода:
//    Включить компьютер, запустить программу, написать алгоритм, написать код, скомпилировать.
//    Задания 1.3, 1.4
        Integer a = 1;//переменная примитивного типа
        Integer b = 2;
        String Dog1 = "Барс";//переменная ссылочного типа
        String Dog2 = "Boris";
        String[] dogs1 = {"Шарик", "Барс", "Рыжик", "Тузик", "Лайка"};
        String[] dogs2 = {"Вулкан", "Барбос", "Пират", "Буран", "Силач"};
        Animal Dog = new Animal("Животные", "Рыжик", 3);  //переменная класса Animal
        int[] arr1 = {1, 2, 3, 4, 5, 8, 12, 24, 33, 15, 16, 17}; //для сравнения вышеперечисленных переменных с другими переменными методом перебора создаем массивы
        int[] arr2 = {2, 4, 22, 33, 44, 33, 16, 19};  //в одном массиве искомая переменная есть, в другом нет
        System.out.println("a= " +a);
        System.lineSeparator();
        System.out.println("b= " +b);
        System.lineSeparator();
        System.out.println("Dog1= " +Dog1);
        System.lineSeparator();
        System.out.println("Dog2= " +Dog2);
        System.lineSeparator();
        System.out.println("Сравнение Dog1 и Dog2: " + Dog1.equals(Dog2));
        System.lineSeparator();
        System.out.println("Сравнение a и b: " + a.compareTo(b));
        System.lineSeparator();

        long nano_startTime = System.nanoTime();
//        for (int i = 0; i < arr1.length; i++) {
//            String strToPrint = "arr1[" + i + "]=" + arr1[i];
//        }
        search(b, arr1); //число есть
        search(b, arr2); //числа нет
        search(Dog1, dogs1); //животное есть
        search(Dog1, dogs2);//животного нет
        long nano_endTime = System.nanoTime() - nano_startTime;
        System.out.println("Время выполнения сравнения, нс: " + nano_endTime);
    }
    //создаем оверлоад-методы для сравнения переменных
    public static void search(int b, int[] arr1) {
        for (int arr : arr1) {
            if (b == arr) {
                System.out.printf("Число %d присутствует в приведенном массиве чисел\n", b);
                return;
            }
        }
        System.out.printf("Число %d отсутствует в приведенном массиве чисел\n", b);
    }

    public static void search(String a, String[] words) {
        for (String word : words) {
            if (a.equals(word)) {
                System.out.printf("Слово %s присутствует в приведенном массиве слов\n", a);
                return;
            }
        }
        System.out.printf("Слово %s отсутствует в приведенном массиве слов\n", a);
    }
}