import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private int id;
    private String nome;
    private String email;
    private String nivelAcesso;

    private static List<Morador> moradores = new ArrayList<>();
    private static List<Consulta> consultas = new ArrayList<>();

    public Administrador(int id, String nome, String email, String nivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nivelAcesso = nivelAcesso;
    }

    // Gerenciar usuários: adicionar, remover ou listar moradores
    public void gerenciarUsuarios(Morador morador) {
        if (!moradores.contains(morador)) {
            moradores.add(morador);
            System.out.println("Morador " + morador.getNome() + " adicionado ao sistema.");
        } else {
            System.out.println("Morador " + morador.getNome() + " já existe no sistema.");
        }

        // Visualizar todos os moradores
        System.out.println("Lista de moradores:");
        for (Morador m : moradores) {
            System.out.println(m.getNome() + " - " + m.getEmail());
        }
    }

    // Gerenciar consultas: confirmar ou cancelar consultas
    public void gerenciarConsultas(Consulta consulta) {
        if ("pendente".equals(consulta.getStatus())) {
            consulta.confirmar();
        } else if ("confirmada".equals(consulta.getStatus())) {
            consulta.cancelar();
        } else {
            System.out.println("Consulta com status " + consulta.getStatus() + " não pode ser alterada.");
        }
    }

    // Visualizar estatísticas: número de moradores e consultas
    public void visualizarEstatisticas() {
        System.out.println("Estatísticas do sistema:");
        System.out.println("Total de moradores: " + moradores.size());
        System.out.println("Total de consultas: " + consultas.size());
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

    public String getNivelAcesso() {
        return nivelAcesso;
    }
}
