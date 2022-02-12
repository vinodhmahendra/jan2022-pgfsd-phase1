package client;

import domain.Shirt;
import feature.CacheShirt;
import feature.CacheString;
import generics.feature.CacheAny;

public class TestCacheAny {

	public static void main(String[] args) {
		
		CacheString myMessage = new CacheString() ; // type specific
		CacheShirt myShirt  = new CacheShirt(); // type specific
		
		//Generics
//		CacheAny<String> myGenericMessage = new CacheAny<String>();
//		CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();
		
		CacheAny<String> myGenericMessage = new CacheAny<>();
		CacheAny<Shirt> myGenericShirt = new CacheAny<>();
		
		//add data and print
		myMessage.add("save this for me"); // Type
		myGenericMessage.add("save this for me"); // Generic
		
		System.out.println("Message is: " +myGenericMessage.get());

//		myShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
		myGenericShirt.add(Shirt.newShirt(1111, "Blue Shirt", "Blue", "Medium"));
		System.out.println("Shirt Type: " +myGenericShirt.get().toString());
	}

}
