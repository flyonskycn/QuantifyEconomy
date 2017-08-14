package com.flyonsky.quantify.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.flyonsky.quantify.BaseSpringJUnit;
import com.flyonsky.quantify.entity.Securities;

public class SecuritieServiceTest extends BaseSpringJUnit{

	@Autowired
	private SecuritieService service;
	
	@Test
	public void test1() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException{
		Workbook wb = WorkbookFactory.create(this.getClass().getClassLoader().getResourceAsStream("AG.xls"));
		Sheet sheet = wb.getSheet("A");
		Securities s = null;
		for (Row row : sheet) {
			if(row.getRowNum() > 0){
				s = new Securities(); 
	            for (Cell cell : row) {
	            	cell.setCellType(CellType.STRING);
	                if(cell.getColumnIndex() == 2){
	                	s.setCode(cell.getStringCellValue());
	                }
	                if(cell.getColumnIndex() == 3){
	                	s.setName(cell.getStringCellValue());
	                }
	            }
	            this.getService().createSecuritie(s);
			}
        }
	}

	public SecuritieService getService() {
		return service;
	}

	public void setService(SecuritieService service) {
		this.service = service;
	}
}
