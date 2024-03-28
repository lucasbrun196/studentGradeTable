/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentPackage;

/**
 *
 * @author lucas
 */
public class Student {
    private String name;
    private String mat;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    public Float average(){
        return (nota1 + nota2 + nota3) / 3;
    }
    public String status(){
        Float average = average();
        if(average < 3){
            return "Reprovado";
        }else if(average <= 3 || average < 7){
            return "Em exame";
        }else{
            return "Aprovado";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }
    
}
