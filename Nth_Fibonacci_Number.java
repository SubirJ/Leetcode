class Solution {
    static long nthFibonacci(long n){
        // code here
        long first = 0, second = 1, next;
        
        if((n >= 1) && (n <= 1000)){
            
            if(n==0)
                return 0;
            if(n==1)
                return 1;
            if(n>1){
                for(long i=2; i<=n; i++){
                    next = (first%1000000007) + (second%1000000007);
                    if(n == i)
                        return (next%1000000007);
                    first=second;
                    second=next;
                }
            }
        }
        
        //823693831 =656
        return 0;
    }
	
	public static void main(String[] args){
		long n = 656;
		
		System.out.println(nthFibonacci(n));
	}
}