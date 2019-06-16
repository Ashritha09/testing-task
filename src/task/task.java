/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;
/**
 *
 * @author Ramakrishna
 */

/*
             “ABCD” => “BCD”
             “AACD” => “CD” 
             “BACD” => “BCD”
             “BBAA” => “BBAA”       
             “AABAA” => “BAA”

*/


public class task {

    /**
     * @param args the command line arguments
     * @return 
     */
    @SuppressWarnings("empty-statement")
    public static String main(String[] args) {
        
        // TODO code application logic here
       // task t=new task();

    /**
     *
     * @return
     */
  

       String test1(){
           
             String str="ABCD";
                String str1;
                if(str.charAt(0)=='A')
                {
                   if(str.charAt(1)=='A')
                       str1=str.substring(1,str.length());
                
                else {
                       str1=str.substring(2,str.length());
                    }
                }
                else
                { 
                    return str;
                }
                return str1;
        
    }

    /**
     *
     * @return
     */
    public String test2()
                {    
                      String str="AACD";
                String str1;
                if(str.charAt(0)=='A')
                {
                   if(str.charAt(1)=='A')
                       str1=str.substring(1,str.length());
                
                else {
                       str1=str.substring(2,str.length());
                    }
                }
                else
                { 
                    return str;
                }
                return str1;
                }

    /**
     *
     * @return
     */
    public String test3()
             {
                String str="BACD";
                String str1;
                if(str.charAt(0)=='A')
                {
                   if(str.charAt(1)=='A')
                       str1=str.substring(1,str.length());
                
                else {
                       str1=str.substring(2,str.length());
                    }
                }
                else
                { 
                    return str;
                }
                return str1;
               }
   public String test4()
            {    
                String str="BBAA";
                String str1;
                if(str.charAt(0)=='A')
                {
                   if(str.charAt(1)=='A')
                       str1=str.substring(1,str.length());
                
                else {
                       str1=str.substring(2,str.length());
                    }
                }
                else
                { 
                    return str;
                }
                return str1;
            }
   public String test5()
            {   
                
                 String str="AABAA";
                String str1;
                if(str.charAt(0)=='A')
                {
                   if(str.charAt(1)=='A')
                       str1=str.substring(1,str.length());
                
                else {
                       str1=str.substring(2,str.length());
                    }
                }
                else
                { 
                    return str;
                }
                return str1;
            }
    }

}

                                     
                                
            
