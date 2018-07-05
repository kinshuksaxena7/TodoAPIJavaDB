package Controller;

import DBCon.DataIO;

public class ControllerAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataIO client1 = new DataIO();
		try {
			System.out.println(Converter.convertToJSON(client1.getTodoList()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		client1.closeConnection();
		
	}

}
