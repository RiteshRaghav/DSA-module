class Solution {
    public void dfs(int k, ArrayList<ArrayList<Integer>> adj,boolean[] visited, Set<Integer> st){
        if(visited[k]) return;
        st.add(k);
        visited[k]=true;
        for(int i:adj.get(k)){
            dfs(i,adj,visited,st);
        }
    }
    
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        boolean[] visited=new boolean[n];
        Set<Integer> st=new HashSet<>();
        List<Integer> res=new ArrayList<>();

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
           adj.add(new ArrayList<>());
        }

        for(int i=0;i<invocations.length;i++){
            adj.get(invocations[i][0]).add(invocations[i][1]);
        }

        dfs(k,adj,visited,st);

         for(int[] i:invocations){
            if(!visited[i[0]] && visited[i[1]]){
                for(int j=0;j<n;j++){
                    res.add(j);
                }
                return res;
            }
         }
          
        for(int i=0;i<n;i++){
            if(!visited[i]) res.add(i);
        }
        return res;
    }
}