import java.util.List;
import java.util.ArrayList;

public class Morador {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private List<Vacina> vacinas;

    // Construtor
    public Morador(int id, String nome, String email, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.vacinas = new ArrayList<>();
    }

    // Método para agendar consulta
    public void agendarConsulta(Consulta consulta) {
        consulta.confirmar();
        System.out.println("Consulta agendada para " + consulta.getDataHora() + " com o profissional " + consulta.getProfissional().getNome());
    }

    // Método para consultar informações sobre saúde
    public String consultarInformacoesSaude() {
        return "Informações gerais sobre saúde: Prevenção de doenças, cuidados com a saúde mental, alimentação saudável, etc.";
    }

    // Método para alterar dados de contato
    public void alterarDadosContato(String novoEmail, String novoTelefone) {
        this.email = novoEmail;
        this.telefone = novoTelefone;
        System.out.println("Dados de contato atualizados para: " + novoEmail + " e " + novoTelefone);
    }

    // Método para visualizar o calendário de vacinas
    public List<Vacina> visualizarCalendarioVacinas() {
        if (vacinas.isEmpty()) {
            System.out.println("Você ainda não tem vacinas cadastradas.");
        }
        return vacinas;
    }

    // Método para adicionar vacina ao calendário do morador
    public void adicionarVacina(Vacina vacina) {
        vacinas.add(vacina);
        System.out.println("Vacina " + vacina.getNome() + " adicionada ao calendário de " + nome);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
