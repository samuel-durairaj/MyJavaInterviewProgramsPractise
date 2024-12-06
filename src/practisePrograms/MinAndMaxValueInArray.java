package practisePrograms;

public class MinAndMaxValueInArray {
	
	public static void minAndMaxValueInArray() {
		int arr[] = {3,9,5,6,11,10};
		int len = arr.length;

		//Maximum value in an array
		int max= arr[0];
		for(int i=1;i<len;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Value: "+max);
		
		//Minimum value in an array
		int min= arr[0];
		for(int j=1;j<len;j++) {
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println("Minimum Value: "+min);
	}

	public static void main(String[] args) {
		minAndMaxValueInArray();
	}

}
