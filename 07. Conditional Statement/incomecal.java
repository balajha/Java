import java.util.*;
public class incomecal {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);

int income=sc.nextInt();
int tax;
int l=100000; 
if(income<5*l){
   tax=0;
   System.out.println("Tax is "+tax);
}
else if(income>=5*l && income<10*l ){
    tax=(int)(income*0.2);
   System.out.println("Tax is "+tax);
}
else{
    tax = (int)(income*0.3);
    System.out.println("Tax is "+tax);
}

sc.close();
}
}
