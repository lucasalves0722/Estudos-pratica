package com.projeto;
public class Carro extends Veiculo {
    public void Ligar() {
        //ENCAPSULAMENTO
        confereCambio();
        confereCombustivel();
        //FIM ENCAPSULAMENTO
        System.out.println("CARRO LIGADO");
        System.out.format("Chassi: %s\n", getChassi());
    }

    private void confereCombustivel() {
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    private void confereCambio() {
        System.out.println("CONFERINDO CAMBIO");
    }
}
