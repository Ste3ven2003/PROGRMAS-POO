package ec.edu.espe.calculadora.resistencias.views;

import java.awt.event.KeyEvent;


public class TextFieldValidation {
   
   public static boolean onlyLetters(KeyEvent evt) {
      char c = evt.getKeyChar();
      String text = String.valueOf(c);
      return text.matches("^[a-zA-Z]+$");
   }
   
}
