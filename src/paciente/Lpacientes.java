/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paciente;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Lpacientes extends Pacientes{
    protected ArrayList <Pacientes> ListaPa= new ArrayList<>();

    public Lpacientes(int numCedu, String name, String date, Date horallega, String clasificacion, Date horasali) {
        super(numCedu, name, date, horallega, clasificacion, horasali);
    }


  
    private void addPaciente(Pacientes paci){
        if ("Rojo".equals(this.clasificacion)) {
            ListaPa.add(0, paci);
        }
        if ("Amarillo".equals(this.clasificacion)) {
            ListaPa.add(1, paci);
        }
        if ("verde".equals(this.clasificacion)) {
            ListaPa.add(paci);
        }
    }
    
    private boolean atenderPaci(Pacientes paci, boolean atendido){
        for (Pacientes ListaPa1 : ListaPa) {
            if (atendido==true) {
                return " ya se puede ir ".equals(atendido);
            } else {
            }
        }
        return false;
       
}
    private void searchPaci(){
        for(Pacientes p:ListaPa){
            System.out.println(p);
        }
        
    }
    
}
