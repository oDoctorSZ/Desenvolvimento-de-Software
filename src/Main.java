import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Morador, ProfissionalDeSaude e Administrador
        Morador morador1 = new Morador(1, "João Silva", "joao@example.com", "Rua 1", "123456789");
        Morador morador2 = new Morador(2, "Maria Oliveira", "maria@example.com", "Rua 2", "987654321");

        ProfissionalDeSaude profissional1 = new ProfissionalDeSaude(1, "Dr. Carlos", "Pediatra", "Segunda a Sexta, 9h - 17h");
        ProfissionalDeSaude profissional2 = new ProfissionalDeSaude(2, "Dra. Ana", "Ginecologista", "Segunda a Sexta, 10h - 16h");

        Administrador administrador = new Administrador(1, "Administrador", "admin@example.com", "Admin");

        // Adicionando moradores ao sistema
        administrador.gerenciarUsuarios(morador1);
        administrador.gerenciarUsuarios(morador2);

        // Criando e confirmando uma consulta
        Consulta consulta1 = new Consulta(1, new Date(), profissional1, morador1);
        administrador.gerenciarConsultas(consulta1);  // Confirmando a consulta

        // Alterando data e hora da consulta
        consulta1.alterarDataHora(new Date(System.currentTimeMillis() + 3600000));  // Adicionando 1 hora à data atual

        // Criando e cadastrando vacinas
        Vacina vacina1 = new Vacina(1, "Vacina A", new Date(), morador1);
        Vacina vacina2 = new Vacina(2, "Vacina B", new Date(System.currentTimeMillis() + 86400000), morador2);

        // Cadastrando as vacinas
        profissional1.cadastrarCalendarioVacinas(vacina1);
        profissional2.cadastrarCalendarioVacinas(vacina2);

        // Listando vacinas cadastradas
        Vacina.listarVacinas();

        // Editando informações do profissional de saúde
        profissional1.editarInformacoes("Dr. Carlos Santos", "Cardiologista");

        // Visualizando as estatísticas do sistema
        administrador.visualizarEstatisticas();
    }
}
