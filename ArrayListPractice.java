public class ArrayListPractice 
{
	public static void main(String[] args) 
  {
		ArrayList <String> nameArrayList2 = new ArrayList <>(Arrays.asList("Carolina","Cammie", "Kathy", "Lindsey", "Ami")); // initialise arraylist
		
		System.out.println(nameArrayList2.get(1)); // get the value of an element at a particular index
		
		System.out.println(nameArrayList2.size()); // gets the length of the arrayList
		
		nameArrayList2.add("Aiiklyn"); // add a new element
		System.out.println(nameArrayList2.get(5));
		
		nameArrayList2.set(2, "Robbyn"); // change the element at a particular index
		System.out.println(nameArrayList2.get(2));
		
		nameArrayList2.remove(0);  // remove an element
		System.out.println(nameArrayList2.get(0));
		
		System.out.println(nameArrayList2);
		
		Collections.sort(nameArrayList2);
		
		for(int i=0; i<nameArrayList2.size(); i++)
		{
			System.out.println(nameArrayList2.get(i));
		}
		
		nameArrayList2.clear();
		System.out.println(nameArrayList2);
	}
}
