import java.util.Arrays;
import java.util.Scanner;

class MaxStations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Total number of trains
        int[] arrival = new int[n]; // Arrival timings
        int[] depart = new int[n]; // Departure timings

        for(int i=0;i<n;i++){
            arrival[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            depart[i] = sc.nextInt();
        }

        solve(arrival, depart);

    }

    private static void solve(int[] arrival,int[] departure){
        
        // Sort both the arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        // Maintain a count of maximum platforms
        int count = 0;
        int maxPlatform = 0;
        int j=0,i=0;

        while(i<arrival.length){
            if(arrival[i] < departure[j]){
                maxPlatform = Math.max(maxPlatform,++count);
                i++;
            }

            else{
                count--;
                j++;
            }
        }

        System.out.println("Maximum platforms needed = " + maxPlatform);

    }
}