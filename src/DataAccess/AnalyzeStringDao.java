/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import view.Validation;

/**
 *
 * @author This PC
 */
public class AnalyzeStringDao {
    
    private static AnalyzeStringDao instance=null;
    private String input_string;
    public Validation validation;
    
    public AnalyzeStringDao(){
        validation= new Validation();
    }
    
    public static AnalyzeStringDao Instance(){
        if(instance==null){
            synchronized (AnalyzeStringDao.class) {
                if(instance==null){
                    instance= new AnalyzeStringDao();
                }
            }
        }
        return instance;
    }
    
    public void getNumber(){
        System.out.print("Input String: ");
        input_string= validation.checkInputString();
        HashMap<String, List<Integer>> hmNumber= new HashMap<>();
        String number= getCharacterNumber(input_string);
        String[] list_number= number.split(",");
        List<Integer> perfectNumber= new ArrayList<>();
        List<Integer> oddNumber= new ArrayList<>();
        List<Integer> evenNumber= new ArrayList<>();
        List<Integer> allNumber= new ArrayList<>();
        for (int i = 0; i < list_number.length; i++) {
            int changeToNum= Integer.parseInt(list_number[i]);
            if(changeToNum%2==0){
                evenNumber.add(changeToNum);
            }else {
                oddNumber.add(changeToNum);
            }
            if(checkPerfectNum(changeToNum)){
                perfectNumber.add(changeToNum);
            }
            allNumber.add(changeToNum);
        }
        hmNumber.put("Perfect Square Numbers: ", perfectNumber);
        hmNumber.put("Odd Numbers: ", oddNumber);
        hmNumber.put("Even Numbers: ", evenNumber);
        hmNumber.put("All Numbers: ", allNumber);
        for (Map.Entry<String, List<Integer>> entry : hmNumber.entrySet()) {         
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
    
    public void getCharacter(){
        HashMap<String, String> hmString= new HashMap<>();       
        hmString.put("Uppercase Characters: ", getUpperCharacter(input_string));
        hmString.put("Lower Characters: ", getLowerCharacter(input_string));
        hmString.put("Special Characters: ", getSpecialCharacter(input_string));
        hmString.put("All Characters: ", getAllCharacter(input_string));
        for (Map.Entry<String, String> entry : hmString.entrySet()) {
            System.out.println(entry.getKey()+""+entry.getValue());           
        }
    }
    
    public String getUpperCharacter(String s){
        String uppercase= s.replaceAll("\\W|[0-9]|[a-z]", "");
        return uppercase;
    }
    
    public String getLowerCharacter(String s){
        String lower= s.replaceAll("\\W|[0-9]|[A-Z]", "");
        return lower;
    }
    
    public String getSpecialCharacter(String s){
        String special= s.replaceAll("\\w", "");
        return special;
    }
    
    public String getAllCharacter(String s){
        String allCharacter= s.replaceAll("\\[0-9]", "");
        return allCharacter;
    }
    
    public boolean checkPerfectNum(int number){
        if(((int)Math.sqrt(number) * (int)Math.sqrt(number))==number){
            return true;
        }
        return false;
    }
    
    public String getCharacterNumber(String input_string){
        String number= input_string.replaceAll("\\D+", ",");
        return number;
    }
    
}
