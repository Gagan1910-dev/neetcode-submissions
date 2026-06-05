class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String>res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
        int j=str.indexOf('#',i);
        int len=Integer.parseInt(str.substring(i,j));
        int start=j+1;
        int end=start+len;
        String word=str.substring(start,end);
        res.add(word);
        i=end;
        }
        return res;
       
    }
}
