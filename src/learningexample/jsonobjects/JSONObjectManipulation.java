package learningexample.jsonobjects;

import org.json.*;
import java.util.*;


public class JSONObjectManipulation {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject jObj = new JSONObject();
		jObj.put("name","Mary");
		jObj.put("age",30);
		
		JSONObject address = new JSONObject();
		address.put("StreetAddress","Test Street 1");
		address.put("City","Test City");
		address.put("ZipCode","123456");
		jObj.put("address",address);
		
		System.out.println("Json Object :"+jObj+"\n");
		
	
		//Parsing json
		Iterator<String> keys= jObj.keys();
		String keyValue;
		Iterator<String> keyAddress;
		String keyAddrValue;
		JSONObject jsonAddess;
		while(keys.hasNext())
		{
			keyValue=keys.next();
			if(keyValue.equals("address"))
			{
				jsonAddess = (JSONObject) jObj.get(keyValue);
				keyAddress = jsonAddess.keys();
				while(keyAddress.hasNext())
				{
					keyAddrValue = keyAddress.next();
					System.out.println(keyAddrValue +"\t: " +jsonAddess.get(keyAddrValue));
				}
				
			}
			else
			{
				System.out.println(keyValue +"\t: "+jObj.get(keyValue));
			}
		}
		
	}

}
