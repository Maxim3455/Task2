public class Main {
    public static void main(String[] args){
        System.out.println("1) " + repeat("max", 3));
        System.out.println("2) " + differenceMaxMin(new int[]{1, 3, 7}));
        System.out.println("3) " + isAvgWhole(new int[]{1,2,3,4}));
        int a [] = new int[]{1, 2, 3, 4};
        int b[] = cumulativeSum(a);
        for (int i = 0; i < b.length; i++){
            System.out.println("*4) " + b[i]);
        }
        System.out.println("5) " + getDecimalPlaces("234.5768"));
        System.out.println("6) " + Fibonacci(12));
        System.out.println("7) " + isValid("324226"));
        System.out.println("8) " + isStrangePair("radio", "orator"));
        System.out.println("9) " + isPrefix("automation", "auto-"));
        System.out.println("9.1) " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("10) " + boxSeq(3));
    }
    //Повторение каждого символа n раз.
    public static String repeat(String m, int a){
        String now = "";
        for (int i = 0; i < m.length(); i++){
            for (int j = 0; j < a; j++){
                now += m.charAt(i);
            }
        }
        return now;
    }
    //Разница между максимальным и минимальным значениями.
    public static int differenceMaxMin(int a[]){
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }else if(max < a[i]){
                max = a[i];
            }
        }
        return max - min;
    }
    //Среднее значение.
    public static boolean isAvgWhole(int a[]){
        int res = 0;
        for(int i = 0; i < a.length; i++){
            res += a[i];
        }
        return (res % a.length == 0);
    }
    //Массив, в котором каждое целое число является суммой самого себя + всех предыдущих чисел в массиве.
    public static int [] cumulativeSum(int [] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++)
                b[i] += a[j];
        }
        return b;
    }
    // Число десятичных знаков
    public static int getDecimalPlaces(String a){
        int F = a.indexOf(".");
        int res = a.length()- F - 1;
        return res;
    }
    // Число Фибоначчи.
    public static int Fibonacci(int a){
        int F[] = new int[a+1];
        F[0] = 1;
        F[1] = 1;
        int res = 0;
        for (int n = 2; n < F.length; n++){
            F[n] = F[n-1] + F[n-2];
        }
        return F[a];
    }
    // Проверка почтовых индексов
    public static boolean isValid(String s) {
        int a = Integer.parseInt(s);
        return (s.length() == 5 && (a == (int)a) && s.contains(""));
    }
    // ФункциЯ, которая возвращает true, если пара строк представляет собой странную пару, и false в противном случае.
    public static boolean isStrangePair(String a, String b){
        return (a.substring(0,1).equals(b.substring(b.length()-1))) &&
                (b.substring(0,1).equals(a.substring(a.length()-1)));
    }
    // Префикс
    public static boolean isPrefix(String a, String b){
        b = b.substring(0, b.length() - 1);
        return a.indexOf(b) == 0;
    }
    // Суффикс
    public static boolean isSuffix(String a, String b){
        b = b.substring(1);
        return (a.length()-a.lastIndexOf(b)) == b.length();
    }
    // Функция, которая принимает число (шаг) в качестве аргумента и
    // возвращает количество полей на этом шаге последовательности.
    public static int boxSeq(int n){
        int a = 0;
        for (int i = 0; i < n; i++){
            if (i % 2==0){
                a += 3;
            }else a--;
        }
        return a;
    }
}
