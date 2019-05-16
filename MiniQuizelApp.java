import java.util.*;
import javax.swing.*;
import java.io.*;

public class MiniQuizelApp
{
   public static void main(String[] args)
   {
      //declare
      String name;
      String group;
      String codeP;
      String matNo;
      String lectName;
      int respond;
      String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
      int a=0,b=0,mark=0;
      
      int num =1;
      
      studentDetail exam;

      Scanner x = new Scanner(System.in);

      
      //input
      try
      {

            FileWriter fw1 = new FileWriter("result.txt",true);
            BufferedWriter bw1 = new BufferedWriter (fw1);
            PrintWriter pw1 = new PrintWriter(bw1);
            
            FileWriter fw2 = new FileWriter("record.txt",true);
            BufferedWriter bw2 = new BufferedWriter (fw2);
            PrintWriter pw2 = new PrintWriter(bw2);

         do
         {
            System.out.print("Enter student's name: ");
            name = x.nextLine();
            //input.nextLine();
            System.out.print("\nEnter matric number: ");
            matNo = x.nextLine();
            System.out.print("\nEnter your group: ");
            group = x.nextLine();
            System.out.print("\nEnter lecturer name: ");
            lectName = x.nextLine();
         
         
           
         
            if(group.equalsIgnoreCase("RCS1103A"))
            {
               System.out.print("\nChoose Your Luck A , B , C: ");
               codeP = x.next(); 
               if(codeP.equalsIgnoreCase("A"))
               {
                  q1 = JOptionPane.showInputDialog(null,"Que1: What is the methods for double data type in Buffered Reader?\nA) nextDouble() \nB) nextLong() \nC) Double.parseDouble() \nD) Long.parseLong()");
                  q2 = JOptionPane.showInputDialog(null,"Que2: What is the name of our first Prime Minister\nA) Tun Abdul Razak\nB) Tun Hussein Onn\nC) Tunku Abdul Rahman\nD) Tun Dr Mahathir");
                  q3 = JOptionPane.showInputDialog(null,"Que3: Which is not loop?\nA) while\nB) if..else\nC) for\nD) do while");
                  q4 = JOptionPane.showInputDialog(null,"Que4: What is the state of Langkawi\nA) Perak\nB) Kedah\nC) Pulau Pinang \nD) Perlis");
                  q5 = JOptionPane.showInputDialog(null,"Que5: What is universal colour of USB 3.0 \nA)  Black\nB) Blue \nC) red\nD) yellow");
                  q6 = JOptionPane.showInputDialog(null,"Que6: Which one is repitition\nA) Sentinel loop\nB) super loop\nC) optimus loop\nD) prime loop");
                  q7 = JOptionPane.showInputDialog(null,"Que7: What our group name\nA) QOP\nB) Abadon\nC) Bounty Hunter\nD) Zeus");
                  q8 = JOptionPane.showInputDialog(null,"Que8: Which one is not the data entry\nA) Scanner\nB) Buffered Reader\nC) Dialog box\nD) Print");  
                  q9 = JOptionPane.showInputDialog(null,"Que9: Which brand of laptop is most suitable for gamers \nA) Dell\nB) HP\nC) Lenovo\nD) MSI");
                  q10 = JOptionPane.showInputDialog(null,"Que10: What is the name of new Rector \nA) Zainuddin\nB) Adib\nC) Syafiq\nD) WaN");

                  exam = new answerA();

                  if(exam instanceof answerA)
                  {
                     answerA temp = (answerA)exam;
                     temp.setAnswerA(name,matNo,group,lectName,mark,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
                     JOptionPane.showMessageDialog(null,"congratulation, your mark is ="+temp.calcAnswer());
                  }
               }
               else if(codeP.equalsIgnoreCase("B"))
               {
                  q1 = JOptionPane.showInputDialog(null,"Que1: Which is a reserved word in the Java programming language\nA) method\nB) native\nC) subclasses\nD) reference");
                  q2 = JOptionPane.showInputDialog(null,"Que2: When was Malaysia formed\nA) 1963  \nB) 1968 \nC) 1976 \nD) 1984");
                  q3 = JOptionPane.showInputDialog(null,"Que3: Which country seceded from Malaysia 1965\nA) Brunei\nB) Singapore\nC) Taiwan\nD) Tibet");
                  q4 = JOptionPane.showInputDialog(null,"Que4: Sabah and Sarawak are part of which island\nA) Java\nB) Bali\nC) Borneo\nD) Timor");
                  q5 = JOptionPane.showInputDialog(null,"Que5: Which country occupied Malaysia during World War II\nA) Japan\nB) China b\nC) Australia\nD) Vietnam");
                  q6 = JOptionPane.showInputDialog(null,"Que6: Which is the capital of Malaysia\nA) Kelang\nB) Ambon\nC) Kuala Lumpur\nD) Dili");
                  q7 = JOptionPane.showInputDialog(null,"Que7: Which one is the currency for Malaysia\nA) Ringgit\nB) Yen\nC) Rupee\nD) Dollar");
                  q8 = JOptionPane.showInputDialog(null,"Que8: Which is the official language of Malaysia\nA) Chinese\nB) Malay\nC) Esperanto\nD) Tamil");  
                  q9 = JOptionPane.showInputDialog(null,"Que9: To which religion did Parameswara Dewa Shah, the ruler of Malacca in the 15th century,convert?\nA) Buddhism\nB) Jainism\nC) Islam\nD) Voodooism");
                  q10 = JOptionPane.showInputDialog(null,"Que10: Which country began a programme of confrontation against Malaysia in 1963 that ended in 1966\nA) UK\nB) Thailand\nC) Indonesia\nD) Burma");

                  exam = new answerB();

                  if(exam instanceof answerB)
                  {
                     answerB temp = (answerB)exam;
                     temp.setAnswerB(name,matNo,group,lectName,mark,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
                     JOptionPane.showMessageDialog(null,"congratulation, your mark is ="+temp.calcAnswer());
                  }
               }
               else if(codeP.equalsIgnoreCase("C"))
               {
                  q1 = JOptionPane.showInputDialog(null,"Que1: Which one among these is not a datatype\nA) int\nB) float\nC) boolean\nD) char");
                  q2 = JOptionPane.showInputDialog(null,"Que2: Which package is directly available to our class without importing it\nA) swing\nB) applet\nC) net\nD) lang");
                  q3 = JOptionPane.showInputDialog(null,"Que3: which is not a keyword\nA) class\nB) int\nC) get\nD) if");
                  q4 = JOptionPane.showInputDialog(null,"Que4: which of this is valid outside class\nA) int i = mySuper.pubSuper;\nB) int j = mySuper.privSuper\nC) int j = mySuper.protSuper; \nD) int j = mySuper.privSub");
                  q5 = JOptionPane.showInputDialog(null,"Que5: which one is Mutator\nA) public String getData\nB) public class a extends b\nC) public String toString\nD) public void setData");
                  q6 = JOptionPane.showInputDialog(null,"Que6: Which one is repitition\nA) Sentinel loop\nB) super loop\nC) optimus loop\nD) prime loop");
                  q7 = JOptionPane.showInputDialog(null,"Que7: What our group name\nA) QOP\nB) Abadon\nC) Bounty Hunter\nD) Zeus");
                  q8 = JOptionPane.showInputDialog(null,"Que8: Which Chapter is Inheritence\nA) 2\nB) 4\nC) 7\nD) 9");  
                  q9 = JOptionPane.showInputDialog(null,"Que9: Who is the class leader for mgt 162 B\nA) Syafiq\nB) Azri\nC) Nafis\nD) Najib");
                  q10 = JOptionPane.showInputDialog(null,"Que10: What is the name of our Lecturer");

                  exam = new answerC();

                  if(exam instanceof answerC)
                  {
                     answerC temp = (answerC)exam;
                     temp.setAnswerC(name,matNo,group,lectName,mark,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
                     JOptionPane.showMessageDialog(null,"congratulation, your mark is ="+temp.calcAnswer());
                  }
               }
               a++;
            }
            else if(group.equalsIgnoreCase("RCS1103B"))
            {
               System.out.print("\nChoose Your Luck A , B , C: ");
               codeP = x.next(); 
               if(codeP.equalsIgnoreCase("A"))
               {
                  q1 = JOptionPane.showInputDialog(null,"Que1: What is the methods for double data type in Buffered Reader?\nA) nextDouble() \nB) nextLong() \nC) Double.parseDouble() \nD) Long.parseLong()");
                  q2 = JOptionPane.showInputDialog(null,"Que2: What is the name of our first Prime Minister\nA) Tun Abdul Razak\nB) Tun Hussein Onn\nC) Tunku Abdul Rahman\nD) Tun Dr Mahathir");
                  q3 = JOptionPane.showInputDialog(null,"Que3: Which is not loop?\nA) while\nB) if..else\nC) for\nD) do while");
                  q4 = JOptionPane.showInputDialog(null,"Que4: What is the state of Langkawi\nA) Perak\nB) Kedah\nC) Pulau Pinang \nD) Perlis");
                  q5 = JOptionPane.showInputDialog(null,"Que5: What is universal colour of USB 3.0 \nA)  Black\nB) Blue \nC) red\nD) yellow");
                  q6 = JOptionPane.showInputDialog(null,"Que6: Which one is repitition\nA) Sentinel loop\nB) super loop\nC) optimus loop\nD) prime loop");
                  q7 = JOptionPane.showInputDialog(null,"Que7: What our group name\nA) QOP\nB) Abadon\nC) Bounty Hunter\nD) Zeus");
                  q8 = JOptionPane.showInputDialog(null,"Que8: Which one is not the data entry\nA) Scanner\nB) Buffered Reader\nC) Dialog box\nD) Print");  
                  q9 = JOptionPane.showInputDialog(null,"Que9: Which brand of laptop is most suitable for gamers \nA) Dell\nB) HP\nC) Lenovo\nD) MSI");
                  q10 = JOptionPane.showInputDialog(null,"Que10: What is the name of new Rector \nA) Zainuddin\nB) Adib\nC) Syafiq\nD) WaN");

                  exam = new answerA();

                  if(exam instanceof answerA)
                  {
                     answerA temp = (answerA)exam;
                     temp.setAnswerA(name,matNo,group,lectName,mark,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
                     JOptionPane.showMessageDialog(null,"congratulation, your mark is ="+temp.calcAnswer());
                  }
               }
               else if(codeP.equalsIgnoreCase("B"))
               {
                  q1 = JOptionPane.showInputDialog(null,"Que1: Which is a reserved word in the Java programming language\nA) method\nB) native\nC) subclasses\nD) reference");
                  q2 = JOptionPane.showInputDialog(null,"Que2: When was Malaysia formed\nA) 1963  \nB) 1968 \nC) 1976 \nD) 1984");
                  q3 = JOptionPane.showInputDialog(null,"Que3: Which country seceded from Malaysia 1965\nA) Brunei\nB) Singapore\nC) Taiwan\nD) Tibet");
                  q4 = JOptionPane.showInputDialog(null,"Que4: Sabah and Sarawak are part of which island\nA) Java\nB) Bali\nC) Borneo\nD) Timor");
                  q5 = JOptionPane.showInputDialog(null,"Que5: Which country occupied Malaysia during World War II\nA) Japan\nB) China b\nC) Australia\nD) Vietnam");
                  q6 = JOptionPane.showInputDialog(null,"Que6: Which is the capital of Malaysia\nA) Kelang\nB) Ambon\nC) Kuala Lumpur\nD) Dili");
                  q7 = JOptionPane.showInputDialog(null,"Que7: Which one is the currency for Malaysia\nA) Ringgit\nB) Yen\nC) Rupee\nD) Dollar");
                  q8 = JOptionPane.showInputDialog(null,"Que8: Which is the official language of Malaysia\nA) Chinese\nB) Malay\nC) Esperanto\nD) Tamil");  
                  q9 = JOptionPane.showInputDialog(null,"Que9: To which religion did Parameswara Dewa Shah, the ruler of Malacca in the 15th century,convert?\nA) Buddhism\nB) Jainism\nC) Islam\nD) Voodooism");
                  q10 = JOptionPane.showInputDialog(null,"Que10: Which country began a programme of confrontation against Malaysia in 1963 that ended in 1966\nA) UK\nB) Thailand\nC) Indonesia\nD) Burma");

                  exam = new answerB();

                  if(exam instanceof answerB)
                  {
                     answerB temp = (answerB)exam;
                     temp.setAnswerB(name,matNo,group,lectName,mark,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
                     JOptionPane.showMessageDialog(null,"congratulation, your mark is ="+temp.calcAnswer());
                  }
               }
               else if(codeP.equalsIgnoreCase("C"))
               {
                  q1 = JOptionPane.showInputDialog(null,"Que1: Which one among these is not a datatype\nA) int\nB) float\nC) boolean\nD) char");
                  q2 = JOptionPane.showInputDialog(null,"Que2: Which package is directly available to our class without importing it\nA) swing\nB) applet\nC) net\nD) lang");
                  q3 = JOptionPane.showInputDialog(null,"Que3: which is not a keyword\nA) class\nB) int\nC) get\nD) if");
                  q4 = JOptionPane.showInputDialog(null,"Que4: which of this is valid outside class\nA) int i = mySuper.pubSuper;\nB) int j = mySuper.privSuper\nC) int j = mySuper.protSuper; \nD) int j = mySuper.privSub");
                  q5 = JOptionPane.showInputDialog(null,"Que5: which one is Mutator\nA) public String getData\nB) public class a extends b\nC) public String toString\nD) public void setData");
                  q6 = JOptionPane.showInputDialog(null,"Que6: Which one is repitition\nA) Sentinel loop\nB) super loop\nC) optimus loop\nD) prime loop");
                  q7 = JOptionPane.showInputDialog(null,"Que7: What our group name\nA) QOP\nB) Abadon\nC) Bounty Hunter\nD) Zeus");
                  q8 = JOptionPane.showInputDialog(null,"Que8: Which Chapter is Inheritence\nA) 2\nB) 4\nC) 7\nD) 9");  
                  q9 = JOptionPane.showInputDialog(null,"Que9: Who is the class leader for mgt 162 B\nA) Syafiq\nB) Azri\nC) Nafis\nD) Najib");
                  q10 = JOptionPane.showInputDialog(null,"Que10: What is the name of our Lecturer");

                  exam = new answerC();

                  if(exam instanceof answerC)
                  {
                     answerC temp = (answerC)exam;
                     temp.setAnswerC(name,matNo,group,lectName,mark,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
                     JOptionPane.showMessageDialog(null,"congratulation, your mark is ="+temp.calcAnswer());
                  }
               }
               b++;
            }
         
            respond = JOptionPane.showConfirmDialog(null,"Do You Want To Continue ?", "Continue",JOptionPane.YES_NO_OPTION);

            

         }while( respond == JOptionPane.YES_OPTION);

         pw1.close();
         pw2.close();         
      }
      catch(FileNotFoundException fn)
		{
			System.out.println(fn.getMessage());
		}
		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}
		catch (Exception e)
		{  
			System.out.println(e.getMessage());
		}
   }
}