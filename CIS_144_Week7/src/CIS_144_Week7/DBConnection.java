package CIS_144_Week7;

import javax.swing.*;
import java.sql.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class DBConnection {
    static JFrame frame=new JFrame("AWS RDS Testing");
    static JTable table;
    static ResultSet rs;
    //static ResultSet rs1;

    static String[][] rowData;
    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://cis144test1.cnnucldxkz6h.us-east-1.rds.amazonaws.com:3306/WrightDB", "adminjoey", "Myzwu3-vumjow-mamqow");
            Statement stmt=con.createStatement();
            rs=stmt.executeQuery("select * from employees");
            int count=0;
            while(rs.next())
            {
                ++count;
            }
            rowData=new String[count][4];
            System.out.println("Rows ==> "+count);
            int index=0;
            rs=stmt.executeQuery("select employeeID, employeeLname, employeeFname, employeeState from employees");
            while(rs.next())
            {
                rowData[index][0]=String.valueOf(rs.getInt(1));
                rowData[index][1]=rs.getString(2);
                rowData[index][2]=rs.getString(3);
                rowData[index][3]=rs.getString(4);
                index++;
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        String[] columnNames={"ID", "LAST NAME", "FIRST NAME", "STATE"};
        table=new JTable(rowData, columnNames);

        table.setRowSelectionAllowed(true);
        ListSelectionModel rowSelectionModel=table.getSelectionModel();
        rowSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        rowSelectionModel.addListSelectionListener(new gustavo());


        frame.add(new JScrollPane(table));
        frame.setSize(350, 200);
        frame.setVisible(true);
    }

    public static class gustavo implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            String selectedID=null;
            String selectedLname=null;
            String selectedFname=null;
            String selectedCity=null;
            int[] selectedRow=table.getSelectedRows();
            for(int i=0; i<selectedRow.length; i++)
            {
                selectedID=(String)table.getValueAt(selectedRow[i], 0);
                selectedLname=(String)table.getValueAt(selectedRow[i], 1);
                selectedFname=(String)table.getValueAt(selectedRow[i], 2);
                selectedCity=(String)table.getValueAt(selectedRow[i], 3);
            }
            StringBuilder sb=new StringBuilder();
            sb.append("Employee Info\n");
            sb.append("=============\n");
            sb.append("id : "+selectedID+"\n");
            sb.append("Last Name : "+selectedLname+"\n");
            sb.append("First Name : "+selectedFname+"\n");
            sb.append("City : "+selectedCity+"\n");

            JOptionPane.showMessageDialog(frame,sb.toString(),
                    "Row Selected", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
