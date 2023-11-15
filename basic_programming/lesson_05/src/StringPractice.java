public class StringPractice {

    public static void main(String[] args) {
        // Задача 1: Получить длину строки
        String str1 = "Hello, World!";
        int length = 0;
        System.out.println("Длина строки str1: " + length);

        // Задача 2: Преобразовать строку в верхний регистр
        String str2 = "Java Programming";
        String upperStr = str2;
        System.out.println("Строка в верхнем регистре: " + upperStr);

        // Задача 3: Извлечь подстроку из строки
        String str3 = "Hello, Java World!";
        String substring = str3;
        System.out.println("Подстрока str3: " + substring);

        // Задача 4: Заменить символы 'a' на 'D' в строке
        String str4 = "Java";
        String replacedStr = str4;
        System.out.println("Строка после замены: " + replacedStr);

        // Задача 5: Обрезать пробелы в начале и в конце строки
        String str5 = "   Hello, World!   ";
        String trimmedStr = str5;
        System.out.println("Строка после обрезки пробелов: '" + trimmedStr + "'");

        // Задача 6: Определить, содержит ли строка подстроку "Program"
        String str6 = "Java Programming Language";
        boolean contains = false;
        System.out.println("Строка содержит 'Program': " + contains);

        // Задача 7: Сравнить две строки, игнорируя регистр символов
        String str7a = "Hello";
        String str7b = "hello";
        boolean isEqualIgnoreCase = false;
        System.out.println("Строки равны (игнорируя регистр): " + isEqualIgnoreCase);

        // Задача 8: Получить первый индекс символа в строке
        String str8 = "Java";
        int indexOfA = 0;
        System.out.println("Индекс первого вхождения 'a': " + indexOfA);

        // Задача 9: удалите пробелы и получите подстроку от индексов 7 до 11
        String str9 = "   Hello, Java World!   ";
        String trimmedAndSub = str9;
        System.out.println("Обрезанная и извлеченная подстрока: " + trimmedAndSub);

        // Задача 10: переведите строку в верхний регистр и найдите первый индекс подстроки "JAVA"
        String str10 = "Learn Java Programming";
        int indexAfterUpper = str10.toUpperCase().indexOf("JAVA");
        System.out.println("Индекс 'JAVA' после преобразования в верхний регистр: " + indexAfterUpper);

        // Задача 11: Замените "Fun" на "Awesome" и переведите строку в нижний регистр
        String str11 = "Java is Fun";
        String replacedAndLower = str11;
        System.out.println("Измененная и приведенная к нижнему регистру строка: " + replacedAndLower);

        // Задача 12: Удалите лигние пробелы и сравните строки, игнорируя регистр
        String str12a = "  java  ";
        String str12b = "Java";
        boolean isEqualTrimAndIgnoreCase = false;
        System.out.println("Равны ли строки после trim и игнорирования регистра: " + isEqualTrimAndIgnoreCase);

        // Задача 13: получите подстроку начиная с 5 индекса и приведите ее к верхнему регистру
        String str13 = "java programming";
        String subAndUpper = str13;
        System.out.println("Подстрока в верхнем регистре: " + subAndUpper);

        // Задача 14: Присоедините к имеющейся строке "fun", после замените "fun" на "awesome"
        String str14 = "Java is a lot of fun";
        String replacedStr14 = str14;
        System.out.println("Измененная строка: " + replacedStr14);

    }
}
