package ga.denis.fabrictest.item;

import ga.denis.fabrictest.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item DISCHARGED_CRYSTAL = registerItem("discharged_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.CRYSTALS)));

    public static final Item CHARGED_CRYSTAL = registerItem("charged_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.CRYSTALS)));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.debug("Registering ModItems for " + TestMod.MOD_ID);
    }
}