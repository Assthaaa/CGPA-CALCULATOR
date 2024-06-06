import java.util.Scanner;
class Cgpacal
{
	int java_marks,stress_marks,daa_marks,awd_marks,bp_marks,sql_marks,communication_marks;
	Cgpacal(int java_marks,int stress_marks,int daa_marks,int awd_marks,int bp_marks,int sql_marks,int communication_marks)
	{
		this.java_marks=java_marks;
		this.stress_marks=stress_marks;
		this.daa_marks=daa_marks;
		this.awd_marks=awd_marks;
		this.bp_marks=bp_marks;
		this.sql_marks=sql_marks;
		this.communication_marks=communication_marks;
	}
	
	void cal_cgpa()
	{
		int tot_marks=java_marks+stress_marks+daa_marks+awd_marks+bp_marks+sql_marks+communication_marks;
		System.out.println(tot_marks);
		double per=tot_marks/10.00;
		double cgpa=per/9.5;
		System.out.println("CGPA Is: "+cgpa);
	}
	void cal_percentage()
	{
		int tot_marks=java_marks+stress_marks+daa_marks+awd_marks+bp_marks+sql_marks+communication_marks;
		System.out.println(tot_marks);
		double per=tot_marks/10.00;
		System.out.println("Percentage Is: "+per);
	}
	public static void main(String args[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the Java programming:(out of 150)");
		int java_marks=sc.nextInt();
		System.out.println("Enter the marks of the Stress and Conflict Management:(out of 150)");
		int stress_marks=sc.nextInt();
		System.out.println("Enter the marks of the Design and Algorithm Analysis:(out of 150)");
		int daa_marks=sc.nextInt();
		System.out.println("Enter the marks of the Advanced web Development:(out of 150)");
		int awd_marks=sc.nextInt();
		System.out.println("Enter the marks of the Building Presence:(out of 150)");
		int bp_marks=sc.nextInt();
		System.out.println("Enter the marks of the Sql and Data Modelling:(out of 100)");
		int sql_marks=sc.nextInt();
		System.out.println("Enter the marks of the Interpersonal Communication Skills:(out of 150)");
		int communication_marks=sc.nextInt();
		Cgpacal c=new Cgpacal(java_marks,stress_marks,daa_marks,awd_marks,bp_marks,sql_marks,communication_marks);
		
		do
		{
			System.out.println("1.Calculate CGPA");
			System.out.println("2.Calculate Percentage");
			System.out.println("0.EXIT");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
						c.cal_cgpa();
						break;
				case 2:
						c.cal_percentage();
						break;
				case 0:
				     System.exit(0);
					 break;
				default: 
				     System.out.println("invalid choice");
			}
		}while(choice!=0);
	}
}
