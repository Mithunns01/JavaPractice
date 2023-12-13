package extrapackage;

public class student extends Object
{
	
		int rollNo;
		String name;
		float per;
		public student(int rollNo, String name, float per )
		{
			this.rollNo=rollNo;
			this.name=name;
			this.per=per;
			
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return rollNo+" " +name+" "+per;
		}
		
}
		
	


