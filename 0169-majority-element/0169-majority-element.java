class Solution {
    public static Integer getKeyByValue(Map<Integer, Integer> map, Integer value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return 0; 
    }

    public int majorityElement(int[] arr) {
        int n=arr.length;
        if(n==0) return arr[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],1);
        for(int i=1;i<n;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }

        }
        int max=Integer.MIN_VALUE;
        for(Integer nums:map.values()){
            max=Math.max(max,nums);
        }
    
        return getKeyByValue(map,max);
    }
}