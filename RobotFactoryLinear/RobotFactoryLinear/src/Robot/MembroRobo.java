package Robot;

public class MembroRobo {
    private final String tipo; // Tipo do membro (ex: braço esquerdo, perna direita)
    private final int grupo; // Grupo de produção do membro
    private final int funcionario; // Identifica o funcionário responsável por este membro
    private final int posicao; // Posiciona o membro na esteira

    public MembroRobo(String tipo, int grupo, int funcionario, int posicao) {
        this.tipo = tipo; // Inicializa o tipo
        this.grupo = grupo; // Inicializa o grupo
        this.funcionario = funcionario; // Inicializa o funcionário
        this.posicao = posicao; // Inicializa a posição
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "MembroRobo{" +
                "tipo='" + tipo + '\'' +
                ", grupo=" + grupo +
                ", funcionario=" + funcionario +
                ", posicao=" + posicao +
                '}';
    }
}
