package F4;

import Lampada.Modo;

public class TesteCasaIInteligente{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Lampada l1 = new Lampada(Modo.ON, 5, 2, 0, 0);
        Lampada l2 = new Lampada(Modo.OFF, 10, 3, 0, 0);
        
        CasaInteligente ci = new CasaInteligente();
        
        ci.addLampada(l1);
        ci.addLampada(l2);
        System.out.println(ci);
        
        ci.ligaLampadaNormal(0);
        ci.ligaLampadaEco(1);
        System.out.println(ci);
        
        ci.ligaTodasEco();
        System.out.println(ci);
        System.out.println(ci.qtEmEco());
        
        ci.ligaTodasMax();
        System.out.println(ci);
        System.out.println(ci.qtEmEco());
        
        ci.removeLampada(0);
        System.out.println(ci);
    }
}