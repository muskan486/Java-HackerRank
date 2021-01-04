import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;
    public Student(int id,String name,double cgpa)
    {
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getCGPA()
    {
        return cgpa;
    }
    
    public int compareTo(Student o)
    {
        if(cgpa==o.cgpa)
        {
            if(name.compareTo(o.name)==0)
            {
                return id-o.id;
            }
            else
            {
            return name.compareTo(o.name);
            } 
        }
        else{
        if(cgpa<o.cgpa)
        return 1;
        else
        return -1;
    }
 }
}
class Priorities
{
    public List<Student> getStudents(List<String> events)
    {
        PriorityQueue<Student> pq=new PriorityQueue<Student>();
        for(String s:events)
        {
            String[] srr=s.split("\\s");
               if(srr.length>1)
               {
                   Student obj=new Student(Integer.valueOf(srr[3]),srr[1],Double.valueOf(srr[2]));
                   pq.add(obj);
                   
               }
               else
               {
                   pq.poll();
               }
            
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }
        ArrayList<Student> al=new ArrayList<Student>(pq);
        return al;
        
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
