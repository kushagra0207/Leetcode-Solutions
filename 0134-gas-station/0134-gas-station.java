class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int gas_sum=0;
        int cost_sum=0;
        int count=0;
        int start =0;
         for(int i=0;i<gas.length;i++){
             gas_sum=gas_sum+gas[i];
             cost_sum=cost_sum+cost[i];
         }
        if(gas_sum<cost_sum) return -1;
        
        for(int i=0;i<gas.length;i++){
            count=count+(gas[i]-cost[i]);
            if(count<0){
                count=0;
                start=i+1;
            }
            
            
}
        
        return start;
    }
}