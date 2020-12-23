
# Modelagem do nosso cinema

Para visualizar o diagrama basta copiar o código a seguir e colá-lo neste site: <https://start.jhipster.tech/jdl-studio/>:

```
entity Cliente {
    nome String,
    cpf String,
    email String,
    idade Integer,
    senha String
}

entity Filme {
    titulo String,
    genero String,
    duracao Integer, // em minutos
	dublado Boolean
}

entity Ingresso {
    codigo Long,
    valor Double,
    horario Date,
    cadeira String, 
    sala Integer,
    data Date,
    filme Filme,
    cliente Cliente
}

relationship ManyToOne {
	Ingresso{cliente} to Cliente
    Ingresso{filme} to Filme
}
```