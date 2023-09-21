enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

// Classe que representa um aluno com nome e idade
class Aluno {
    val nome: String
    val idade: Int

    constructor(nome: String, idade: Int) {
        this.nome = nome
        this.idade = idade
    }
}

// Classe que representa um conteúdo educacional com nome, duração e nível
data class ConteudoEducacional constructor(val nome: String, val duracao: Int, val nivel: Nivel)

// Classe que representa um bootcamp com nome e uma lista de conteúdos educacionais
data class Bootcamp constructor(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
    }
}

// Classe que representa uma formação com nome e uma lista de conteúdos educacionais
data class Formacao constructor(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
    }
}

fun main() {
    // Criando alguns conteúdos educacionais
    val conteudoJavaBasico = ConteudoEducacional("Java Básico", 60, Nivel.BASICO)
    val conteudoJavaIntermediario = ConteudoEducacional("Java Intermediário", 120, Nivel.INTERMEDIARIO)
    val conteudoJavaAvancado = ConteudoEducacional("Java Avançado", 180, Nivel.AVANCADO)

    val conteudoKotlinBasico = ConteudoEducacional("Kotlin Básico", 60, Nivel.BASICO)
    val conteudoKotlinIntermediario = ConteudoEducacional("Kotlin Intermediário", 120, Nivel.INTERMEDIARIO)
    val conteudoKotlinAvancado = ConteudoEducacional("Kotlin Avançado", 180, Nivel.AVANCADO)

    // Criando bootcamps e formações com esses conteúdos educacionais
    val bootcampJava = Bootcamp("Java", listOf(conteudoJavaBasico))
    val bootcampKotlin = Bootcamp("Kotlin", listOf(conteudoKotlinBasico))

    val formacaoJava = Formacao("Java", listOf(conteudoJavaBasico, conteudoJavaIntermediario, conteudoJavaAvancado))
    val formacaoKotlin = Formacao("Kotlin", listOf(conteudoKotlinBasico, conteudoKotlinIntermediario, conteudoKotlinAvancado))

    // Criando alguns alunos
    val aluno1 = Aluno("Hudson", 30)
    val aluno2 = Aluno("Davi", 30)

    // Matriculando os alunos nos bootcamps e formações
    bootcampJava.matricular(aluno1)
    formacaoJava.matricular(aluno1)

    bootcampKotlin.matricular(aluno2)
    formacaoKotlin.matricular(aluno2)
}