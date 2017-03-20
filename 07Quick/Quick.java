public class Quick{
public static int part(int[] data, int start, int end){
//-Choose a random element to be a pivot, and partition the array around it. 
//-Only partition the elements from start to end inclusive.
//-When done returns the index of the final position of the pivot element.      
//    (Should be from start to end inclusive)

	int random = start + (int)(Math.random() * (end - start + 1));
	int pivot = data[random];
	swap(data, pivot, end);
	int start1 = start;

	while(start < end){
	if (data[start] >= pivot){
		swap(data, start, end);
		end--;
	}

	if (data[start] < pivot){
		swap(data, end, start + 1);
		start++;
		}
	}
	//for those larger numbers in the beginning
	if (data[start] >= pivot){
		swap(data, end, start);
	}

	if (data[start] < pivot){
		swap(data, end, start + 1);
		start1++;
	}

	for(int index = start; index < end; index++){
		if (data[index] < pivot){
			swap(data, start1, index);
			start1++;
		}
	}

	swap(data, end, start1);
	return start1;

	/*
	for(int index = start; index < end; index++){
		if (data[index] < pivot){
			swap(data, start1, index);
			start1++;
		}
	}

	swap(data, end, start1);
	return start1;
	*/
}
	public static void swap(int[]data, int a, int b){
	int temp = data[a];
	data[a] = data[b];
	data[b] = temp;
}

	public static void main(String[] args){
	int[] data4 = new int[]{1,2,3,4,3,2,1,2,3,2,1,4,2,3,1,2,4,3,1,2};
	System.out.println(part(data4, 0, data4.length - 1));
}

}


