class Solution {
    public List<Integer> majorityElement(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        map.put(arr[0],1);
        
        for(int i=1;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int x=n/3;
        List<Integer> ans=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            if(map.get(key)>x){
                ans.add(key);
            }

        }       
        return ans;
    }
}