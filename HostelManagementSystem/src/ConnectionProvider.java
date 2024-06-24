import java.sql.*;


public class ConnectionProvider {
       Connection con;
       Statement st;
       ResultSet rs;
      

    ConnectionProvider(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel?zeroDateTimeBehavior=convertToNull", "root", "");
        st=con.createStatement();
       }
    catch(Exception e){
        System.out.println(e);
       }
     }
    
     public ResultSet getRoom(){
        try{
        String query="Select * from room";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
     
    public void insertRoom(String Number,String Activate,String Status){
    try{
    String query="insert into room (Number,Activate,Status)values('"+Number+"','"+Activate+"','"+Status+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet searchRoom(String Number){
      try{
      String query="Select * from room where Number ='"+Number+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
     public void updateRoom(String Number,String Activate){
        try{
        String query="update room set Activate ='"+Activate+"'where Number ='"+Number+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
     
      public void deleteRoom(String Number){
        try{
        String query="delete from room where Number ='"+Number+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
      
      public ResultSet getManageRoom(){
        try{
        String query="Select * from room where Activate='Yes' and Status='Not Booked'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
      
    public void insertStudent(String MobileNo,String Name,String Father,String Mother,String Email,String Address,String College,String CNIC,String RoomNo,String Status){
    try{
    String query="insert into student (MobileNo,Name,Father,Mother,Email,Address,College,CNIC,RoomNo,Status)values('"+MobileNo+"','"+Name+"','"+Father+"','"+Mother+"','"+Email+"','"+Address+"','"+College+"','"+CNIC+"','"+RoomNo+"','"+Status+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void updateRoomStatus(String Number){
        try{
        String query="update room set Status='Booked' where Number ='"+Number+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public void updateNoRoomStatus(String Number){
        try{
        String query="update room set Status='Not Booked' where Number ='"+Number+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public ResultSet searchStudent(String MobileNo){
      try{
      String query="Select * from student where MobileNo ='"+MobileNo+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public void updateStudent(String MobileNo,String Name,String Father,String Mother,String Email,String Address,String College,String CNIC,String RoomNo,String Status){
    try{
    String query="update student set Name='"+Name+"',Father='"+Father+"',Mother='"+Mother+"',Email='"+Email+"',Address='"+Address+"',College='"+College+"',CNIC='"+CNIC+"',RoomNo='"+RoomNo+"',Status='"+Status+"'where MobileNo ='"+MobileNo+"'";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void deleteStudent(String MobileNo){
        try{
        String query="delete from student where MobileNo ='"+MobileNo+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
     public ResultSet getFees(String MobileNo){
        try{
        String query="Select * from fees where MobileNo ='"+MobileNo+"'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
     
     public ResultSet searchStudentFees(String MobileNo){
      try{
      String query="Select * from student where MobileNo ='"+MobileNo+"' and Status='Living'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
     
     public ResultSet searchPayFees(String Month, String MobileNo){
      try{
      String query="Select * from fees inner join student where student.Status='Living' and fees.Month='"+Month+"' and fees.MobileNo='"+MobileNo+"' and student.MobileNo='"+MobileNo+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
     
    public void insertFees(String MobileNo,String Month,String Amount){
    try{
    String query="insert into fees (MobileNo,Month,Amount)values('"+MobileNo+"','"+Month+"','"+Amount+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet getLivingStudent(){
        try{
        String query="Select * from student where Status='Living'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
    
    public ResultSet getLeavedStudent(){
        try{
        String query="Select * from student where Status='Leaved'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
    
    public void insertEmployee(String MobileNo,String Name,String Father,String Mother,String Email,String Address,String CNIC,String Designation,String Status){
    try{
    String query="insert into employee (MobileNo,Name,Father,Mother,Email,Address,CNIC,Designation,Status)values('"+MobileNo+"','"+Name+"','"+Father+"','"+Mother+"','"+Email+"','"+Address+"','"+CNIC+"','"+Designation+"','"+Status+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet searchEmployee(String MobileNo){
      try{
      String query="Select * from employee where MobileNo ='"+MobileNo+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
    public void updateEmployee(String MobileNo,String Name,String Father,String Mother,String Email,String Address,String CNIC,String Designation,String Status){
    try{
    String query="update employee set Name='"+Name+"',Father='"+Father+"',Mother='"+Mother+"',Email='"+Email+"',Address='"+Address+"',CNIC='"+CNIC+"',Designation='"+Designation+"',Status='"+Status+"'where MobileNo ='"+MobileNo+"'";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public void deleteEmployee(String MobileNo){
        try{
        String query="delete from employee where MobileNo ='"+MobileNo+"'";
        st.executeUpdate(query);
        }catch(Exception e){
        System.out.println(e);
        }
     }
    
    public void insertPayment(String MobileNo,String Month,String Amount){
    try{
    String query="insert into payment (MobileNo,Month,Amount)values('"+MobileNo+"','"+Month+"','"+Amount+"')";
    st.executeUpdate(query);
    }catch(Exception e){
    System.out.println(e);
    }
    }
    
    public ResultSet getPayment(String MobileNo){
        try{
        String query="Select * from payment where MobileNo ='"+MobileNo+"'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
    
    public ResultSet searchEmployeePayment(String MobileNo){
      try{
      String query="Select * from employee where MobileNo ='"+MobileNo+"' and Status='Working'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
     
     public ResultSet searchPayEmployee(String Month, String MobileNo){
      try{
      String query="Select * from payment inner join employee where employee.Status='Working' and payment.Month='"+Month+"' and payment.MobileNo='"+MobileNo+"' and employee.MobileNo='"+MobileNo+"'";
      rs=st.executeQuery(query);
      }catch(Exception e){
      System.out.println(e);
      }   
      return rs;
    }
    
     public ResultSet getEmployeeWorking(){
        try{
        String query="Select * from employee where Status='Working'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
     
     public ResultSet getLeavedEmployee(){
        try{
        String query="Select * from employee where Status='Not Working'";
        rs=st.executeQuery(query);
        }catch(Exception e){
        
           System.out.println(e);
        }
       return rs;
      }
}
