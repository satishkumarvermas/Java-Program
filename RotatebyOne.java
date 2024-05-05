import java.util.Arrays;

class RotatebyOne {
	public static void main(String[] args)
	{
		int arr[] = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Given Array is");
		System.out.println(Arrays.toString(arr));
		
		int last_el = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = last_el;

		System.out.println("Rotated Array is");
		System.out.println(Arrays.toString(arr));
	}
}
