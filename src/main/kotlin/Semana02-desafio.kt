data class Pessoa(val nome: String, val idade: Int)

fun main() {
    val pessoas = mutableListOf<Pessoa>()

    do {
        println("Selecione uma opção:")
        println("1 - Adicionar pessoa")
        println("2 - Exibir lista de pessoas")
        println("3 - Exibir média de idade das pessoas")
        println("4 - Buscar pessoa pelo nome")
        println("5 - Remover pessoa pelo nome")
        println("6 - Sair")

        val opcao = readln().toIntOrNull()

        when (opcao) {
            1 -> {
                print("Digite o nome da pessoa: ")
                val nome = readLine()
                print("Digite a idade da pessoa: ")
                val idade = readLine()?.toIntOrNull()

                if (nome != null && idade != null) {
                    pessoas.add(Pessoa(nome, idade))
                    println("Pessoa adicionada com sucesso!")
                } else {
                    println("Dados inválidos!")
                }
            }

            2 -> {
                if (pessoas.isEmpty()) {
                    println("Nenhuma pessoa adicionada ainda.")
                } else {
                    println("Lista de pessoas:")
                    for (pessoa in pessoas) {
                        println("${pessoa.nome} - ${pessoa.idade} anos")
                    }
                }
            }

            3 -> {
                if (pessoas.isEmpty()) {
                    println("Nenhuma pessoa adicionada ainda.")
                } else {
                    val media = pessoas.map { it.idade }.average()
                    println("Média de idade das pessoas: ${media.toInt()} anos")
                }
            }

            4 -> {
                print("Digite o nome da pessoa que deseja buscar: ")
                val nome = readLine()

                if (nome != null) {
                    val pessoa = pessoas.find { it.nome.equals(nome, true) }

                    if (pessoa != null) {
                        println("${pessoa.nome} - ${pessoa.idade} anos")
                    } else {
                        println("Pessoa não encontrada!")
                    }
                } else {
                    println("Nome inválido!")
                }
            }

            5 -> {
                print("Digite o nome da pessoa que deseja remover: ")
                val nome = readLine()

                if (nome != null) {
                    val pessoa = pessoas.find { it.nome.equals(nome, true) }

                    if (pessoa != null) {
                        pessoas.remove(pessoa)
                        println("Pessoa removida com sucesso!")
                    } else {
                        println("Pessoa não encontrada!")
                    }
                } else {
                    println("Nome inválido!")
                }
            }

            6 -> {
                println("Encerrando o programa...")
                break
            }

            else -> {
                println("Opção inválida!")
            }
        }

        println()
    } while (true)
}
