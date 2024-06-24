package Esteiras;

import Robot.ParteRobo;
import FabricaMain.FabricaRobot;
import java.util.concurrent.atomic.AtomicInteger;
import Log.Logger;

public class GrupoEsteira2 implements Runnable {
    private final int grupo;
    private final AtomicInteger contador = new AtomicInteger(0);
    private static final int FUNCIONARIOS_POR_GRUPO = 9;

    public GrupoEsteira2(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String tipo = "";
                switch (grupo) {
                    case 1: tipo = "corpo"; break;
                    case 2: tipo = "cabeca"; break;
                }
                int funcionario = contador.get() % FUNCIONARIOS_POR_GRUPO + 1;
                ParteRobo parte = new ParteRobo(tipo, grupo, funcionario, contador.incrementAndGet());
                FabricaRobot.esteira2.put(parte);
                Logger.log("Parte produzida: " + parte);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
