package Esteiras;

import Log.Logger;
import Robot.Robo;
import Robot.MembroRobo;
import Robot.ParteRobo;
import FabricaMain.FabricaRobot;
import java.util.concurrent.atomic.AtomicInteger;

public class GrupoEsteira3 implements Runnable {
    private final int grupo;
    private final int posicao;
    private static final int FUNCIONARIOS_POR_GRUPO = 5;
    private static final AtomicInteger contador = new AtomicInteger(0);

    public GrupoEsteira3(int grupo, int posicao) {
        this.grupo = grupo;
        this.posicao = posicao;
    }

    @Override
    public void run() {
        while (true) {
            try {
                MembroRobo bracoEsquerdo = null;
                MembroRobo bracoDireito = null;
                MembroRobo pernaEsquerda = null;
                MembroRobo pernaDireita = null;
                ParteRobo corpo = null;
                ParteRobo cabeca = null;

                // Busca e valida os membros e partes do robô
                while (bracoEsquerdo == null || bracoDireito == null || pernaEsquerda == null || pernaDireita == null || corpo == null || cabeca == null) {
                    MembroRobo membro = FabricaRobot.esteira1.take();
                    ParteRobo parte = FabricaRobot.esteira2.take();

                    if (membro != null) {
                        switch (membro.getTipo()) {
                            case "bracoEsquerdo":
                                if (bracoEsquerdo == null) {
                                    bracoEsquerdo = membro;
                                }
                                break;
                            case "bracoDireito":
                                if (bracoDireito == null) {
                                    bracoDireito = membro;
                                }
                                break;
                            case "pernaEsquerda":
                                if (pernaEsquerda == null) {
                                    pernaEsquerda = membro;
                                }
                                break;
                            case "pernaDireita":
                                if (pernaDireita == null) {
                                    pernaDireita = membro;
                                }
                                break;
                        }
                    }

                    if (parte != null) {
                        switch (parte.getTipo()) {
                            case "corpo":
                                if (corpo == null) {
                                    corpo = parte;
                                }
                                break;
                            case "cabeca":
                                if (cabeca == null) {
                                    cabeca = parte;
                                }
                                break;
                        }
                    }
                }

                int funcionario = contador.get() % FUNCIONARIOS_POR_GRUPO + 1;
                Robo robo = new Robo(bracoEsquerdo, bracoDireito, pernaEsquerda, pernaDireita, corpo, cabeca, grupo, funcionario, posicao);
                FabricaRobot.esteira3.put(robo);
                Logger.log("Robô montado: " + robo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
