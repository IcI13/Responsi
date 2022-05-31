
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author D15kY
 */
public class GUI extends JFrame {
    JButton btnCreate = new JButton("Create");
    JButton btnUpdate = new JButton("Update");
    JButton btnClear = new JButton("Clear");
    JButton btnDelete = new JButton("Delete");
    
    JTextField fNama = new JTextField();
    JTextField fPortofolio = new JTextField();
    JTextField fMicroteaching = new JTextField();
    JTextField fWawancara = new JTextField();
    
    JLabel lNama = new JLabel("Nama");
    JLabel lPortofolio = new JLabel("Nilai Portofolio");
    JLabel lMicroteaching = new JLabel("Nilai Microteaching");
    JLabel lWawancara = new JLabel("NIlai Wawancara");
    
    JTable tData = new JTable();
    
    public GUI(){
        
        setTitle("ASLAB");
        setLayout(null);
        
        add(btnCreate);
        add(btnUpdate);
        add(btnClear);
        add(btnDelete);
        
        add(fNama);
        add(fPortofolio);
        add(fMicroteaching);
        add(fWawancara);
        
        add(lNama);
        add(lPortofolio);
        add(lMicroteaching);
        add(lWawancara);
        
        add(tData);
        
        tData.setBounds(10,20,400,400);
        
        
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
