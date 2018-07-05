package Controller;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.ResultSet;

public class Converter {

	public static JSONArray convertToJSON(ResultSet resultSet) throws Exception {
		JSONArray jsonArray = new JSONArray();
		while (resultSet.next()) {
			int total_rows = resultSet.getMetaData().getColumnCount();
			JSONObject obj = new JSONObject();
			for (int i = 0; i < total_rows; i++) {
				
				obj.put(resultSet.getMetaData().getColumnLabel(i + 1).toLowerCase(), resultSet.getObject(i + 1));
				
			}
			jsonArray.put(obj);
		}
		return jsonArray;
	}

	public static String convertToXML(ResultSet resultSet) throws Exception {
		StringBuffer xmlArray = new StringBuffer("<results>");
		while (resultSet.next()) {
			int total_rows = resultSet.getMetaData().getColumnCount();
			xmlArray.append("<result ");
			for (int i = 0; i < total_rows; i++) {
				xmlArray.append(" " + resultSet.getMetaData().getColumnLabel(i + 1).toLowerCase() + "='"
						+ resultSet.getObject(i + 1) + "'");
			}
			xmlArray.append(" />");
		}
		xmlArray.append("</results>");
		return xmlArray.toString();
	}
}
