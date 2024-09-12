Estrutura do Projeto
Encapsulamento: As classes terão atributos privados e métodos públicos para acessá-los.
Abstração: Usaremos uma interface para definir um contrato de desconto.
Herança: As classes de estratégias de desconto herdarão de uma classe base ou implementarão uma interface.
Polimorfismo: O sistema será capaz de usar diferentes estratégias de desconto de forma intercambiável.

Explicação dos Pilares de POO
Encapsulamento:
Os atributos das classes são privados e acessíveis apenas através de métodos públicos (getters e setters).
Abstração:
A interface DescontoStrategy define um contrato para as estratégias de desconto, sem expor detalhes de implementação.
Herança:
As classes DescontoPorcentagem e DescontoFixo implementam a interface DescontoStrategy, herdando seu contrato.
Polimorfismo:
O método calcularTotalComDesconto da classe Venda pode usar qualquer implementação de DescontoStrategy, permitindo o uso de diferentes estratégias de desconto de forma intercambiável.
