#Hashset
•	Duplicates  Values are not allowed 
•	If you add duplicates also –After Compiling – Duplicates will be not printed in the Console  
•	Insertion Order is Not Preserved – Generally insertion is not preferred. if you want to for insertion you may go 


#Methods 

1.	Difference ---- Set1 and Set2  
Set1.removeall (Set2) 
System.out.println(Set1);

2.	Unique  ---- Set1 and Set2  
Set1.addAll(Set2);
System.out.println(Set1);
 

3. Common Elements  ---- Set1 and Set2  
	Set1.retainAll(Set2);
System.out.println(Set1);
