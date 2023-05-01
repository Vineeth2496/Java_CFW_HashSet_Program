package com.CFWHashset;

import java.util.HashSet;
import java.util.Spliterator;

public class Hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet H=new HashSet();
		System.out.println("Before HashSet flo's:");
		H.add("Sapanish flo");
		H.add("Swyn flo");
		H.add("Bird flo");
		H.add("Covid-19");
		H.add("Omicrown");
		System.out.println("After HashSet flo's: "+H);
	//	public int size();
		System.out.println("Size of hashset flo's "+H.size());
	//  public boolean isEmpty();
		System.out.println("HashSet of flo's are Empty: "+H.isEmpty());
	//  public boolean contains(java.lang.Object);
		Boolean re1=H.contains("Covid-19");
		System.out.println("Flo's contains covid-19: "+re1);
		Boolean re2=H.contains("Dangue");
		System.out.println("Flo's contains Dangue: "+re2);
	//  public boolean add(E);
		H.add("Monkey Pockes");
		System.out.println("After Flo's Added: "+H);
	//  public boolean remove(java.lang.Object);
		H.remove("Bird flo");
		System.out.println("After Removing Bird flo: "+H);
	//  public void clear();
		H.clear();
		System.out.println("After clearing all flo's: "+H);
	//  public java.lang.Object clone();
	//  public java.util.Spliterator<E> spliterator();
		HashSet H1=new HashSet();
		H1.add("vineeth@gmail.com");
		H1.add("Katherine@gmail.com");
		H1.add("MargottRobbi@gmail.com");
		H1.add("Kristan@gmail.com");
		H1.add("TaylorSwift@gmail.com");
		System.out.println("Hashset Emails Spliting:");
		Spliterator li=H1.spliterator();
		li.forEachRemaining((n)-> System.out.println(n));
	//  public java.lang.Object[] toArray();
	//  public <T> T[] toArray(T[]);
		
	}

}
/*

C:\Users\vinee>javap java.util.HashSet
Compiled from "HashSet.java"
public class java.util.HashSet<E> extends java.util.AbstractSet<E> implements java.util.Set<E>, java.lang.Cloneable, java.io.Serializable {
  static final long serialVersionUID;
  public java.util.HashSet();
  public java.util.HashSet(java.util.Collection<? extends E>);
  public java.util.HashSet(int, float);
  public java.util.HashSet(int);
  java.util.HashSet(int, float, boolean);
  public java.util.Iterator<E> iterator();
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public boolean add(E);
  public boolean remove(java.lang.Object);
  public void clear();
  public java.lang.Object clone();
  public java.util.Spliterator<E> spliterator();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  static {};
}

C:\Users\vinee>
*/