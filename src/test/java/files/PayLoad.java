package files;

public class PayLoad {
	public static String addPlace() {
		return "{\r\n"
				+ "        \"createdAt\": 1631825833,\r\n"
				+ "        \"employee_firstname\": \"TestData12345\",\r\n"
				+ "        \"employee_lastname\": \"TestData12345\",\r\n"
				+ "        \"employee_phonenumbe\": \"264-783-9453\",\r\n"
				+ "        \"ademployee_emaildress\": \"ademployee_emaildress 1\",\r\n"
				+ "        \"citemployee_addressy\": \"citemployee_addressy 1\",\r\n"
				+ "        \"stateemployee_dev_level\": \"stateemployee_dev_level 1\",\r\n"
				+ "        \"employee_gender\": \"employee_gender 1\",\r\n"
				+ "        \"employee_hire_date\": \"2025-10-31T16:35:45.426Z\",\r\n"
				+ "        \"employee_onleave\": true,\r\n"
				+ "        \"tech_stack\": [],\r\n"
				+ "        \"project\": []\r\n"
				+ "    }\r\n"
				+ "";
	}
	
	public static String CoursePrice()
	{
		return "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "},\r\n"
				+ "\"courses\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\"price\": 50,\r\n"
				+ "\"copies\": 6\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\"price\": 40,\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\"price\": 45,\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
	}
	
	//Hotel prices
	public static String hotelPrice() {
		return "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\":2160,\r\n"
				+ "\"website\": \"maroot.com\"\r\n"
				+ "},\r\n"
				+ "\"hotel\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"First floor\",\r\n"
				+ "\"total_rooms\": 30,\r\n"
				+ "\"rooms_booked\": 5,\r\n"
				+ "\"price\": 120\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Second floor\",\r\n"
				+ "\"total_rooms\": 35,\r\n"
				+ "\"rooms_booked\": 8,\r\n"
				+ "\"price\": 160\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Third Floor\",\r\n"
				+ "\"total_rooms\": 35,\r\n"
				+ "\"rooms_booked\": 2,\r\n"
				+ "\"price\": 140\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
	}
	//School
	public static String school() {
		return "{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"total_students\": 30,\r\n"
				+ "\"website\": \"Skylinetowers.com\"\r\n"
				+ "},\r\n"
				+ "\"student\": [\r\n"
				+ "{\r\n"
				+ "\"class\": \"First Class\",\r\n"
				+ "\"student_id\": 222,\r\n"
				+ "\"name\": \"khan\",\r\n"
				+ "\"fname\": \"majeed\",\r\n"
				+ "\"tname\": \"khan\",\r\n"
				+ "\"emailAddress\": \"khan\",\r\n"
				+ "\"grade\": 1\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"class\": \"Second Class\",\r\n"
				+ "\"student_id\": 212,\r\n"
				+ "\"name\": \"Wali\",\r\n"
				+ "\"fname\": \"rahim\",\r\n"
				+ "\"tname\": \"zia\",\r\n"
				+ "\r\n"
				+ "\"emailAddress\": \"khan@yahoo.com\",\r\n"
				+ "\"grade\": 2\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"class\": \"Third class\",\r\n"
				+ "\"student_id\": 110,\r\n"
				+ "\"name\": \"Haroon\",\r\n"
				+ "\"fname\": \"Ali\",\r\n"
				+ "\"tname\": \"khalid\",\r\n"
				+ "\"emailAddress\": \"haroon@gmail.com\",\r\n"
				+ "\"grade\": 3\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\"class\": \"Third Class\",\r\n"
				+ "\"student_id\": 414,\r\n"
				+ "\"name\": \"Reza\",\r\n"
				+ "\"fname\": \"mansoor\",\r\n"
				+ "\"tname\": \"khalid\",\r\n"
				+ "\"emailAddress\": \"saeed@gmail.com\",\r\n"
				+ "\"grade\": 3\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
	}
	public static String addBook(String isbn, String aisle) {
		String payload="{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+" \",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
				return payload;
	}
	
	//my Own library Json PayLoad
	public static String bookToLibrary(String isbn, String aisl) {
		String bAdd="{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisl+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		return bAdd;
	}
	
}
