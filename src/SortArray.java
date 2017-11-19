import org.junit.Test;


public class SortArray {

	@Test
	public void test01() throws Exception{
		
		int[] arr = {5,9,1,3,2,4};
		
		//System.out.println("Array size : " + arr.length);
		
		int t = arr.length;
		System.out.println(t);
		
		System.out.println(arr[2]);
		
		
		for(int i = 0; i<t-1; i++){
			System.out.println(arr[i]);
			if(arr[i] > arr[i+1]){
				
				int a = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = a;
			}
			System.out.println(arr[i]);
		}
	}
}
