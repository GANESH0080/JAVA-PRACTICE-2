package SamplePrograms;

public class IndentifyError {

	public static void main(String[] args) {
		try{
			int a[] = new int[5];
			a[5] = 30/0;
		}
		//Exception e should be placed at the last
		catch(Exception e)
		{
			System.out.println("Common task completed");
			System.out.println(e);
		}
	    catch (ArithmeticException e)
		{
			System.out.println("Task 1 is completed");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Task 2 completed");
		}
		System.out.println("Rest of the Code");
	}

	}

// getting Compile time error
