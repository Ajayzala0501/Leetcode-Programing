package org.example.leetcode.string;

public class Detect_Capital {
    public static boolean detectCapitalUse(String word) {

      if(word.length()<=1){
          return true;
      }

      String detectCase = "";
      if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
          detectCase = "Upper";
      } else if (Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
          detectCase = "Lower";
      }else {
          detectCase = "Mix";
      }
      for(int i=detectCase.equals("Mix")?1:0;i<word.length();i++){
         if(detectCase.equals("Upper")){
             if(!Character.isUpperCase(word.charAt(i))){
                 return false;
             }
         }
         if(detectCase.equals("Lower")){
             if(!Character.isLowerCase(word.charAt(i))){
                 return false;
             }
         }
          if(detectCase.equals("Mix")){
              if(!Character.isLowerCase(word.charAt(i))){
                  return false;
              }
          }
      }
        return true;
    }
}
