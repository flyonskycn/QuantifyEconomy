package com.flyonsky.quantify.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.flyonsky.quantify.BaseSpringJUnit;
import com.flyonsky.quantify.entity.Securities;

@Ignore
public class SecuritieServiceTest extends BaseSpringJUnit{

	@Autowired
	private SecuritieService service;
	
//	@Ignore
	@Test
	public void test1() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, ParseException{
		Workbook wb = WorkbookFactory.create(this.getClass().getClassLoader().getResourceAsStream("AG.xls"));
		Sheet sheet = wb.getSheet("A");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
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
	                if(cell.getColumnIndex() == 4){
	                	s.setIssuedate(sf.parse(cell.getStringCellValue()));
	                }
	            }
	            s.setExchange("上交所");
	            this.getService().createSecuritie(s);
			}
        }
	}
	
	@Test
	public void test2() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, ParseException{
		Workbook wb = WorkbookFactory.create(this.getClass().getClassLoader().getResourceAsStream("SG.xlsx"));
		Sheet sheet = wb.getSheet("上市公司列表");
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Securities s = null;
		for (Row row : sheet) {
			if(row.getRowNum() > 0){
				s = new Securities(); 
	            for (Cell cell : row) {
//	            	cell.setCellType(CellType.STRING);
	            	if(StringUtils.isNotBlank(cell.getStringCellValue())){
		                if(cell.getColumnIndex() == 5){
		                	s.setCode(cell.getStringCellValue());
		                }
		                if(cell.getColumnIndex() == 6){
		                	s.setName(cell.getStringCellValue());
		                }
		                if(cell.getColumnIndex() == 7){
		                	s.setIssuedate(sf.parse(cell.getStringCellValue()));
		                }
	            	}
	            }
	            if(StringUtils.isNotBlank(s.getCode())){
		            s.setExchange("深交所");
		            this.getService().createSecuritie(s);
	            }
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
