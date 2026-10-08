package Lista3;

public class num1 {
    public static void main(String[] args) {

        System.out.println("100 dólares em reais: R$ " + dolarParaReal(100, 5.50));
        System.out.println("30°C em Fahrenheit: " + celsiusParaFahrenheit(30));
        converterDias(800);
        System.out.println("90 km/h em m/s: " + kmhParaMs(90));
    }

    private static double dolarParaReal(double dolar, double cotacao) {
        return dolar * cotacao;
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static void converterDias(int diasTotais) {
        int anos = diasTotais / 365;
        int meses = (diasTotais % 365) / 30;
        int dias = (diasTotais % 365) % 30;

        System.out.println(anos + " ano(s), " + meses + " mes(es), " + dias + " dia(s)");
    }

    private static double kmhParaMs(double kmh) {
        return kmh / 3.6;
    }
}
