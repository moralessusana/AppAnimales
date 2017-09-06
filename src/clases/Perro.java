/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Admin
 */
public class Perro extends Animal implements Mascota{
    private int peso;
    
    @Override
    public void comer(String comida) {
        if(comida.toLowerCase().equals("purina")){
            System.out.println("Mmmm, gracias!");
        } else {
            System.out.println("No gracias, no me gusta " + comida);
        }
    }

    @Override
    public void pelearCon(Animal contrincante) {
        if(this.getSexo()==contrincante.getSexo()){
            if(this.getSexo() == Sexo.HEMBRA){
                System.out.println("Las perras se ladran");
            } else {
                System.out.println("Los perros se pelean");
            }
        } else {
            System.out.println("No hay pelea");
        }
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau Guau");
    }
    
}
