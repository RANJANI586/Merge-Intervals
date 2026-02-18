class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        return intervals;
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]>ans =new ArrayList<>();
        int[] newItrl=intervals[0];
        ans.add(newItrl);
        for(int[] interval:intervals){
            if(interval[0]<=newItrl[1])
            newItrl[1]=Math.max(newItrl[1],interval[1]);
            else{
                newItrl=interval;
                ans.add(newItrl);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}