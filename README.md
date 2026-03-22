# ☕ Desmistificando a POO com Java

Projeto criado para aplicar na prática os pilares fundamentais da **Programação Orientada a Objetos (POO)**. O desafio consiste em abstrair um domínio real (como um sistema de Bootcamp ou plataforma de cursos) e implementar a lógica utilizando Java.


## 🏛️ Os 4 Pilares da POO Aplicados

Para este projeto, os conceitos foram formalizados da seguinte maneira:

1.  **Abstração:** Isolamento de características essenciais de um objeto, como a classe abstrata `Conteudo`, que define a base para Cursos e Mentorias.
2.  **Encapsulamento:** Proteção dos atributos das classes usando modificadores `private`, garantindo que o estado interno só seja alterado por métodos específicos.
3.  **Herança:** Especialização de classes. `Curso` e `Mentoria` herdam comportamentos e atributos comuns de `Conteudo`, evitando repetição de código.
4.  **Polimorfismo:** Capacidade de um objeto ser referenciado de várias formas. O método `calcularXp()` se comporta de maneira distinta para cada tipo de conteúdo.

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Orientada a Objetos (OO)
* **IDE Sugerida:** IntelliJ IDEA ou VS Code

## 📁 Estrutura do Projeto

* `Conteudo.java`: Classe pai (abstrata).
* `Curso.java`: Classe filha com atributo de carga horária.
* `Mentoria.java`: Classe filha com atributo de data.
* `Bootcamp.java`: Reúne conteúdos e desenvolvedores inscritos.
* `Dev.java`: Gerencia a progressão, conteúdos inscritos e concluídos do usuário.
