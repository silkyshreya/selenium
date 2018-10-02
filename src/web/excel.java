/**
 * 
 */
package web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Sony
 *
 */
public class excel {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws Exception 
	{
     File file= new  File("./data/ouput.xlsx");
     FileInputStream f= new FileInputStream(file);
     
     Workbook wb = WorkbookFactory.create(f);
     
     Sheet sheet = wb.getSheet("Sheet1");
     Row row = sheet.getRow(0);
     Cell cell = row.getCell(0);
     String data=cell.toString();
     System.out.println(data);
    
	}

}
