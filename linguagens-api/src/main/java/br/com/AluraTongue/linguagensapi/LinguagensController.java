package br.com.AluraTongue.linguagensapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagensController {
    
    @Autowired
    private LinguagensRepository repositorio;

    @GetMapping(path = "/Linguagens")
    public List<Linguagem> BuscaLinguagens(){
        List<Linguagem> listaDeLinguagens = repositorio.findAll();
        return listaDeLinguagens;
    }

    @PostMapping(path = "/Linguagens")
    public Linguagem RegistraLinguagem(@RequestBody Linguagem linguagem){
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }
}
