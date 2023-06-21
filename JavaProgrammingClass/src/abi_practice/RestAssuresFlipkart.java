package abi_practice;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Coding Round:
This round has one problem statement and you are expected to give the working code

Q1: Problem statement: (Choose any language of your choice)
Time limit: ~ 90 mins

You are given an API to fetch weather data for different cities based on the cityIds

City Files Json - 
https://drive.google.com/file/d/1WdTLbq7X0H7oRlVCXakw6ujMae9hlksE/view?usp=sharing

Open Weather API ( parameterised on cityId):
http://api.openweathermap.org/data/2.5/group?id=<cityId1,cityId2,cityId3>&units=metric&appid=6d4c202370ae8d7c76ee8edefc512a4f

Sample api - ( input is passed with three cityIdâ€™s ):
http://api.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=6d4c202370ae8d7c76ee8edefc512a4f

Implement the following:
Use Cities file json to get a list of all city ids for the following country codes 
IN

Use the Open Weather API  and cityIds fetched in Question 1, to get the data for the following attributes and save it in memory for future use.
<cityId, countryId, cityName, temp, pressure, humidity, temp_min, temp_max,
sea_level, grnd_level>

List the cities which have weather ( main attribute ) as â€œclearâ€?.

Expected Response  - 
 {â€œclearâ€? : [â€œhyderabadâ€?, â€œchennaiâ€?]}


Expectations:
Make sure that your code is readable, decent naming conventions and handle the exceptions wherever you can.
Data can be stored in memory wherever required
*/

public class RestAssuresFlipkart {
	static String country="IN";
	static List<String> olist=new ArrayList<String>();
	static List<Object> list=new ArrayList<>();
	static int i,j;
	static String mapping="map"+""+j+"";
	static HashMap<String, String> out = new HashMap<>();
	public static void main(String[] args) throws IOException {
JsonPath js=new JsonPath(new String(Files.readAllBytes(Paths.get("C:\\Users\\Admin\\Downloads\\city-ids.json"))));
List<String> Initial =js.get("x");
System.out.println(Initial.size());
for(i=0;i<=Initial.size()-1;i++)
{
try {
	if(country.equals(js.getString("["+i+"].country")))
	{
	olist.add(js.getString("["+i+"].id"));
	}
} catch (Exception e) {
	e.printStackTrace();
}
}
RestAssured.baseURI="http://api.openweathermap.org/data/2.5/group";
System.out.println(olist);
for (j=0;j<olist.size();j++) {
Response res=given().queryParam("id",""+olist.get(j)+"").queryParam("units","metric").queryParam("appid","6d4c202370ae8d7c76ee8edefc512a4f").header("Content-Type","application/json")
.when().get().then().extract().response();
//res.prettyPrint();
JsonPath js1=new JsonPath(res.asPrettyString());
HashMap<String, String> mapping = new HashMap<>();
String cityId=js1.getString("list[0].weather[0].id");
String countryId=js1.getString("list[0].id");
String cityName=js1.getString("list[0].name");
String temp=js1.getString("list[0].main.temp");
String pressure=js1.getString("list[0].main.pressure");
String humidity=js1.getString("list[0].main.humidity");
String temp_min=js1.getString("list[0].main.temp");
String temp_max=js1.getString("list[0].main.temp_max");
String sea_level=js1.getString("list[0].main.sea_level");
String grnd_level=js1.getString("list[0].main.grnd_level");
String clear=js1.getString("list[0].weather[0].main");
mapping.put("cityId", cityId);
mapping.put("countryId", countryId);
mapping.put("cityName", cityName);
mapping.put("temp", temp);
mapping.put("pressure", pressure);
mapping.put("humidity", humidity);
mapping.put("temp_min", temp_min);
mapping.put("temp_max", temp_max);
mapping.put("sea_level", sea_level);
mapping.put("grnd_level", grnd_level);
mapping.put("clear", clear);
String s=mapping.get("clear");
if(s.equals("Clear"))
		{
	list.add(mapping.get("cityName"));
		}

}
Map<String,Object> weather=new HashMap<>();
weather.put("clear",list);

for (Map.Entry<String, Object> set : weather.entrySet()) {
    System.out.println(set.getKey() + " = " + set.getValue());
    }
//or
System.out.println(weather);
	}
}  

