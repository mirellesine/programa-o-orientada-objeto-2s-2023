package lista2.atividade5;

import java.util.List;

//Criei um sistema de classes que representa a série Game of Thrones
public class Main {
    public static void main(String[] args) {
        // Criar algumas Casas
        Casa stark = new Casa("Stark", "Winter is Coming", "Winterfell");
        Casa targaryen = new Casa("Targaryen", "Fire and Blood", "Dragonstone");
        Casa lannister = new Casa("Lannister", "Hear Me Roar!", "Casterly Rock");

        // Criar alguns Nobres (Personagens e Reis)
        Personagem jonSnow = new Personagem("Jon Snow", stark, "Rei do Norte");
        Personagem daenerys = new Personagem("Daenerys Targaryen", targaryen, "Mãe dos Dragões");
        Rei cersei = new Rei("Cersei Lannister", lannister, 5);
        Rei aegon = new Rei("Aegon", targaryen, 37);
        

        // Fazer juramentos
        jonSnow.fazerJuramento();
        daenerys.fazerJuramento();
        cersei.fazerJuramento();

        // Criar alguns Dragões
        Dragao drogon = new Dragao("Drogon", "Preto", 30.5);
        Dragao rhaegal = new Dragao("Rhaegal", "Verde", 28.0);
        Dragao balerion = new Dragao("Balerion", "Preto", 35);

        // Exibir informações
        System.out.println("Casa de Jon Snow: " + jonSnow.getCasa().getNome());
        System.out.println("Título de Cersei Lannister: " + cersei.getTitulo());
        System.out.println("Dragão Drogon é da cor: " + drogon.getCor());

        // Alterar propriedades
        jonSnow.setTitulo("Guardião do Norte");
        cersei.setAnosDeReinado(7);

        // Exibir informações atualizadas
        System.out.println("Novo título de Jon Snow: " + jonSnow.getTitulo());
        System.out.println("Reinado atual de Cersei Lannister: " + cersei.getAnosDeReinado());

        // Adicionar um dragão ao Personagem
        daenerys.adicionarDragao(drogon);
        daenerys.adicionarDragao(rhaegal);
        aegon.adicionarDragao(balerion);

        // Listar os dragões de Daenerys
        List<Dragao> dragoesDaenerys = daenerys.listarDragoes();
        System.out.println("Dragões de Daenerys:");
        for (Dragao dragao : dragoesDaenerys) {
            System.out.println(dragao.getNome());
        }

        //Listar os dragões de Aegon
        List<Dragao> dragoesDeAegon = aegon.listarDragoes();
        System.out.println("Dragões de Aegon:");
        for (Dragao dragao : dragoesDeAegon) {
            System.out.println(dragao.getNome());
        }
    }
}

