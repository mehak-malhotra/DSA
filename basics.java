class basics{
    public static void main(String[] args){
        Ques q= new Ques();
        // System.out.println(q.sum(4));
        // System.out.println(q.factorial(4));.
        // q.even(12);
        
        // int[] a1= {1, 2, 13, 4, 5};
        // int[] a2= q.copyarr(a1);
        // for(int i=0; i< a2.length; i++){
        //     System.out.println(a2[i]);
        // }

        // int[] a3= Arrays.copyOf(a1, 5);
        // for(int i=0; i< a3.length; i++){
        //     System.out.println(a3[i]);
        // }

        int[] a4= {12, 45, 67, 89, 90, 112, 345};
        System.out.println(q.binarySearch(a4, 4));
    }
}

class Ques{
    int binarySearch(int[] arr, int num){
        int s= 0; 
        int e= arr.length -1;
        while(s<e){
            int mid= s+ (e-s)/2;
            if(arr[mid] == num){
                return mid;
            }
            if(arr[mid] > num){
                e= mid;
            }else{
                s=mid+1;
            }
        }

        return -1;
    }

    int[] copyarr(int[] arr){
        int n= arr.length;
        int[] a2= new int[n];
        for(int i=0; i<n; i++){
            a2[i]= arr[i];
        }

        return a2;
    }
    
    // even nos from one to n
    void even(int n){
        for(int i=0; i<=n; i+=2){
            System.out.println(i);
        }
    }
 
    // factorial of n
    int factorial(int n){
        int fac=1;
        for(int i=n; i>0; i--){
            fac*=i;
        }
        return fac;
    }

    // find sum of n natural nos
    int sum(int n){
        // int s=0;
        // for(int i=1; i<=n; i++){
        //     s+= i;
        // }
        // return s;

        return ((n)*(n+1))/2;
    }
}