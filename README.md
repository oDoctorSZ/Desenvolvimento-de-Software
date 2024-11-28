Documentação Técnica do Sistema
1. Visão Geral do Sistema
O sistema de gestão de saúde comunitária tem como objetivo otimizar a administração dos serviços de saúde em comunidades locais. Ele permite o gerenciamento de consultas médicas, vacinas, moradores e profissionais de saúde, garantindo um controle eficiente e um melhor acesso às informações de saúde. O sistema é projetado para facilitar agendamentos, notificações de vacinas e administração de dados dos usuários.

2. Descrição das Classes e Funcionalidades
2.1. Classe: Morador
Responsabilidade: Representa os moradores do sistema, contendo suas informações pessoais e permitindo o agendamento de consultas e o acompanhamento de vacinas.

Atributos:
id: Identificador único do morador.
nome: Nome completo do morador.
email: E-mail de contato do morador.
endereco: Endereço do morador.
cpfCnpj: CPF ou CNPJ, dependendo do tipo de morador.
Métodos:
agendarConsulta(Consulta consulta): Permite que o morador agende uma consulta com um profissional de saúde.
alterarDadosContato(String novoEmail, String novoEndereco, String novoCpfCnpj): Altera as informações de contato do morador.
visualizarCalendarioVacinas(): Permite que o morador veja as vacinas agendadas e seu status.
adicionarVacina(Vacina vacina): Permite que o morador adicione uma vacina ao seu histórico.
2.2. Classe: ProfissionalDeSaude
Responsabilidade: Representa os profissionais de saúde que prestam serviços médicos aos moradores.

Atributos:

id: Identificador único do profissional.
nome: Nome completo do profissional de saúde.
especialidade: Especialidade do profissional (ex: Pediatra, Ginecologista).
horarioAtendimento: Horário de atendimento disponível.
Métodos:

cadastrarCalendarioVacinas(Vacina vacina): Cadastra uma vacina para os moradores do sistema.
editarInformacoes(String novoNome, String novaEspecialidade): Permite ao profissional editar suas informações pessoais.
listarConsultas(): Exibe todas as consultas agendadas com o profissional.
2.3. Classe: Administrador
Responsabilidade: Gerencia os usuários (moradores) e consultas, além de fornecer estatísticas sobre o uso do sistema.

Atributos:

id: Identificador único do administrador.
nome: Nome completo do administrador.
email: E-mail de contato do administrador.
nivelAcesso: Nível de acesso (admin, gerente, etc.).
Métodos:

gerenciarUsuarios(Morador morador): Adiciona ou remove moradores do sistema.
gerenciarConsultas(Consulta consulta): Confirma ou cancela consultas.
visualizarEstatisticas(): Exibe as estatísticas do sistema, como o número de moradores e consultas.
2.4. Classe: Consulta
Responsabilidade: Representa uma consulta médica, permitindo o gerenciamento de seu status (pendente, confirmada, cancelada) e alteração de data e hora.

Atributos:

id: Identificador único da consulta.
dataHora: Data e hora da consulta.
status: Status da consulta (pendente, confirmada, cancelada).
profissional: Profissional de saúde responsável pela consulta.
morador: Morador que agendou a consulta.
Métodos:

confirmar(): Confirma a consulta, alterando seu status para "confirmada".
cancelar(): Cancela a consulta, alterando seu status para "cancelada".
alterarDataHora(Date novoHorario): Permite alterar a data e hora da consulta.
2.5. Classe: Vacina
Responsabilidade: Representa uma vacina aplicada ao morador, permitindo o cadastro, listagem e notificação sobre o agendamento de vacinas.

Atributos:

id: Identificador único da vacina.
nome: Nome da vacina.
dataAplicacao: Data em que a vacina foi ou será aplicada.
morador: Morador que recebeu a vacina.
Métodos:

cadastrar(): Cadastra a vacina no sistema e envia uma notificação ao morador.
listarVacinas(): Exibe todas as vacinas cadastradas no sistema.
notificarMorador(): Simula o envio de uma notificação para o morador sobre a vacina.
3. Fluxo de Funcionalidades
Cadastro de Moradores: O administrador pode adicionar moradores ao sistema, que terão suas informações de contato e histórico de consultas/vacinas gerenciados.

Agendamento de Consultas: Moradores podem agendar consultas com profissionais de saúde, que podem ser confirmadas ou canceladas. Caso a consulta seja confirmada, o status é alterado para "confirmada".

Cadastro de Vacinas: Profissionais de saúde podem cadastrar vacinas para os moradores, que receberão notificações sobre as vacinas aplicadas.

Gestão de Consultas: O administrador pode gerenciar consultas, seja confirmando ou cancelando.

Estatísticas do Sistema: O administrador pode acessar estatísticas, como o número de moradores e consultas realizadas.

4. Tecnologias Utilizadas
Java: A linguagem principal usada para o desenvolvimento do sistema.
JDK: A versão 11 ou superior é recomendada para compilar e rodar o sistema.
Biblioteca de E-mail: Para envio de notificações por e-mail (quando implementado).

5. Fluxo de Execução
Administração de Moradores: O administrador pode gerenciar os moradores, incluindo a adição e a remoção, além de visualizar suas informações.
Gestão de Consultas: O administrador e os moradores podem interagir com consultas, como agendamentos, confirmações, cancelamentos e alterações.
Cadastro e Acompanhamento de Vacinas: Profissionais de saúde registram vacinas, e os moradores recebem as notificações pertinentes.
