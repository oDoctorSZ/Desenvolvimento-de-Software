import java.util.List;

public class ProfissionalDeSaude {
    private int id;
    private String nome;
    private String especialidade;
    private String disponibilidade;

    public ProfissionalDeSaude(int id, String nome, String especialidade, String disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.disponibilidade = disponibilidade;
    }

    public void cadastrarCalendarioVacinas(Vacina vacina) {
        vacina.cadastrar(); // Chama o método da classe Vacina para cadastrar
        System.out.println("Vacina " + vacina.getNome() + " cadastrada no calendário.");
    }

    public void confirmarConsulta(Consulta consulta) {
        consulta.confirmar();
        System.out.println("Consulta confirmada com " + consulta.getProfissional().getNome());
    }

    public void editarInformacoes(String novoNome, String novaEspecialidade) {
        this.nome = novoNome;
        this.especialidade = novaEspecialidade;
        System.out.println("Informações editadas para: " + novoNome + " - " + novaEspecialidade);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
}
