class AddevenIndex {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Total: "+ sum);
    }
}