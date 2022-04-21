package com.example;


public class TicTacToeGame
{
      
      
 public static Evaluation evaluateBoard(String boardstate)
       
{
           
String lc = boardstate.toLowerCase();

           
if(boardstate.length() !=9)
           
{
               
return Evaluation.InvalidInput;
           
}
       
    
int countx=0;
    
int counto=0;

      
for(int  i=0;i<lc.length();i++)
      
{
         
if(lc.charAt(i)=='x'){
         
countx++;
         
}
         
if(lc.charAt(i)=='o'){
         
counto++;
         
}
      
}
      
if(Math.abs(counto - countx)>=2){
        
return Evaluation.UnreachableState;
    
}
    
Boolean xwins = win('x',lc);
    
Boolean owins = win('o',lc);
    
if((xwins)&&(owins))
    
{
      
return Evaluation.UnreachableState;
    
}
    
else if(xwins)
    
{
      
return Evaluation.Xwins;
    
}
    
else if(owins)
    
{
      
return Evaluation.Owins;
    
}
    
else
    
{
      
return Evaluation.NoWinner;
    
}
  
}
  
 public static boolean win(char checker, String lc)
   
{
     
if(lc.charAt(0)==checker && lc.charAt(1)==checker && lc.charAt(2)==checker)
    
{
      
return true;
    
}
    
if(lc.charAt(3)==checker && lc.charAt(4)==checker && lc.charAt(5)==checker)
    
{
      
return true;
    
}
    
if(lc.charAt(6)==checker && lc.charAt(7)==checker && lc.charAt(8)==checker)
    
{
      
return true;
    
}
    
if(lc.charAt(0)==checker && lc.charAt(3)==checker && lc.charAt(6)==checker)
    
{
      
return true;
    
}
    
if(lc.charAt(2)==checker && lc.charAt(9)==checker && lc.charAt(5)==checker)
    
{
      
return true;
    
}
    
if(lc.charAt(2)==checker && lc.charAt(5)==checker && lc.charAt(8)==checker)
    
{
      
return true;
    
}
    
if(lc.charAt(0)==checker && lc.charAt(4)==checker && lc.charAt(8)==checker)
    
{
      
return true;
   
 }
    
return(lc.charAt(2)==checker && lc.charAt(4)==checker && lc.charAt(6)==checker);
   
}
   
public static void main(String args[])
{
   
System.out.println(evaluateBoard("O...X.X.."));

    
System.out.println(evaluateBoard("XXX...oo."));
    
System.out.println(evaluateBoard("...Xxx.oo"));
    
System.out.println(evaluateBoard("oo....xxx"));
    
System.out.println(evaluateBoard("x..x..xoo"));
    
System.out.println(evaluateBoard(".x..xoox."));
    
System.out.println(evaluateBoard("..xoox..x"));
    
System.out.println(evaluateBoard("x...x.oox"));
    
System.out.println(evaluateBoard("..x.x.xoo"));
    
System.out.println(evaluateBoard("O.."));
   
System.out.println(evaluateBoard("O...X.X...."));
    
System.out.println(evaluateBoard("Oooxxx..."));
    
System.out.println(evaluateBoard("oxooxooxo"));
   
}

}
