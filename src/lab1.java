import java.util.Scanner;
/*
*task 1 #32
*Дано вещественное число x. Вычислить  ((x-1)(x-3)(x-7)...(x-63))/((x-2)(x-4)(x-8)...(x-64))
 */
class task1{

}
/*
 *task 2 #57
 *вычислить сумму 1-(1/2)+(1/3)-...+(-1)^(n+1)*1/n
 */
class task2{

}

/*
* task 3 #82
* Даны натуральное число n и вещественные числа а1, a2, …, аn. Определить сумму этих чисел.
 */
class task3 {
    public static void main(String[] args) {
        int n, i;
        double a, s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        n = scanner.nextInt();
        for (i = 1; i <= n; ++i) {
            System.out.print("Enter a" + i + ": ");
            a = scanner.nextDouble();
            s += a ;
        }
        System.out.println("\nSum: " + s);
    }
}
/*
 *task 4 #107
 *У гусей и кроликов вместе 64 лапы. Сколько может быть кроликов и гусей (указать все сочетания)?
 */
class task4 {
    public static void main(String[] args) {

        int g;
        int k;
        int n = 64;


        {
            for (g = 0; g <= n; g++) {
                for (k = 0; k <= n / 2; k++) {
                    if (2 * g + 4 * k == n) {
                        System.out.println("\nGusy " + g);
                        System.out.println("Kroli " + k);

                    }

                }
            }
        }
    }
}
/*
 *task 5 #132
 *Определить пары натуральных чисел а < 100 и b < 100, произведение которых в 10 раз больше их суммы. Сколько таких пар?
 */
class task5{

}