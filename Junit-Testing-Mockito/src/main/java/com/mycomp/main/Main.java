package com.mycomp.main;

public class Main {

		private static String str1   = null;
	    private static String str2   = null;

	    public static void main(String[] args)
	    {
	        if( args.length != 2 )
	        {
	            call();
	        }

	        Main ex = new Main(args[0], args[1]);
	        ex.getData();
	    }

	    public Main(String str1, String str2)
	    {
	        Main.str1 = str1;
	        Main.str2 = str2;
	    }

	    public void getData(){
	        System.out.println("Name is: "+str1);
	        System.out.println("City is: "+str2);
	    }

	    private static void call()
	    {
	        System.err.println("Usage: String1 String2");
	        System.err.println("Where: ");
	        System.err.println("       String1 - Name");
	        System.err.println("       String1 - City");
	        System.exit(1);
	    }   
	}


