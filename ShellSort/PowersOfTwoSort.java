package ShellSort;

public class PowersOfTwoSort{
    static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    static void exchange(Comparable[] a, int i,int j ){
        Comparable temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void sort(Comparable[] a){
        int N= a.length;
        int h=1;
        while(h<N/2){
            h =2*h;
        }
        while(h>=1) {
            for (int i = 0; i < N; i++) {
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
                    exchange(a,j,j-h);
                }
            }
            h=h/2;
        }
    }
}
