import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.applet.*;

public class chess extends Applet{
	
			Image img,img1,img2,img3,img4,p,p1,r,r1,b2,b1,q,q1,k,k1,kn,kn1,img9;
			
		int arr[][]=new int[8][8];
			int c=0,f=0,col,row,val=0,a=5,b=11,d=5;
			
		public void init()
		{
			img2=getImage(getDocumentBase(),"e.jpg");
			img9=getImage(getDocumentBase(),"wall.jpg");img3=getImage(getDocumentBase(),"j.jpg");
			img=getImage(getDocumentBase(),"chess.jpg");
			p=getImage(getDocumentBase(),"p.png");p1=getImage(getDocumentBase(),"p1.png");
			b2=getImage(getDocumentBase(),"b.png");b1=getImage(getDocumentBase(),"b1.png");
			r=getImage(getDocumentBase(),"r.png");r1=getImage(getDocumentBase(),"r1.png");
			kn=getImage(getDocumentBase(),"kn.png");kn1=getImage(getDocumentBase(),"kn1.png");
			k=getImage(getDocumentBase(),"k.png");k1=getImage(getDocumentBase(),"k1.png");
			q=getImage(getDocumentBase(),"q.png");q1=getImage(getDocumentBase(),"q1.png");
			addMouseListener(new M(this));
			addMouseMotionListener(new M(this));
			arr[0][0]=2;
            arr[0][1]=3;
            arr[0][2]=4;
            arr[0][3]=6;
            arr[0][4]=5;
            arr[0][5]=4;
            arr[0][6]=3;
            arr[0][7]=2;
            arr[7][0]=8;
            arr[7][1]=9;
            arr[7][2]=10;
            arr[7][3]=12;
            arr[7][4]=11;
            arr[7][5]=10;
            arr[7][6]=9;
            arr[7][7]=8;
            arr[1][0]=1;arr[1][1]=1;arr[1][2]=1;arr[1][3]=1;arr[1][4]=1;arr[1][5]=1;arr[1][6]=1;arr[1][7]=1;
            arr[6][0]=7;arr[6][1]=7;arr[6][2]=7;arr[6][3]=7;arr[6][4]=7;arr[6][5]=7;arr[6][6]=7;arr[6][7]=7;
            arr[5][0]=0;arr[5][1]=0;arr[5][2]=0;arr[5][3]=0;arr[5][4]=0;arr[5][5]=0;arr[5][6]=0;arr[5][7]=0;
            arr[4][0]=0;arr[4][1]=0;arr[4][2]=0;arr[4][3]=0;arr[4][4]=0;arr[4][5]=0;arr[4][6]=0;arr[4][7]=0;
            arr[3][0]=0;arr[3][1]=0;arr[3][2]=0;arr[3][3]=0;arr[3][4]=0;arr[3][5]=0;arr[3][6]=0;arr[3][7]=0;
            arr[2][0]=0;arr[2][1]=0;arr[2][2]=0;arr[2][3]=0;arr[2][4]=0;arr[2][5]=0;arr[2][6]=0;arr[2][7]=0;
			
		}
			
			public void paint (Graphics g)
			{
				if(d==5)
				{
					g.drawImage(img9,0,0,800,800,this);
					
				}
				if(d==0){
					g.drawImage(img,0,0,800,800,this);
				for(int j=0;j<8;j++)
				{
					for(int i=0;i<8;i++)
					{
						if(arr[i][j]!=0)
						{
							int a,b;
							a=(i*100+(i+1)*100)/2;
							b=(j*100+(j+1)*100)/2;
							
							if(arr[i][j]==2)
							{
								
								g.drawImage(r,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==1)
							{
								
								g.drawImage(p,b-48,a-48,95,95,this);
							}

							else if(arr[i][j]==3)
							{
								
								g.drawImage(kn,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==4)
							{
								
								g.drawImage(b2,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==5)
							{
								
								g.drawImage(k,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==6)
							{
								
								g.drawImage(q,b-48,a-48,95,95,this);
							}
							
							if(arr[i][j]==7)
							{
								
								g.drawImage(p1,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==8)
							{
								
								g.drawImage(r1,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==9)
							{
								
								g.drawImage(kn1,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==10)
							{
								
								g.drawImage(b1,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==11)
							{
								
								g.drawImage(k1,b-48,a-48,95,95,this);
							}
							else if(arr[i][j]==12)
							{
								
								g.drawImage(q1,b-48,a-48,95,95,this);
							}
						}
					}
				}

				}
				if(d==1)
				{
					g.drawImage(img2,200,150,400,400,this);
				}
				if(d==2)
				{
					g.drawImage(img3,200,150,400,400,this);
				}
			}
			
	
		
		}
	
