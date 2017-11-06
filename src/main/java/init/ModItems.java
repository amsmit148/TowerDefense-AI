package init;

import com.ayanami_.towerdefense.Reference;

import items.ItemObsidianingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item archerTower; //The actual item
	public static Item iceTower;
	public static Item fireTower;
	public static Item cannonTower;
	public static Item wizardTower;
	public static Item obsidianIngot; //This is from the tutorial
	
	public static void init() {
		obsidianIngot = new ItemObsidianingot();
		//archerTower = new ItemArchertower();
		
	}
	public static void register() { 
		ForgeRegistries.ITEMS.register(obsidianIngot);
		
	}
	public static void registerRenders() { 
		registerRender(obsidianIngot);
		
	}
	private static void registerRender(Item item) { 
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	
}
