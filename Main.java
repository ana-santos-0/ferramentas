public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(); //esta variavel e uma referencia para um objeto da classe cilindro. contem uma referencia para o objeto cilindro criado na memoria
        double volume;
        cilindro.setRaio(5); //altera o valor do atributo raio daquele objeto. da o valor 5 a variavel de instancia raio - objeto da classe
        cilindro.setAltura(6); //novo valor de altura para o cilindro
        volume=cilindro.calcularVolume(); //guarda na variavel volume o valor do volume o_O
        System.out.println("Volume Cilindro1: " + volume);

        Cilindro cilindro2 = new Cilindro();
        cilindro2.setAltura(10);
        cilindro2.setRaio(6);
        volume=cilindro2.calcularVolume();
        System.out.println("Volume Cilindro2: " + volume);
    }
}