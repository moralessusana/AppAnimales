
package clases;


public class Gato extends Animal implements Mascota{
    private String raza;

    public Gato(){
        super(Sexo.MACHO);
        this.raza = "siames";
    }
    public Gato(Sexo sexo){
        super(sexo);
        this.raza = "siames";
    }
    public Gato(String raza) {
        super(Sexo.MACHO);
        this.raza = raza;
    }
    public Gato(Sexo sexo, String raza) {
        super(sexo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void maulla(){
        System.out.println("Miauuuu");
    }
    public void ronronea(){
        System.out.println("grgrgrgrggrgrgrgr");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nRaza: " + raza;
    }
    
    public void comer(String comida){
        if(comida.toLowerCase().equals("pescado")){
            System.out.println("Mmmm, gracias!");
        } else {
            System.out.println("No gracias, no me gusta " + comida);
        }
    }
    
    public void pelearCon(Animal contrincante){
        if(this.getSexo()==contrincante.getSexo()){
            if(this.getSexo() == Sexo.HEMBRA){
                System.out.println("Las gatas se pelean");
            } else {
                System.out.println("Los gatos se insultan");
            }
        } else {
            System.out.println("No hay pelea");
        }
    }
    public void hacerRuido(){
        maulla();
        ronronea();
    }
}
