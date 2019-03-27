class AvailablePath{
    public static boolean path(int[][] arr,boolean[][] visited,int sr,int sc,int dr,int dc){
        
        // Base Cases
        if(sr<0 || sr>=arr.length || sc <0 || sc>=arr[0].length){
            return false;
        }
        if(arr[sr][sc]==0){
            return false;
        }
        if(sc==dc && sr==dr){
            
            return true;
        }
        if(visited[sr][sc]==true){
            return false;
        }

        // Mark Visited as True
        visited[sr][sc] = true;

        // Rec Cases
        boolean ans1 = path(arr,visited,sr, sc+1, dr, dc); // Right
        boolean ans2 = path(arr,visited,sr,sc-1,dr,dc); // Left
        boolean ans3 = path(arr,visited,sr-1, sc, dr, dc); // Top
        boolean ans4 = path(arr,visited,sr+1, sc, dr, dc); // Bottom

        return ans1 || ans2 || ans3 || ans4;
    }
    public static void main(String[] args) {
        
        int arr[][] = {
            {1,0,1,1},
            {1,0,1,1},
            {1,1,1,1},
            {0,1,0,1}
        };
        String pathCovered = "";
        boolean visited[][] = new boolean[arr.length][arr[0].length];
        if(path(arr,visited,0,0,3,3,pathCovered)==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}