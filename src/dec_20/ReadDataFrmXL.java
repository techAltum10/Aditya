package dec_20;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFrmXL {
	//http://seletesting.blogspot.in/2013/04/reading-excel-data-with-apache-poi-team.html
	//https://poi.apache.org/download.html
	
	//@Test
	public static String[][] atTest() throws Exception{
		
		String filePath = "D:\\abc\\testData.xls";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		//Apache POI
		XSSFWorkbook wb = new XSSFWorkbook(fIP);
		XSSFSheet sheet = wb.getSheetAt(1);
		
		//Count Rows and Columns
		int xRows = sheet.getLastRowNum() + 1;
		System.out.println("Total Rows are : " + xRows);
		
		int xCols = sheet.getRow(1).getLastCellNum();
		System.out.println("Total cols are : " + xCols);
		
		String[][] xData = new String[xRows][xCols];
		
		for(int i = 0; i<xRows; i++){
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j<xCols; j++){
				
				XSSFCell cell = row.getCell(j);
				
				String value = cellToString(cell);
				xData[i][j] = value;
				//System.out.print(value);
				//System.out.print("##");
			}
			//System.out.println("@");
		}
		return xData;
	}

	public static String cellToString(XSSFCell cell) {

		Object result;
		int type = cell.getCellType();
		
		switch(type){
		case HSSFCell.CELL_TYPE_BLANK:
			result = "";
			break;
		
		case HSSFCell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
			break;
			
		case HSSFCell.CELL_TYPE_ERROR:
			throw new RuntimeException("There is some error in cell.");
			
		case HSSFCell.CELL_TYPE_FORMULA:
			throw new RuntimeException("There is formula in cell.");
		
		case HSSFCell.CELL_TYPE_NUMERIC:
			result = cell.getNumericCellValue();
			break;
			
		case HSSFCell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;
			
		default:
			throw new RuntimeException("Out of world.");
		}
		return result.toString();
	}
}
