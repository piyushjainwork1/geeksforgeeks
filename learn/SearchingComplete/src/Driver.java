import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int[] a = {3, 1, 3, 3, 2};
        int x = 5;
     //   majorityElement(a,x);
        System.out.println("the sum is "+sumOfTenNumber());
    }

    public static int binarySearch(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == x) return mid;
            if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static int recursionSearchBinary(int[] a, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (a[mid] == x) return mid;
        else if (a[mid] > x) return recursionSearchBinary(a, x, low, mid - 1);
        else return recursionSearchBinary(a, x, mid + 1, high);
    }

    public static int firstOccuranceInSortedArray(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > x) high = mid - 1;
            if (a[mid] < x) low = mid + 1;
            if (mid != a.length - 1 || a[mid + 1] != a[mid]) {
                return mid;
            } else high = mid + 1;
        }
        return -1;
    }

    static public int firstOcc(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > x) high = mid - 1;
            if (a[mid] < x) low = mid + 1;
            if (a[mid] == x && a[mid - 1] != a[mid]) return mid;
            else low = mid - 1;
        }
        return -1;
    }
    public static int Count1sInSortedArray(int[] a){
        int length = a.length;
        return (length -(firstOcc(a,1)));
    }


    static int majorityElement(int a[], int size)
    {
            int [] N = new int [10000001];
            for(int i = 0; i<size; i++){
                N[a[i]]++;
                if(N[a[i]] > size/2){
                    return a[i];
                }
            }
            return -1;
    }

    static  int sumOfTenNumber(){
        int sum =0;
        Scanner sc = new Scanner(System.in);
//        for(int i =1;i<=10;i++){
//            System.out.println("Please enter a number");
//            int num = sc.nextInt();
//            if(num <0){
//                System.out.println("please enter positive number only");
//                i--;
//            }
//            sum = sum+num;
//        }

        int count =1;
        while(count <=10){
            int num = sc.nextInt();
            if(num >0){
                count++;
                sum = sum+num;
            }
        }
        return sum;
    }




}
