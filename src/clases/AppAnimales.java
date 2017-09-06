
package clases;

public class AppAnimales {

    
    public static void main(String[] args) {
        Gato pupi = new Gato();
        Gato pupa = new Gato(Sexo.HEMBRA, "persa");
        Ave ave = new Ave();
        Pinguino pinguino = new Pinguino();
        
        ave.asearse();
        ave.volar();
        pinguino.asearse();
        pinguino.volar();
        
        System.out.println(pupi);
        pupi.dormir();
        System.out.println(pupa);
        pupa.ronronea();
        
        pupi.pelearCon(pupa);
        pupi.comer("Pescado");
        pupa.comer("Mandioca");
        
        pupa.hacerRuido();
        
    }
    
}
