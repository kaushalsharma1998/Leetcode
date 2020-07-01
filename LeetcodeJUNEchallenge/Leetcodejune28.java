class 	Leetcodejune28 {
    Map<String, PriorityQueue<String>> graph;
    LinkedList res;
    public List<String> findItinerary(List<List<String>> tickets) {
        graph = new HashMap<>();
        res = new LinkedList<>();
        
        //1. Build Graph
        for(List<String> ticket : tickets){
            String from = ticket.get(0), to = ticket.get(1);
            if(!graph.containsKey(from)) graph.put(from, new PriorityQueue<>());
            
            graph.get(from).offer(to);
        }
        
        //2. Call DFS from JFK
        dfs("JFK");
        return res;
    }
    
    void dfs(String from){
        PriorityQueue<String> arrivals = graph.get(from);
        while(arrivals != null && !arrivals.isEmpty()){
            dfs(arrivals.poll());
        }
        
        res.addFirst(from);
    }
   
}