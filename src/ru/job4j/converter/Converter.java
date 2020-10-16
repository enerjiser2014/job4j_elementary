package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(int value) {
        return (float) value / 90;
    }

    public static float rubleToDollar(int value) {
        return (float) value / 77;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " $$.");

        //tests euro
        int inEuro = 180;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("180 rubles are 2Euros. Test result :" + passedEuro);

        //tests dollar
        int inDollar = 154;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("154 rubles are 2$$ . Test result :" + passedDollar);

    }
}
