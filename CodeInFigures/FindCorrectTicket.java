package CodeInFigures;

import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.nashorn.internal.scripts.JO;
import sun.security.krb5.internal.Ticket;

import javax.swing.*;

public class FindCorrectTicket {
    public static void main(String[] args) {
      Long TicketNum= GetTicketNum();
      Long NewTicketNum = RemoveLastNum(TicketNum);
      Long Remainder = FindRemainder(NewTicketNum);
      Long LastNum = FindLastNum(TicketNum);
      Boolean CorrectNum = VerifyNum (Remainder, LastNum);
      JOptionPane.showMessageDialog(null, CorrectNum);

    }
    public static long GetTicketNum(){
        String TicketNumber = JOptionPane.showInputDialog(null, "Please Enter Ticket Number");
        Long TicketNum = Long.parseLong(TicketNumber);
        return TicketNum ;
    }
    public static long RemoveLastNum(long TicketNum){
        String StringNewNum = String.valueOf(TicketNum);
        String DroppedNum = StringNewNum.substring(0, StringNewNum.length()-1);
        Long NewTicketNumber = Long.parseLong(DroppedNum);
        return NewTicketNumber;
    }
    public static long FindRemainder(long NewTicketNum){
        Long Remainder = NewTicketNum % 7;
        return Remainder;
    }
    public static long FindLastNum(long TicketNum){
        long LastNum = TicketNum % 10;
        return LastNum;
    }
    public static boolean VerifyNum(long Remainder, long LastNum){
        return Remainder == LastNum;
        }
    }


