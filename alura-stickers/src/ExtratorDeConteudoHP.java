import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ExtratorDeConteudoHP implements ExtratorDeConteudo{

    @Override
    public List<Conteudo> extrairConteudos(String json) {

        // System.out.println(json);
        // var parser = new JsonParser();
        // List<Map<String, String>> listaDeFilmes = parser.parse(json);

        Gson gson = new Gson();
        Type tipoLista = new TypeToken<ArrayList<String>>() {}.getType();
		ArrayList<String> listaDeFilmes = gson.fromJson(json, tipoLista);
        System.out.println(listaDeFilmes.get(0));

        List<Conteudo> listaDeConteudos = new ArrayList<>();
        
        // for (Map<String, String> personagem: listaDeFilmes){
        //     String name = personagem.get("name");
        //     String url_imagem = personagem.get("image");
        //     String nome_arquivo = name.replaceAll("[-+.^:,]","") + ".png";
        //     Conteudo conteudo = new Conteudo(name, url_imagem, nome_arquivo);
        //     listaDeConteudos.add(conteudo);
        // }
        return listaDeConteudos;
    }

}
