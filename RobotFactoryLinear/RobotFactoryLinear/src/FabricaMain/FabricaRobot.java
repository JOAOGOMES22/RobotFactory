package FabricaMain;

import Robot.MembroRobo;
import Robot.ParteRobo;
import Robot.Robo;
import Esteiras.GrupoEsteira1;
import Esteiras.GrupoEsteira2;
import Esteiras.GrupoEsteira3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FabricaRobot {
    public static final BlockingQueue<MembroRobo> esteira1 = new LinkedBlockingQueue<>();
    public static final BlockingQueue<ParteRobo> esteira2 = new LinkedBlockingQueue<>();
    public static final BlockingQueue<Robo> esteira3 = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        Thread grupo1 = new Thread(new GrupoEsteira1(1));
        Thread grupo2 = new Thread(new GrupoEsteira1(2));
        Thread grupo3 = new Thread(new GrupoEsteira1(3));
        Thread grupo4 = new Thread(new GrupoEsteira1(4));

        Thread grupo5 = new Thread(new GrupoEsteira2(1));
        Thread grupo6 = new Thread(new GrupoEsteira2(2));

        Thread grupo7 = new Thread(new GrupoEsteira3(1, 1));
        Thread grupo8 = new Thread(new GrupoEsteira3(2, 2));

        grupo1.start();
        grupo2.start();
        grupo3.start();
        grupo4.start();
        grupo5.start();
        grupo6.start();
        grupo7.start();
        grupo8.start();
    }
}
