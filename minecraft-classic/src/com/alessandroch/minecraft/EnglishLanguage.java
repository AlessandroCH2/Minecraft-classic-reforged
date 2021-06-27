package com.alessandroch.minecraft;

public class EnglishLanguage extends Language {

	public EnglishLanguage(String langName) {
		super(langName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void loadTextes() {
		textes.put("language_setting", "Language");
		textes.put("options_setting", "Options...");	
		textes.put("music_setting", "Music");
		textes.put("fpsshow_setting", "Show FPS");
		textes.put("renderdistance_setting", "Render Distance");
		textes.put("controls_setting", "Controls...");
		textes.put("controls_menuname", "Controls");
		textes.put("back_to_game", "Back to game");
		textes.put("done", "Done");
		textes.put("options_setting", "Options...");	
		textes.put("on", "ON");	
		textes.put("off", "OFF");	
	}

}
