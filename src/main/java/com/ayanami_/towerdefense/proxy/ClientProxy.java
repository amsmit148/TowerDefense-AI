package com.ayanami_.towerdefense.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		
	}

}
