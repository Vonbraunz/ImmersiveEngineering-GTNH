package cofh.lib.util.helpers;

import net.minecraft.util.DamageSource;

public class DamageHelper {

    public static DamageSource cryotheum = new DamageSource("cryotheum").setDamageBypassesArmor();

    public static DamageSource pyrotheum = new DamageSource("pyrotheum").setDamageBypassesArmor().setFireDamage();
}
