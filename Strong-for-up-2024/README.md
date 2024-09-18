```mermaid
classDiagram
    class Cliente {
        int id
        string nome
        string cpf
        Date dataNascimento
        string endereco
        string telefone
        string email
    }

    class Plano {
        string incon
        string descricao
    }

    class Matricula {
        Date dataMatricula
        Cliente cliente
        Plano plano
    }

    class Pagamento {
        Date dataPagamento
        float valor
    }```

    Cliente "1" --> "1" Matricula : possui
    Plano "1" --> "1..*" Matricula : inclui
    Matricula "1" --> "1" Pagamento : gera
