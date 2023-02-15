package com.ZohoCRM.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	
	public String getPropertydata(String key) throws IOException {
FileInputStream fis=new FileInputStream("./data/CommonsData.property");
Properties p=new Properties();
p.load(fis);
String data = p.getProperty(key);
return data;
}
	public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/CRMdata.xlsx");
		Workbook ws = WorkbookFactory.create(fis);
		String data = ws.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}