package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private void foo() throws Exception {
        bar("DES"); // this should create a warning
        Cipher c = Cipher.getInstance("AES");
        Cipher d = Cipher.getInstance("TESTd");
        
        /// Adding a false comment
        Cipher e = Cipher.getInstance("AES");
    }

    private void bar(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
        Cipher d = Cipher.getInstance("TESTING");
    }
}
