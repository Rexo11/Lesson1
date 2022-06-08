import java.util.Arrays;

public class Lesson1 {
    //Продвинутый уровень
    public static void main(String[] args) {

        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String textTask1 = "234";
        String textTask2 = "some_text";

        task1(textTask1, textTask2);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        Integer a = 3;
        Integer b = 5;

        task2(a, b);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        Integer[] array1 = {1,2,5,7,10};
        Integer[] array2 = {2,3,2,17,15};

        task3(array1, array2);

        //Задача №4
        //В слове "Hello world!" заменить все l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String textTask4 = "Hello world!";

        task4(textTask4);
    }
    //Задача №1
    public static void task1(String text1, String text2) {
        try
        {
            System.out.println("Задача №1:");
            System.out.println(Integer.parseInt(text1) + text2.length());
            System.out.println("");
        }
        catch (Exception e)
        {
            System.out.println("В первой строке не число\n");
        }
    }
    //Задача №2
    public static void task2(Integer a, Integer b) {
        System.out.println("Задача №2:");
        System.out.println((int) (Math.pow((a + b), 2)));
        System.out.println("");
    }
    //Задача №3
    public static void task3(Integer[] array1, Integer[] array2) {
        Integer lengthArr = array1.length;
        Integer[] array3 = new Integer[lengthArr*3];

        for (int i = 0; i < lengthArr; i++) {
            array3[i] = array1[i];
            array3[i + lengthArr] = array2[i];
            array3[i + lengthArr*2] = array1[i] * array2[i];
        }

        System.out.println("Задача №3:");
        System.out.println(Arrays.toString(array3));
        System.out.println("");
    }

    public static void task4(String text) {
        System.out.println("Задача №4:");
        System.out.println(text.replaceAll("l", "r").toUpperCase().substring(0,8));
        System.out.println("");
    }
}

