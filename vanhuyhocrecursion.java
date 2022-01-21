public class baitapcsd {

// Tinh x^n
        public static int tinhXn(int x, int n){
            if (n==0) return 1;
            else return x*tinhXn(x,n-1);
        }
    

//Tinh Tong So Nguyen Duong Trong Day
public static int Sum(int n){
    int a;
    if(n/10==0) return n%10;
    else a = n % 10;
    return a+ Sum(n/10);
}

//Tinh nCk
public static int giaithua(int x){
    if(x==0){ return 1;}
    else{
        return x*giaithua(x-1);
    }
}

public static int kCn(int k, int n){
    return giaithua(n)/(giaithua(k)*giaithua(n-k));
}

// Tinh Uoc Chung Lon Nhat Cua a,b
public static int UCLN(int a,int b){
    if (a==b) return a;
    else{
        if(a>b) a =a-b;
        else b = b-a;
        return UCLN(a,b);
    }
}
        public static void main(String[] args) {
            
            System.out.println(tinhXn(3,4));
            System.out.println(Sum(2752));
            System.out.println(kCn(3,6));
            System.out.println(UCLN(81,9));
        }
    }
    
