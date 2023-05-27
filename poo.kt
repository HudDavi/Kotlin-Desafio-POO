enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Aluno{
    val nome: String
    val idade: Int

    constructor(nome: String, idade: Int){
        this.nome = nome
        this.idade = idade
    }
}

data class ConteudoEducacional constructor(val nome: String, val duracao: Int, val nivel: Nivel)

data class Bootcamp constructor(val nome: String, val conteudos: List<ConteudoEducacional>){
    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno){
        inscritos.add(aluno)
    }
}

data class Formacao constructor(val nome: String, val conteudos: List<ConteudoEducacional>){
    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno): String{
        inscritos.add(aluno)
        return ("O aluno $aluno.nome com idade $aluno.idade foi matriculado na formação $nome")
    }
}

fun main() {
    val conteudoJavaBasico = ConteudoEducacional("Java Básico", 60, Nivel.BASICO)
    val conteudoJavaIntermediario = ConteudoEducacional("Java Intermediário", 120, Nivel.INTERMEDIARIO)
    val conteudoJavaAvancado = ConteudoEducacional("Java Avançado", 180, Nivel.AVANCADO)

    val conteudoKotlinBasico = ConteudoEducacional("Kotlin Básico", 60, Nivel.BASICO)
    val conteudoKotlinIntermediario = ConteudoEducacional("Kotlin Intermediário", 120, Nivel.INTERMEDIARIO)
    val conteudoKotlinAvancado = ConteudoEducacional("Kotlin Avançado", 180, Nivel.AVANCADO)

    val bootcampJava = Bootcamp("Java", listOf(conteudoJavaBasico))
    val bootcampKotlin = Bootcamp("Kotlin", listOf(conteudoKotlinBasico))

    val formacaoJava = Formacao("Java", listOf(conteudoJavaBasico, conteudoJavaIntermediario, conteudoJavaAvancado))
    val formacaoKotlin = Formacao("Kotlin", listOf(conteudoKotlinBasico, conteudoKotlinIntermediario, conteudoKotlinAvancado))

    val aluno1 = Aluno("Hudson", 30)
    val aluno2 = Aluno("Davi", 30)

    bootcampJava.matricular(aluno1)
    formacaoJava.matricular(aluno1)

    bootcampKotlin.matricular(aluno2)
    formacaoKotlin.matricular(aluno2)
}