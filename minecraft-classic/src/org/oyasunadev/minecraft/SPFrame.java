package org.oyasunadev.minecraft;

import com.mojang.minecraft.Minecraft;
import com.mojang.minecraft.MinecraftApplet$1;

import javax.swing.*;
import java.awt.*;

public final class SPFrame extends JFrame
{
	public SPFrame()
	{
		setTitle("Minecraft Classic - Reforged");
		setSize(800,500);
	
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;

		if(getWidth() == width && getHeight() == height)
		{
		 	setUndecorated(true);
		}
	}

	public void startMinecraft(String username,String svip)
	{
		MCApplet applet = new MCApplet();
		MinecraftApplet$1 canvas = new MinecraftApplet$1(applet);
      canvas.setSize(getWidth(), getHeight());
		Minecraft minecraft = new Minecraft(canvas, applet, getWidth(), getHeight(),false,username,"no need",svip);
      
		canvas.setSize(getWidth(), getHeight());
       
		add(canvas);
        
		pack();

		new Thread(minecraft).start();
		
	}

	public void finish()
	{
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getWidth()),
				(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) );
	}
}
