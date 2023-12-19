package PracticeLast;
public class Max3 {

	public static void main(String[] args) {
		int arr[]= {10,45,22,23,44,34,66};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Third max value is"+arr[arr.length-3]);
	}
}