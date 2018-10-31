package Functions;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Flight_ExcelFunction {

	public static XSSFSheet ExcelWSheet;
	public static XSSFWorkbook ExcelWbook;
	public static XSSFCell Cell;
	public static XSSFRow Row;

	public Flight_ExcelFunction(String path, String Sheetname) throws Exception {

		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWbook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWbook.getSheet(Sheetname);
		} catch (Exception e) {

			throw (e);
		}

	}

	public String getCellData(int RowNum, int ColNum) {

		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();

			return CellData;
		} catch (Exception e) {

			return " ";
		}

	}

	public static void main(String[] args) throws Exception {

		Flight_ExcelFunction GE = new Flight_ExcelFunction("E:\\SELENIUM_JAVA\\GoibiboProject\\Excel_Files\\GoExcel.xlsx", "Sheet1");

	}

}
