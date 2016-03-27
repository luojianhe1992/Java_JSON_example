package test_1;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONExercise {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter student's name: ");
		String studentName1 = scanner.nextLine();
		
		System.out.println("Enter course name: ");
		String courseName1 = scanner.nextLine();
		
		System.out.println("Enter grade: ");
		int grade1 = Integer.parseInt(scanner.nextLine());
		
		
		// create a JSONObject Object
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", studentName1);

		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("grade", grade1);
		jsonObject2.put("name", courseName1);

		
		JSONArray jsonArray = new JSONArray();
		// add json object to the json array
		jsonArray.add(jsonObject2);

		jsonObject.put("courses", jsonArray);
		
		System.out.println(jsonObject.toJSONString());
		
		System.out.println("**********************************************");
		
		System.out.println(jsonArray.toString());
		
		System.out.println("**********************************************");

		System.out.println("Enter second course information");
		System.out.println("Enter course name: ");
		String courseName2 = scanner.nextLine();
		
		System.out.println("Enter grade: ");
		int grade2 = Integer.parseInt(scanner.nextLine());
		
		JSONObject jsonObject3 = new JSONObject();
		jsonObject3.put("grade", grade1);
		jsonObject3.put("name", courseName1);
		
		// add json object to the json array
		jsonArray.add(jsonObject3);

		
		System.out.println("**********************************************");
		
		System.out.println("Enter third course information");
		System.out.println("Enter course name: ");
		String courseName3 = scanner.nextLine();
		
		System.out.println("Enter grade: ");
		int grade3 = Integer.parseInt(scanner.nextLine());
		
		JSONObject jsonObject4 = new JSONObject();
		jsonObject4.put("grade", grade1);
		jsonObject4.put("name", courseName1);
		
		// add json object to the json array
		jsonArray.add(jsonObject4);
		
		
		System.out.println("**********************************************");
		
		System.out.println(jsonObject.toJSONString());
		
		System.out.println("**********************************************");
		
		System.out.println(jsonArray.toString());
		
		System.out.println("**********************************************");

		for (Object tempJSONObject : jsonArray.toArray()) {
			System.out.println(tempJSONObject);
		}

		
		
	}
}
