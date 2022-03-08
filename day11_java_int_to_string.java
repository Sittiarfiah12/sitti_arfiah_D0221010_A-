import java.util.*;

import java.security.*;

Penyelesaian kelas awam {

public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  cuba {

   Pengimbas masuk = Pengimbas baharu(System.in);

   int n = dalam .nextInt();

   in.close();

   //String s=???; Lengkapkan baris ini di bawah

   //Tulis kod anda di sini

   //String s = ""+n;

   //String s = String.valueOf(n);

   //String s = Integer.toString(n);

   //String s = String.format("%d" , n);

   

   Integer i = new Integer (n);

   StringBuilder sb = new StringBuilder();

   sb.append (i);

   String s = sb.toString();

   

   if (n == Integer.parseInt(s)) {

    System.out.println("Good job");

   } else {

    System.out.println("Wrong answer.");

   }

  } catch (DoNotTerminate.ExitTrappedException e) {

   System.out.println("Unsuccessful Termination!!");

  }

 }

}

//The following class will prevent you from terminating the code using exit(0)!

class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;

 }

 public static void forbidExit() {

  final SecurityManager securityManager = new SecurityManager() {

   @Override

   public void checkPermission(Permission permission) {

    if (permission.getName().contains("exitVM")) {

     throw new ExitTrappedException();

    }

   }

  };

  System.setSecurityManager(securityManager);

 }

}
