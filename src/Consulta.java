import java.util.Date;

public class Consulta {
    private int id;
    private Date dataHora;
    private String status;
    private ProfissionalDeSaude profissional;
    private Morador morador;

    public Consulta(int id, Date dataHora, ProfissionalDeSaude profissional, Morador morador) {
        this.id = id;
        this.dataHora = dataHora;
        this.profissional = profissional;
        this.morador = morador;
        this.status = "pendente";  // O status inicial é "pendente"
    }

    // Método para confirmar a consulta
    public void confirmar() {
        if ("pendente".equals(this.status)) {
            this.status = "confirmada";
            System.out.println("Consulta confirmada para " + morador.getNome() + " com " + profissional.getNome() + " na data " + dataHora);
        } else if ("confirmada".equals(this.status)) {
            System.out.println("A consulta já está confirmada para " + morador.getNome() + ".");
        } else {
            System.out.println("Não é possível confirmar a consulta, ela está " + status);
        }
    }

    // Método para cancelar a consulta
    public void cancelar() {
        if ("pendente".equals(this.status)) {
            this.status = "cancelada";
            System.out.println("Consulta cancelada para " + morador.getNome());
        } else if ("cancelada".equals(this.status)) {
            System.out.println("A consulta já foi cancelada para " + morador.getNome());
        } else {
            System.out.println("Não é possível cancelar a consulta, ela já foi confirmada.");
        }
    }

    // Método para alterar a data e hora da consulta
    public void alterarDataHora(Date novoHorario) {
        if ("pendente".equals(this.status) || "confirmada".equals(this.status)) {
            this.dataHora = novoHorario;
            System.out.println("Data e hora alteradas para " + novoHorario + " para " + morador.getNome());
        } else {
            System.out.println("Não é possível alterar a data de uma consulta cancelada.");
        }
    }

    // Getters
    public int getId() {
        return id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public ProfissionalDeSaude getProfissional() {
        return profissional;
    }

    public Morador getMorador() {
        return morador;
    }
}
