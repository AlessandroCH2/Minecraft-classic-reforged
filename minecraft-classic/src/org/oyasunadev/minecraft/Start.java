package org.oyasunadev.minecraft;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: Oliver Yasuna
 * Date: 9/23/12
 * Time: 4:04 PM
 */
public class Start
{
	public static void main(String[] args)
	{
		new Start(args);
	}

	public Start(String[] args)
	{
		System.setProperty("org.lwjgl.librarypath", "C:\\ClassicReforged\\lwjgl");
	
		System.load("C:\\ClassicReforged\\opengl32.dll");

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		SPFrame spFrame = new SPFrame();

		spFrame.setVisible(true);

		spFrame.startMinecraft(args[1],args[0]);
		spFrame.finish();
	}
}
