package awt_sample_proj;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class awt_project1 {
    public static void main(String[] args) {
        new Innerawt_project1() ;       
    }
}

 class Innerawt_project1{
    Innerawt_project1()
    {
        Frame frame=new Frame();
        frame.setSize(900, 600);
        frame.setVisible(true);
        frame.setTitle("Sample Project");
        frame.setLayout(null);

        // heading label..............
        Label label0 = new Label("Sample Form using AWT",Label.CENTER);
        label0.setBounds(200,40,500,27);
        label0.setBackground(Color.GREEN);
        Font font2=new Font("myfont2", Font.TYPE1_FONT, 25);
        label0.setFont(font2);
        frame.add(label0);

        // adding First name label......
        Label label1 = new Label("First Name",Label.CENTER);
        label1.setBounds(200,80,100,15);
        label1.setBackground(Color.YELLOW);
        label1.setForeground(Color.BLACK);
        Font font=new Font("myfont1",Font.BOLD,12);
        label1.setFont(font);
        frame.add(label1);

        TextField textField1=new TextField();
        textField1.setBounds(200,100,100,20);
        frame.add(textField1);

        // adding middle name label......
        Label label2=new Label("Middle Name",Label.CENTER);
        label2.setBounds(400,80,100,15);
        label2.setBackground(Color.YELLOW);
        label2.setForeground(Color.BLACK);
        label2.setFont(font);
        frame.add(label2);

        TextField textField2=new TextField();
        textField2.setBounds(400,100,100,20);
        frame.add(textField2);

        // adding last name label............
        Label label3=new Label("Last Name",Label.CENTER);
        label3.setBounds(600,80,100,15);
        label3.setBackground(Color.YELLOW);
        label3.setForeground(Color.BLACK);
        label3.setFont(font);
        frame.add(label3);
        
        TextField textField3=new TextField();
        textField3.setBounds(600,100,100,20);
        frame.add(textField3);

        // adding the emailID label...........
        Label label4=new Label("Email ID",Label.CENTER);
        label4.setBounds(200,145,100,15);
        label4.setBackground(Color.YELLOW);
        label4.setFont(font);
        frame.add(label4);

        TextField textField4=new TextField();
        textField4.setBounds(200,165,150,20);
        frame.add(textField4);

        // adding Contact number label
        Label label5=new Label("Phone Number",Label.CENTER);
        label5.setBounds(400,145,100,15);
        label5.setBackground(Color.YELLOW);
        label5.setFont(font);
        frame.add(label5);

        TextField textField5=new TextField();
        textField5.setBounds(400,165,100,20);
        frame.add(textField5);

        // adding gender label.............
        Label label7=new Label("Choose Gender",Label.CENTER);
        label7.setBounds(600,145,100,15);
        label7.setBackground(Color.YELLOW);
        label7.setFont(font);
        frame.add(label7);

        Checkbox checkbox1=new Checkbox("Male",false);
        Checkbox checkbox2=new Checkbox("Female",false);
        checkbox1.setBounds(600,165,50,20);
        checkbox2.setBounds(648,165,55,20);
        frame.add(checkbox1);
        frame.add(checkbox2);

        //adding states......
        Label label6=new Label("Choose State",Label.CENTER);
        label6.setBounds(200,200,100,15);
        label6.setBackground(Color.YELLOW);
        label6.setFont(font);
        frame.add(label6);

        Choice choice1=new Choice();
        choice1.setBounds(200,220,100,20);
        choice1.add("Uttar Pradesh");
        choice1.add("Madhya Pradesh");
        choice1.add("Punjab");
        choice1.add("Delhi");
        frame.add(choice1);

        // adding city label........
        Label label8=new Label("Choose City",Label.CENTER);
        label8.setBounds(400,200,100,15);
        label8.setBackground(Color.YELLOW);
        label8.setFont(font);
        frame.add(label8);

        Choice choice2=new Choice();
        choice2.setBounds(400,220,100,20);
        choice2.add("Varanasi");
        choice2.add("Ballia");
        choice2.add("Azamghar");
        choice2.add("Noida");
        frame.add(choice2);

        // pincode label...
        Label label9=new Label("Pincode",Label.CENTER);
        label9.setBounds(600,200,100,15);
        label9.setBackground(Color.YELLOW);
        label9.setFont(font);
        frame.add(label9);

        TextField textField6=new TextField();
        textField6.setBounds(600,220,100,20);
        frame.add(textField6);        

        // full adress label.......
        Label label10=new Label("Address",Label.CENTER);
        label10.setBounds(300,300,100,15);
        label10.setBackground(Color.YELLOW);
        label10.setFont(font);
        frame.add(label10);

        TextArea textArea1=new TextArea();
        textArea1.setBounds(250,320,200,70);
        frame.add(textArea1);

        // Profession label..............
        Label label11=new Label("Profession",Label.CENTER);
        label11.setBounds(500,300,100,15);
        label11.setBackground(Color.YELLOW);
        label11.setFont(font);
        frame.add(label11);

        List list1=new List();
        list1.add("Doctor");
        list1.add("Engineer");
        list1.add("Farmer");
        list1.add("Labour");
        list1.add("Other");
        list1.setBounds(480,320,150,70);
        frame.add(list1);

        // adding button..........

        Button button1=new Button("Save");
        button1.setBounds(400,450,60,25);
        button1.setBackground(Color.BLUE);
        button1.setFont(font);
        frame.add(button1);

        // Color color=new Color();/
        frame.setBackground(Color.LIGHT_GRAY);


        // adding menu bars............................
        MenuBar mBar=new MenuBar();
        Menu menu=new Menu("Menu");
        MenuItem mItem2=new MenuItem("Carrier");
        MenuItem mItem3=new MenuItem("Contact");
        MenuItem mItem4=new MenuItem("Login");
        Menu menu2=new Menu("test");
        MenuItem mt1=new MenuItem("Test 0");
        MenuItem mt2=new MenuItem("Test 1");
        menu2.add(mt1);
        menu2.add(mt2);

        MenuItem subItem1=new MenuItem("Achivment");
        MenuItem subItem2=new MenuItem("Founder");
        MenuItem subItem3=new MenuItem("Our Projects");
        Menu subMenu=new Menu("About");
        subMenu.add(subItem1);
        subMenu.add(subItem2);
        subMenu.add(subItem3);

        menu.add(subMenu);
        menu.add(mItem2);
        menu.add(mItem3);
        menu.add(mItem4);
        mBar.add(menu);
        mBar.add(menu2);

        // adding windowListner....
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.out.println("closing");
                System.exit(0);
            }
        });

        frame.setMenuBar(mBar);
    }
    
}

