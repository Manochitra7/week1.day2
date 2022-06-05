package javaAssignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {3,2,11,4,6,7};
		int [] arr2= {1,2,8,4,9,7};
		int size1 = arr1.length; 
		int size2 = arr2.length;
		System.out.println("array1 length= "+size1);
		System.out.println("array2 length=" +size2);
		for (int i=0; i<arr1.length; i++ ) {
			
			for(int j=0; j<arr2.length;j++) {
				if( arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
				
			}
		}
				

	}

}
