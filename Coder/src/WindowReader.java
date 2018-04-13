import javax.annotation.processing.Filer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class WindowReader extends JFrame implements ActionListener {

    public static void main(String []args){
        WindowReader windowReader = new WindowReader();
        windowReader.setTitle("Reader an Writer");
    }
    JFileChooser fileDialog;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem itemSave,itemOpen;

    JTextArea textArea;
    BufferedReader in;
    FileReader fileReader;
    BufferedWriter out;
    FileWriter fileWriter;

    WindowReader() {
        init();
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void init() {
        textArea = new JTextArea(10,10);
        textArea.setFont(new Font("gb2312",Font.PLAIN,28));
        add(new JScrollPane(textArea),BorderLayout.CENTER);
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        itemOpen = new JMenuItem("OPEN");
        itemSave = new JMenuItem("SAVE");
        itemSave.addActionListener(this);
        itemOpen.addActionListener(this);
        menu.add(itemSave);
        menu.add(itemOpen);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        fileDialog = new JFileChooser();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == itemSave){
            int state = fileDialog.showSaveDialog(this);
            if(state == JFileChooser.APPROVE_OPTION) {
                try {
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName();
                    File file = new File(dir,name);
                    fileWriter = new FileWriter(file);
                    out = new BufferedWriter(fileWriter);
                    out.write(textArea.getText());
                    out.close();
                    fileWriter.close();
                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
            }

        }
        else if(actionEvent.getSource() == itemOpen){
            int state = fileDialog.showSaveDialog(this);
            if(state == JFileChooser.APPROVE_OPTION){
                textArea.setText(null);

                try{
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName();
                    File file = new File(dir,name);
                    fileReader = new FileReader(file);
                    in = new BufferedReader(fileReader);

                    String s = null;
                    while ((s=in.readLine())!=null){
                        textArea.append(s+"\n");
                    }
                    in.close();
                    fileReader.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
