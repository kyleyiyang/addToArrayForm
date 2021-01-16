class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int i=A.length-1;
        int temp=0;
        List<Integer> ans = new ArrayList<>();
        while (i>=0 || K>0) {
            int a = i<0?0:A[i];
            int b = K>0?K%10:0;
            //System.out.println("a="+a+"; b="+b+"; k="+K+"; temp="+temp);
            ans.add((a+b+temp)%10);
            temp = (a+b+temp)/10;
            K = K /10;
            i--;
        }
        if (temp!=0) ans.add(temp);
        Collections.reverse(ans);
        return ans;
    }
}
