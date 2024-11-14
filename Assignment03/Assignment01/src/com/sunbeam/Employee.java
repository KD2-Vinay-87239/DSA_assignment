package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	
      public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
		
	}
     	public int getEmpid() {
		return empid;
	}
     	
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
	public static void binarySearch(Employee[]arr,int key) {
		int left = 0, right = arr.length-1, mid=0;
		for(int i=left;i<=right;i++) {
			mid = (left+right)/2;
			if(key==arr[mid].empid) {
				break;
		}else if(key>arr[mid].empid) {
			left=mid+1;
		}else {
			right=mid-1;
		}
		}System.out.println("Index of key-"+mid);
	}
	public static void binarySearchName(Employee[]arr,String key) {
		int i=0;
		while(i<arr.length-1) {
			if(arr[i].name==key) {
				System.out.println("Index of your search-"+i);
			break;
			}i++;
		}
	}

		public static void main(String[] args) {
     		Scanner sc = new Scanner (System.in);
		 Employee[] employee = new Employee[4];
	     
	     employee[0]=new Employee(1,"Pradnya");
	     employee[1]=new Employee(2,"Sarika");
	     employee[2]=new Employee(3,"Suyash");
	     employee[3]=new Employee(4,"Vinay");
	     
	     binarySearch(employee,3);
	     binarySearchName(employee,"Suyash");
	   }
		
        
}


