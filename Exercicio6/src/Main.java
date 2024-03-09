//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        Motor motor1 = new Motor();
        Motor motor2 = new Motor();

        kart1.nome = "Bmw";
        kart2.nome = "Audi";

        piloto1.nome = "Hamilton";
        piloto2.nome = "Vettel";

        motor1.cilindrada = "150";
        motor2.cilindrada = "100";

        motor1.velocidadeMaxima = 137;
        motor2.velocidadeMaxima = 133;

        piloto1.superPoder();
        piloto2.superPoder();

        motor1.mostraInfo();
        motor2.mostraInfo();

        kart1.pular();
        kart2.pular();
        kart1.fazerDrift();
        kart2.fazerDrift();
        kart1.fazerDrift();



    }
}