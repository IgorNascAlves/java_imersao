package br.com.AluraTongue.linguagensapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="linguagensAlura")
public record Linguagem(@Id String id, String title, String url, int ranking){}