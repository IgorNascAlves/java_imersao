import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoNASA implements ExtratorDeConteudo {

    @Override
    public List<Conteudo> extrairConteudos(String json) {
       
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(json);
        List<Conteudo> listaDeConteudos = new ArrayList<>();
        
        for (Map<String, String> filme: listaDeFilmes){
            String titulo = filme.get("title");
            String url_filme = filme.get("url");
            String nome_arquivo = titulo.replaceAll("[-+.^:,]","") + ".png";
            Conteudo conteudo = new Conteudo(titulo, url_filme, nome_arquivo);
            listaDeConteudos.add(conteudo);
        }

        return listaDeConteudos;
    }
    
}