
package clases;

public class Pinguino extends Ave{

    public Pinguino() {
    }

    public Pinguino(Sexo sexo) {
        super(sexo);
    }
    
    public void volar(){
        System.out.println("Yo no puedo volar");
    }
}
