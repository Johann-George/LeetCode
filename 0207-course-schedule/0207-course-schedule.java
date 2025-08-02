class Solution {

    private Map<Integer, List<Integer>> preMap = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        for(int i=0;i<numCourses;i++){
            preMap.put(i,new ArrayList<>());
        }

        for(int[] prereq: prerequisites){
            preMap.get(prereq[0]).add(prereq[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int crs){
        if(visiting.contains(crs)){
            return false;
        }
        if(preMap.get(crs).isEmpty()){
            return true;
        }
        visiting.add(crs);
        for(int pre: preMap.get(crs)){
            if(!dfs(pre)){
                return false;
            }
        }
        visiting.remove(crs);
        preMap.put(crs, new ArrayList<>());
        return true;
    }

}