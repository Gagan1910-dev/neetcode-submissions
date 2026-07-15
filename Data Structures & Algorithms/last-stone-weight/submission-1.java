class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int a:stones){
            list.add(a);
        }
        while(list.size()>1){
            Collections.sort(list);
            int cur=list.remove(list.size()-1)-list.remove(list.size()-1);
            if(cur!=0){
                list.add(cur);
            }
          
        }
          if(list.isEmpty()){
                return 0;
            }
            else{
                return list.get(0);
            }
    }
}
