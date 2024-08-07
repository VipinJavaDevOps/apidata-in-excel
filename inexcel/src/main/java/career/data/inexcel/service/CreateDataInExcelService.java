package career.data.inexcel.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import career.data.inexcel.constants.HeaderConstants;
import career.data.inexcel.model.Excelheadermodel;


@Service
public class CreateDataInExcelService implements Excelheader{
	private static final Logger LOGGER=LoggerFactory.getLogger(CreateDataInExcelService.class);
	private static final String filePath="C:\\Users\\Dell\\Downloads\\RnitData2.xlsx";

	@Override
	public String createDataInExcelService(Excelheadermodel excelheadermodel) {
		LOGGER.info("Enter in  createDataInExcelService:createdatainexcelService");
		try {
			Workbook workbook;
	
			var existingFile=new File(filePath);
			if(existingFile.exists()) {
				LOGGER.debug("If the file exists load the exist, create a new workbook:{}",existingFile);
				try(var fileInputStream= new FileInputStream(existingFile)){
					workbook=new XSSFWorkbook(fileInputStream);
				}
				}else {
					LOGGER.debug("If the file doesn't exist, create a new workbook: {}", existingFile);
					workbook = new XSSFWorkbook();
					LOGGER.info("Create a new sheet named MailDetails");
					workbook.createSheet(HeaderConstants.EXCEL_FILE_NAME);

					// Create headers for the Excel sheet
					Sheet sheet = workbook.getSheet(HeaderConstants.EXCEL_FILE_NAME);
					var headerRow = sheet.createRow(0);
					String[] headers = { HeaderConstants.name ,HeaderConstants.email, HeaderConstants.mobileNumber,HeaderConstants.city,
							HeaderConstants.state,HeaderConstants.chooseFile,HeaderConstants.massage};
					for (var i = 0; i < headers.length; i++) {
						var cell = headerRow.createCell(i);
						cell.setCellValue(headers[i]);
					}
				}

				LOGGER.info("Create a new row and append data ");
				var sheet = workbook.getSheet(HeaderConstants.EXCEL_FILE_NAME);
			
				var totalRows = sheet.getPhysicalNumberOfRows();
				Object[] rowData = {excelheadermodel.getName(),excelheadermodel.getEmail(),excelheadermodel.getMobileNumber(),excelheadermodel.getCity(), 
						excelheadermodel.getState(),excelheadermodel.getChooseFile(),excelheadermodel.getMassage()
						
					 };
				LOGGER.debug("data for append in excel is :{}", rowData);
				LOGGER.debug("Start from the last filled row :{} ", sheet.getLastRowNum());
				var newRow = sheet.createRow(sheet.getLastRowNum() + 1);

				for (var colNum = 0; colNum < rowData.length; colNum++) {
					var cell = newRow.createCell(colNum);
					if (rowData[colNum] instanceof Number) {
						cell.setCellValue(((Number) rowData[colNum]).doubleValue());
					} else {
						cell.setCellValue(String.valueOf(rowData[colNum]));
					}
				}
				try (var fileOut = new FileOutputStream(existingFile)) {
					workbook.write(fileOut);
				}
				workbook.close();
				LOGGER.debug("Data appended to the Excel file successfully. File name: {}", filePath);
			} catch (IOException e) {
				LOGGER.error("Error occured in saveDataInExcelFile: {}", e.getMessage());
			}
		
		
		return filePath;
	}

}
