package com.DataStructures;

class TestCustomException1{
    int n1=0, n2=1, n3=0;

    boolean flag = true;
  int febonachi(int count){
      if(count == 1){
      }
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      if (flag){
          System.out.println(0);
          flag=false;
      }
      febonachi(--count);
      return 0;
  }
     
   public static void main(String args[]){
       TestCustomException1 obj = new TestCustomException1();
       int count = 5;
       //System.out.println(n1+" "+n2);
       obj.febonachi(count);
   }
}  
