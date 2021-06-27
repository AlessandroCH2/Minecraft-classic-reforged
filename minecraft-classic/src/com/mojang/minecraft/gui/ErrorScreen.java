package com.mojang.minecraft.gui;

import com.mojang.minecraft.Minecraft;
import com.mojang.minecraft.gui.GuiScreen;
import com.mojang.minecraft.net.NetworkManager;

public final class ErrorScreen extends GuiScreen {

   private String title;
   private String text;
private Minecraft mc2;

   public ErrorScreen(String var1, String var2) {
      this.title = var1;
      this.text = var2;
   }
   public ErrorScreen(String var1, String var2,Minecraft mc) {
	      this.title = var1;
	      this.text = var2;
	      this.mc2 = mc;
	   }
   public final void onOpen() {
	     


	      this.buttons.add(new Button(100, this.width / 2 - 100, this.height / 6 + 168, "Close Minecraft"));
	   }

   public final void render(int var1, int var2) {
      drawFadingBox(0, 0, this.width, this.height, -12574688, -11530224);
      drawCenteredString(this.fontRenderer, this.title, this.width / 2, 90, 16777215);
      drawCenteredString(this.fontRenderer, this.text, this.width / 2, 110, 16777215);
      
     
     
      super.render(var1, var2);
   }
   protected final void onButtonClick(Button var1) {
	      if(var1.active) {
	         
mc2 = Minecraft.instance;
	         if(var1.id == 100) {
	        	// mc2.connectToOtherServer();
	         }

	        

	      }
	   }
   protected final void onKeyPress(char var1, int var2) {}
}
