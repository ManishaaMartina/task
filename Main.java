package com.mycompany.app.java8;
import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] argv) {
    /*java.io.Serializable ser = (java.io.Serializable & Calculator)*/engine((x,y)-> x + y);    
   /* public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}*/
 
  }  
  public static void engine(Calculator cal)
  {
    long x=100,y=200;
    long res=Calculator.cal(x,y);
    System.out.println(res);
  }
}

@FunctionalInterface
interface Calculator{
  long cal(long x, long y);
}