import MainTask.*;
import OptionalTaskFirst.*;
import OptionalTaskSecond.*;

public class JavaFundMirzaf4eg
{
    public static void main( String[] args )
    {
//___________________________________________________________
        System.out.println("The main task from mirzaf4eg!");
        System.out.println("\nThe first task: Приветствовать любого пользователя при вводе его имени через командную строку.");
        String user = new TaskFirst().user;
        System.out.println("Hello, " + user + "! " + "Tell us your story.");
        System.out.println("\nThe second task: Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        TaskSecond argsCommandLineRevers= new TaskSecond();
            argsCommandLineRevers.argsCommandLine();
            argsCommandLineRevers.printArgsCommandLineRevers();
        System.out.println("\nThe third task: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        TaskThird arrayRandom = new TaskThird();
            arrayRandom.randomNum();
            arrayRandom.arrayRandomNum();
            arrayRandom.printArrayRandomNum();
        System.out.println("\nThe fourth task: Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.");
        TaskFourth mathFunction = new TaskFourth();
            mathFunction.numberDigit();
        System.out.println("\nThe five task: Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
        TaskFive month = new TaskFive();
            month.numberMonth();
            month.showMouth();
//___________________________________________________________
        System.out.println("\nThe optional task first: Ввести n чисел с консоли.");
        OptionalTaskFirst numberLength = new OptionalTaskFirst();
            numberLength.numberArraySet();
            numberLength.numberLengthArraySet();
        System.out.println("\nThe first task OpOne: Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
            numberLength.MinMaxLength();
        System.out.println("\nThe second task OpOne: Вывести числа в порядке возрастания (убывания) значений их длины.");
            numberLength.sortNumberArrayUP();
            numberLength.sortNumberArrayDOWN();
        System.out.println("\nThe third task OpOne: Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
            numberLength.MoLessAver();
        System.out.println("\nThe fourth task OpOne: Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.");
            numberLength.UniqueNumber();
//___________________________________________________________
        System.out.println("\nThe optional task second: Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).");
        OptionalTaskSecond matrix = new OptionalTaskSecond();
            matrix.SetMatrixN();
            matrix.SetMatrixM();
            matrix.SetMatrix();
            matrix.printMatrix();
        System.out.println("\nThe first Add_taskSecond: Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).");
            matrix.setMatrixK();
            matrix.SortMatrixColumn();
            matrix.printMatrix();
            matrix.SortMatrixRow();
            matrix.printMatrix();
//___________________________________________________________
    }
}
