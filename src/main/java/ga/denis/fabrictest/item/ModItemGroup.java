package ga.denis.fabrictest.item;

import ga.denis.fabrictest.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CRYSTALS = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "crystals"), () -> new ItemStack(ModItems.CHARGED_CRYSTAL));
}
