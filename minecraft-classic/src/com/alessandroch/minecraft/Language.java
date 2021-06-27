package com.alessandroch.minecraft;

import java.util.HashMap;

import com.mojang.minecraft.Minecraft;

public abstract class Language {

	public String langName = "English";
	public HashMap textes;
	public static Language getLanguage() 
	{
		return Minecraft.instance.getLang();
	}
	public Language(String langName) 
	{
		this.langName = langName;
		this.textes = new HashMap<String, String>();
		loadTextes();
	}

	protected abstract void loadTextes();
	public String getText(String string) {
		return (String) textes.get(string);
	}
}
