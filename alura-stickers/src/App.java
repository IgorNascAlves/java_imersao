import java.io.InputStream;
import java.net.URL;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        // String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        // ExtratorDeConteudo extratorDeConteudo = new ExtratorDeConteudoIMDB();

        // String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
        // ExtratorDeConteudo extratorDeConteudo = new ExtratorDeConteudoNASA();

        // String url = "http://hp-api.herokuapp.com/api/characters";
        // ExtratorDeConteudo extratorDeConteudo = new ExtratorDeConteudoHP();

        String url = "http://localhost:8080/Linguagens";
        ExtratorDeConteudo extratorDeConteudo = new ExtratorDeConteudoLinguagens();

        PegaResposta pegaResposta = new PegaResposta();
        String json = pegaResposta.buscaResposta(url);
        List<Conteudo> listaDeConteudos = extratorDeConteudo.extrairConteudos(json);        
        GeradoraDeFigurinhas gerador = new GeradoraDeFigurinhas();

        for (int i = 0; i < 3; i++) {
            
            Conteudo conteudo = listaDeConteudos.get(i);

            String titulo = conteudo.titulo();
            String url_filme = conteudo.urlImagem();
            String nome_arquivo = conteudo.nome_arquivo();
            InputStream stream_image_filme = new URL(url_filme).openStream();

            gerador.criar(stream_image_filme, nome_arquivo, titulo);

            System.out.println(titulo);
        }


    }
}