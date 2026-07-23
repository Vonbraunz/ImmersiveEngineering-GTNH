package thaumcraft.api.damagesource;

import net.minecraft.util.DamageSource;

public class DamageSourceThaumcraft extends DamageSource
{
	public static DamageSource dissolve = new DamageSourceThaumcraft("dissolve");

	protected DamageSourceThaumcraft(String damageType)
	{
		super(damageType);
	}
}
