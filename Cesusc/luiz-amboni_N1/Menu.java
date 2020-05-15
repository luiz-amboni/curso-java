package fretadora.cesusc;

import java.time.LocalDateTime;

public class Menu {

    public static void main(String[] args) {

        System.out.println("\nFrutas: ");
        Fruta maca = new Fruta("Maças vermelhas","Comida",30.00f,"fff-555000","Maça Vermelha",3.00f);
        Fruta banana = new Fruta();
        banana.setDescricao("Banana Maçã");
        banana.setTipo("Comida");
        banana.setPeso(15.00f);
        banana.setNumeroNotaFiscal("fff-666000");
        banana.setNomeFruta("Banana-maçã");
        banana.setPrecoFrutaKg(5.00f);
        System.out.println(maca.toString());
        System.out.println(banana.toString());

        System.out.println("\nEmbalagens: ");
        Embalagem embalagem1 = new Embalagem("Embalagem para embrulho de materiais","Embalagem",1f,"eee-5555","Plástico",2000f);
        Embalagem embalagem2 = new Embalagem();
        embalagem2.setDescricao("Embalagem para embrulho de comida");
        embalagem2.setTipo("Embalagem");
        embalagem2.setPeso(0.5f);
        embalagem2.setMaterialEmbalagem("Polímero");
        embalagem2.setQuantidadeEmbalem(200f);
        embalagem2.setNumeroNotaFiscal("eee-6666");
        System.out.println(embalagem1.toString());
        System.out.println(embalagem2.toString());

        System.out.println("\nCombústiveis: ");
        Combústivel gasolina = new Combústivel("Gasolina","Combústivel",10f,"AAA-0001","Gasolina Comum",10f);
        Combústivel diesel = new Combústivel();
        diesel.setDescricao("Diesel");
        diesel.setTipo("Combústivel");
        diesel.setPeso(15f);
        diesel.setNumeroNotaFiscal("AAA-0002");
        diesel.setTipoCombustivel("Diesel");
        gasolina.inpecionar(LocalDateTime.of(2020,5,25,15,20),"Policia Civil");
        diesel.inpecionar(LocalDateTime.of(2020,11,26,11,48),"Petrobras");
        System.out.println(gasolina.toString());
        System.out.println(diesel.toString());

        System.out.println("\nProdutos Perigosos: ");
        ProdutosPerigosos produtoInflamavel = new ProdutosPerigosos("Alcool","Liquido Inflmável",50.00f,"BBB-0001","Alcool etilico");
        ProdutosPerigosos gasCozinha = new ProdutosPerigosos();
        gasCozinha.setDescricao("GLP");
        gasCozinha.setTipo("Gás explosivo");
        gasCozinha.setPeso(70.00f);
        gasCozinha.setNumeroNotaFiscal("CCC-0001");
        gasCozinha.setNomeMercadoria("Gás Loquefeito de Prtróleo");
        produtoInflamavel.inpecionar(LocalDateTime.of(2020,8,20,8,21),"Policia Federal");
        gasCozinha.inpecionar(LocalDateTime.of(2020,07,29,10,30),"Policia Militar");
        System.out.println(produtoInflamavel.toString());
        System.out.println(gasCozinha.toString());


        System.out.println("\nFretes regulares: ");
        FreteRegular freteRegular1 = new FreteRegular(maca.getDescricao(),"Nova Veneza","Florianópolis",260.00f,3.00f,"Dias Semanais",2);
        FreteRegular freteRegular2 = new FreteRegular();
        freteRegular2.setMercadoria(banana.getDescricao());
        freteRegular2.setCidadeOrigem("Criciúma");
        freteRegular2.setCidadeDestino("Içara");
        freteRegular2.setDistanciaKm(40.00f);
        freteRegular2.setFrequencia(2.00f);
        freteRegular2.setUnidadeFrequencia("Semanas Mensais");
        freteRegular2.setQuantidadeOperacoes(3);
        System.out.println(freteRegular1.toString());
        System.out.println(freteRegular2.toString());
        System.out.println("Valor total do frete regular 1: " + freteRegular1.calculaValorFrete());
        System.out.println("Valor total do frete regular 2: " + freteRegular2.calculaValorFrete());

        System.out.println("\nFretes por Demanda: ");
        FreteDemanda freteDemanda1 = new FreteDemanda(embalagem1.getDescricao(),"Nova Veneza","Florianópolis",260.00f,LocalDateTime.of(2020,2,18,12,58));
        FreteDemanda freteDemanda2 = new FreteDemanda();
        freteDemanda2.setMercadoria(embalagem2.getDescricao());
        freteDemanda2.setCidadeOrigem("Criciúma");
        freteDemanda2.setCidadeDestino("Içara");
        freteDemanda2.setDistanciaKm(40.00f);
        freteDemanda2.setDataColeta(LocalDateTime.of(2020,7,23,13,5));
        System.out.println(freteDemanda1.toString());
        System.out.println(freteDemanda2.toString());
        System.out.println("Valor total do frete por demanda 1: " + freteDemanda1.calculaValorFrete());
        System.out.println("Valor total do frete por demanda 2: " + freteDemanda2.calculaValorFrete());

    }
}
