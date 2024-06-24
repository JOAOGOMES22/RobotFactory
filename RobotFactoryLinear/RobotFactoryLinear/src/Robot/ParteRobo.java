package Robot;

public class ParteRobo {
    private final String tipo; // Tipo da parte (ex: corpo, cabeça)
    private final int grupo; // Grupo de produção da parte
    private final int funcionario; // Identifica o funcionário responsável por esta parte
    private final int posicao; // Posiciona a parte na esteira

    public ParteRobo(String tipo, int grupo, int funcionario, int posicao) {
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
        return "ParteRobo{" +
                "tipo='" + tipo + '\'' +
                ", grupo=" + grupo +
                ", funcionario=" + funcionario +
                ", posicao=" + posicao +
                '}';
    }
}
