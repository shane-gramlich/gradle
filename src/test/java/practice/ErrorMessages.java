package practice;


public enum ErrorMessages {
	Assert("The testOutput expected did not match the classOutput actual:");

	private String message;

	ErrorMessages(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
