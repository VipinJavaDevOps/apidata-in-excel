package career.data.inexcel.validation;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import career.data.inexcel.constants.HeaderConstants;
import career.data.inexcel.customException.ValidationErrorMessage;
import career.data.inexcel.model.Excelheadermodel;
import jakarta.validation.constraints.Pattern;



@Component
public class ExcelheaderValidator {
private static final Logger LOGGER= LoggerFactory.getLogger(ExcelheaderValidator.class);
	
	
	public void ExcelValidator(Excelheadermodel excelheadermodel) {
		LOGGER.info("Enter the ExcelheaderValidator:ExcelValidator");
		nameHeaderValidator(excelheadermodel);
		emailHeaderValidator(excelheadermodel);
		mobileNumberHeaderValidator(excelheadermodel);
		cityHeaderValidator(excelheadermodel);
		stateHeaderValidator(excelheadermodel);
		chooseFileHeaderValidator(excelheadermodel);
		massageHeaderValidator(excelheadermodel);
		
	}
	 private void nameHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:nameHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getName()) || excelheadermodel.getName().trim().isEmpty() ) {
				throw new ValidationErrorMessage(HeaderConstants.NAME_ERROR_MESSAGE);
			}
		 
	 }
	 private void emailHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:emailHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getEmail()) || excelheadermodel.getEmail().trim().isEmpty()) {
				throw new ValidationErrorMessage(HeaderConstants.Email_Error_Message);
			}
		 
		 
	 }
	 private void mobileNumberHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:mobileNumberHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getMobileNumber()) || excelheadermodel.getMobileNumber().trim().isEmpty()) {
				throw new ValidationErrorMessage(HeaderConstants.MobileNumber_Error_Message);
			}
		 
	 }
	 private void cityHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:cityHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getCity()) || excelheadermodel.getCity().trim().isEmpty()) {
				throw new ValidationErrorMessage(HeaderConstants.City_Error_Message);
			}
		 
	 }
	 private void stateHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:stateHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getState()) || excelheadermodel.getState().trim().isEmpty()) {
				throw new ValidationErrorMessage(HeaderConstants.STATE_ERROR_Message);
			}
		 
	 }
	 private void chooseFileHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:chooseFileHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getChooseFile()) ||excelheadermodel.getChooseFile().trim().isEmpty()) {
				throw new ValidationErrorMessage(HeaderConstants.ChooseFile_Error_Message);
			}
		 
	 }
	 private void massageHeaderValidator(Excelheadermodel excelheadermodel) {
		 LOGGER.info("enter the ExcelHeaderValidator:massageHeaderValidator");
		 if (Objects.isNull(excelheadermodel.getMassage()) || excelheadermodel.getMassage().trim().isEmpty()) {
				throw new ValidationErrorMessage(HeaderConstants.MASSAGE_ERROR_Message);
			}
		 
	 }

}
