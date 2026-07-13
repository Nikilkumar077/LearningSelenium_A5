package LearndataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
	
	Workbook book;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("./src/test/resources/user test data.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		String data1 = book.getSheet("").getRow(0).getCell(0).getStringCellValue();
		
		double data2 = book.getSheet("").getRow(0).getCell(0).getNumericCellValue();
		
		boolean data3 = book.getSheet("").getRow(0).getCell(0).getBooleanCellValue();
		
		
		//write---->New sheet,New Row
		book.createSheet("").createRow(0).createCell(0).setCellValue("");
		
		//write---->Existing sheet,existing row
		book.getSheet("").getRow(0).createCell(0).setCellValue("");
		
		//write---->Existing sheet,New row
		book.getSheet("").createRow(0).createCell(0).setCellValue("");
		
		FileOutputStream fos=new FileOutputStream("");
		
		book.write(fos);
		
		book.close();
		
		
	}

}
