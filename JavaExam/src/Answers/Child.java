package Answers;

class GrandParent
{
	String grandFatherName;
	String grandMotherName;

	public GrandParent(String grandFatherName, String grandMotherName)
	{
		this.grandFatherName=grandFatherName;
		this.grandMotherName=grandMotherName;
		System.out.println("GrandFather Name :\n"+grandFatherName+"\nGrandMother Name :\n"+ grandMotherName);
	}
}

class Parent extends GrandParent
{   String fatherName;
    String motherName;
    
	Parent(String fatherName, String motherName, String grandFatherName, String grandMotherName)
	{
		this(grandFatherName, grandMotherName);
		System.out.println("\nFather Name :\n"+fatherName+"\nMother Name :\n"+motherName);
	}

	public Parent(String grandFatherName, String grandMotherName)
	{
		super(grandFatherName, grandMotherName);
		
	}	
}

public class Child extends Parent {

	Child(String fatherName, String motherName, String grandFatherName, String grandMotherName) {
		super(fatherName, motherName, grandFatherName, grandMotherName);		
	}
	public static void main(String[] args) {
		
         Child c = new Child("fName","mName","gfName","gmName");         
	}
}
