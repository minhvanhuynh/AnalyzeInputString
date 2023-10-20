/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.AnalyzeStringRepository;
import Repository.IAnalyzeStringRepository;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManageAnalyzeString extends Menu<String>{
    
    private IAnalyzeStringRepository analyze_string= new AnalyzeStringRepository();
    
    public ManageAnalyzeString(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                analyze_string.getNumber();
                analyze_string.getCharacter();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
    
}
