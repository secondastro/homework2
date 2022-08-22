public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte a = 3; short b = 2; int c = 4; long d = 10000000000000L;
        float f = 1.234f; double w = 1.23456;
        boolean x = true; char q = 'q';
        //Задание 2
        double firstWeight = 78.2;
        double secondWeight = 82.7;
        double summaryWeight = firstWeight+secondWeight;
        double diffWeight = Math.abs(secondWeight - firstWeight);
        System.out.println("Общий вес двух бойцов: " + summaryWeight);
        System.out.println("Разница в весе: " + diffWeight);
        //Задание 3
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int blendWeight = (bananaWeight*banana+milkWeight*milk+iceCreamWeight*iceCream+eggWeight*egg);
        int grams = 1000;

        double total = blendWeight/(grams*1.0);
        System.out.println("Масса завтрака: " + total);
        //Задание 4
        int aim = 7;
        int gramsInKg = 1000;
        int dayWeight1=250;
        int dayWeight2=500;
        int days1 = aim*gramsInKg/dayWeight1; int days2=aim*gramsInKg/dayWeight2;
        int daysMid = (days1+days2)/2;
        System.out.println("Максимальное кол-во дней: " + days1);
        System.out.println("Минимальное кол-во дней: " + days2);
        System.out.println("Среднее количество дней: " + daysMid);
        //Задание 5
        int misha = 67760; int denis =83690; int kristina = 76230;
        int mishaNew = misha + misha/10;
        int denisNew = denis + denis/10;
        int kristinaNew = kristina + kristina/10;
        int mishaDiff = (mishaNew-misha)*12;
        int denisDiff = (denisNew-denis)*12;
        int kristinaDiff = (kristinaNew-kristina)*12;
        System.out.println("Миша теперь получает " + mishaNew + " рублей. Годовой доход вырос на " + mishaDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей.");
    }
}