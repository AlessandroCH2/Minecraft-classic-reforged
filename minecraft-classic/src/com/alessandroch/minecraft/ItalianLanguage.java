package com.alessandroch.minecraft;

public class ItalianLanguage extends Language {

	public ItalianLanguage(String langName) {
		super(langName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void loadTextes() {
		textes.put("language_setting", "Lingua");
		textes.put("options_setting", "Opzioni...");	
		textes.put("music_setting", "Musica");
		textes.put("fpsshow_setting", "Mostra FPS");
		textes.put("renderdistance_setting", "Distanza di Render");
		textes.put("controls_setting", "Controlli...");
		textes.put("controls_menuname", "Controlli");
		textes.put("back_to_game", "Ritorna al gioco");
		textes.put("done", "Fatto");
		textes.put("on", "ATTIVO");	
		textes.put("off", "DISATTIVO");	
	}

}
