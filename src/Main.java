
import controller.ManageAnalyzeString;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "===== Analysis String program ====";
        String[] s= new String[] {"Input String To Analyze", "Exit"};
        new ManageAnalyzeString(title, s).run();
    }
}
