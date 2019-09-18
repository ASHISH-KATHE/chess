import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
public class M extends Panel implements MouseListener,MouseMotionListener
{
	chess play;
	
	int a,b,flag=0,tflag=0;
	
	M(chess mp)
	{
		play=mp;
	}
	
	int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
			return b;
	}
	int min(int a,int b)
	{
		if(a<b)
		{
			return a;
		}
		else
			return b;
	}
	public void mousePressed(MouseEvent e)
	{
		play.showStatus("Mouse Pressed");
	}
	public void mouseClicked(MouseEvent e)
	{
		if((e.getModifiers()&InputEvent.BUTTON1_MASK)==InputEvent.BUTTON1_MASK)
		{
			
			play.showStatus("left Mouse Button Clicked at "+e.getX()+","+e.getY());
			a=e.getX()/100;
			b=e.getY()/100;
			
			play.row=b;
			play.col=a;
			play.val=play.arr[b][a];
			if(play.d==5){play.d=0;play.repaint();}
			

		}
		else
		{
			a=e.getX()/100;
			b=e.getY()/100;
			if(play.val!=0)
			{
				if((play.val==1&&play.col==a&&play.row==b-1&&play.arr[b][a]==0)||(play.val==7&&play.col==a&&play.row==b+1&&play.arr[b][a]==0))
				{					
						flag=1;					
				}
				else if((play.val==1&&play.col==a&&play.row==b-2&&play.arr[b][a]==0&&play.row==1)||(play.val==7&&play.col==a&&play.row==b+2&&play.arr[b][a]==0&&play.row==6))
				{					
						flag=1;					
				}
				else if(((play.val==1&&play.arr[b][a]>6&&(play.col==a-1||play.col==a+1)&&play.row==b-1)||(play.val==7&&play.arr[b][a]<7&&(play.col==a-1||play.col==a+1)&&play.row==b+1))&&play.arr[b][a]!=0)
				{
					flag=1;
				}
				else if((play.val==2&&(play.col==a||play.row==b)&&(play.arr[b][a]>6||play.arr[b][a]==0))||(play.val==8&&(play.col==a||play.row==b)&&(play.arr[b][a]<7||play.arr[b][a]==0)))
				{
					flag=1;
					if(max(play.col,a)-min(play.col,a)==1||max(play.row,b)-min(play.row,b)==1)
					{
						
					}
					else
					{
							for(int i=min(play.col,a)+1;i<max(play.col,a);i++)
							{
								if(play.arr[b][i]!=0)
								{
									flag=0;
								}
							}
							for(int i=min(play.row,b)+1;i<max(play.row,b);i++)
							{
								if(play.arr[i][a]!=0)
								{
									flag=0;
								}
							}
					}
				}
				else if(play.val==4&&((play.col-a)*(-1)==(play.row-b)||(play.col-a==play.row-b*(-1))||(play.col-a==play.row-b))&&(play.arr[b][a]>6||play.arr[b][a]==0)||(play.val==10&&((play.col-a)*(-1)==(play.row-b)||(play.col-a==play.row-b*(-1))||(play.col-a==play.row-b))&&(play.arr[b][a]<7||play.arr[b][a]==0)))
				{
					flag=1;int v=0,o=0;
					if(min(play.row,b)==play.row&&min(play.col,a)==play.col)
								{
									v=1;o=1;
								}
								else if(min(play.row,b)==b&&min(play.col,a)==play.col)
								{
									v=1;o=-1;
								}
								else if(min(play.row,b)==b&&min(play.col,a)==a)
								{
									v=-1;o=-1;
								}
								else if(min(play.row,b)==play.row&&min(play.col,a)==a)
								{
									v=-1;o=1;
								}
					if(max(play.col,a)-min(play.col,a)==1||max(play.row,b)-min(play.row,b)==1)
					{
						
					}
					else
					{
							int j=play.row+o;int i=play.col+v;
							while((i<max(play.col,a)&&j<max(play.row,b))&&(i>min(play.col,a)&&j>min(play.row,b)))
							{
								if(play.arr[j][i]!=0)
								{
									flag=0;
								}
								i=i+v;
								j=j+o;
								
							}
							
					}
				}
				else if(play.val==6&&((play.col-a)*(-1)==(play.row-b)||(play.col-a==play.row-b*(-1))||(play.col-a==play.row-b)||play.col==a||play.row==b)&&(play.arr[b][a]>6||play.arr[b][a]==0)||(play.val==12&&((play.col-a)*(-1)==(play.row-b)||(play.col-a==play.row-b*(-1))||(play.col-a==play.row-b)||play.col==a||play.row==b)&&(play.arr[b][a]<7||play.arr[b][a]==0)))
				{
					flag=1;
					int v=0,o=0;
					if(min(play.row,b)==play.row&&min(play.col,a)==play.col)
								{
									v=1;o=1;
								}
								else if(min(play.row,b)==b&&min(play.col,a)==play.col)
								{
									v=1;o=-1;
								}
								else if(min(play.row,b)==b&&min(play.col,a)==a)
								{
									v=-1;o=-1;
								}
								else if(min(play.row,b)==play.row&&min(play.col,a)==a)
								{
									v=-1;o=1;
								}
					if(max(play.col,a)-min(play.col,a)==1||max(play.row,b)-min(play.row,b)==1)
					{
						
					}
					else
					{
						if(play.col==a||play.row==b)
						{
							for(int i=min(play.col,a)+1;i<max(play.col,a);i++)
							{
								if(play.arr[b][i]!=0)
								{
									flag=0;
								}
							}
							for(int i=min(play.row,b)+1;i<max(play.row,b);i++)
							{
								if(play.arr[i][a]!=0)
								{
									flag=0;
								}
							}
						}
							else if(play.col!=a&&play.row!=b){
							int j=play.row+o;int i=play.col+v;
							while((i<max(play.col,a)&&j<max(play.row,b))&&(i>min(play.col,a)&&j>min(play.row,b)))
							{
								if(play.arr[j][i]!=0)
								{
									flag=0;
								}
								i=i+v;
								j=j+o;
								
							}}
					}
				}
				else if(play.val==3&&((play.col==a+2&&play.row==b+1)||(play.col==a-2&&play.row==b+1)||(play.col==a-2&&play.row==b-1)||(play.col==a+2&&play.row==b-1)||(play.col==a-1&&play.row==b-2)||(play.col==a-1&&play.row==b+2)||(play.col==a+1&&play.row==b-2)||(play.col==a+1&&play.row==b+2))&&(play.arr[b][a]>6||play.arr[b][a]==0)||(play.val==9&&((play.col==a+2&&play.row==b+1)||(play.col==a-2&&play.row==b+1)||(play.col==a-2&&play.row==b-1)||(play.col==a+2&&play.row==b-1)||(play.col==a-1&&play.row==b-2)||(play.col==a-1&&play.row==b+2)||(play.col==a+1&&play.row==b-2)||(play.col==a+1&&play.row==b+2))&&(play.arr[b][a]<7||play.arr[b][a]==0)))
				{
					flag=1;
				}
				else if(play.val==5&&(play.col==a||play.col==a||play.col==a+1||play.col==a-1)&&(play.row==b||play.row==b||play.row==b+1||play.row==b-1)&&(play.arr[b][a]>6||play.arr[b][a]==0)||(play.val==11&&(play.col==a||play.col==a||play.col==a+1||play.col==a-1)&&(play.row==b||play.row==b||play.row==b+1||play.row==b-1)&&(play.arr[b][a]<7||play.arr[b][a]==0)))
				{
					flag=1;
				}
				if(flag==1&&tflag==0&&play.val<7)
				{
					play.arr[b][a]=play.val;
					play.val=0;
					play.arr[play.row][play.col]=0;
					flag=0;
					tflag=1;play.repaint();
				}
				else if(flag==1&&tflag==1&&play.val>6)
				{
					play.arr[b][a]=play.val;
					play.val=0;
					play.arr[play.row][play.col]=0;
					flag=0;
					tflag=0;play.repaint();
				}
				
			play.a=0;
			play.b=0;
			for(int i=0;i<8;i++)
			{
				for(int j=0;j<8;j++)
				{
						if(play.arr[i][j]==5)
						{
							play.a=5;
						}
						else if(play.arr[i][j]==11)
						{
							play.b=11;
						}
				}
			}
			play.showStatus("mouse  right released at "+e.getX()+","+e.getY());
			if(play.b==0)
			{
				play.d=1;
			}
			if(play.a==0)
			{
				play.d=2;
			}
			}
			
		}
	}
		public void mouseReleased(MouseEvent e)
		{
			play.showStatus("mouse released at "+e.getX()+","+e.getY());
		}
		public void mouseEntered(MouseEvent e)
		{
			play.showStatus("mouse Entered");
		}
		public void mouseExited(MouseEvent e)
		{
			play.showStatus("mouse Exited");
		}
		public void mouseDragged(MouseEvent e)
		{
			play.showStatus("mouse Dragged");
		}
		public void mouseMoved(MouseEvent e)
		{
			play.showStatus("mouse moved");
		}
	
	}
	
