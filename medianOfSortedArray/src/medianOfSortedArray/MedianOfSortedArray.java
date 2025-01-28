package medianOfSortedArray;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[nums1.length+nums2.length];
        double med;
        System.arraycopy(nums1,0,a,0,nums1.length);
        System.arraycopy(nums2,0,a,nums1.length,nums2.length);
        Arrays.sort(a);
        int len = a.length;
        if(len%2==0){
            med = a[len/2]+a[len/2-1];
            return med/2;
        }
        else{
            return a[len/2];
        }
	}

}
