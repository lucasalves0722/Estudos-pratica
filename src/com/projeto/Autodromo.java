package com.projeto;
public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("989858");
        //jeep.Ligar();

        Moto z400 = new Moto();
        z400.setChassi("784552");
        //z400.Ligar();

        Veiculo qualquerVeiculo = jeep;
        qualquerVeiculo.Ligar();

    }
}
