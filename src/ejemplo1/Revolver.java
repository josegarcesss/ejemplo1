/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;
/**
 *
 * @author Alakyan
 */
public class Revolver {
private final int[] Tambor;
private final int cantBalas;

    public Revolver() {
        this.Tambor = new int[6];
        this.cantBalas = 0;
    }
    
    public void cargar_Balas(int cantBalas){
        double aux=Math.random();
        for(int i=0;i<6;i++){
            if(cantBalas<i+1){
                if(aux>=0.5){
                    Tambor[i]=1;
                    cantBalas=cantBalas-1;
                    if(cantBalas==0){
                        i=7;
                    }
                }else{
                    Tambor[i]=0;
                }
            }else{
                Tambor[i]=1;                
            }
        }
        System.out.println("Arma Cargada");
    }
    
    
            
}
