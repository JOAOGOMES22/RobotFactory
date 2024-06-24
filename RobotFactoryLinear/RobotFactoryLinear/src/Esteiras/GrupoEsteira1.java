package Esteiras;

import Robot.MembroRobo;
import FabricaMain.FabricaRobot;
import java.util.concurrent.atomic.AtomicInteger;
import Log.Logger;

public class GrupoEsteira1 implements Runnable {
    private final int grupo;
    private final AtomicInteger contador = new AtomicInteger(0);
    private static final int FUNCIONARIOS_POR_GRUPO = 12;

    public GrupoEsteira1(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String tipo = "";
                switch (grupo) {
                    case 1: tipo = "bracoEsquerdo"; break;
                    case 2: tipo = "bracoDireito"; break;
                    case 3: tipo = "pernaDireita"; break;
                    case 4: tipo = "pernaEsquerda"; break;
                }
                int funcionario = contador.get() % FUNCIONARIOS_POR_GRUPO + 1;
                MembroRobo membro = new MembroRobo(tipo, grupo, funcionario, contador.incrementAndGet());
                FabricaRobot.esteira1.put(membro);
                Logger.log("Membro produzido: " + membro);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
