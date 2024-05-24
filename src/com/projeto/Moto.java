package com.projeto;
public class Moto extends Veiculo {

    @Override
    public void Ligar() {
        System.out.println("MOTO LIGADA");
        System.out.format("Chassi: %s", getChassi());
       
    }
  
}