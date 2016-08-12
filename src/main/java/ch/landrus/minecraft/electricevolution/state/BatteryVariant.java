package ch.landrus.minecraft.electricevolution.state;

import java.util.Locale;

import net.minecraft.util.IStringSerializable;

public enum BatteryVariant implements IStringSerializable {

	DEFAULT;

	@Override
	public String getName() {
		return name().toLowerCase(Locale.ROOT);
	}
	
}
