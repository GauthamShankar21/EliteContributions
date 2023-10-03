class Solution {
    public int leastBricks(List<List<Integer>> wall) 
    {
        HashMap<Integer, Integer> edge_frequency = new HashMap<>(); 
        int max_frequency = 0;  
        for(int row=0; row<wall.size(); row++) 
        {
            int edge_postion = 0;             
            for(int brick_no=0; brick_no<wall.get(row).size()-1; brick_no++)
            {
                int current_brick_length = wall.get(row).get(brick_no);
                edge_postion = edge_postion + current_brick_length; 
                edge_frequency.put(edge_postion,edge_frequency.getOrDefault(edge_postion,0)+1); 
                max_frequency = Math.max(edge_frequency.get(edge_postion),max_frequency); 
            }
        }
        return wall.size() - max_frequency; 
    }
}