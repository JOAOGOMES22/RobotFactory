package Robot;

public class Robo {
    private final MembroRobo bracoEsquerdo; // Braço esquerdo do robô
    private final MembroRobo bracoDireito; // Braço direito do robô
    private final MembroRobo pernaEsquerda; // Perna esquerda do robô
    private final MembroRobo pernaDireita; // Perna direita do robô
    private final ParteRobo corpo; // Corpo do robô
    private final ParteRobo cabeca; // Cabeça do robô
    private final int grupoMontagem; // Grupo de montagem do robô
    private final int funcionarioMontagem; // Funcionário responsável pela montagem
    private final int posicao; // Posiciona o robô na esteira

    public Robo(MembroRobo bracoEsquerdo, MembroRobo bracoDireito, MembroRobo pernaEsquerda, MembroRobo pernaDireita, ParteRobo corpo, ParteRobo cabeca, int grupoMontagem, int funcionarioMontagem, int posicao) {
        this.bracoEsquerdo = bracoEsquerdo; // Inicializa o braço esquerdo
        this.bracoDireito = bracoDireito; // Inicializa o braço direito
        this.pernaEsquerda = pernaEsquerda; // Inicializa a perna esquerda
        this.pernaDireita = pernaDireita; // Inicializa a perna direita
        this.corpo = corpo; // Inicializa o corpo
        this.cabeca = cabeca; // Inicializa a cabeça
        this.grupoMontagem = grupoMontagem; // Inicializa o grupo de montagem
        this.funcionarioMontagem = funcionarioMontagem; // Inicializa o funcionário de montagem
        this.posicao = posicao; // Inicializa a posição
    }

    @Override
    public String toString() {
        return "Robo{" +
                "bracoEsquerdo=" + bracoEsquerdo +
                ", bracoDireito=" + bracoDireito +
                ", pernaEsquerda=" + pernaEsquerda +
                ", pernaDireita=" + pernaDireita +
                ", corpo=" + corpo +
                ", cabeca=" + cabeca +
                ", grupoMontagem=" + grupoMontagem +
                ", funcionarioMontagem=" + funcionarioMontagem +
                ", posicao=" + posicao +
                '}';
    }
}
