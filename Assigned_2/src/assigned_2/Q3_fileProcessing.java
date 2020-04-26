/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigned_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Q3_fileProcessing extends JFrame {

    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenuFile = new JMenu("File");
    JMenuItem itemFileOpen = new JMenuItem("Open");
    JMenuItem itemFileClose = new JMenuItem("Close");
    JMenuItem itemFileExit = new JMenuItem("Exit");

    JMenu jMenuEdit = new JMenu("Edit");
    JMenuItem itemEditFont = new JMenuItem("Font");
    JMenuItem itemEditColor = new JMenuItem("Color");
    JTextArea textArea = new JTextArea(25, 44);
    JScrollPane textAreaScroller = new JScrollPane(textArea);

    JFileChooser chooser = new JFileChooser();

    FileNameExtensionFilter filter = new FileNameExtensionFilter("text", "text");

    public Q3_fileProcessing() {
        jMenuFile.add(itemFileOpen);
        jMenuFile.add(itemFileClose);
        jMenuFile.add(itemFileExit);

        jMenuEdit.add(itemEditFont);
        jMenuEdit.add(itemEditColor);

        jMenuBar.add(jMenuFile);
        jMenuBar.add(jMenuEdit);
        add(jMenuBar);
        textArea.setLineWrap(true);

        add(textAreaScroller);
        chooser.setFileFilter(filter);
        
        itemFileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnedValue = chooser.showOpenDialog(rootPane);

                if (returnedValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = chooser.getSelectedFile();
                    String filepath = selectedFile.getPath();
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(filepath));
                        String line = "";
                        String text = "";
                        while ((line = br.readLine()) != null) {
                            text += line + "\n";
                        }

                        textArea.setText(text);
                        br.close();
                    } catch (IOException ioe) {
                        JOptionPane.showMessageDialog(null, ioe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        });
        itemFileClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);
                textArea.setFont(new Font("Arial", Font.PLAIN, 12));

            }
        });
        itemFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        itemEditFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String size = JOptionPane.showInputDialog(
                        null,
                        "Enter a font size",
                        "Font",
                        JOptionPane.WARNING_MESSAGE
                );
                int sizee = Integer.parseInt(size);
                textArea.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, sizee));

            }
        });

        itemEditColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ss = JOptionPane.showInputDialog(null, "Enter a color", "Color",
                        JOptionPane.WARNING_MESSAGE,
                        null, new String[]{"Yellow", "Blue", "Red" , "Cyan" , "Green" , "Orange" , "Pink"}, "Blue");
                
                if("Red".equals((String) ss)){
                    textArea.setForeground(Color.red);
                
                }else if("Blue".equals((String) ss)){
                    textArea.setForeground(Color.blue);
                
                }else if("Yellow".equals((String) ss)){
                    textArea.setForeground(Color.yellow);

                }else if("Cyan".equals((String) ss)){
                    textArea.setForeground(Color.cyan);

                }else if("Green".equals((String) ss)){
                    textArea.setForeground(Color.green);

                }else if("Orange".equals((String) ss)){
                    textArea.setForeground(Color.orange);

                }else if("Pink".equals((String) ss)){
                    textArea.setForeground(Color.pink);
                }
            }
        });

        setTitle("File Processing");
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3_fileProcessing();
    }

}

