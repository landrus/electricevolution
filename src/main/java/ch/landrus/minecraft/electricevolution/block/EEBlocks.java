package ch.landrus.minecraft.electricevolution.block;

import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EEBlocks {
	
	public BatteryBlock battery;
	
	public EEBlocks() {
		battery = new BatteryBlock();
		GameRegistry.register(battery.setRegistryName("battery"));
		GameRegistry.register(new ItemBlock(battery).setRegistryName(battery.getRegistryName()));
	}

}
