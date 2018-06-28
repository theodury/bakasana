package fr.etudiantsdefrance.bakasana.exceptions;

public class ExceptionBakasana extends Exception {

	private int codeErreur;
	private String Message;
	
	public ExceptionBakasana(Exception e) {
		this.setCodeErreur(409);
		this.setMessage(e.getMessage());
	}

	public int getCodeErreur() {
		return codeErreur;
	}

	public void setCodeErreur(int codeErreur) {
		this.codeErreur = codeErreur;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
	
}
