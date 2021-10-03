/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.remoto;

import java.util.Hashtable;


/**
 *
 * @author Eduar
 */
public class ControleRemoto {

    public int power;
    public int volume;
    public int mute;
    public String canal = "";
    public String mn_canal;
    public int captions;
    public boolean netflix;
    public int zoom; 
    public boolean menu;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void power(){
        if (power == 0){
            power = 1;
            captions = 0;
        } else {
         power = 0;
         captions = 1;
        }
         
    }
    //botão mute 
    public void mute(){
        if (mute == 0){
            mute++;    
        } else if (mute == 1){
            mute--;
        }
    }
    
    //botão Netflix 
    public void netflix(){
        if (netflix == false) {
            netflix = true; 
        } else {
            netflix = false;
        }
            
    }
    
    public void menu() {
       if (menu == false) {
           menu = true; 
       } else {
           menu = false;
       }
    }
    
    public void captions(){
    if (captions == 0){
            captions++;
         }else if (captions == 1){
             captions--;
         }      
    }
    
    public void zoom(){
     if (zoom == 0) {
         zoom++;
     }else if (zoom == 1){
       zoom++;  
     }else if (zoom == 2){
        zoom++;
     }else if (zoom == 3){
         zoom++;
     }else if (zoom == 4){
         zoom++;
     }else {
         zoom = 0;
     }
     
    } 
     Hashtable<String, String> nome_canal;
     
     public ControleRemoto(){
        nome_canal = new Hashtable<>();
        nome_canal.put("1","Discovery channel");
        nome_canal.put("2","Telecine cult");
        nome_canal.put("3","Tv futura");
        nome_canal.put("4","Animal Planet");
        nome_canal.put("5","Supernatural");
        nome_canal.put("6","Globo");
        nome_canal.put("7","Band");
        nome_canal.put("8","SBT");
        nome_canal.put("9","Riverdale");
        nome_canal.put("10","Discovery Channel");
        nome_canal.put("11","HBO");
        nome_canal.put("12","National Geographic");
        nome_canal.put("13","History");
        nome_canal.put("14","Telecine action");
        nome_canal.put("15","Telecine fun");
        nome_canal.put("16","Telecine premiun");
        nome_canal.put("17","TNT");
        nome_canal.put("18","Sport TV ");
        nome_canal.put("19","ESPN");
        nome_canal.put("20","The originals");
     
  }
      
    public void canais(String canal){
        this.canal = String.valueOf(Integer.parseInt(canal));
        mn_canal = nome_canal.get(this.canal);
    }
    
    public void trocadecanais (int valor){
        int v = Integer.parseInt(canal);
        
        if (valor == 1){
            if ((v == 00)){
                v = 0;
            } else {
                v += valor;
            }
        }  
        canal = String.valueOf(v);
        mn_canal = nome_canal.get(canal);      
    
        if (valor == -1) {
         if ((v == 1)) {
             v = 99;
         } else { 
             v+= valor;
         }
         this.canal = String.valueOf(v);
         mn_canal = nome_canal.get(this.canal); 
       }
    }        
}