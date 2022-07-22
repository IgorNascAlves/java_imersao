package br.com.AluraTongue.linguagensapi;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagensRepository extends MongoRepository<Linguagem, String>{
    
}
