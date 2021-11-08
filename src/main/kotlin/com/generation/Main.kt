import com.generation.Funcionario


fun main(args: Array<String>) {



    val fabricio: Funcionario = Funcionario("Fabricio", "Calvanese",
            123, 20, 30,)

        Funcionario.calculateBonus(fabricio)





    val fabricio: Estudantes = Estudantes("Fabricio", "Calvanese",
        123, 50.0, 2)

    val rodrigo: Estudantes = Estudantes("Rodrigo", "Albuquerque",
        542, 60.0, 3)

    val cursoJapones = Cursos("Japonês", "Josinei", 2)
    val cursoIngles = Cursos("Inglês", "Alberto", 1)

    cursoJapones.cadastrar(fabricio)
    cursoIngles.cadastrar(rodrigo)
}