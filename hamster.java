import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
//想想還有沒有其他的東西要import
public class hamster extends JFrame implements ActionListener,MouseMotionListener,MouseListener //名稱改一改
{
	Container contain;
	//設定UI元件
	JButton botton;
	JLabel index1,index2;
	//設定共用的變數與類別
	java.util.Random rg;
	int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,mode,ms;//mt時間,ms分數
	double mt;
	javax.swing.Timer t;
	public hamster() //建構元
	{
		super("啦啦啦好玩的打地鼠"); 
		//初始化共用變數
		x1=200;x2=400;x3=300;
		x4=500;x5=100;
		y1=200;y2=200;y3=380;
		y4=380;y5=380;mode=0;
		rg=new Random();
		contain=getContentPane();//取得ContentPane
		//設定版面設定
		contain.setLayout(new FlowLayout());
		//初始化UI元件
		botton=new JButton("按下開始ㄅ～");
		index1=new JLabel("還有剩下:30秒");
		index2=new JLabel("你目前的成績:0");

		//將UI元件加入ContentPane
		contain.add(index1);contain.add(botton);contain.add(index2);
		//設定UI元件與滑鼠的事件觸發傾聽者
		botton.addActionListener(this);
		addMouseMotionListener(this);
		addMouseListener(this);
		t=new javax.swing.Timer(500,this);
		setSize(640,600);//設定size，顯示出去
		setVisible(true);
	}
	public void paint(Graphics g) 
	{
		super.paint(g);//畫出元件

		g.drawOval(x1-50,y1-50,100,100);
		g.drawOval(x2-50,y2-50,100,100);
		g.drawOval(x3-50,y3-50,100,100);
		g.drawOval(x4-50,y4-50,100,100);
		g.drawOval(x5-50,y5-50,100,100);
		//額外的畫圖程式寫在這裡

		if(mode==1)
			g.fillOval(x1-50,y1-50,100,100); // 黑色的圓
		else
			g.drawOval(x1-50,y1-50,100,100);
		if(mode==2)
			g.fillOval(x2-50,y2-50,100,100);
		else
			g.drawOval(x2-50,y2-50,100,100);
		if(mode==3)
			g.fillOval(x3-50,y3-50,100,100);
		else
			g.drawOval(x3-50,y3-50,100,100);
		if(mode==4)
			g.fillOval(x4-50,y4-50,100,100);
		else
			g.drawOval(x4-50,y4-50,100,100);
		if(mode==5)
			g.fillOval(x5-50,y5-50,100,100);
		else
			g.drawOval(x5-50,y5-50,100,100);
	}
	public void mouseDragged(MouseEvent xxx) { };
	public void mouseMoved(MouseEvent e){ };
	//UI元件事件處理類別寫在這裡
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==botton)
		{
			mt=30;
			ms=0;
			t.start();
		}
		else if (e.getSource()==t)
		{
			mt=mt-0.5;
			mode=rg.nextInt(5)+1;
			index1.setText("剩下:"+mt+"秒");
			repaint();
		}
	}
	public void mouseEntered(MouseEvent e){ }; 
	public void mouseExited(MouseEvent e){ }; 
	public void mousePressed(MouseEvent e)
	{
		int mx,my;
		mx=e.getX();
		my=e.getY();
		if (mode==1)
		{
			if ((x1-mx)*(x1-mx)+(y1-my)*(y1-my)<2500)
			{
				ms=ms+1;
				index2.setText("成績:"+ms);
				mode=0;
				repaint();
			}
		}
		else if (mode==2)
		{
			if ((x2-mx)*(x2-mx)+(y2-my)*(y2-my)<2500)
			{
				ms=ms+1;
				index2.setText("成績:"+ms);
				mode=0;
				repaint();
			}
		}
		else if (mode==3)
		{
			if ((x3-mx)*(x3-mx)+(y3-my)*(y3-my)<2500)
			{
				ms=ms+1;
				index2.setText("成績:"+ms);
				mode=0;
				repaint();
			}
		}
		else if (mode==4)
		{
			if ((x4-mx)*(x4-mx)+(y4-my)*(y4-my)<2500)
			{
				ms=ms+1;
				index2.setText("成績:"+ms);
				mode=0;
				repaint();
			}
		}
		else if (mode==5)
		{
			if ((x5-mx)*(x5-mx)+(y5-my)*(y5-my)<2500)
			{
				ms=ms+1;
				index2.setText("成績:"+ms);
				mode=0;
				repaint();
			}
		}

	};
	public void mouseReleased(MouseEvent e){ };
	public void mouseClicked(MouseEvent e){ };

	//滑鼠事件處理類別寫在這裡
	/***主程式***/
	public static void main(String args[]) //程式起點
	{
		hamster app=new hamster(); //名稱改一改，啟動UI元件
		app.addWindowListener(new WindowAdapter(){ 
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}); //處理視窗關閉要求
	}
}

