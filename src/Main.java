import java.util.ArrayList;

class intClass{
	private int value;
	
	public intClass(int intValue) {
		this.value=intValue;
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}

public class Main {
	


	public static void main(String[] args) {
		ArrayList<Integer> iList=new ArrayList<Integer>();
		//Integer is the class not primitive datatype
		iList.add(11);//Here behind the scene in add method 1 object of Integer class
		              //is creating and value of that object is 11;
		ArrayList<intClass> intClassList =new ArrayList<intClass>();
		intClassList.add(new intClass(11));
		intClassList.add(new intClass(22));
		//
		iList.add(56);//internally it like Integer=new Integer(56)
		
		for(int i=0;i<=5;i++) {
			iList.add(Integer.valueOf(i));//autoboxing primitive type i is converting into wrapper
			                              //class object
		}
		
		for(int i=0;i<=5;i++) {
			System.out.println(i+"  ---->"+iList.get(i).intValue());//unboxing
		//here taking object and converting into primitive type int
		}
		
		Integer i=new Integer(10);
		int ivalue=11;//unboxing object
		if(i==ivalue) {
			System.out.println("both values are equal");
		}else {
			System.out.println("both values are not equal");
		}
		Integer i1=11;//autoboxing
		if(i1==ivalue) {
			System.out.println("both values are equal");
		}else {
			System.out.println("both values are not equal");
		}
	}

}

