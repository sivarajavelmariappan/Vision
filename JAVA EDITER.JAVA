import java.awt.Font;
import java.awt.Menu;
import java.awt.Image;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Label;
import java.awt.Choice;
import java.awt.Button;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.Checkbox;
import java.awt.TextField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import java.awt.CheckboxGroup;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.event.ItemEvent;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.KeyListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import javax.swing.ScrollPaneConstants;
class Project_Editer extends Frame implements ActionListener,KeyListener
{
    private Button insertText;
    private TextField insert;
    private JScrollPane scrollvari,srollsort;
    private Menu quick;
    private String contents[]={"class","public","static","void","main","String","System","out","print","println","int","if",
    "if","for","abstract","continue","goto","package","Synchronized","assert","default","private","this","boolean","do",
    "implements","protected","throw","break","double","import","throws","byte","else","instanceof","retrun","transient",
    "case","extends","short","try","catch","final","interface","char","finally","long","strictfp","volatile","float",
    "native","super","while","const","new","swith","java","awt","io","javax","utill","lang","net"};
    private String sum=new String();
    private String brace="";
    private String bracedecre="";
    private int bracecount=0;
    private JTextArea sort;
    private String temp=new String();
    private String check=new String();
    private String sorting[]=new String[1000];
    private boolean in=true;
    private String pack=new String();
    private int count=0;
    private String s=new String();
    private JTextArea text;
    private Font font;
    private boolean out=false;
    private Image icon;
    private MenuBar mb,mtown;
    private Menu file,edit,help;
    private MenuItem cut,copy,paste,selectall,quickbox,classprocess;
    private Frame f=new Frame("EDITER");
    public Project_Editer()
    {
            icon=Toolkit.getDefaultToolkit().getImage("C:/jdk1.3/bin/Demo/jfc/Java2D/images/duke.png");
            f.setIconImage(icon);
            try
            {
                f.addWindowListener(new WindowAdapter()
                    {
                        public void windowClosing(WindowEvent we)
                        {
                            System.exit(1);
                        }
                    });
            quick=new Menu("     TOOLS      ");
            quick.addActionListener(this);
            cut=new MenuItem("CUT");
            copy=new MenuItem("COPY");
            paste=new MenuItem("PASTE");
            selectall=new MenuItem("SELECT ALL");
            quickbox=new MenuItem("/ IMPORT PACKAGES");
            classprocess=new MenuItem("/ IMPORT CLASS");
            cut.addActionListener(this);
            copy.addActionListener(this);
            paste.addActionListener(this);
            selectall.addActionListener(this);
            classprocess.addActionListener(this);
            mb=new MenuBar();
            file=new Menu("     FILE     ");
            edit=new Menu("     EDIT     ");
            help=new Menu("     HELP     ");
            edit.add(cut);
            edit.add(copy);
            edit.add(paste);
            edit.add(selectall);
            quick.add(quickbox);
            quick.add(classprocess);
            mb.add(file);
            mb.add(edit);
            mb.add(help);
            mb.add(quick);
            f.setMenuBar(mb);
            font=new Font("Courier New",Font.PLAIN,16);
            text=new JTextArea();
            text.setBounds(50,70,845,620);
            text.setFont(font);
            text.addKeyListener(this);
            text.setBackground(Color.black);
            text.setForeground(Color.blue);
            scrollvari=new JScrollPane(text);
            scrollvari.setBounds(50,70,845,620);
            scrollvari.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            f.add(scrollvari);
            font=new Font("Courier New",Font.PLAIN,20);
            insert=new TextField();
            insert.setFont(font);
            insert.setBackground(Color.black);
            insert.setForeground(Color.red);
            insert.setBounds(1000,100,300,30);
            f.add(insert);
            insertText=new Button("INSERT");
            insertText.setBounds(1305,200,50,50);
            insertText.setBackground(Color.black);
            insertText.addActionListener(this);
            f.add(insertText);
            font=new Font("Courier New",Font.PLAIN,16);
            sort=new JTextArea();
            sort.setFont(font);
            sort.setBackground(Color.black);
            sort.setForeground(Color.green);
            sort.setBounds(1000,130,300,290);
            srollsort=new JScrollPane(sort);
            srollsort.setBounds(1000,130,300,500);
            srollsort.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            f.add(srollsort);
            f.setSize(1370,750);
            f.setLayout(null);
            f.setVisible(true);
        }
        catch(NullPointerException e){}
        catch(ArrayIndexOutOfBoundsException ae){}
    }
class QuickBox extends Frame implements ItemListener,ActionListener
{
    private String security=new String();
    private boolean p1=true,p2=true,p3=true,p4=true,p5=true,p6=true;
    private String minf=new String();
    private String submit=new String();
    private Button b,refresh,close,j1,j2,j3,j4,j5;
    private Checkbox pack1,pack2,pack3,pack4,pack5;
    private Label im,la,list1,list2,list3,list4,list5;
    private Font fon;
    private Choice able;
    private boolean come=true;
    private boolean ap=false;
    Frame f=new Frame("IMPORT PACKAGE");
    QuickBox()
    {
        f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
        close=new Button("CLOSE");
        close.addActionListener(this);
        close.setBounds(10,300,100,30);
        f.add(close);
        refresh=new Button("REFRESH");
        refresh.addActionListener(this);
        refresh.setBounds(130,300,90,30);
        b=new Button("SUBMIT");
        b.addActionListener(this);
        b.setBounds(230,300,90,30);
        list1=new Label("UTIL");
        list1.setBounds(50,50,60,35);
        list2=new Label("IO");
        list2.setBounds(50,100,60,35);
        list3=new Label("AWT");
        list3.setBounds(50,150,60,35);
        list4=new Label("APPLET");
        list4.setBounds(50,200,60,35);
        list5=new Label("NET");
        list5.setBounds(50,250,60,35);
        j1=new Button("UTIL CLASS");
        j1.setBounds(200,50,100,20);
        j1.addActionListener(this);
        j2=new Button("IO CLASS");
        j2.setBounds(200,100,100,20);
        j2.addActionListener(this);
        j3=new Button("AWT CLASS");
        j3.setBounds(200,150,100,20);
        j3.addActionListener(this);
        j4=new Button("APPLET CLASS");
        j4.setBounds(200,200,100,20);
        j4.addActionListener(this);
        j5=new Button("NET CLASS");
        j5.setBounds(200,250,100,20);
        j5.addActionListener(this);
        pack1=new Checkbox("ALL");
        pack1.setBounds(130,50,40,35);
        pack2=new Checkbox("ALL");
        pack2.setBounds(130,100,40,35);
        pack3=new Checkbox("ALL");
        pack3.setBounds(130,150,40,35);
        pack4=new Checkbox("ALL");
        pack4.setBounds(130,200,40,35);
        pack5=new Checkbox("ALL");
        pack5.setBounds(130,250,40,35);
        pack1.addItemListener(this);
        pack2.addItemListener(this);
        pack3.addItemListener(this);
        pack4.addItemListener(this);
        pack5.addItemListener(this);
        f.add(refresh);
        f.add(pack1);
        f.add(pack3);
        f.add(pack2);
        f.add(pack4);
        f.add(pack5);
        f.add(list1);
        f.add(list2);
        f.add(list3);
        f.add(list4);
        f.add(list5);
        f.add(j1);f.add(j2);f.add(j3);f.add(j4);f.add(j5);
        fon=new Font("Courier New",Font.PLAIN,12);
        im=new Label("IMPORT PACKAGES :");
        im.setFont(fon);
        im.setBounds(15,25,150,35);
        f.add(im);
        f.add(b);
        la=new Label("");
        f.add(la);
        f.setBounds(990,250,350,350);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ae)
    {
        if(pack1.getState()==true)
        {
            if(p1)
            submit+="import java.util.*;\n";
            p1=false;
        }
        if(pack2.getState()==true)
        {
            if(p2)
            submit+="import java.io.*;\n";
            p2=false;
        }
        if(pack3.getState()==true)
        {
            if(p3)
            submit+="import java.awt.*;\n";
            p3=false;
        }
        if(pack4.getState()==true)
        {
            if(p4)
            submit+="import java.applet.*;\n";
            p4=false;
            ap=true;
        }
        if(pack5.getState()==true)
        {
            if(p5)
            submit+="import java.net.*;\n";
            p5=false;
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("UTIL CLASS"))
        {
            new utilPack();
        }
        if(s.equals("IO CLASS"))
        {
            new ioPack();
        }
        if(s.equals("APPLET CLASS"))
        {
            new appletPack();
        }
        if(s.equals("AWT CLASS"))
        {
            new awtPack();
        }
        if(s.equals("NET CLASS"))
        {
            new netPack();
        }
        if(s.equals("SUBMIT"))
        {
            text.setText(submit+text.getText());
            submit="";
        }
        if(s.equals("REFRESH"))
        {
            submit="";
        }
        if(s.equals("CLOSE"))
        {
            f.setVisible(false);
        }
    }
    class ioPack extends Frame implements ItemListener,ActionListener
    {
        private Button ok;
        private Checkbox i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36,i37,i38,i39,i40,i41,i42,i43,i44,i45,i46;
        private boolean io1=true,io2=true,io3=true,io4=true,io5=true,io6=true,io7=true,io8=true,io9=true,io10=true,io11=true,io12=true,io13=true,io14=true,io15=true,io16=true,io17=true,io18=true,io19=true,io20=true,io21=true,io22=true,io23=true,io24=true,io25=true,io26=true,io27=true,io28=true,io29=true,io30=true,io31=true,io32=true,io33=true,io34=true,io35=true,io36=true,io37=true,io38=true,io39=true,io40=true,io41=true,io42=true,io43=true,io44=true,io45=true,io46=true;
        Frame f=new Frame("IO PACKAGE");
        ioPack()
        {
            ok=new Button("OK");
            ok.addActionListener(this);
            ok.setBounds(900,300,90,40);
            f.add(ok);
            i1=new Checkbox("BufferedInputStream");
            i1.setBounds(20,20,150,50);
            i1.addItemListener(this);
            i2=new Checkbox("BufferedOutputStream");
            i2.setBounds(170,20,150,50);
            i2.addItemListener(this);
            i3=new Checkbox("BufferedReader");
            i3.setBounds(320,20,150,50);
            i3.addItemListener(this);
            i4=new Checkbox("BufferedWriter");
            i4.setBounds(470,20,150,50);
            i4.addItemListener(this);
            i5=new Checkbox("ByteArrayInputStream");
            i5.setBounds(620,20,150,50);
            i5.addItemListener(this);
            i6=new Checkbox("ByteArrayOutputStream");
            i6.setBounds(770,20,150,50);
            i6.addItemListener(this);
            i7=new Checkbox("CharArrayReader");
            i7.setBounds(20,60,150,50);
            i7.addItemListener(this);
            i8=new Checkbox("CharArrayWriter");
            i8.setBounds(170,60,150,50);
            i8.addItemListener(this);
            i9=new Checkbox("DataInputStream");
            i9.setBounds(320,60,150,50);
            i9.addItemListener(this);
            i10=new Checkbox("DataOutputStream");
            i10.setBounds(470,60,150,50);
            i10.addItemListener(this);
            i11=new Checkbox("File");
            i11.setBounds(620,60,50,50);
            i11.addItemListener(this);
            i12=new Checkbox("FileDesciptor");
            i12.setBounds(770,60,100,50);
            i12.addItemListener(this);
            i13=new Checkbox("FileInputStream");
            i13.setBounds(20,100,150,50);
            i13.addItemListener(this);
            i14=new Checkbox("FileOutputStream");
            i14.setBounds(170,100,150,50);
            i14.addItemListener(this);
            i15=new Checkbox("FilePermission");
            i15.setBounds(320,100,150,50);
            i15.addItemListener(this);
            i16=new Checkbox("FileReader");
            i16.setBounds(470,100,150,50);
            i16.addItemListener(this);
            i17=new Checkbox("FileWriter");
            i17.setBounds(620,100,150,50);
            i17.addItemListener(this);
            i18=new Checkbox("FileInputStream");
            i18.setBounds(770,100,150,50);
            i18.addItemListener(this);
            i19=new Checkbox("FileOutputStream");
            i19.setBounds(20,140,150,50);
            i19.addItemListener(this);
            i20=new Checkbox("FilterReader");
            i20.setBounds(170,140,150,50);
            i20.addItemListener(this);
            i21=new Checkbox("FilterWriter");
            i21.setBounds(320,140,150,50);
            i21.addItemListener(this);
            i22=new Checkbox("InputStream");
            i22.setBounds(470,140,150,50);
            i22.addItemListener(this);
            i23=new Checkbox("InputStreamReader");
            i23.setBounds(620,140,150,50);
            i23.addItemListener(this);
            i24=new Checkbox("LineNumberReader");
            i24.setBounds(770,140,150,50);
            i24.addItemListener(this);
            i25=new Checkbox("ObjectInputStream");
            i25.setBounds(20,180,150,50);
            i25.addItemListener(this);
            i26=new Checkbox("ObjectInputStream.GetField");
            i26.setBounds(170,180,150,50);
            i26.addItemListener(this);
            i27=new Checkbox("ObjectStreamClass");
            i27.setBounds(320,180,150,50);
            i27.addItemListener(this);
            i28=new Checkbox("ObjectStreamField");
            i28.setBounds(470,180,150,50);
            i28.addItemListener(this);
            i29=new Checkbox("OutputStream");
            i29.setBounds(620,180,150,50);
            i29.addItemListener(this);
            i30=new Checkbox("OutputStreamWriter");
            i30.setBounds(770,180,150,50);
            i30.addItemListener(this);
            i31=new Checkbox("PipedInputStream");
            i31.setBounds(20,220,150,50);
            i31.addItemListener(this);
            i32=new Checkbox("PipedOutputStream");
            i32.setBounds(170,220,150,50);
            i32.addItemListener(this);
            i33=new Checkbox("PipedReader");
            i33.setBounds(320,220,150,50);
            i33.addItemListener(this);
            i34=new Checkbox("PipedWriter");
            i34.setBounds(470,220,150,50);
            i34.addItemListener(this);
            i35=new Checkbox("PrintStream");
            i35.setBounds(620,220,150,50);
            i35.addItemListener(this);
            i36=new Checkbox("PrintWriter");
            i36.setBounds(770,220,150,50);
            i36.addItemListener(this);
            i37=new Checkbox("PushbackInputStream");
            i37.setBounds(20,260,150,50);
            i37.addItemListener(this);
            i38=new Checkbox("PushbackReader");
            i38.setBounds(170,260,150,50);
            i38.addItemListener(this);
            i39=new Checkbox("RandomAccessFile");
            i39.setBounds(320,260,150,50);
            i39.addItemListener(this);
            i40=new Checkbox("Reader");
            i40.setBounds(470,260,150,50);
            i40.addItemListener(this);
            i41=new Checkbox("SequenceInputStream");
            i41.setBounds(620,260,150,50);
            i41.addItemListener(this);
            i42=new Checkbox("SerializablePermission");
            i42.setBounds(770,260,150,50);
            i42.addItemListener(this);
            i43=new Checkbox("StreanTokenizer");
            i43.setBounds(20,300,150,50);
            i43.addItemListener(this);
            i44=new Checkbox("StringReader");
            i44.setBounds(170,300,150,50);
            i44.addItemListener(this);
            i45=new Checkbox("Writer");
            i45.setBounds(320,300,150,50);
            i45.addItemListener(this);
            i46=new Checkbox("DataInput");
            i46.setBounds(470,300,150,50);
            i46.addItemListener(this);       
            f.add(i1);f.add(i2);f.add(i3);f.add(i4);f.add(i5);f.add(i6);f.add(i7);f.add(i8);f.add(i9);f.add(i10);f.add(i11);f.add(i12);f.add(i13);f.add(i14);f.add(i15);f.add(i16);f.add(i17);f.add(i18);f.add(i19);f.add(i20);f.add(i21);f.add(i22);f.add(i23);f.add(i24);f.add(i25);f.add(i26);f.add(i27);f.add(i28);f.add(i29);f.add(i30);f.add(i31);f.add(i32);f.add(i33);f.add(i34);f.add(i35);f.add(i36);f.add(i37);f.add(i38);f.add(i39);f.add(i40);f.add(i41);f.add(i42);f.add(i43);f.add(i44);f.add(i45);f.add(i46);
            f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            f.setVisible(true);
            f.setBounds(100,100,1000,350);
        }
        public void actionPerformed(ActionEvent ae)
        {
            String str=ae.getActionCommand();
            if(str.equals("OK"))
            {
                f.setVisible(false);
                text.setText(submit+text.getText());
                submit="";
            }
        }
        public void itemStateChanged(ItemEvent ae)
        {
            if(i1.getState()==true)
            {
            if(io1)
            submit+="import java.io.BufferedInputStream;\n";
            io1=false;
            }
            if(i2.getState()==true)
            {
            if(io2)
            submit+="import java.io.BufferedOutputStream;\n";
            io2=false;
            }
            if(i3.getState()==true)
            {
            if(io3)
            submit+="import java.io.BufferedReader;\n";
            io3=false;
            }
            if(i4.getState()==true)
            {
            if(io4)
            submit+="import java.io.BufferedWriter;\n";
            io4=false;
            }
            if(i5.getState()==true)
            {
            if(io5)
            submit+="import java.io.ByteArrayInputStream;\n";
            io5=false;
            }
            if(i6.getState()==true)
            {
            if(io6)
            submit+="import java.io.ByteArrayOutputStream;\n";
            io6=false;
            }
            if(i7.getState()==true)
            {
            if(io7)
            submit+="import java.io.CharArrayReader;\n";
            io7=false;
            }
            if(i8.getState()==true)
            {
            if(io8)
            submit+="import java.io.CharArrayWriter;\n";
            io8=false;
            }
            if(i9.getState()==true)
            {
            if(io9)
            submit+="import java.io.DataInputStream;\n";
            io9=false;
            }
            if(i10.getState()==true)
            {
            if(io10)
            submit+="import java.io.DataOutputStream;\n";
            io10=false;
            }
            if(i11.getState()==true)
            {
            if(io11)
            submit+="import java.io.File;\n";
            io11=false;
            }
            if(i12.getState()==true)
            {
            if(io12)
            submit+="import java.io.FileDesciptor;\n";
            io12=false;
            }
            if(i13.getState()==true)
            {
            if(io13)
            submit+="import java.io.FileInputStream;\n";
            io13=false;
            }
            if(i14.getState()==true)
            {
            if(io14)
            submit+="import java.io.FileOutputStream;\n";
            io14=false;
            }
            if(i15.getState()==true)
            {
            if(io15)
            submit+="import java.io.FilePermission;\n";
            io15=false;
            }
            if(i16.getState()==true)
            {
            if(io16)
            submit+="import java.io.FileReader;\n";
            io16=false;
            }
            if(i17.getState()==true)
            {
            if(io17)
            submit+="import java.io.FileWriter;\n";
            io17=false;
            }
            if(i18.getState()==true)
            {
            if(io18)
            submit+="import java.io.FileInputStream;\n";
            io18=false;
            }
            if(i19.getState()==true)
            {
            if(io19)
            submit+="import java.io.FileOutputStream;\n";
            io19=false;
            }
            if(i20.getState()==true)
            {
            if(io20)
            submit+="import java.io.FilterReader;\n";
            io20=false;
            }
            if(i21.getState()==true)
            {
            if(io21)
            submit+="import java.io.FilterWriter;\n";
            io21=false;
            }
            if(i22.getState()==true)
            {
            if(io22)
            submit+="import java.io.InputStream;\n";
            io22=false;
            }
            if(i23.getState()==true)
            {
            if(io23)
            submit+="import java.io.InputStreamReader;\n";
            io23=false;
            }
            if(i24.getState()==true)
            {
            if(io24)
            submit+="import java.io.LineNumberReader;\n";
            io24=false;
            }
            if(i25.getState()==true)
            {
            if(io25)
            submit+="import java.io.ObjectInputStream;\n";
            io25=false;
            }
            if(i26.getState()==true)
            {
            if(io26)
            submit+="import java.io.ObjectInputStream.GetField;\n";
            io26=false;
            }
            if(i27.getState()==true)
            {
            if(io27)
            submit+="import java.io.ObjectStreamClass;\n";
            io27=false;
            }
            if(i28.getState()==true)
            {
            if(io28)
            submit+="import java.io.ObjectStreamField;\n";
            io28=false;
            }
            if(i29.getState()==true)
            {
            if(io29)
            submit+="import java.io.OutputStream;\n";
            io29=false;
            }
            if(i30.getState()==true)
            {
            if(io30)
            submit+="import java.io.OutputStreamWriter;\n";
            io30=false;
            }
            if(i31.getState()==true)
            {
            if(io31)
            submit+="import java.io.PipedInputStream;\n";
            io31=false;
            }
            if(i32.getState()==true)
            {
            if(io32)
            submit+="import java.io.PipedOutputStream;\n";
            io32=false;
            }
            if(i33.getState()==true)
            {
            if(io33)
            submit+="import java.io.PipedReader;\n";
            io33=false;
            }
            if(i34.getState()==true)
            {
            if(io34)
            submit+="import java.io.PipedWriter;\n";
            io34=false;
            }
            if(i35.getState()==true)
            {
            if(io35)
            submit+="import java.io.PrintStream;\n";
            io35=false;
            }
            if(i36.getState()==true)
            {
            if(io36)
            submit+="import java.io.PrintWriter;\n";
            io36=false;
            }
            if(i37.getState()==true)
            {
            if(io37)
            submit+="import java.io.PushbackInputStream;\n";
            io37=false;
            }
            if(i38.getState()==true)
            {
            if(io38)
            submit+="import java.io.PushbackReader;\n";
            io38=false;
            }
            if(i39.getState()==true)
            {
            if(io39)
            submit+="import java.io.RandomAccessFile;\n";
            io39=false;
            }
            if(i40.getState()==true)
            {
            if(io40)
            submit+="import java.io.Reader;\n";
            io40=false;
            }
            if(i41.getState()==true)
            {
            if(io41)
            submit+="import java.io.SequenceInputStream;\n";
            io41=false;
            }
            if(i42.getState()==true)
            {
            if(io42)
            submit+="import java.io.SerializablePermission;\n";
            io42=false;
            }
            if(i43.getState()==true)
            {
            if(io43)
            submit+="import java.io.StreanTokenizer;\n";
            io43=false;
            }
            if(i44.getState()==true)
            {
            if(io44)
            submit+="import java.io.StringReader;\n";
            io44=false;
            }
            if(i45.getState()==true)
            {
            if(io45)
            submit+="import java.io.Writer;\n";
            io45=false;
            }
            if(i46.getState()==true)
            {
            if(io46)
            submit+="import java.io.DataInput;\n";
            io46=false;
            }
        }
        }
    class utilPack extends Frame implements ActionListener,ItemListener
    {
        private Button ok;
        private boolean ut1=true,ut2=true,ut3=true,ut4=true,ut5=true,ut6=true,ut7=true,ut8=true,ut9=true,ut10=true,ut11=true,ut12=true,ut13=true,ut14=true,ut15=true,ut16=true,ut17=true,ut18=true,ut19=true,ut20=true,ut21=true,ut22=true,ut23=true,ut24=true,ut25=true,ut26=true,ut27=true,ut28=true,ut29=true,ut30=true,ut31=true,ut32=true,ut33=true,ut34=true,ut35=true,ut36=true,ut37=true,ut38=true,ut39=true,ut40=true,ut41;
        private Checkbox u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14,u15,u16,u17,u18,u19,u20,u21,u22,u23,u24,u25,u26,u27,u28,u29,u30,u31,u32,u33,u34,u35,u36,u37,u38,u39,u40,u41;
        Frame f=new Frame("UTIL PACKAGE");
        utilPack()
        {
            ok=new Button("OK");
            ok.setBounds(900,270,90,40);
            ok.addActionListener(this);
            f.add(ok);
            u1=new Checkbox("AbstractCollection");
            u1.setBounds(20,20,150,50);
            u1.addItemListener(this);
            u2=new Checkbox("AbstractList");
            u2.setBounds(170,20,150,50);
            u2.addItemListener(this);
            u3=new Checkbox("AbstractMap");
            u3.setBounds(320,20,150,50);
            u3.addItemListener(this);
            u4=new Checkbox("AbstractSequentialList");
            u4.setBounds(470,20,150,50);
            u4.addItemListener(this);
            u5=new Checkbox("AbstractSet");
            u5.setBounds(620,20,150,50);
            u5.addItemListener(this);
            u6=new Checkbox("ArrayList");
            u6.setBounds(770,20,150,50);
            u6.addItemListener(this);
            u7=new Checkbox("Arrays");
            u7.setBounds(20,60,150,50);
            u7.addItemListener(this);
            u8=new Checkbox("BitSet");
            u8.setBounds(170,60,150,50);
            u8.addItemListener(this);
            u9=new Checkbox("Calendar");
            u9.setBounds(320,60,150,50);
            u9.addItemListener(this);
            u10=new Checkbox("Collections");
            u10.setBounds(470,60,150,50);
            u10.addItemListener(this);
            u11=new Checkbox("Currency");
            u11.setBounds(620,60,150,50);
            u11.addItemListener(this);
            u12=new Checkbox("Date");
            u12.setBounds(770,60,150,50);
            u12.addItemListener(this);
            u13=new Checkbox("Dictionary");
            u13.setBounds(20,100,150,50);
            u13.addItemListener(this);
            u14=new Checkbox("EventListenerProxy");
            u14.setBounds(170,100,150,50);
            u14.addItemListener(this);
            u15=new Checkbox("EventObject");
            u15.setBounds(320,100,150,50);
            u15.addItemListener(this);
            u16=new Checkbox("GregorianCalendar");
            u16.setBounds(470,100,150,50);
            u16.addItemListener(this);
            u17=new Checkbox("HashMap");
            u17.setBounds(620,100,150,50);
            u17.addItemListener(this);
            u18=new Checkbox("HashSet");
            u18.setBounds(770,100,150,50);
            u18.addItemListener(this);
            u19=new Checkbox("Hashtable");
            u19.setBounds(20,140,150,50);
            u19.addItemListener(this);
            u20=new Checkbox("IdentityHashMap");
            u20.setBounds(170,140,150,50);
            u20.addItemListener(this);
            u21=new Checkbox("LinkedHashMap");
            u21.setBounds(320,140,150,50);
            u21.addItemListener(this);
            u22=new Checkbox("LinkedHashSet");
            u22.setBounds(470,140,150,50);
            u22.addItemListener(this);
            u23=new Checkbox("LinkedList");
            u23.setBounds(620,140,150,50);
            u23.addItemListener(this);
            u24=new Checkbox("ListResourceBundle");
            u24.setBounds(770,140,150,50);
            u24.addItemListener(this);
            u25=new Checkbox("Locale");
            u25.setBounds(20,180,150,50);
            u25.addItemListener(this);
            u26=new Checkbox("Observable");
            u26.setBounds(170,180,150,50);
            u26.addItemListener(this);
            u27=new Checkbox("Properties");
            u27.setBounds(320,180,150,50);
            u27.addItemListener(this);
            u28=new Checkbox("PropertyPermission");
            u28.setBounds(470,180,150,50);
            u28.addItemListener(this);
            u29=new Checkbox("PropertyResourceBundle");
            u29.setBounds(620,180,150,50);
            u29.addItemListener(this);
            u30=new Checkbox("Random");
            u30.setBounds(770,180,150,50);
            u30.addItemListener(this);
            u31=new Checkbox("ResourceBundle");
            u31.setBounds(20,220,150,50);
            u31.addItemListener(this);
            u32=new Checkbox("SimpleTimeZone");
            u32.setBounds(170,220,150,50);
            u32.addItemListener(this);
            u33=new Checkbox("Stack");
            u33.setBounds(320,220,150,50);
            u33.addItemListener(this);
            u34=new Checkbox("StringTokenizer");
            u34.setBounds(470,220,150,50);
            u34.addItemListener(this);
            u35=new Checkbox("Timer");
            u35.setBounds(620,220,150,50);
            u35.addItemListener(this);
            u36=new Checkbox("TimerTask");
            u36.setBounds(770,220,150,50);
            u36.addItemListener(this);
            u37=new Checkbox("TimerZone");
            u37.setBounds(20,260,150,50);
            u37.addItemListener(this);
            u38=new Checkbox("TreeMap");
            u38.setBounds(170,260,150,50);
            u38.addItemListener(this);
            u39=new Checkbox("TreeSet");
            u39.setBounds(320,260,150,50);
            u39.addItemListener(this);
            u40=new Checkbox("Vector");
            u40.setBounds(470,260,150,50);
            u40.addItemListener(this);
            u41=new Checkbox("WeakHashMap");
            u41.setBounds(620,260,150,50);
            u41.addItemListener(this);
            f.add(u1);
            f.add(u2);
            f.add(u3);
            f.add(u4);
            f.add(u5);
            f.add(u6);
            f.add(u7);
            f.add(u8);
            f.add(u9);
            f.add(u10);
            f.add(u11);
            f.add(u12);
            f.add(u13);
            f.add(u14);
            f.add(u15);
            f.add(u16);
            f.add(u17);
            f.add(u18);
            f.add(u19);
            f.add(u20);
            f.add(u21);
            f.add(u22);
            f.add(u23);
            f.add(u24);
            f.add(u25);
            f.add(u26);
            f.add(u27);
            f.add(u28);
            f.add(u29);
            f.add(u30);
            f.add(u31);
            f.add(u32);
            f.add(u33);
            f.add(u34);
            f.add(u35);
            f.add(u36);
            f.add(u37);
            f.add(u38);
            f.add(u39);
            f.add(u40);
            f.add(u41);
             f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            f.setVisible(true);
            f.setBounds(200,200,1000,320);
        }
        public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("OK"))
        {
            f.setVisible(false);
            text.setText(submit+text.getText());
            submit="";
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(u1.getState()==true)
        {
            if(ut1)
            submit+="import java.util.AbstractCollection;\n";
            ut1=false;
            }
            if(u2.getState()==true)
            {
            if(ut2)
            submit+="import java.util.AbstractList;\n";
            ut2=false;
            }
            if(u3.getState()==true)
            {
            if(ut3)
            submit+="import java.util.AbstractMap;\n";
            ut3=false;
            }
            if(u4.getState()==true)
            {
            if(ut4)
            submit+="import java.util.AbstractSequentialList;\n";
            ut4=false;
            }
            if(u5.getState()==true)
            {
            if(ut5)
            submit+="import java.util.AbstractSet;\n";
            ut5=false;
            }
            if(u6.getState()==true)
            {
            if(ut6)
            submit+="import java.util.ArrayList;\n";
            ut6=false;
            }
            if(u7.getState()==true)
            {
            if(ut7)
            submit+="import java.util.Arrays;\n";
            ut7=false;
            }
            if(u8.getState()==true)
            {
            if(ut8)
            submit+="import java.util.BitSet;\n";
            ut8=false;
            }
            if(u9.getState()==true)
            {
            if(ut9)
            submit+="import java.util.Calendar;\n";
            ut9=false;
            }
            if(u10.getState()==true)
            {
            if(ut10)
            submit+="import java.util.Collections;\n";
            ut10=false;
            }
            if(u11.getState()==true)
            {
            if(ut11)
            submit+="import java.util.Currency;\n";
            ut11=false;
            }
            if(u12.getState()==true)
            {
            if(ut12)
            submit+="import java.util.Date;\n";
            ut12=false;
            }
            if(u13.getState()==true)
            {
            if(ut13)
            submit+="import java.util.Dictionary;\n";
            ut13=false;
            }
            if(u14.getState()==true)
            {
            if(ut14)
            submit+="import java.util.EventListenerProxy;\n";
            ut14=false;
            }
            if(u15.getState()==true)
            {
            if(ut15)
            submit+="import java.util.EventObject;\n";
            ut15=false;
            }
            if(u16.getState()==true)
            {
            if(ut16)
            submit+="import java.util.GregorianCalendar;\n";
            ut16=false;
            }
            if(u17.getState()==true)
            {
            if(ut17)
            submit+="import java.util.HashMap;\n";
            ut17=false;
            }
            if(u18.getState()==true)
            {
            if(ut18)
            submit+="import java.util.HashSet;\n";
            ut18=false;
            }
            if(u19.getState()==true)
            {
            if(ut19)
            submit+="import java.util.Hashtable;\n";
            ut19=false;
            }
            if(u20.getState()==true)
            {
            if(ut20)
            submit+="import java.util.IdentityHashMap;\n";
            ut20=false;
            }
            if(u21.getState()==true)
            {
            if(ut21)
            submit+="import java.util.LinkedHashMap;\n";
            ut21=false;
            }
            if(u22.getState()==true)
            {
            if(ut22)
            submit+="import java.util.LinkedHashSet;\n";
            ut22=false;
            }
            if(u23.getState()==true)
            {
            if(ut23)
            submit+="import java.util.LinkedList;\n";
            ut23=false;
            }
            if(u24.getState()==true)
            {
            if(ut24)
            submit+="import java.util.ListResourceBundle;\n";
            ut24=false;
            }
            if(u25.getState()==true)
            {
            if(ut25)
            submit+="import java.util.Locale;\n";
            ut25=false;
            }
            if(u26.getState()==true)
            {
            if(ut26)
            submit+="import java.util.Observable;\n";
            ut26=false;
            }
            if(u27.getState()==true)
            {
            if(ut27)
            submit+="import java.util.Properties;\n";
            ut27=false;
            }
            if(u28.getState()==true)
            {
            if(ut28)
            submit+="import java.util.PropertyPermission;\n";
            ut28=false;
            }
            if(u29.getState()==true)
            {
            if(ut29)
            submit+="import java.util.PropertyResourceBundle;\n";
            ut29=false;
            }
            if(u30.getState()==true)
            {
            if(ut30)
            submit+="import java.util.Random;\n";
            ut30=false;
            }
            if(u31.getState()==true)
            {
            if(ut31)
            submit+="import java.util.ResourceBundle;\n";
            ut31=false;
            }
            if(u32.getState()==true)
            {
            if(ut32)
            submit+="import java.util.SimpleTimeZone;\n";
            ut32=false;
            }
            if(u33.getState()==true)
            {
            if(ut33)
            submit+="import java.util.Stack;\n";
            ut33=false;
            }
            if(u34.getState()==true)
            {
            if(ut34)
            submit+="import java.util.StringTokenizer;\n";
            ut34=false;
            }
            if(u35.getState()==true)
            {
            if(ut35)
            submit+="import java.util.Timer;\n";
            ut35=false;
            }
            if(u36.getState()==true)
            {
            if(ut36)
            submit+="import java.util.TimerTask;\n";
            ut36=false;
            }
            if(u37.getState()==true)
            {
            if(ut37)
            submit+="import java.util.TimerZone;\n";
            ut37=false;
            }
            if(u38.getState()==true)
            {
            if(ut38)
            submit+="import java.util.TreeMap;\n";
            ut38=false;
            }
            if(u39.getState()==true)
            {
            if(ut39)
            submit+="import java.util.TreeSet;\n";
            ut39=false;
            }
            if(u40.getState()==true)
            {
            if(ut40)
            submit+="import java.util.Vector;\n";
            ut40=false;
            }
            if(u41.getState()==true)
            {
            if(ut41)
            submit+="import java.util.WeakHashMap;\n";
            ut41=false;
            }
        }
    }
    class awtPack extends Frame implements ActionListener,ItemListener
    {
        private Checkbox a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,a41,a42,a43,a44,a45,a46,a47,a48,a49,a50,a51,a52,a53;
        private boolean aw1=true,aw2=true,aw3=true,aw4=true,aw5=true,aw6=true,aw7=true,aw8=true,aw9=true,aw10=true,aw11=true,aw12=true,aw13=true,aw14=true,aw15=true,aw16=true,aw17=true,aw18=true,aw19=true,aw20=true,aw21=true,aw22=true,aw23=true,aw24=true,aw25=true,aw26=true,aw27=true,aw28=true,aw29=true,aw30=true,aw31=true,aw32=true,aw33=true,aw34=true,aw35=true,aw36=true,aw37=true,aw38=true,aw39=true,aw40=true,aw41=true,aw42=true,aw43=true,aw44=true,aw45=true,aw46=true,aw47=true,aw48=true,aw49=true,aw50=true,aw51=true,aw52=true,aw53;
        private Button ok;
        Frame f=new Frame("UTIL PACKAGE");
        awtPack()
        {
            ok=new Button("OK");
            ok.setBounds(900,350,90,40);
            ok.addActionListener(this);
            f.add(ok);
            a1=new Checkbox("AWTEvent");
            a1.setBounds(20,20,150,50);
            a1.addItemListener(this);
            a2=new Checkbox("AWTEventMulticaster");
            a2.setBounds(170,20,150,50);
            a2.addItemListener(this);
            a3=new Checkbox("BorderLayout");
            a3.setBounds(320,20,150,50);
            a3.addItemListener(this);
            a4=new Checkbox("Button");
            a4.setBounds(470,20,150,50);
            a4.addItemListener(this);
            a5=new Checkbox("Canvas");
            a5.setBounds(620,20,150,50);
            a5.addItemListener(this);
            a6=new Checkbox("CardLayout");
            a6.setBounds(770,20,150,50);
            a6.addItemListener(this);
            a7=new Checkbox("Checkbox");
            a7.setBounds(20,60,150,50);
            a7.addItemListener(this);
            a8=new Checkbox("CheckboxGroup");
            a8.setBounds(170,60,150,50);
            a8.addItemListener(this);
            a9=new Checkbox("CheckboxMenuItem");
            a9.setBounds(320,60,150,50);
            a9.addItemListener(this);
            a10=new Checkbox("Choice");
            a10.setBounds(470,60,150,50);
            a10.addItemListener(this);
            a11=new Checkbox("Color");
            a11.setBounds(620,60,150,50);
            a11.addItemListener(this);
            a12=new Checkbox("Component");
            a12.setBounds(770,60,150,50);
            a12.addItemListener(this);
            a13=new Checkbox("Container");
            a13.setBounds(20,100,150,50);
            a13.addItemListener(this);
            a14=new Checkbox("Cursor");
            a14.setBounds(170,100,150,50);
            a14.addItemListener(this);
            a15=new Checkbox("Dialog");
            a15.setBounds(320,100,150,50);
            a15.addItemListener(this);
            a16=new Checkbox("Dimension");
            a16.setBounds(470,100,150,50);
            a16.addItemListener(this);
            a17=new Checkbox("Event");
            a17.setBounds(620,100,150,50);
            a17.addItemListener(this);
            a18=new Checkbox("EventQueue");
            a18.setBounds(770,100,150,50);
            a18.addItemListener(this);
            a19=new Checkbox("FileDialog");
            a19.setBounds(20,140,150,50);
            a19.addItemListener(this);
            a20=new Checkbox("FlowLayout");
            a20.setBounds(170,140,150,50);
            a20.addItemListener(this);
            a21=new Checkbox("Font");
            a21.setBounds(320,140,150,50);
            a21.addItemListener(this);
            a22=new Checkbox("FontMetrics");
            a22.setBounds(470,140,150,50);
            a22.addItemListener(this);
            a23=new Checkbox("Frame");
            a23.setBounds(620,140,150,50);
            a23.addItemListener(this);
            a24=new Checkbox("Graphics");
            a24.setBounds(770,140,150,50);
            a24.addItemListener(this);
            a25=new Checkbox("GraphicsDevice");
            a25.setBounds(20,180,150,50);
            a25.addItemListener(this);
            a26=new Checkbox("GraphicsEnvironment");
            a26.setBounds(170,180,150,50);
            a26.addItemListener(this);
            a27=new Checkbox("GridBagConstraints");
            a27.setBounds(320,180,150,50);
            a27.addItemListener(this);
            a28=new Checkbox("GridBagLayout");
            a28.setBounds(470,180,150,50);
            a28.addItemListener(this);
            a29=new Checkbox("Image");
            a29.setBounds(620,180,150,50);
            a29.addItemListener(this);
            a30=new Checkbox("Insets");
            a30.setBounds(770,180,150,50);
            a30.addItemListener(this);
            a31=new Checkbox("Label");
            a31.setBounds(20,220,150,50);
            a31.addItemListener(this);
            a32=new Checkbox("List");
            a32.setBounds(170,220,150,50);
            a32.addItemListener(this);
            a33=new Checkbox("MediaTracker");
            a33.setBounds(320,220,150,50);
            a33.addItemListener(this);
            a34=new Checkbox("Menu");
            a34.setBounds(470,220,150,50);
            a34.addItemListener(this);
            a35=new Checkbox("MenuBar");
            a35.setBounds(620,220,150,50);
            a35.addItemListener(this);
            a36=new Checkbox("MenuComponent");
            a36.setBounds(770,220,150,50);
            a36.addItemListener(this);
            a37=new Checkbox("MenuItem");
            a37.setBounds(20,260,150,50);
            a37.addItemListener(this);
            a38=new Checkbox("MenuShortcut");
            a38.setBounds(170,260,150,50);
            a38.addItemListener(this);
            a39=new Checkbox("Panel");
            a39.setBounds(320,260,150,50);
            a39.addItemListener(this);
            a40=new Checkbox("Point");
            a40.setBounds(470,260,150,50);
            a40.addItemListener(this);
            a41=new Checkbox("Polygon");
            a41.setBounds(620,260,150,50);
            a41.addItemListener(this);
            a42=new Checkbox("PopupMenu");
            a42.setBounds(770,260,150,50);
            a42.addItemListener(this);
            a43=new Checkbox("PrintJob");
            a43.setBounds(20,300,150,50);
            a43.addItemListener(this);
            a44=new Checkbox("Rectangle");
            a44.setBounds(170,300,150,50);
            a44.addItemListener(this);
            a45=new Checkbox("Robot");
            a45.setBounds(320,300,150,50);
            a45.addItemListener(this);
            a46=new Checkbox("Scrollbar");
            a46.setBounds(470,300,150,50);
            a46.addItemListener(this);
            a47=new Checkbox("ScrollPane");
            a47.setBounds(620,300,150,50);
            a47.addItemListener(this);
            a48=new Checkbox("SystemColor");
            a48.setBounds(770,300,150,50);
            a48.addItemListener(this);
            a49=new Checkbox("TextArea");
            a49.setBounds(20,340,150,50);
            a49.addItemListener(this);
            a50=new Checkbox("TextComponent");
            a50.setBounds(170,340,150,50);
            a50.addItemListener(this);
            a51=new Checkbox("TextField");
            a51.setBounds(320,340,150,50);
            a51.addItemListener(this);
            a52=new Checkbox("Toolkit");
            a52.setBounds(470,340,150,50);
            a52.addItemListener(this);
            a53=new Checkbox("Window");
            a53.setBounds(620,340,150,50);
            a53.addItemListener(this);
            f.add(a1);
            f.add(a2);
            f.add(a3);
            f.add(a4);
            f.add(a5);
            f.add(a6);
            f.add(a7);
            f.add(a8);
            f.add(a9);
            f.add(a10);
            f.add(a11);
            f.add(a12);
            f.add(a13);
            f.add(a14);
            f.add(a15);
            f.add(a16);
            f.add(a17);
            f.add(a18);
            f.add(a19);
            f.add(a20);
            f.add(a21);
            f.add(a22);
            f.add(a23);
            f.add(a24);
            f.add(a25);
            f.add(a26);
            f.add(a27);
            f.add(a28);
            f.add(a29);
            f.add(a30);
            f.add(a31);
            f.add(a32);
            f.add(a33);
            f.add(a34);
            f.add(a35);
            f.add(a36);
            f.add(a37);
            f.add(a38);
            f.add(a39);
            f.add(a40);
            f.add(a41);
            f.add(a42);
            f.add(a43);
            f.add(a44);
            f.add(a45);
            f.add(a46);
            f.add(a47);
            f.add(a48);
            f.add(a49);
            f.add(a50);
            f.add(a51);
            f.add(a52);
            f.add(a53);
             f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            f.setVisible(true);
            f.setBounds(200,200,1000,400);
        }
        public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("OK"))
        {
            f.setVisible(false);
            text.setText(submit+text.getText());
            submit="";
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(a1.getState()==true)
        {
            if(aw1)
            submit+="import java.awt.AWTEvent;\n";
            aw1=false;
            }
            if(a2.getState()==true)
            {
            if(aw2)
            submit+="import java.awt.AWTEventMulticaster;\n";
            aw2=false;
            }
            if(a3.getState()==true)
            {
            if(aw3)
            submit+="import java.awt.BorderLayout;\n";
            aw3=false;
            }
            if(a4.getState()==true)
            {
            if(aw4)
            submit+="import java.awt.Button;\n";
            aw4=false;
            }
            if(a5.getState()==true)
            {
            if(aw5)
            submit+="import java.awt.Canvas;\n";
            aw5=false;
            }
            if(a6.getState()==true)
            {
            if(aw6)
            submit+="import java.awt.CardLayout;\n";
            aw6=false;
            }
            if(a7.getState()==true)
            {
            if(aw7)
            submit+="import java.awt.Checkbox;\n";
            aw7=false;
            }
            if(a8.getState()==true)
            {
            if(aw8)
            submit+="import java.awt.CheckboxGroup;\n";
            aw8=false;
            }
            if(a9.getState()==true)
            {
            if(aw9)
            submit+="import java.awt.CheckboxMenuItem;\n";
            aw9=false;
            }
            if(a10.getState()==true)
            {
            if(aw10)
            submit+="import java.awt.Choice;\n";
            aw10=false;
            }
            if(a11.getState()==true)
            {
            if(aw11)
            submit+="import java.awt.Color;\n";
            aw11=false;
            }
            if(a12.getState()==true)
            {
            if(aw12)
            submit+="import java.awt.Component;\n";
            aw12=false;
            }
            if(a13.getState()==true)
            {
            if(aw13)
            submit+="import java.awt.Container;\n";
            aw13=false;
            }
            if(a14.getState()==true)
            {
            if(aw14)
            submit+="import java.awt.Cursor;\n";
            aw14=false;
            }
            if(a15.getState()==true)
            {
            if(aw15)
            submit+="import java.awt.Dialog;\n";
            aw15=false;
            }
            if(a16.getState()==true)
            {
            if(aw16)
            submit+="import java.awt.Dimension;\n";
            aw16=false;
            }
            if(a17.getState()==true)
            {
            if(aw17)
            submit+="import java.awt.Event;\n";
            aw17=false;
            }
            if(a18.getState()==true)
            {
            if(aw18)
            submit+="import java.awt.EventQueue;\n";
            aw18=false;
            }
            if(a19.getState()==true)
            {
            if(aw19)
            submit+="import java.awt.FileDialog;\n";
            aw19=false;
            }
            if(a20.getState()==true)
            {
            if(aw20)
            submit+="import java.awt.FlowLayout;\n";
            aw20=false;
            }
            if(a21.getState()==true)
            {
            if(aw21)
            submit+="import java.awt.Font;\n";
            aw21=false;
            }
            if(a22.getState()==true)
            {
            if(aw22)
            submit+="import java.awt.FontMetrics;\n";
            aw22=false;
            }
            if(a23.getState()==true)
            {
            if(aw23)
            submit+="import java.awt.Frame;\n";
            aw23=false;
            }
            if(a24.getState()==true)
            {
            if(aw24)
            submit+="import java.awt.Graphics;\n";
            aw24=false;
            }
            if(a25.getState()==true)
            {
            if(aw25)
            submit+="import java.awt.GraphicsDevice;\n";
            aw25=false;
            }
            if(a26.getState()==true)
            {
            if(aw26)
            submit+="import java.awt.GraphicsEnvironment;\n";
            aw26=false;
            }
            if(a27.getState()==true)
            {
            if(aw27)
            submit+="import java.awt.GridBagConstraints;\n";
            aw27=false;
            }
            if(a28.getState()==true)
            {
            if(aw28)
            submit+="import java.awt.GridBagLayout;\n";
            aw28=false;
            }
            if(a29.getState()==true)
            {
            if(aw29)
            submit+="import java.awt.Image;\n";
            aw29=false;
            }
            if(a30.getState()==true)
            {
            if(aw30)
            submit+="import java.awt.Insets;\n";
            aw30=false;
            }
            if(a31.getState()==true)
            {
            if(aw31)
            submit+="import java.awt.Label;\n";
            aw31=false;
            }
            if(a32.getState()==true)
            {
            if(aw32)
            submit+="import java.awt.List;\n";
            aw32=false;
            }
            if(a33.getState()==true)
            {
            if(aw33)
            submit+="import java.awt.MediaTracker;\n";
            aw33=false;
            }
            if(a34.getState()==true)
            {
            if(aw34)
            submit+="import java.awt.Menu;\n";
            aw34=false;
            }
            if(a35.getState()==true)
            {
            if(aw35)
            submit+="import java.awt.MenuBar;\n";
            aw35=false;
            }
            if(a36.getState()==true)
            {
            if(aw36)
            submit+="import java.awt.MenuComponent;\n";
            aw36=false;
            }
            if(a37.getState()==true)
            {
            if(aw37)
            submit+="import java.awt.MenuItem;\n";
            aw37=false;
            }
            if(a38.getState()==true)
            {
            if(aw38)
            submit+="import java.awt.MenuShortcut;\n";
            aw38=false;
            }
            if(a39.getState()==true)
            {
            if(aw39)
            submit+="import java.awt.Panel;\n";
            aw39=false;
            }
            if(a40.getState()==true)
            {
            if(aw40)
            submit+="import java.awt.Point;\n";
            aw40=false;
            }
            if(a41.getState()==true)
            {
            if(aw41)
            submit+="import java.awt.Polygon;\n";
            aw41=false;
            }
            if(a42.getState()==true)
            {
            if(aw42)
            submit+="import java.awt.PopupMenu;\n";
            aw42=false;
            }
            if(a43.getState()==true)
            {
            if(aw43)
            submit+="import java.awt.PrintJob;\n";
            aw43=false;
            }
            if(a44.getState()==true)
            {
            if(aw44)
            submit+="import java.awt.Rectangle;\n";
            aw44=false;
            }
            if(a45.getState()==true)
            {
            if(aw45)
            submit+="import java.awt.Robot;\n";
            aw45=false;
            }
            if(a46.getState()==true)
            {
            if(aw46)
            submit+="import java.awt.Scrollbar;\n";
            aw46=false;
            }
            if(a47.getState()==true)
            {
            if(aw47)
            submit+="import java.awt.ScrollPane;\n";
            aw47=false;
            }
            if(a48.getState()==true)
            {
            if(aw48)
            submit+="import java.awt.SystemColor;\n";
            aw48=false;
            }
            if(a49.getState()==true)
            {
            if(aw49)
            submit+="import java.awt.TextArea;\n";
            aw49=false;
            }
            if(a50.getState()==true)
            {
            if(aw50)
            submit+="import java.awt.TextComponent;\n";
            aw50=false;
            }
            if(a51.getState()==true)
            {
            if(aw51)
            submit+="import java.awt.TextField;\n";
            aw51=false;
            }
            if(a52.getState()==true)
            {
            if(aw52)
            submit+="import java.awt.Toolkit;\n";
            aw52=false;
            }
            if(a53.getState()==true)
            {
            if(aw53)
            submit+="import java.awt.Window;\n";
            aw53=false;
            }
        }
    }
    class appletPack extends Frame implements ActionListener
    {
        private Button ok;
        private Label classname,hvalue,wvalue,la;
        private TextField cname,hv,wv;
        Frame f=new Frame("UTIL PACKAGE");
        appletPack()
        {
             f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            cname=new TextField(30);
            cname.setBounds(50,100,200,20);
            cname.addActionListener(this);
            f.add(cname);
            wv=new TextField(30);
            wv.setBounds(350,100,200,20);
            wv.addActionListener(this);
            f.add(wv);
            hv=new TextField(30);
            hv.setBounds(650,100,200,20);
            hv.addActionListener(this);
            f.add(hv);
            classname=new Label("ENTER THE CLASS NAME :");
            classname.setBounds(50,50,300,40);
            f.add(classname);
            wvalue=new Label("ENTER THE APPLET WIDTH :");
            wvalue.setBounds(350,50,300,40);
            f.add(wvalue);
            hvalue=new Label("ENTER THE APPLET HEIGHT :");
            hvalue.setBounds(650,50,300,40);
            f.add(hvalue);
            f.setVisible(true);
            f.setBounds(200,200,1000,200);
            ok=new Button("OK");
            ok.setBounds(900,150,90,40);
            ok.addActionListener(this);
            f.add(ok);
        }
        public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        String name=cname.getText();
        String h=hv.getText();
        String w=wv.getText();
        if(s.equals("OK"))
        {
            f.setVisible(false);
            submit+="//<applet code=\""+name+".java\" width="+w+" height="+h+"></applet>\n";
            text.append(submit);
            submit="";
        }
    }
    }
    class netPack extends Frame implements ActionListener,ItemListener
    {
        private Button ok;
        private Checkbox ne1,ne2,ne3,ne4,ne5,ne6,ne7,ne8,ne9,ne10,ne11,ne12,ne13,ne14,ne15,ne16,ne17,ne18,ne19,ne20,ne21,ne22,ne23,ne24,ne25,ne26,ne27;
        private boolean net1=true,net2=true,net3=true,net4=true,net5=true,net6=true,net7=true,net8=true,net9=true,net10=true,net11=true,net12=true,net13=true,net14=true,net15=true,net16=true,net17=true,net18=true,net19=true,net20=true,net21=true,net22=true,net23=true,net24=true,net25=true,net26=true,net27;
        Frame f=new Frame("UTIL PACKAGE");
        netPack()
        {
            ok=new Button("OK");
            ok.setBounds(900,200,90,40);
            ok.addActionListener(this);
            f.add(ok);
            ne1=new Checkbox("Authenticator");
            ne1.setBounds(20,20,150,50);
            ne1.addItemListener(this);
            ne2=new Checkbox("ContentHandler");
            ne2.setBounds(170,20,150,50);
            ne2.addItemListener(this);
            ne3=new Checkbox("DatagramPacket");
            ne3.setBounds(320,20,150,50);
            ne3.addItemListener(this);
            ne4=new Checkbox("DatagramSocket");
            ne4.setBounds(470,20,150,50);
            ne4.addItemListener(this);
            ne5=new Checkbox("DatagramSocketImpl");
            ne5.setBounds(620,20,150,50);
            ne5.addItemListener(this);
            ne6=new Checkbox("HttpURLConnection");
            ne6.setBounds(770,20,150,50);
            ne6.addItemListener(this);
            ne7=new Checkbox("InetAddress");
            ne7.setBounds(20,60,150,50);
            ne7.addItemListener(this);
            ne8=new Checkbox("Inet4Address");
            ne8.setBounds(170,60,150,50);
            ne8.addItemListener(this);
            ne9=new Checkbox("Inet6Address");
            ne9.setBounds(320,60,150,50);
            ne9.addItemListener(this);
            ne10=new Checkbox("InetSocketAddress");
            ne10.setBounds(470,60,150,50);
            ne10.addItemListener(this);
            ne11=new Checkbox("JarURLConnection");
            ne11.setBounds(620,60,150,50);
            ne11.addItemListener(this);
            ne12=new Checkbox("MulticastSocket");
            ne12.setBounds(770,60,150,50);
            ne12.addItemListener(this);
            ne13=new Checkbox("NetPermission");
            ne13.setBounds(20,100,150,50);
            ne13.addItemListener(this);
            ne14=new Checkbox("NetworkInterface");
            ne14.setBounds(170,100,150,50);
            ne14.addItemListener(this);
            ne15=new Checkbox("PasswordAuthentication");
            ne15.setBounds(320,100,150,50);
            ne15.addItemListener(this);
            ne16=new Checkbox("ServerSocket");
            ne16.setBounds(470,100,150,50);
            ne16.addItemListener(this);
            ne17=new Checkbox("Socket");
            ne17.setBounds(620,100,150,50);
            ne17.addItemListener(this);
            ne18=new Checkbox("SocketAddress");
            ne18.setBounds(770,100,150,50);
            ne18.addItemListener(this);
            ne19=new Checkbox("SocketImpl");
            ne19.setBounds(20,140,150,50);
            ne19.addItemListener(this);
            ne20=new Checkbox("SocketPermission");
            ne20.setBounds(170,140,150,50);
            ne20.addItemListener(this);
            ne21=new Checkbox("URI");
            ne21.setBounds(320,140,150,50);
            ne21.addItemListener(this);
            ne22=new Checkbox("URL");
            ne22.setBounds(470,140,150,50);
            ne22.addItemListener(this);
            ne23=new Checkbox("URLClassLoader");
            ne23.setBounds(620,140,150,50);
            ne23.addItemListener(this);
            ne24=new Checkbox("URLConnection");
            ne24.setBounds(770,140,150,50);
            ne24.addItemListener(this);
            ne25=new Checkbox("URLDecoder");
            ne25.setBounds(20,180,150,50);
            ne25.addItemListener(this);
            ne26=new Checkbox("URLEncoder");
            ne26.setBounds(170,180,150,50);
            ne26.addItemListener(this);
            ne27=new Checkbox("URLStreamHandler");
            ne27.setBounds(320,180,150,50);
            ne27.addItemListener(this);
            f.add(ne1);
            f.add(ne2);
            f.add(ne3);
            f.add(ne4);
            f.add(ne5);
            f.add(ne6);
            f.add(ne7);
            f.add(ne8);
            f.add(ne9);
            f.add(ne10);
            f.add(ne11);
            f.add(ne12);
            f.add(ne13);
            f.add(ne14);
            f.add(ne15);
            f.add(ne16);
            f.add(ne17);
            f.add(ne18);
            f.add(ne19);
            f.add(ne20);
            f.add(ne21);
            f.add(ne22);
            f.add(ne23);
            f.add(ne24);
            f.add(ne25);
            f.add(ne26);
            f.add(ne27);
             f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            f.setVisible(true);
            f.setBounds(200,200,1000,250);
        }
        public void itemStateChanged(ItemEvent ie)
        {
            if(ne1.getState()==true)
            {
                if(net1)
                submit+="import java.net.Authenticator;\n";
                net1=false;
                }
                if(ne2.getState()==true)
                {
                if(net2)
                submit+="import java.net.ContentHandler;\n";
                net2=false;
                }
                if(ne3.getState()==true)
                {
                if(net3)
                submit+="import java.net.DatagramPacket;\n";
                net3=false;
                }
                if(ne4.getState()==true)
                {
                if(net4)
                submit+="import java.net.DatagramSocket;\n";
                net4=false;
                }
                if(ne5.getState()==true)
                {
                if(net5)
                submit+="import java.net.DatagramSocketImpl;\n";
                net5=false;
                }
                if(ne6.getState()==true)
                {
                if(net6)
                submit+="import java.net.HttpURLConnection;\n";
                net6=false;
                }
                if(ne7.getState()==true)
                {
                if(net7)
                submit+="import java.net.InetAddress;\n";
                net7=false;
                }
                if(ne8.getState()==true)
                {
                if(net8)
                submit+="import java.net.Inet4Address;\n";
                net8=false;
                }
                if(ne9.getState()==true)
                {
                if(net9)
                submit+="import java.net.Inet6Address;\n";
                net9=false;
                }
                if(ne10.getState()==true)
                {
                if(net10)
                submit+="import java.net.InetSocketAddress;\n";
                net10=false;
                }
                if(ne11.getState()==true)
                {
                if(net11)
                submit+="import java.net.JarURLConnection;\n";
                net11=false;
                }
                if(ne12.getState()==true)
                {
                if(net12)
                submit+="import java.net.MulticastSocket;\n";
                net12=false;
                }
                if(ne13.getState()==true)
                {
                if(net13)
                submit+="import java.net.NetPermission;\n";
                net13=false;
                }
                if(ne14.getState()==true)
                {
                if(net14)
                submit+="import java.net.NetworkInterface;\n";
                net14=false;
                }
                if(ne15.getState()==true)
                {
                if(net15)
                submit+="import java.net.PasswordAuthentication;\n";
                net15=false;
                }
                if(ne16.getState()==true)
                {
                if(net16)
                submit+="import java.net.ServerSocket;\n";
                net16=false;
                }
                if(ne17.getState()==true)
                {
                if(net17)
                submit+="import java.net.Socket;\n";
                net17=false;
                }
                if(ne18.getState()==true)
                {
                if(net18)
                submit+="import java.net.SocketAddress;\n";
                net18=false;
                }
                if(ne19.getState()==true)
                {
                if(net19)
                submit+="import java.net.SocketImpl;\n";
                net19=false;
                }
                if(ne20.getState()==true)
                {
                if(net20)
                submit+="import java.net.SocketPermission;\n";
                net20=false;
                }
                if(ne21.getState()==true)
                {
                if(net21)
                submit+="import java.net.URI;\n";
                net21=false;
                }
                if(ne22.getState()==true)
                {
                if(net22)
                submit+="import java.net.URL;\n";
                net22=false;
                }
                if(ne23.getState()==true)
                {
                if(net23)
                submit+="import java.net.URLClassLoader;\n";
                net23=false;
                }
                if(ne24.getState()==true)
                {
                if(net24)
                submit+="import java.net.URLConnection;\n";
                net24=false;
                }
                if(ne25.getState()==true)
                {
                if(net25)
                submit+="import java.net.URLDecoder;\n";
                net25=false;
                }
                if(ne26.getState()==true)
                {
                if(net26)
                submit+="import java.net.URLEncoder;\n";
                net26=false;
                }
                if(ne27.getState()==true)
                {
                if(net27)
                submit+="import java.net.URLStreamHandler;\n";
                net27=false;
                }
            }
            public void actionPerformed(ActionEvent ae)
            {
                String s=ae.getActionCommand();
                if(s.equals("OK"))
                {
                    f.setVisible(false);
                    text.setText(submit+text.getText());
                    submit="";
                }
            }
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        //===============This is the Cut Black===================
        if(ae.getSource()==cut)
        {
            String some=text.getSelectedText();
        }
        if(ae.getSource()==copy)
        {
            System.out.println("Copy");
        }
        if(ae.getSource()==paste)
        {
            System.out.println("Paste");
        }
        if(ae.getSource()==selectall)
        {
            System.out.println("Select All");
        }
        if(ae.getSource()==quick)
        {
            new QuickBox();
        }
        if(ae.getSource()==classprocess)
        {
            new ClassProcesses();
        }
        String command=ae.getActionCommand();
        if(command.equals("INSERT"))
        {
            text.append(sorting[0]+" ");
        }
    }
    class ClassProcesses extends Frame implements ActionListener,ItemListener
    {
        private String lis=new String();
        private String extend=new String(); 
        private boolean e=true;
        private String submit=new String();
        private String get=new String();
        private Label cls,chcls,la,selex,selim;
        private TextField encls;
        private Choice pro;
        private Button ok,ex,imple;
        Frame f=new Frame("IMPORT CLASS");
        ClassProcesses()
        {
            selex=new Label("EXTENDS CLASS :");
            selex.setBounds(20,150,150,40);
            f.add(selex);
            selim=new Label("IMPLEMENTS INTERFACE :");
            selim.setBounds(20,200,160,40);
            f.add(selim);
            pro=new Choice();
            pro.select("none");
            pro.add("none");
            pro.add("public");
            pro.add("private");
            pro.add("producted");
            pro.setBounds(200,110,150,40);
            pro.addItemListener(this);
            f.add(pro);
            cls=new Label("ENTER THE CLASS NAME :");
            cls.setBounds(20,50,150,40);
            f.add(cls);
            encls=new TextField(20);
            encls.setBounds(200,60,150,25);
            f.add(encls);
            encls.addActionListener(this);
            chcls=new Label("SELECT THE LIST :");
            chcls.setBounds(20,100,150,40);
            f.add(chcls);
            ok=new Button("OK");
            ok.setBounds(300,250,90,40);
            ok.addActionListener(this);
            f.add(ok);
            ex=new Button("EXTEND");
            ex.setBounds(200,150,100,30);
            ex.addActionListener(this);
            f.add(ex);
            imple=new Button("IMPLEMENT");
            imple.setBounds(200,200,100,30);
            imple.addActionListener(this);
            f.add(imple);
            la=new Label("");
            f.add(la);
            f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            f.setBounds(950,250,400,300);
            f.setVisible(true);
        }
        public void actionPerformed(ActionEvent ae)
        {
            String some=encls.getText();
            String s=ae.getActionCommand();
            if(s.equals("EXTEND"))
            {
                new extendsClass();
            }
            if(s.equals("IMPLEMENT"))
            {
                new impleClass();
            }
            if(s.equals("OK"))
            {
                submit+=get+"class "+some+" "+extend+" "+lis+"\n";
                f.setVisible(false);
                text.setText(text.getText()+submit);
            }
        }
        class impleClass extends Frame implements ActionListener,ItemListener
        {
            private boolean e=true;
            private Button ok;
            private Label ls;
            private Checkbox ext1,ext2,ext3,ext4,ext5,ext6,ext7,ext8,ext9,ext10,ext11,ext12,ext13;
            private boolean exten1=true,exten2=true,exten3=true,exten4=true,exten5=true,exten6=true,exten7=true,exten8=true,exten9=true,exten10=true,exten11=true,exten12=true,exten13;
            Frame f=new Frame("EXTENDS CLASS");
            impleClass()
            {
                ext1=new Checkbox("ActionListener");
                ext1.setBounds(20,20,150,50);
                ext1.addItemListener(this);
                ext2=new Checkbox("AdjustmentListener");
                ext2.setBounds(170,20,150,50);
                ext2.addItemListener(this);
                ext3=new Checkbox("ComponentListener");
                ext3.setBounds(320,20,150,50);
                ext3.addItemListener(this);
                ext4=new Checkbox("ContainerListener");
                ext4.setBounds(470,20,150,50);
                ext4.addItemListener(this);
                ext5=new Checkbox("FocusListener");
                ext5.setBounds(620,20,150,50);
                ext5.addItemListener(this);
                ext6=new Checkbox("ItemListener");
                ext6.setBounds(770,20,150,50);
                ext6.addItemListener(this);
                ext7=new Checkbox("KeyListener");
                ext7.setBounds(20,60,150,50);
                ext7.addItemListener(this);
                ext8=new Checkbox("MouseListener");
                ext8.setBounds(170,60,150,50);
                ext8.addItemListener(this);
                ext9=new Checkbox("MouseMotionListener");
                ext9.setBounds(320,60,150,50);
                ext9.addItemListener(this);
                ext10=new Checkbox("MouseWheelListener");
                ext10.setBounds(470,60,150,50);
                ext10.addItemListener(this);
                ext11=new Checkbox("TextListener");
                ext11.setBounds(620,60,150,50);
                ext11.addItemListener(this);
                ext12=new Checkbox("WindowFocusListener");
                ext12.setBounds(770,60,150,40);
                ext12.addItemListener(this);
                ext13=new Checkbox("WindowListener");
                ext13.setBounds(20,100,150,40);
                ext13.addItemListener(this);
                f.add(ext1);
                f.add(ext2);
                f.add(ext3);
                f.add(ext4);
                f.add(ext5);
                f.add(ext6);
                f.add(ext7);
                f.add(ext8);
                f.add(ext9);
                f.add(ext10);
                f.add(ext11);
                f.add(ext12);
                f.add(ext13);
                ok=new Button("OK");
                ok.setBounds(900,100,90,40);
                ok.addActionListener(this);
                f.add(ok);
                ls=new Label("");
                f.add(ls);
                f.setVisible(true);
                f.setBounds(200,150,1000,150);
                f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
            }
            public void actionPerformed(ActionEvent ae)
            {
                String s=ae.getActionCommand();
                if(s.equals("OK"))
                {
                    f.setVisible(false);
                }
            }
            public void itemStateChanged(ItemEvent ie)
            {
                if(e)
                lis+="implements ";
                e=false;
                if(ext1.getState()==true)
                {
                    if(exten1)
                    lis+="ActionListener";
                    exten1=false;
                }
                if(ext2.getState()==true)
                {
                    if(exten2)
                    lis+="AdjustmentListener";
                    exten2=false;
                }
                if(ext3.getState()==true)
                {
                    if(exten3)
                    lis+="ComponentListener";
                    exten3=false;
                }
                if(ext4.getState()==true)
                {
                    if(exten4)
                    lis+="ContainerListener";
                    exten4=false;
                }
                if(ext5.getState()==true)
                {
                    if(exten5)
                    lis+="FocusListener";
                    exten5=false;
                }
                if(ext6.getState()==true)
                {
                    if(exten6)
                    lis+="ItemListener"; 
                    exten6=false;
                }
                if(ext7.getState()==true)
                {
                    if(exten7)
                    lis+="KeyListener";
                    exten7=false;
                }
                if(ext8.getState()==true)
                {
                    if(exten8)
                    lis+="MouseListener";
                    exten8=false;
                }
                if(ext9.getState()==true)
                {
                    if(exten9)
                    lis+="MouseMotionListener";
                    exten9=false;
                }
                if(ext10.getState()==true)
                {
                    if(exten10)
                    lis+="MouseWheelListener";
                    exten10=false;
                }
                if(ext11.getState()==true)
                {
                    if(exten11)
                    lis+="TextListener";
                    exten11=false;
                }
                if(ext12.getState()==true)
                {
                    if(exten12)
                    lis+="WindowFocusListener";
                    exten12=false;
                }
                if(ext13.getState()==true)
                {
                    if(exten13)
                    lis+="WindowListener";
                    exten13=false;
                }
                lis+=",";
            }
        }
        public void itemStateChanged(ItemEvent ie)
            {
                get=pro.getSelectedItem();
                if(get.equals("none"))
                {
                    get="";
                }
                else
                get+=" ";
            }
        class extendsClass extends Frame implements ActionListener,ItemListener
        {
            private boolean to=true;
            private Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53;
            private boolean cc1=true,cc2=true,cc3=true,cc4=true,cc5=true,cc6=true,cc7=true,cc8=true,cc9=true,cc10=true,cc11=true,cc12=true,cc13=true,cc14=true,cc15=true,cc16=true,cc17=true,cc18=true,cc19=true,cc20=true,cc21=true,cc22=true,cc23=true,cc24=true,cc25=true,cc26=true,cc27=true,cc28=true,cc29=true,cc30=true,cc31=true,cc32=true,cc33=true,cc34=true,cc35=true,cc36=true,cc37=true,cc38=true,cc39=true,cc40=true,cc41=true,cc42=true,cc43=true,cc44=true,cc45=true,cc46=true,cc47=true,cc48=true,cc49=true,cc50=true,cc51=true,cc52=true,cc53;
            private Button ok;
            private Label ls;
            Frame f=new Frame("EXTENDS CLASS");
            extendsClass()
            {
                c1=new Checkbox("AWTEvent");
                c1.setBounds(20,20,150,50);
                c1.addItemListener(this);
                c2=new Checkbox("AWTEventMulticaster");
                c2.setBounds(170,20,150,50);
                c2.addItemListener(this);
                c3=new Checkbox("BorderLayout");
                c3.setBounds(320,20,150,50);
                c3.addItemListener(this);
                c4=new Checkbox("Button");
                c4.setBounds(470,20,150,50);
                c4.addItemListener(this);
                c5=new Checkbox("Canvas");
                c5.setBounds(620,20,150,50);
                c5.addItemListener(this);
                c6=new Checkbox("CardLayout");
                c6.setBounds(770,20,150,50);
                c6.addItemListener(this);
                c7=new Checkbox("CheckBox");
                c7.setBounds(20,60,150,50);
                c7.addItemListener(this);
                c8=new Checkbox("CheckBoxGroup");
                c8.setBounds(170,60,150,50);
                c8.addItemListener(this);
                c9=new Checkbox("CheckBoxMenuItem");
                c9.setBounds(320,60,150,50);
                c9.addItemListener(this);
                c10=new Checkbox("Choice");
                c10.setBounds(470,60,150,50);
                c10.addItemListener(this);
                c11=new Checkbox("Color");
                c11.setBounds(620,60,150,50);
                c11.addItemListener(this);
                c12=new Checkbox("Component");
                c12.setBounds(770,60,150,50);
                c12.addItemListener(this);
                c13=new Checkbox("Container");
                c13.setBounds(20,100,150,50);
                c13.addItemListener(this);
                c14=new Checkbox("Cursor");
                c14.setBounds(170,100,150,50);
                c14.addItemListener(this);
                c15=new Checkbox("Dialog");
                c15.setBounds(320,100,150,50);
                c15.addItemListener(this);
                c16=new Checkbox("Dimension");
                c16.setBounds(470,100,150,50);
                c16.addItemListener(this);
                c17=new Checkbox("Event");
                c17.setBounds(620,100,150,50);
                c17.addItemListener(this);
                c18=new Checkbox("EventQueue");
                c18.setBounds(770,100,150,50);
                c18.addItemListener(this);
                c19=new Checkbox("FileDialog");
                c19.setBounds(20,140,150,50);
                c19.addItemListener(this);
                c20=new Checkbox("FlowLayout");
                c20.setBounds(170,140,150,50);
                c20.addItemListener(this);
                c21=new Checkbox("Font");
                c21.setBounds(320,140,150,50);
                c21.addItemListener(this);
                c22=new Checkbox("FontMetrics");
                c22.setBounds(470,140,150,50);
                c22.addItemListener(this);
                c23=new Checkbox("Frame");
                c23.setBounds(620,140,150,50);
                c23.addItemListener(this);
                c24=new Checkbox("Graphics");
                c24.setBounds(770,140,150,50);
                c24.addItemListener(this);
                c25=new Checkbox("GraphicsDevice");
                c25.setBounds(20,180,150,50);
                c25.addItemListener(this);
                c26=new Checkbox("GrphicsEnvironment");
                c26.setBounds(170,180,150,50);
                c26.addItemListener(this);
                c27=new Checkbox("GridBagConstraints");
                c27.setBounds(320,180,150,50);
                c27.addItemListener(this);
                c28=new Checkbox("GridBagLayout");
                c28.setBounds(470,180,150,50);
                c28.addItemListener(this);
                c29=new Checkbox("Image");
                c29.setBounds(620,180,150,50);
                c29.addItemListener(this);
                c30=new Checkbox("Insets");
                c30.setBounds(770,180,150,50);
                c30.addItemListener(this);
                c31=new Checkbox("Label");
                c31.setBounds(20,220,150,50);
                c31.addItemListener(this);
                c32=new Checkbox("List");
                c32.setBounds(170,220,150,50);
                c32.addItemListener(this);
                c33=new Checkbox("MediaTracker");
                c33.setBounds(320,220,150,50);
                c33.addItemListener(this);
                c34=new Checkbox("Menu");
                c34.setBounds(470,220,150,50);
                c34.addItemListener(this);
                c35=new Checkbox("MenuBar");
                c35.setBounds(620,220,150,50);
                c35.addItemListener(this);
                c36=new Checkbox("MenuComponent");
                c36.setBounds(770,220,150,50);
                c36.addItemListener(this);
                c37=new Checkbox("MenuItem");
                c37.setBounds(20,260,150,50);
                c37.addItemListener(this);
                c38=new Checkbox("MenuShortcut");
                c38.setBounds(170,260,150,50);
                c38.addItemListener(this);
                c39=new Checkbox("Panel");
                c39.setBounds(320,260,150,50);
                c39.addItemListener(this);
                c40=new Checkbox("Point");
                c40.setBounds(470,260,150,50);
                c40.addItemListener(this);
                c41=new Checkbox("Polygon");
                c41.setBounds(620,260,150,50);
                c41.addItemListener(this);
                c42=new Checkbox("PopupMenu");
                c42.setBounds(770,260,150,50);
                c42.addItemListener(this);
                c43=new Checkbox("PrintJob");
                c43.setBounds(20,300,150,50);
                c43.addItemListener(this);
                c44=new Checkbox("Rectangle");
                c44.setBounds(170,300,150,50);
                c44.addItemListener(this);
                c45=new Checkbox("Robot");
                c45.setBounds(320,300,150,50);
                c45.addItemListener(this);
                c46=new Checkbox("Scrollbar");
                c46.setBounds(470,300,150,50);
                c46.addItemListener(this);
                c47=new Checkbox("ScrollPane");
                c47.setBounds(620,300,150,50);
                c47.addItemListener(this);
                c48=new Checkbox("SystemColor");
                c48.setBounds(770,300,150,50);
                c48.addItemListener(this);
                c49=new Checkbox("TextArea");
                c49.setBounds(20,340,150,50);
                c49.addItemListener(this);
                c50=new Checkbox("TextComponent");
                c50.setBounds(170,340,150,50);
                c50.addItemListener(this);
                c51=new Checkbox("TextField");
                c51.setBounds(320,340,150,50);
                c51.addItemListener(this);
                c52=new Checkbox("Toolkit");
                c52.setBounds(470,340,150,50);
                c52.addItemListener(this);
                c53=new Checkbox("Window");
                c53.setBounds(620,340,150,50);
                c53.addItemListener(this);
                f.add(c1);
                f.add(c2);
                f.add(c3);
                f.add(c4);
                f.add(c5);
                f.add(c6);
                f.add(c7);
                f.add(c8);
                f.add(c9);
                f.add(c10);
                f.add(c11);
                f.add(c12);
                f.add(c13);
                f.add(c14);
                f.add(c15);
                f.add(c16);
                f.add(c17);
                f.add(c18);
                f.add(c19);
                f.add(c20);
                f.add(c21);
                f.add(c22);
                f.add(c23);
                f.add(c24);
                f.add(c25);
                f.add(c26);
                f.add(c27);
                f.add(c28);
                f.add(c29);
                f.add(c30);
                f.add(c31);
                f.add(c32);
                f.add(c33);
                f.add(c34);
                f.add(c35);
                f.add(c36);
                f.add(c37);
                f.add(c38);
                f.add(c39);
                f.add(c40);
                f.add(c41);
                f.add(c42);
                f.add(c43);
                f.add(c44);
                f.add(c45);
                f.add(c46);
                f.add(c47);
                f.add(c48);
                f.add(c49);
                f.add(c50);
                f.add(c51);
                f.add(c52);
                f.add(c53);
                f.setVisible(true);
                f.setBounds(200,150,1000,400);
                f.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent we)
                    {
                        f.setVisible(false);
                    }
                });
                ok=new Button("OK");
                ok.setBounds(900,350,90,40);
                ok.addActionListener(this);
                f.add(ok);
                ls=new Label("");
                f.add(ls);
            }
            public void actionPerformed(ActionEvent ae)
            {
                String s=ae.getActionCommand();
                if(s.equals("OK"))
                {
                    f.setVisible(false);
                }
            }
            public void itemStateChanged(ItemEvent ie)
            {
                if(to)
                extend+="extends ";
                to=false;
                if(c1.getState()==true)
{
if(cc1)
extend+="AWTEvent";
cc1=false;
}
if(c2.getState()==true)
{
if(cc2)
extend+="AWTEventMulticaster";
cc2=false;
}
if(c3.getState()==true)
{
if(cc3)
extend+="BorderLayout";
cc3=false;
}
if(c4.getState()==true)
{
if(cc4)
extend+="Button";
cc4=false;
}
if(c5.getState()==true)
{
if(cc5)
extend+="Canvas";
cc5=false;
}
if(c6.getState()==true)
{
if(cc6)
extend+="CardLayout";
cc6=false;
}
if(c7.getState()==true)
{
if(cc7)
extend+="CheckBox";
cc7=false;
}
if(c8.getState()==true)
{
if(cc8)
extend+="CheckBoxGroup";
cc8=false;
}
if(c9.getState()==true)
{
if(cc9)
extend+="CheckBoxMenuItem";
cc9=false;
}
if(c10.getState()==true)
{
if(cc10)
extend+="Choice";
cc10=false;
}
if(c11.getState()==true)
{
if(cc11)
extend+="Color";
cc11=false;
}
if(c12.getState()==true)
{
if(cc12)
extend+="Component";
cc12=false;
}
if(c13.getState()==true)
{
if(cc13)
extend+="Container";
cc13=false;
}
if(c14.getState()==true)
{
if(cc14)
extend+="Cursor";
cc14=false;
}
if(c15.getState()==true)
{
if(cc15)
extend+="Dialog";
cc15=false;
}
if(c16.getState()==true)
{
if(cc16)
extend+="Dimension";
cc16=false;
}
if(c17.getState()==true)
{
if(cc17)
extend+="Event";
cc17=false;
}
if(c18.getState()==true)
{
if(cc18)
extend+="EventQueue";
cc18=false;
}
if(c19.getState()==true)
{
if(cc19)
extend+="FileDialog";
cc19=false;
}
if(c20.getState()==true)
{
if(cc20)
extend+="FlowLayout";
cc20=false;
}
if(c21.getState()==true)
{
if(cc21)
extend+="Font";
cc21=false;
}
if(c22.getState()==true)
{
if(cc22)
extend+="FontMetrics";
cc22=false;
}
if(c23.getState()==true)
{
if(cc23)
extend+="Frame";
cc23=false;
}
if(c24.getState()==true)
{
if(cc24)
extend+="Graphics";
cc24=false;
}
if(c25.getState()==true)
{
if(cc25)
extend+="GraphicsDevice";
cc25=false;
}
if(c26.getState()==true)
{
if(cc26)
extend+="GrphicsEnvironment";
cc26=false;
}
if(c27.getState()==true)
{
if(cc27)
extend+="GridBagConstraints";
cc27=false;
}
if(c28.getState()==true)
{
if(cc28)
extend+="GridBagLayout";
cc28=false;
}
if(c29.getState()==true)
{
if(cc29)
extend+="Image";
cc29=false;
}
if(c30.getState()==true)
{
if(cc30)
extend+="Insets";
cc30=false;
}
if(c31.getState()==true)
{
if(cc31)
extend+="Label";
cc31=false;
}
if(c32.getState()==true)
{
if(cc32)
extend+="List";
cc32=false;
}
if(c33.getState()==true)
{
if(cc33)
extend+="MediaTracker";
cc33=false;
}
if(c34.getState()==true)
{
if(cc34)
extend+="Menu";
cc34=false;
}
if(c35.getState()==true)
{
if(cc35)
extend+="MenuBar";
cc35=false;
}
if(c36.getState()==true)
{
if(cc36)
extend+="MenuComponent";
cc36=false;
}
if(c37.getState()==true)
{
if(cc37)
extend+="MenuItem";
cc37=false;
}
if(c38.getState()==true)
{
if(cc38)
extend+="MenuShortcut";
cc38=false;
}
if(c39.getState()==true)
{
if(cc39)
extend+="Panel";
cc39=false;
}
if(c40.getState()==true)
{
if(cc40)
extend+="Point";
cc40=false;
}
if(c41.getState()==true)
{
if(cc41)
extend+="Polygon";
cc41=false;
}
if(c42.getState()==true)
{
if(cc42)
extend+="PopupMenu";
cc42=false;
}
if(c43.getState()==true)
{
if(cc43)
extend+="PrintJob";
cc43=false;
}
if(c44.getState()==true)
{
if(cc44)
extend+="Rectangle";
cc44=false;
}
if(c45.getState()==true)
{
if(cc45)
extend+="Robot";
cc45=false;
}
if(c46.getState()==true)
{
if(cc46)
extend+="Scrollbar";
cc46=false;
}
if(c47.getState()==true)
{
if(cc47)
extend+="ScrollPane";
cc47=false;
}
if(c48.getState()==true)
{
if(cc48)
extend+="SystemColor";
cc48=false;
}
if(c49.getState()==true)
{
if(cc49)
extend+="TextArea";
cc49=false;
}
if(c50.getState()==true)
{
if(cc50)
extend+="TextComponent";
cc50=false;
}
if(c51.getState()==true)
{
if(cc51)
extend+="TextField";
cc51=false;
}
if(c52.getState()==true)
{
if(cc52)
extend+="Toolkit";
cc52=false;
}
if(c53.getState()==true)
{
if(cc53)
extend+="Window";
cc53=false;
}
            }
        }
    }
    public void keyPressed(KeyEvent ke){}
    public void keyReleased(KeyEvent ke)
    {
        String come=""+ke.getKeyChar();
        if(come.equals("{"))
        {
            brace+="\t";
            bracecount++;
        }
        if(come.equals("}"))
        {
            for(int i=0;i<brace.length();i++)
            {
                int z=brace.length();
                StringBuffer sb=new StringBuffer(brace);
                brace=String.valueOf(sb.delete(z-1,z));
            }
        } 
         try
        {
            int key=ke.getKeyCode();
            if(key==ke.VK_ENTER)
            {
                in=true;
                text.append(brace);
                insert.setText("");
                sort.setText("");
                count=0;
            }
        }catch(NullPointerException ne){}
    }
    public void keyTyped(KeyEvent ke)
    {
        //====================================Balck of the auto Select mode=========================================
        String s=String.valueOf(ke.getKeyChar());
        if(in)
        {
            for(int n=0;n<contents.length;n++)
            {
                check=String.valueOf(contents[n].charAt(0));
                if(s.equalsIgnoreCase(check))
                {
                    sorting[count]=contents[n];
                    count++;
                }
            }
            for(int i=0;i<count;i++)
            {
                for(int j=i+1;j<count;j++)
                {
                    if(sorting[j].compareToIgnoreCase(sorting[i])<0)
                    {    
                        temp=sorting[i];
                        sorting[i]=sorting[j];
                        sorting[j]=temp;
                    }
                }
            }
            for(int i=0;i<count;i++)
            {
                insert.setText(">>   "+sorting[0]);
                sort.append(" \n>>"+sorting[i]+"\n");
            }
            in=false;
        }
        if((s.equals(" "))||(s.equals("!"))||(s.equals("@"))||(s.equals("#"))||(s.equals("$"))||(s.equals("%"))||(s.equals("^"))||(s.equals("&"))||(s.equals("*"))||(s.equals("("))||(s.equals(")"))||(s.equals("-"))||(s.equals("+"))||(s.equals("_"))||(s.equals("="))||(s.equals("{"))||(s.equals("}"))||(s.equals("|"))||(s.equals("\\"))||(s.equals("["))||(s.equals("["))||(s.equals("]"))||(s.equals(":"))||(s.equals(";"))||(s.equals("\""))||(s.equals("/"))||(s.equals("'"))||(s.equals("<"))||(s.equals(">"))||(s.equals(","))||(s.equals("."))||(s.equals("?"))||(s.equals("/")))
        {
            count=0;
            in=true;
            sort.setText("");
        }
        //==========================================================================================================
    }
}
class Project
{
    public static void main(String ar[])
    {
        Project_Editer pe=new Project_Editer();
    }
}
