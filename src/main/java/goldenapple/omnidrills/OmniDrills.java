package goldenapple.omnidrills;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import goldenapple.omnidrills.init.ModItems;
import goldenapple.omnidrills.reference.Reference;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class OmniDrills {
    @Mod.Instance
    public static OmniDrills instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
