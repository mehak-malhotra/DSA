class One{
    public static void main(String[] args){
        Solution st= new Solution();
        // st.print();
        // st.printnum(1, 7);
        // st.printreverse(5);
        // st.printback(4, 4);
        // st.sum(4);
        // System.out.println(st.s);
        // st.sum1(4, 0);
        // System.out.println(st.sum2(4));

        st.reverse(0, 4, st.arr);
        for(int i=0; i<5; i++){
            System.out.print(st.arr[i] + " ");
        }
    }
}

class Solution{
    String name= "Mehak";
    int count= 1;

    // print name 5 times
    void print(){
        if(count > 5){
            return;
        }
        System.out.println(name);
        count++;
        print();
    }

    // print linearly from 1 to n
    void printnum(int c, int n){
        System.out.println(c);
        if(c == n){
            return;
        }
        printnum(c+1,n);
    }

    // print from n to 1
    void printreverse(int n){
        if(n <1){
            return;
        }
        System.out.println(n);
        printreverse(n-1);
    }

    // print 1 to n using backtracking
    void printback(int i, int n){
        if(i == 0){
            return;
        }
        printback(i-1, n);
        System.out.println(i);
    }

    int s= 0;

    // sum of first n numbers
    void sum0(int n){
        if(n == 0){
            return;
        }
        s += n;
        sum0(n-1);
    }

    // sum of first n numbers PARAMETERISED WAY
    void sum1(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sum1(n-1, sum);
    }

    // sum of first n numbers FUNCTIONAL WAY
    int sum2(int n){
        if(n == 0){
            return 0;
        }

        return n + sum2(n-1);
    }

    // reverse an array inplace with recursion
    int[] arr= {1, 2, 3, 4, 5};
    void reverse(int s, int e, int[] arr){
        if(s>e){
            return;
        }

        int temp= arr[s];
        arr[s]= arr[e];
        arr[e]= temp;

        reverse(s+1, e-1, arr);
    }
}