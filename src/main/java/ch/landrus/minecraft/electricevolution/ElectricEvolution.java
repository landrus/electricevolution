package ch.landrus.minecraft.electricevolution;

import ch.landrus.minecraft.electricevolution.block.EEBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ElectricEvolution.MODID, version = ElectricEvolution.VERSION)
public class ElectricEvolution {
	
    //public static final String MODID = "%{modid}";
	public static final String MODID = "electricevolution";
    //public static final String VERSION = "%{version}";
    public static final String VERSION = "1.0.0";
    
    private EEBlocks blocks;
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	blocks = new EEBlocks();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {		
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(blocks.battery), Blocks.COBBLESTONE, Blocks.PLANKS);
    }
    
}
