package abi_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Remove3Concecutive {
public static void main(String[] args) {
    String str="ABCCCCBBA";
	Vector<Character> v = new Vector<>();
	for (int i = 0; i < str.length(); ++i)
	{
		v.add(str.charAt(i));
		if (v.size() > 2)
		    {
		    int sz = v.size();
		if (v.get(sz - 1) == v.get(sz - 2) &&v.get(sz - 2) == v.get(sz - 3) &&v.get(sz - 3) == v.get(sz - 4))
		    {
		    v.setSize(sz - 4);
		    }
		    }
	}
	// printing the string final string
	for (int i = 0; i < v.size(); ++i)
	System.out.print(v.get(i));
		
	List<Character> olist=new ArrayList<Character>();
	for (int i = 0; i < str.length(); ++i)
	{
		olist.add(str.charAt(i));
		if (olist.size() > 3)
			{
			int sz = olist.size();
		if (olist.get(sz - 1) == olist.get(sz - 2) &&olist.get(sz - 2) == olist.get(sz - 3) &&olist.get(sz - 3) == olist.get(sz - 4))
			{
			olist.remove(sz - 1);
			olist.remove(sz - 2);
			olist.remove(sz - 3);
			olist.remove(sz - 4);
			}
			}
	}
	// printing the string final string
	for (int i = 0; i < olist.size(); ++i)
	System.out.print(olist.get(i));
	}
}
