package org.example;

import javax.print.attribute.standard.MediaSize.NA;

public class Phone {

  public static void main(String[] args) {

    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    NavegadorInternet navegadorInternet = new NavegadorInternet();
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    
    aparelhoTelefonico.atender();
    navegadorInternet.adicionarNovaAba();
    reprodutorMusical.selecionarMusica("Paradise City");

  }
}
