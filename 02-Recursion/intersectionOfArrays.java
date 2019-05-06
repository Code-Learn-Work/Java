import java.util.*;
import java.lang.Integer;


class intersectionOfArrays{
    public static void findIntersection(int arr1[],int arr2[]){
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i:arr1){
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i:arr2){
            list2.add(i);
        }
        list1.retainAll(list2);
        for(int i:list1){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr1[i] = a;
        }
        
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            arr2[i] = a;
        }
        
        findIntersection(arr1, arr2);
        
    }
}