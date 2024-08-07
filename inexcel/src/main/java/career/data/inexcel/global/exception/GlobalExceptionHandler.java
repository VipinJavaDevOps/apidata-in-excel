package career.data.inexcel.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import career.data.inexcel.constants.HeaderConstants;
import career.data.inexcel.customException.ValidationErrorMessage;
import career.data.inexcel.response.ExcelResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ValidationErrorMessage.class)
	public ResponseEntity<?> validationExceptionHandler(ValidationErrorMessage validationErrorMessage) {
		ExcelResponse exceptionMessage = new ExcelResponse();
		exceptionMessage.setStatus(HeaderConstants.FAILURE_STATUS);
		exceptionMessage.setStatusCode(HeaderConstants.VALIDATION_ERROR_CODE);
		exceptionMessage.setMessage(validationErrorMessage.getMessage());
		exceptionMessage.setDescription(HeaderConstants.VALIDATION_DESCRIPTION_MESSAGE);
		return new ResponseEntity<>(exceptionMessage, HttpStatus.NOT_ACCEPTABLE);
	}

}
