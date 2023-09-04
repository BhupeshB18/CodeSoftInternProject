package test;

import java.util.Scanner;

public class Tasks {
	private static Scanner sc;
	private static JavaBean jb;
	
	public void calculateStudentResult() {
		sc=new Scanner(System.in);
		jb=new JavaBean();
		char grade = 0;
		float totalMarks = 0;
		float avg = 0;
		System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/HINDUSTAN MAHAVIDYALAYA/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
		System.out.println("Enter your Full Name");
		jb.setSname(sc.nextLine());
		System.out.println("Enter your Standard");
		jb.setStd(sc.nextLine());
		System.out.println("---------------------------------------------");
		System.out.println("Enter your all 5 subjects Marks");
		System.out.println("NOTE: MARKS MUST BE OUT OF 100");
		System.out.println("Enter your English Marks: ");
		jb.setEnglishMarks(sc.nextFloat());
		System.out.println("Enter your physics Marks: ");
		jb.setPhysicsMarks(sc.nextFloat());
		System.out.println("Enter your Chemistry Marks: ");
		jb.setChemistryMarks(sc.nextFloat());
		System.out.println("Enter your Maths Marks: ");
		jb.setMathsMarks(sc.nextFloat());
		System.out.println("Enter your Biology Marks: ");
		jb.setBiologyMarks(sc.nextFloat());
		
		float m1=jb.getEnglishMarks();
		float m2=jb.getPhysicsMarks();
		float m3=jb.getChemistryMarks();
		float m4=jb.getMathsMarks();
		float m5=jb.getBiologyMarks();
		
		if(m1<=100 && m2<=100 && m3<=100 && m4<=100 && m5<=100) {
			totalMarks=m1+m2+m3+m4+m5;
			avg=totalMarks/5;
			if(avg<60) {
				 grade='E';
			}else if(avg<70) {
				grade='D';
			}else if(avg<80) {
				grade='C';
			}else if(avg<90) {
				grade='B';
			}else {
				grade='A';
			}
			System.out.println("\t\t\t\tMARKSHEET");
			System.out.println("*********************************************************************");
			System.out.println("STUDENTS NAME:"+jb.getSname()+"\nSTANDARD: "+jb.getStd()
								+"\nTOTAL MARKS: "+totalMarks+"\nPERCENTAGE: "+avg);
			System.out.println("GRADE: "+grade);
		}
		else {
			System.out.println("Marks must be out of 100");
		}
	}
	
	public static void main(String []args) {
		Tasks tsk=new Tasks();
		tsk.calculateStudentResult();
	}
}
class JavaBean{
	private float englishMarks;
	private float physicsMarks;
	private float chemistryMarks;
	private float mathsMarks;
	private float biologyMarks;
	private String sname;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	private String std;
	
	public float getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(float englishMarks) {
		this.englishMarks = englishMarks;
	}
	public float getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(float physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public float getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(float chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public float getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(float mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public float getBiologyMarks() {
		return biologyMarks;
	}
	public void setBiologyMarks(float biologyMarks) {
		this.biologyMarks = biologyMarks;
	}
}
