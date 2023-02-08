package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "aa", 11));
        noteLst.add(new Notes(3, "cc", 33));
        noteLst.add(new Notes(4, "bb", 44));
		noteLst.add(new Notes(2, "dd", 34));
        noteLst.add(new Notes(5, "zz", 32));

		// java 8 sort according to id 1,2,3,4,5
        noteLst.sort((n1, n2)->n1.getId()-n2.getId());
        noteLst.forEach((note)->System.out.println(note));
	}


	

}

 class Notes{
	 public int id;
	 public String tagName;
	 public long tagId;
	 
	 public Notes(int id,String tagName,long tagId) {
		 this.id=id;
		 this.tagName=tagName;
		 this.tagId=tagId;
		 
	 }
	 
	 public int getId() {
		 return id;
	 }
	 

	 
 }