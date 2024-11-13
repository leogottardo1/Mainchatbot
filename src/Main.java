import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta = "";
        MiniChatbot bot = new MiniChatbot();
        bot.dizerOla();
        while (!resposta.equals("sair")) {
            resposta = scan.nextLine();
            if (resposta.toLowerCase().contains("oi") || resposta.toLowerCase().contains("olá")) {
                bot.ajudar();
            } else if (resposta.toLowerCase().contains("como você esta?")) {
                bot.comoEstou();
            } else if (resposta.toLowerCase().contains("você gosta de esportes?")) {
                bot.esportes();
            } else if (resposta.toLowerCase().contains("qual é o seu nome?")) {
                bot.MeuNome();
            } else if (resposta.toLowerCase().contains("sair")) {
                bot.sairr();
            } else {
                bot.naoEntendiaPergunta();
            }
        }
    }
}