import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vacina {
    private int id;
    private String nome;
    private Date dataAplicacao;
    private Morador morador;

    // Lista estática que simula o armazenamento das vacinas cadastradas
    private static List<Vacina> vacinasCadastradas = new ArrayList<>();

    // Construtor
    public Vacina(int id, String nome, Date dataAplicacao, Morador morador) {
        this.id = id;
        this.nome = nome;
        this.dataAplicacao = dataAplicacao;
        this.morador = morador;
    }

    // Método para cadastrar a vacina
    public void cadastrar() {
        vacinasCadastradas.add(this);
        System.out.println("Vacina " + nome + " cadastrada para " + morador.getNome());
        notificarMorador();  // Simulando a notificação após o cadastro
    }

    // Método para listar todas as vacinas cadastradas
    public static void listarVacinas() {
        if (vacinasCadastradas.isEmpty()) {
            System.out.println("Nenhuma vacina cadastrada.");
        } else {
            System.out.println("Vacinas cadastradas:");
            for (Vacina vacina : vacinasCadastradas) {
                System.out.println("Nome: " + vacina.getNome() + ", Morador: " + vacina.getMorador().getNome() + ", Data: " + vacina.getDataAplicacao());
            }
        }
    }

    // Método para notificar o morador (simulação)
    public void notificarMorador() {
        // Simula o envio de uma notificação ou mensagem para o morador
        System.out.println("NOTIFICAÇÃO: A vacina " + nome + " foi cadastrada para " + morador.getNome() + ". Data de aplicação: " + dataAplicacao);
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
}

// Para o método abaixo, necessita implementar a biblioteca abaixo (Com Maven)

/**
 * <dependency>
 *     <groupId>com.sun.mail</groupId>
 *     <artifactId>javax.mail</artifactId>
 *     <version>1.6.2</version>
 * </dependency>
 */

/**
 *     // Método para notificar o morador via e-mail
 *     public void notificarMorador() {
 *         String to = morador.getEmail();
 *         String subject = "Vacina cadastrada";
 *         String body = "Olá " + morador.getNome() + ",\n\nA vacina " + nome + " foi cadastrada com sucesso. Data de aplicação: " + dataAplicacao + ".\n\nAtenciosamente,\nSistema de Saúde";
 *
 *         // Envio do e-mail
 *         String from = "seuemail@gmail.com";  // Substitua com o e-mail do administrador
 *         String host = "smtp.gmail.com";
 *         final String username = "seuemail@gmail.com";  // E-mail do administrador
 *         final String password = "suasenha";  // Senha do e-mail do administrador
 *
 *         // Configuração do servidor SMTP
 *         Properties properties = System.getProperties();
 *         properties.setProperty("mail.smtp.host", host);
 *         properties.setProperty("mail.smtp.port", "587");
 *         properties.setProperty("mail.smtp.auth", "true");
 *         properties.setProperty("mail.smtp.starttls.enable", "true");
 *
 *         // Criando uma sessão de autenticação com o e-mail do administrador
 *         Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
 *             protected PasswordAuthentication getPasswordAuthentication() {
 *                 return new PasswordAuthentication(username, password);
 *             }
 *         });
 *
 *         try {
 *             // Criando o objeto MimeMessage
 *             MimeMessage message = new MimeMessage(session);
 *             message.setFrom(new InternetAddress(from));
 *             message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
 *             message.setSubject(subject);
 *             message.setText(body);
 *
 *             // Enviando o e-mail
 *             Transport.send(message);
 *             System.out.println("E-mail de notificação enviado para " + morador.getNome());
 *         } catch (MessagingException mex) {
 *             mex.printStackTrace();
 *         }
 *     }
 */