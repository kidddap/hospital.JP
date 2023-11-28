/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paciente;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Pacientes {
    protected int numCedu;
    protected String name;
    protected String date;
    protected Date horallega;
    protected String clasificacion;
    protected Date horasali;

    public int getNumCedu() {
        return numCedu;
    }

    public void setNumCedu(int numCedu) {
        this.numCedu = numCedu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date getHorallega() {
        return horallega;
    }

    public void setHorallega(Date horallega) {
        this.horallega = horallega;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Date getHorasali() {
        return horasali;
    }

    public void setHorasali(Date horasali) {
        this.horasali = horasali;
    }

    public Pacientes(int numCedu, String name, String date, Date horallega, String clasificacion, Date horasali) {
        this.numCedu = numCedu;
        this.name = name;
        this.date = date;
        this.horallega = horallega;
        this.clasificacion = clasificacion;
        this.horasali = horasali;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "numCedu=" + numCedu + ", name=" + name + ", date=" + date + ", horallega=" + horallega + ", clasificacion=" + clasificacion + ", horasali=" + horasali + '}';
    }

   
}
