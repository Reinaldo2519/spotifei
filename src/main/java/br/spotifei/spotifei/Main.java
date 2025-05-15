/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.spotifei.spotifei;

import br.spotifei.dao.UsuarioDAO;
import br.spotifei.model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("===== MENU =====");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Fazer login");
        System.out.print("Escolha: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        if (opcao == 1) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario novo = new Usuario(0, nome, email, senha, "comum");
            dao.cadastrar(novo);

        } else if (opcao == 2) {
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario usuario = dao.buscarPorEmailESenha(email, senha);
            if (usuario != null) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + usuario.getNome());
            } else {
                System.out.println("Email ou senha inválidos.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

