package com.tirmizee.core.utilities;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class WorkbookUtils {
	
	public Workbook create(MultipartFile fileExcel) throws IOException {
		String extension = FilenameUtils.getExtension(fileExcel.getOriginalFilename());
		switch(extension){
			case "xls"  : return  new HSSFWorkbook(fileExcel.getInputStream());
			case "xlsx" : return  new XSSFWorkbook(fileExcel.getInputStream()); 
			default : return new XSSFWorkbook(fileExcel.getInputStream()); 
		}
	}
	
	public static byte[] toByteArray(Workbook workbook) throws IOException{
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 workbook.write(bos);
		 return bos.toByteArray();
	}

}
