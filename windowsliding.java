public class windowsliding {
    public static void main(String[] args) {
        int arr[]={2,9,4,7,11,5,10,25,3};
        int w=4;
        int s=0;
        for(int i=0;i<w;i++){
            s+=arr[i];
        }
        int max=s;
        for(int i=1;i<=arr.length-w;i++){
            s=s-arr[i-1]+arr[i+w-1];
            if(s>max){
                max=s;
            }
        }
    }
}