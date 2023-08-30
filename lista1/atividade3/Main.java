package lista1.atividade3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" ---------------MENU----------------");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. Listar itens");
            System.out.println("5. Buscar item pelo código");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
           

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("");
                    // Adicionar item

                    System.out.print("Digite o código do item: ");
                    int identificador = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a quantidade do item: ");
                    int quantidade = scanner.nextInt();

                    Objeto objeto = new Objeto(nome, quantidade, identificador);
                    estoque.adicionarObjeto(objeto);
                    System.out.println("Item adicionado com sucesso!");
                    break;
                case 2:
                    // Remover item
                    System.out.println("");
                    System.out.print("Digite o código do item a ser removido: ");
                    int idRemover = scanner.nextInt();
                    estoque.removerObjeto(idRemover);
                    System.out.println("Item removido com sucesso!");
                    break;
                case 3:
                    // Atualizar quantidade
                    System.out.println("");
                    System.out.print("Digite o código do item a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(idAtualizar, novaQuantidade);
                    System.out.println("Quantidade atualizada com sucesso!");
                    break;
                    case 4:
                    // Listar itens
                    System.out.println("");
                    System.out.println("Itens no estoque:");
                    List<Objeto> itens = estoque.listarObjetos();
                    for (Objeto currentItem : itens) {
                        System.out.println("Código: " + currentItem.getId());
                        System.out.println("Nome: " + currentItem.getNome());
                        System.out.println("Quantidade: " + currentItem.getQuantidade());
                        System.out.println(""); 
                       
                    }
                    break;
                
                case 5:
                    // Buscar item pelo código
                    System.out.println("");
                    System.out.print("Digite o código do item a ser buscado: ");
                    int codigoBuscar = scanner.nextInt();
                    Objeto itemEncontrado = estoque.buscarObjetoPorId(codigoBuscar);
                    if (itemEncontrado != null) {
                        System.out.println("Item encontrado: " + itemEncontrado.getNome());
                    } else {
                        System.out.println("Item não encontrado");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    scanner.close();
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }

    }
}