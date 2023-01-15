import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[]args){
        JFrame myFrame;

        myFrame = new JFrame();
		myFrame.setSize(500,400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(new FlowLayout());

        JButton button = new JButton("Tampilkan Data");
        myFrame.add(button);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Mahasiswa student = new Mahasiswa("Wisnu Wicaksono ", 22 , 3);
                student.getInfo();
                Course course = new Course("Pemrograman Beroientasi Objek" , 9);
                course.setStudent(student);

                JOptionPane.showMessageDialog(myFrame, "Hello " + student.name + ", your age is " + student.age + " years old.");
		        myFrame.dispose();
            }
        });

        myFrame.setVisible(true);
    }
}