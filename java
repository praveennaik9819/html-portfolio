import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int button = sc.nextInt();
switch(button){
    case 1 :System.out.println("hello");
    break;
    case 2 :System.out.println("hi");
    break;
    case 3 :System.out.println("hey");
    break;
    default :System.out.println("not valite");
}
}
}
//SWITCH


//FOR LOOP
public class Loop
{
	public static void main(String[] args) {
	    for(int n=0;n<=10;n=n+1){                 //n=n+1 -> n=++
		System.out.println(n);
	}
    	}   
}
//WHILE LOOP
public class Loop
{
	public static void main(String[] args) {
	    int i=0;
	    while(i<=10){
	        System.out.println(i);
	        i++;  //i=i+1
	    }
	    
	    
	   
    	}   
}
//DO WHILE
public class Loop
{
	public static void main(String[] args) {
	    int i=0;
      do {
          System.out.println(i);
          i++;
      } while(i<=10);
	    
	    
	   
    	}   
}

//print the sum of first n natural numbers 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    for(int i=0;i<=n;i++){
	        sum = sum+i;
	    }
		System.out.println(sum);
	}
}

//print the table of a number input by the user

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=1;i<=10;i++){
		System.out.println(i*n);
	    }
	}
}

