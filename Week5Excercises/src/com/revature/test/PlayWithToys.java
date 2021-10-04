package com.revature.test;

import com.revature.model.ActionFigure;
import com.revature.model.Doll;

public class PlayWithToys {
   public static void main(String[] args) {
      Doll doll = new Doll("Annabelle","blue");
      System.out.println("Our doll "+doll.getName()
                    +" has "+doll.getEyeColor()+" eyes.");
      doll.play();
      doll.makeTalk();
      
      ActionFigure figure = new ActionFigure("speed", "Barry Allan", "blue"); 
      System.out.println("Our action figure " + figure.getName() + " has " + figure.getEyeColor() + " eyes and " + figure.getSkill() + ".");
      figure.play();
      figure.makeTalk();
      figure.useSkill();
   }
}