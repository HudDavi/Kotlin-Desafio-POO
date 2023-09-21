# Sistema Educacional em Kotlin

Este é um projeto simples em Kotlin que modela um sistema educacional. Ele permite a criação de bootcamps, formações, inscrições de alunos e o gerenciamento de conteúdos educacionais.

## Conteúdo

- [Visão Geral](#visão-geral)
- [Como Usar](#como-usar)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Visão Geral

Este código implementa um sistema educacional com as seguintes entidades:

- `Nivel`: Uma enumeração que representa os níveis de educação.
- `Aluno`: Uma classe que representa um aluno com nome e idade.
- `ConteudoEducacional`: Uma classe que representa um conteúdo educacional com nome, duração e nível.
- `Bootcamp`: Uma classe que representa um bootcamp com nome e uma lista de conteúdos educacionais. Ela permite a matrícula de alunos.
- `Formacao`: Uma classe que representa uma formação com nome e uma lista de conteúdos educacionais. Ela também permite a matrícula de alunos.

O código cria instâncias dessas classes e demonstra como matricular alunos em bootcamps e formações com diferentes conteúdos educacionais.

## Como Usar

1. Clone este repositório:

```bash
git clone https://github.com/HudDavi/Kotlin-Desafio-POO.git
```

2. Navegue até a pasta do projeto:

```bash
cd Kotlin-Desafio-POO
```

3. Execute o programa:

```bash
kotlin main.kt
```

Siga as instruções no console para criar bootcamps, formações, adicionar conteúdos educacionais e matricular alunos.

## Contribuição

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Fork o projeto.
2. Crie uma nova branch com a sua funcionalidade: `git checkout -b feature/nova-funcionalidade`.
3. Faça commit das suas alterações: `git commit -am 'Adicionei uma nova funcionalidade'`.
4. Faça push para a branch: `git push origin feature/nova-funcionalidade`.
5. Abra uma solicitação pull no GitHub.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).