package week6day1Assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonExcelIntegration {

	public static  String[][] readData(String excelFileName) throws IOException {

		//locate the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//worksheet
		XSSFSheet ws = wb.getSheetAt(0);//1st sheet 0 index
		
		//row count
		int rowCount=ws.getLastRowNum();
		System.out.println(rowCount);//without including header
		
		//column count
		int columnCount=ws.getRow(0).getLastCellNum();//to get last column value
		System.out.println(columnCount);
		
		String[][] data = new String[rowCount][columnCount];
		
		//Iterate entire data
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2=ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]=stringCellValue2;			
				
			}
			
		}
		wb.close();
		return data;
		
	}
}
