package exception;

public class IDFormatTest {

	private String userID;
	
	
	
	public String getUserID() {
		return userID;
	}



	public void setUserID(String userID) throws IDformatException {
		
		if(userID == null) {
			throw new IDformatException("아이디는 null일 수 없다.");
		}
		else if(userID.length()<8||userID.length() > 20) {
			throw new IDformatException("아이디는 8자 이상 20자 이하로 쓰시오");
		}
		this.userID = userID;
	}



	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e);
		}
		
		userID = "1234567";
		
		try {
			idTest.setUserID(userID);
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
