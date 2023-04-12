package sample;
import javafx.event.ActionEvent;
/*un type spécifique d'événement qui est généré lorsqu'un 
 utilisateur interagit avec un contrôle
 */
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//provides classes for creating and managing button controls in JavaFX applications
import javafx.scene.text.Text;
//for displaying text in JavaFX applications
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class GameController implements Initializable{

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Text winnerText;
    
    @FXML
    private Text playerx;

    @FXML
    private Text playero;
    @FXML
  
    
    private int playerTurn = 0;

    ArrayList<Button> buttons;
    private int xCount = 0;
    private int oCount = 0;
    
    private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9));

        buttons.forEach(button ->{
            setupButton(button);//pour configurer les actions à effectuer lorsque le bouton est cliqué
            button.setFocusTraversable(false);
            //bouton est définie sur false pour éviter que
            //le bouton ne prenne le focus lors de la navigation avec le clavier.
        });
    }

    @FXML
    void restartGame(ActionEvent event) {
        buttons.forEach(this::resetButton);
        winnerText.setText("Tic-Tac-Toe");
        playero.setText("XXXXXX");
        playerx.setText("XXXXXX");
        xCount=0;
        oCount=0;
       
    }

    public void resetButton(Button button){
        button.setDisable(false);
        button.setText("");
        button.setStyle("-fx-background-color: 	#c0c0c0;-fx-font-size: 50");
    }
    
    public void exitButton(){
    	System.exit(0);
            }
    
    private void setupButton(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            setPlayerSymbol(button);
            button.setDisable(true);
            checkIfGameIsOver();
        });
    }


    public void setPlayerSymbol(Button button){
        if(playerTurn % 2 == 0){
            button.setText("X");
            playerTurn = 1;
        } else{
            button.setText("O");
            playerTurn = 0;
        }
    }
   
    public void checkIfGameIsOver(){
    
    	    String b1 = button1.getText();
	        String b2 = button2.getText();
	        String b3 = button3.getText();
	       
	        String b4 = button4.getText();
	        String b5 = button5.getText();
	        String b6 = button6.getText();
	        
	        String b7 =button7.getText();
	        String b8 = button8.getText();
	        String b9 = button9.getText();
// PLAYER X CODING
	        
	        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
	        {
	        	winnerText.setText("X won!");
	            xCount++;
	            gameScore();
	            
	            button1.setStyle("-fx-background-color:  #75FC28;-fx-font-size: 50");
	            button2.setStyle("-fx-background-color:  #75FC28;-fx-font-size: 50");
	            button3.setStyle("-fx-background-color:  #75FC28;-fx-font-size: 50");
	            
	        }
	        
	        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
	        {
	        	winnerText.setText("X won!");
	            xCount++;
	            gameScore();
	            
	            button4.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button6.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");          
	        }
	         
	        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
	        {
	        	winnerText.setText("X won!");
	            xCount++;
	            gameScore();
	            
	            button7.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button8.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button9.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");;           
	        }
	        
	        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
	        {
	        	winnerText.setText("X won!");
	        	xCount++;
	            gameScore();
	            
	            button1.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button4.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button7.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");          
	        }
	        
	        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
	        {
	        	winnerText.setText("X won!");
	        	xCount++;
	            gameScore();
	            
	            button2.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
                button8.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");           
	        }
	        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
	        {
	        	winnerText.setText("X won!");
	        	xCount++;
	            gameScore();
	            
	            button3.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button6.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button9.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");        
	        }
	        
	        
	        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
	        {
	        	winnerText.setText("X won!");
	        	xCount++;
	            gameScore();
	            
	            button1.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button9.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");  
	        }
	        
	        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
	        {
	        	winnerText.setText("X won!");
	        	xCount++;
	            gameScore();
	            
	            button3.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");
	            button7.setStyle("-fx-background-color: #75FC28;-fx-font-size: 50");     
	        }

	        // PLAYER O CODING
	        
	        
	        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button1.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button2.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button3.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            
	        }
	        
	        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button4.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button6.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");         
	        }
	         
	        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button7.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button8.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button9.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");          
	        }
	        
	        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button1.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button4.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button7.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");      
	        }
	        
	        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
	        {
	        	winnerText.setText("X won!");
	        	oCount++;
	            gameScore();
	            
	            button2.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button8.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");        
	        }
	        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button3.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button6.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button9.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");  
	        }
	        
	        
	        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button1.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button9.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");   
	        }
	        
	        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
	        {
	        	winnerText.setText("O won!");
	        	oCount++;
	            gameScore();
	            
	            button3.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button5.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");
	            button7.setStyle("-fx-background-color: FCFF33;-fx-font-size: 50");          
	        }
	
	         if((b1 == ("X") && b2 ==("X") && b3 == ("O"))&&
	 	        (b4 == ("O") && b5 ==("O") && b6 == ("X"))&&
	 	        (b7 == ("X") && b8 ==("O") && b8 == ("X"))){
	 	        		   oCount=0;
	 	        		   xCount=0;
	 	        		   winnerText.setText("Tie !");
	 	   	            gameScore();
	 	        	   }
	         if((b1 == ("X") && b2 ==("O") && b3 == ("O")&&
	 	        (b4 == ("O") && b5 ==("X") && b6 == ("X")&&
	 	        (b7 == ("X") && b8 ==("X") && b8 == ("O"))))){
	 	        		   oCount=0;
	 	        		   xCount=0;
	 	        		   winnerText.setText("Tie !");
	 	   	            gameScore();
	 	        	   }
	         
	         if((b1 == ("O") && b2 ==("O") && b3 == ("X")&&
		        (b4 == ("X") && b5 ==("X") && b6 == ("O")&&
		        (b7 == ("O") && b8 ==("O") && b8 == ("X"))))){
		        		   oCount=0;
		        		   xCount=0;
		        		   winnerText.setText("Tie !");
		   	            gameScore();
		        	   }
	         if((b1 == ("X") && b2 ==("O") && b3 == ("X")&&
		        (b4 == ("X") && b5 ==("X") && b6 == ("O")&&
		        (b7 == ("O") && b8 ==("O") && b8 == ("X"))))){
		        		   oCount=0;
		        		   xCount=0;
		        		   winnerText.setText("Tie !");
		   	            gameScore();
		        	   }
	         if((b1 == ("O") && b2 ==("X") && b3 == ("O")&&
		        (b4 == ("X") && b5 ==("X") && b6 == ("O")&&
		        (b7 == ("O") && b8 ==("O") && b8 == ("X"))))){
		        		   oCount=0;
		        		   xCount=0;
		        		   winnerText.setText("Tie !");
		   	            gameScore();
		        	   }

	       /*public void NoWinner(Button button) {
	        	
	        if(winnerText.equals("O won!")||winnerText.equals("X won!")) {
	        	button.setDisabled(true);

    }*/
}
}

 