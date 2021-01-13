/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleadoproject;

/**
 * Clase Empleado Contiene informacion de cada empleado
 * @version 23.06
 * @author Ángeles Dobón, <a href="mailto:angelesdobon@gmail.es">angelesdobon@gmail.es</a>
 */
public class Empleado{

  private String nombre;
  private String apellido;
  private int edad;
  private double salario;

  //Metodos publicos

  /**
   * Suma un plus de XX euros al salario del empleado si el empleado tiene mas de ZZ años<br> 
   * omite esta línea (sustituye la XX por tu año de nacimiento y la ZZ por tu edad)<br>
   * omite esta línea (Si naciste en el 80 y tu edad es de 40 años sería:...)<br>
   * omite esta línea (Suma un plus de 80 euros al salario del empleado si el empleado tiene mas de 40 años)
   * @param sueldoPlus  cantidad en euros que se suma al salario
   * @return <ul><li>true: se suma el plus al sueldo</li><li>false: no se suma el plus al sueldo</li></ul>
   */
  public boolean plus (double sueldoPlus){
    boolean aumento = false ;
    if (edad > 40 && compruebaNombre()){
    salario+= sueldoPlus;
    aumento = true ;
    }
    return aumento ;
  }

  //Metodosprivados
  private boolean compruebaNombre(){
    if(nombre.equals(" ")){
      return false ;
    }
  return true ;
  }

  //Constructores

  /**
   *Constructor por defecto
   */
  public Empleado(){
    this("","",0,0);
  }
  
  /**
   * Contructor con 4 parámetros
   * @param nombre  nombre del empleado
   * @param apellido  apellido del empleado
   * @param edad  edad del empleado
   * @param salario  salario del empleado
   */
  public Empleado (String nombre, String apellido, int edad, double salario){
    this.nombre = nombre ;
    this.apellido = apellido ;
    this.edad = edad;
    this.salario = salario;
  }
}
