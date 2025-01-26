package practisePrograms;

public class LinearSearch {

	public static void linearSearch() {
		int[] arr = {4,6,2,1,8,12,9};
		int searchEle = 22;
		int len = arr.length;
		boolean flag = false;
		
		for(int i=0;i<len;i++) {
			if(searchEle==arr[i]) {
				System.out.print("Element Found at :"+i);
				flag = true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.print("Element Not Found");
		}
		
	}

	public static void main(String[] args) {
		linearSearch();
	}

}
