package collection;

import java.util.HashSet;
import java.util.Iterator;

public class mainclass {

	public static void main(String[] args) 
	{
		
     HashSet<String> hs = new HashSet<String>();
     hs.add("aaaa");
     hs.add("bbbb");
     hs.add(null);
     hs.add("ccc");
     hs.add("dddd");
     hs.add("eeee");
     hs.add(null);
     hs.add("fff");
     System.out.println(hs);
     
   //   hs.stream().filter(str->str!=null).forEach(str->System.out.println(str));
     Iterator<String> il = hs.iterator();
    
	}

}
