/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.AnalyzeStringDao;

/**
 *
 * @author This PC
 */
public class AnalyzeStringRepository implements IAnalyzeStringRepository{

    @Override
    public void getNumber() {
        AnalyzeStringDao.Instance().getNumber();
    }

    @Override
    public void getCharacter() {
        AnalyzeStringDao.Instance().getCharacter();
    }
    
}
