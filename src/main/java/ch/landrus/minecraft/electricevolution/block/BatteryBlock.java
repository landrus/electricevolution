package ch.landrus.minecraft.electricevolution.block;

import javax.annotation.Nonnull;

import ch.landrus.minecraft.electricevolution.state.BatteryVariant;
import ch.landrus.minecraft.electricevolution.state.StateProperties;
import ch.landrus.minecraft.electricevolution.tile.BatteryTile;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BatteryBlock extends Block {
	
	public BatteryBlock() {
		super(Material.ROCK);
		setHardness(2.0F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setDefaultState(blockState.getBaseState().withProperty(StateProperties.BATTERY_VARIANT, BatteryVariant.DEFAULT));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, StateProperties.BATTERY_VARIANT);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(StateProperties.BATTERY_VARIANT).ordinal();
	}

	@Nonnull
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(StateProperties.BATTERY_VARIANT, BatteryVariant.DEFAULT);
	}

	@Override
	public TileEntity createTileEntity(World worldIn, IBlockState state) {
		return new BatteryTile();
	}

}
