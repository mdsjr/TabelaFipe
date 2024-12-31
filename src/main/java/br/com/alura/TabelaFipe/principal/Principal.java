package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1";

    public void exibeMenu() {
        var menu = """
                ***OPÇÕES***
                Carro
                Moto
                Caminhão
                
                Digite a opção desejada: """;
                
        System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco;

        if (opcao.toLowerCase().contains("carro")) {
            endereco = URL_BASE + "/carros/marcas";
        } else if (opcao.toLowerCase().contains("moto")) {
            endereco = URL_BASE + "/motos/marcas";
        } else if (opcao.toLowerCase().contains("caminhão")) {
            endereco = URL_BASE + "/caminhoes/marcas";
        } else {
            System.out.println("Opção inválida");
            return;
        }

        var json = consumo.obterDados(endereco);
        System.out.println(json);

    }
}
