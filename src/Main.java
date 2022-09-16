import java.util.Scanner;


/*
*task 1 #32
*Дано вещественное число x. Вычислить  ((x-1)(x-3)(x-7)...(x-63))/((x-2)(x-4)(x-8)...(x-64))
 */
//
class task1{
    public static double pro(double x,int n)
    {
        double num=1,den=2,p=1; //num числитель, den знаменатель

        for (int i=1; i<=n; i++)
        {
            p=p*(x-num)/(x-den);
            num+=2;
            den+=2;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(pro(0.5,31));
    }
}
/*
 *task 2 #57
 *вычислить сумму 1-(1/2)+(1/3)-...+(-1)^(n+1)*1/n
 */
class task2{

        public static double sum(int n)
        {
            double s=0,p=1;
            for (int i=1; i<=n; i++)
            {
                s+=p/(double)i;
                p=-p;
            }
            return s;
        }

        public static void main(String[] args) {
            System.out.println(sum(30));
        }

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

        int g;//гуси
        int k;//кролики
        int n = 64;//вместе 64 лапы


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
    public static void foo()
    {
        int с=0;
        for (int i = 2; i <= 100; i += 2) //т к произведение должно быть кратно 10ти
            for (int j = 5; j < 100; j += 5)
                if ((i*j) == 10*(i+j))
                {
                    System.out.println(i+" "+j);
                    с++;
                }
        System.out.println("Number of pairs="+с);
    }
    public static void main(String[] args) {
        foo();
    }
}