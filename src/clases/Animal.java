
package clases;

public abstract class Animal {
    protected Sexo sexo;
    
    public Animal(){
        sexo = Sexo.MACHO;
    }
    public Animal(Sexo sexo){
        this.sexo = sexo;
    }
    
    public Sexo getSexo(){
        return sexo;
    }
    
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
    
    public String toString(){
        return "Sexo: " + this.sexo;
    }
    
    public void dormir(){
        System.out.println("Zzzzzzz");
    }
}
