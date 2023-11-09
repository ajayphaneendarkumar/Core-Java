package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {



	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		LinkedList<Integer> l = new LinkedList<Integer>();
		ArrayList<Integer> A= new ArrayList<Integer>();
		List<Integer> L = List.of(17,19,21,25);
		Set<Integer> s = Set.of(2,4,6,8,10);
		HashSet<Integer> h = new HashSet<Integer>();
		TreeSet<Integer>t = new TreeSet(s);
		LinkedHashSet<Integer> Lh = new LinkedHashSet<Integer>();
		//Queue<String> q = new PriorityQueue<String>();
	     Map<String , Integer> m = Map.of("Apple1",1,"Orange1",2,"Bannana1",3,"RASANA",4,"Grapes",5);
	    // HashMap<String, Integer> hm = new HashMap<>();
	     LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>(m);
	     TreeMap<String, Integer> tm = new TreeMap<>(m);
	     //System.out.println(tm.lowerKey("Apple"));
	    // System.out.println(tm.floorKey("Apple"));
	     //System.out.println(tm.higherKey("Apple1"));
	     //System.out.println(tm.ceilingKey("Apple1"));
	    // System.out.println(tm.lastEntry());
	     //System.out.println(tm.firstEntry());
	     //System.out.println(tm.subMap("Bannana1" , "Orange1"));
	     //System.out.println(lhm);
	    // System.out.println(tm);
	    // hm.put("RASANA", 4);
	     /*for(String c : hm.keySet())
	     {
	    	 System.out.println(c);
	     }*/
	     /*for(Integer c : hm.values())
	     {
	    	 System.out.println(c);
	     }*/
	    // hm.clear();
	     // System.out.println(hm.containsKey("Orange1"));
	     //System.out.println(hm.containsValue(3));
	     //System.out.println(hm.isEmpty());
	     //System.out.println(hm.size());
	    // System.out.println(hm);
	     //System.out.println(hm.get("Apple1"));
		/*q.offer("Aplle");
		q.offer("Mango");
		q.offer("Guva");
		q.offer("orange");
		q.addAll(List.of("Rasagulla","Bannana"));
		System.out.println(q);*/
		//Lh.add(20);
		//Lh.add(22);
		//Lh.add(24);
		//Lh.add(26);
		//Lh.addAll(s);
		//Lh.remove(26);
		//System.out.println(Lh.contains(3));
		//System.out.println(Lh.size());
	    //System.out.println(Lh.isEmpty());
		//System.out.println(Lh);
		//System.out.println(t.tailSet(5));
		//System.out.println(t.headSet(5));
		//System.out.println(t.subSet(5,10));
		//System.out.println(t.ceil(6));
		//System.out.println(t.lower(8));
		//System.out.println(t.floor(8));
		//System.out.println(t.higher(9));
		//System.out.println(t);
	    //h.add(3);
		//h.add(5);
		//h.add(7);
		//h.add(9);
		//h.add(11);
		//h.addAll(s);
		//h.clear();
		//System.out.println(h.contains(4));
		//System.out.println(h.size());
		//System.out.println(h);
		//System.out.println(h.isEmpty());
		//System.out.println(h);
		//System.out.println(A);
		//A.add(1,13);   //used to add elements at specific position.
		//System.out.println(A);
		//A.addAll(L);
		//A.get(index);
		//A.set(index,element);" -->used replace the current element with new element.
		//System.out.println(A);
		//System.out.println(A.size());
		//System.out.println(A.isEmpty());
		//System.out.println(A.indexOf(19));
		//A.clear();
		//System.out.println(A);
		//A.remove(7);
		//System.out.println(A);
		/*for(Integer i : A)
		{
			System.out.println(i);
		}*/
		//A.endsWith("ch");
        //A.startsWith("ch");
		/*for(int i=0;i<A.size();i++)
		{
			if(A.contains(i))
			{
				System.out.println("TRUE");
				break;
			}
		}*/
		//LinkedList<data_type>L = new LinkedList<data_type>();
		//LinkedList and ArrayList has same methods.
		//L.addFirst(element);
		//L.addLast(element);
		//L.removeFirst();
		//L.removeLast();
		//System.out.println(L.getFirst());
		//System.out.println(L.getlast());
	    /* Scanner sc = new Scanner(System.in);
	     String str = sc.next();
	     HashMap<Character,Integer> hm = new HashMap<>();
	     char[] ch = str.toCharArray();
	     for(char character1 : ch)
	     {
	    	 Integer cnt = hm.get(character1);
	    	 if(cnt==null)
	    	 {
	    		 hm.put(character1, 1);
	    	 }
	    	 else
	    	 {
	    		 hm.put(character1, cnt+1);
	    	 }
	     }
	     System.out.println(hm);*/
	     

	}

}
