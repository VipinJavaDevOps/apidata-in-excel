package career.data.inexcel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import career.data.inexcel.model.Excelheadermodel;
import career.data.inexcel.service.CreateDataInExcelService;
import career.data.inexcel.validation.ExcelheaderValidator;



@RestController
public class CreateDataInExcelFileController {
	@Autowired
	private CreateDataInExcelService createDataInExcelService;
	@Autowired
	private ExcelheaderValidator validator;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(CreateDataInExcelFileController.class);
	
	
	@PostMapping("/create")
	public String CreateDataInExcelFile(@RequestBody Excelheadermodel excelheadermodel) {
		LOGGER.info("enter the CreateDataInExcelController : createDataInExcel ExccelheaderModel {} ", excelheadermodel);
		validator.ExcelValidator(excelheadermodel);
		return createDataInExcelService.createDataInExcelService(excelheadermodel);
		
		
		
	}


}
