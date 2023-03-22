
package com.mycompany.projectecaixerautomlucas;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 *
 * @author alumne
 */

// Controlador de la finestra per consultar informació referent als comptes que ofereix el banc

public class PentaryController {
    
    @FXML
    Button buttonComeBack;
    
    @FXML
    Button buttonCC;
    
    @FXML
    Button buttonCE;
    
    @FXML
    TextField textfieldInfo;
    
    boolean CC=false;
    boolean CE=false;
    
    @FXML
    private void switchToSecondary() throws IOException {
        CC=false;
        CE=false;
        App.setRoot("secondary");
    }
    
    @FXML
    private void settingCCTrue(){
        CE=false;
        CC=true;
    }
    
    @FXML
    private void settingCETrue(){
        CC=false;
        CE=true;
    }
    
    @FXML
    private void showInfo(){
        
        
        
        String infoCC="Informació relacionada amb els Comptes Corrents";
        String infoCE="Informació relacionada amb els Comptes d'Estalvis";
        try{
            
            
            if(CC==true){
                textfieldInfo.setText(infoCC.toString());
            }
            else if(CE==true){
                textfieldInfo.setText(infoCE.toString());
            }else{
                //no muestres nada
            }
            
        }catch(Exception e){
            System.out.println("L'execució de mostrar informació sobre comptes és incorrecte");
        }
    }
    
}
