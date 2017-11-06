package com.ayanami_.towerdefense;

public class Reference {
	public static final String MOD_ID = "atdm";
	public static final String NAME = "Tower Defense";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";

	public static final String CLIENT_PROXY_CLASS = "com.ayanami_.towerdefense.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.ayanami_.towerdefense.proxy.ServerProxy";

	public static enum towerDefenseItems { 
		OBSIDIANINGOT("obsidianIngot", "ItemObsidianingot");
		//ARCHERTOWER("archerTower", "ItemArchertower");
		
		private String unlocalizedName;
		private String registryName;
		
		towerDefenseItems(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		}
		
		public String getunlocalizedName() {
			return unlocalizedName;
		}
		
		public String getregistryName() {
			return registryName;
		}
	}
		
}
