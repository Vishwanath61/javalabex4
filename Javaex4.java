/*
1.Create an abstract class person which has the data members name, gender, Aadhar
number and abstract methods void getinformation(), void CalculateTax(double income).
Derive another class Employee which has to implement the abstract methods. Tax has to
be calculated based on the criteria
Tax PercentageIncome
Male Female
>=190000 NIL NIL
>=200000 10% NIL
>=500000 20% 10%
<500000 25% 20%
*/

package javaex4;

//@author VISHWA
        
import java.util.*;

abstract class person
{
    String name,gender;
    long aadhar;
    double tax;
    abstract void   getinformation();
    abstract void calculatetax(double income);
    abstract void display();
}

class employee extends person
{    
    public double income;
    
    void getinformation()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("\nName: ");
        name=obj.next();
        System.out.print("Gender: ");
        gender=obj.next();
        System.out.print("Aadhar number: ");
        aadhar=obj.nextLong();
        System.out.print("Income: ");
        this.income=obj.nextDouble();
        calculatetax(income);
    }
    
    void calculatetax(double income)
    {    
        if(income<=190000)
        {
            tax=0;
        }
        
        else if(income<=200000)
        {
            if(gender.equals("MALE")||gender.equals("Male")||gender.equals("male"))
            {
                tax=income*0.1;
            }
            else
            {
                tax=0;
            }
        }
        
        else if(income<=500000)
        {
            if(gender.equals("MALE")||gender.equals("Male")||gender.equals("male"))
            {
                tax=income*0.2;
            }
            if(gender.equals("FEMALE")||gender.equals("Female")||gender.equals("female"))
            {
                tax=income*0.1;
            }
        }
        
        else if(income>500000)
        {
            if(gender.equals("MALE")||gender.equals("Male")||gender.equals("male"))
            {
                tax=income*0.25;
            }
            if(gender.equals("FEMALE")||gender.equals("Female")||gender.equals("female"))
            {
                tax=income*0.2;
            }
        }
    }  
    
    public void display() 
    {
        System.out.println("\nName: " + name+"\nGender: " + gender+"\nAadhar Number: " + aadhar+"\nIncome:"+income+"\nTax: " + tax); 
    }    
}

public class Javaex4 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter no of employees: ");
        int n=scan.nextInt();
        
        employee[] p=new employee[n];
        
        System.out.println("\nEnter the details:");
        for(int i=0;i<n;i++)
        {
            p[i]=new employee();
            p[i].getinformation();
            p[i].calculatetax(p[i].income);
        }  
        
        System.out.println("\nThe details of the employees: ");
        for(int i=0;i<n;i++)
        {
            p[i].display();
        }
    }    
}

