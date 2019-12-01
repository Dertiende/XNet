package mcjty.xnet.datagen;

import mcjty.lib.datagen.BaseRecipeProvider;
import mcjty.rftoolsbase.items.ModItems;
import mcjty.xnet.XNet;
import mcjty.xnet.modules.cables.CableSetup;
import mcjty.xnet.modules.various.VariousSetup;
import mcjty.xnet.modules.controller.ControllerSetup;
import mcjty.xnet.modules.facade.FacadeSetup;
import mcjty.xnet.modules.router.RouterSetup;
import mcjty.xnet.modules.wireless.WirelessRouterSetup;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class Recipes extends BaseRecipeProvider {

    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
        add('F', ModItems.MACHINE_FRAME);
        add('A', ModItems.MACHINE_BASE);
        group("xnet");
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        build(consumer, ShapedRecipeBuilder.shapedRecipe(WirelessRouterSetup.ANTENNA)
                        .key('I', Items.IRON_BARS)
                        .addCriterion("bars", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.IRON_BARS)),
                "IiI", "IiI", " i ");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(WirelessRouterSetup.ANTENNA_BASE)
                        .key('I', Items.IRON_BLOCK)
                        .addCriterion("block", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.IRON_BLOCK)),
                " i ", " i ", "iIi");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(WirelessRouterSetup.ANTENNA_DISH)
                        .key('I', Items.IRON_TRAPDOOR)
                        .addCriterion("trapdoor", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.IRON_TRAPDOOR)),
                "III", "IoI", " i ");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(VariousSetup.REDSTONE_PROXY)
                        .addCriterion("frame", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, ModItems.MACHINE_FRAME)),
                "rrr", "rFr", "rrr");

        build(consumer, ShapedRecipeBuilder.shapedRecipe(ControllerSetup.CONTROLLER)
                        .key('I', Items.REPEATER)
                        .key('C', Items.COMPARATOR)
                        .key('g', Tags.Items.INGOTS_GOLD)
                        .addCriterion("frame", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, ModItems.MACHINE_FRAME)),
                "ICI", "rFr", "igi");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(RouterSetup.ROUTER)
                        .key('I', Items.POWERED_RAIL)
                        .key('C', Items.COMPARATOR)
                        .addCriterion("frame", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, ModItems.MACHINE_FRAME)),
                "ICI", "rFr", "ioi");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(WirelessRouterSetup.WIRELESS_ROUTER)
                        .key('C', Items.COMPARATOR)
                        .addCriterion("frame", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, ModItems.MACHINE_FRAME)),
                "oCo", "rFr", "oro");

        build(consumer, ShapedRecipeBuilder.shapedRecipe(FacadeSetup.FACADE, 16)
                        .key('w', ItemTags.WOOL)
                        .addCriterion("glass", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.GLASS)),
                "pwp", "wGw", "pwp");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.NETCABLE_BLUE, 16)
                        .key('g', Tags.Items.NUGGETS_GOLD)
                        .key('s', Items.STRING)
                        .key('1', Tags.Items.DYES_BLUE)
                        .addCriterion("nugget", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.GOLD_NUGGET)),
                "s1s", "rgr", "srs");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.NETCABLE_YELLOW, 16)
                        .key('g', Tags.Items.NUGGETS_GOLD)
                        .key('s', Items.STRING)
                        .key('1', Tags.Items.DYES_YELLOW)
                        .addCriterion("nugget", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.GOLD_NUGGET)),
                "s1s", "rgr", "srs");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.NETCABLE_RED, 16)
                        .key('g', Tags.Items.NUGGETS_GOLD)
                        .key('s', Items.STRING)
                        .key('1', Tags.Items.DYES_RED)
                        .addCriterion("nugget", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.GOLD_NUGGET)),
                "s1s", "rgr", "srs");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.NETCABLE_GREEN, 16)
                        .key('g', Tags.Items.NUGGETS_GOLD)
                        .key('s', Items.STRING)
                        .key('1', Tags.Items.DYES_GREEN)
                        .addCriterion("nugget", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.GOLD_NUGGET)),
                "s1s", "rgr", "srs");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.NETCABLE_ROUTING, 32)
                        .key('g', Tags.Items.NUGGETS_GOLD)
                        .key('s', Items.STRING)
                        .key('1', Tags.Items.DYES_BLACK)
                        .addCriterion("nugget", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.GOLD_NUGGET)),
                "s1s", "rgr", "srs");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.CONNECTOR_BLUE)
                        .key('g', Tags.Items.INGOTS_GOLD)
                        .key('1', Tags.Items.DYES_BLUE)
                        .key('C', Items.CHEST)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "1C1", "rgr", "1r1");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.CONNECTOR_RED)
                        .key('g', Tags.Items.INGOTS_GOLD)
                        .key('1', Tags.Items.DYES_RED)
                        .key('C', Items.CHEST)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "1C1", "rgr", "1r1");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.CONNECTOR_GREEN)
                        .key('g', Tags.Items.INGOTS_GOLD)
                        .key('1', Tags.Items.DYES_GREEN)
                        .key('C', Items.CHEST)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "1C1", "rgr", "1r1");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.CONNECTOR_YELLOW)
                        .key('g', Tags.Items.INGOTS_GOLD)
                        .key('1', Tags.Items.DYES_YELLOW)
                        .key('C', Items.CHEST)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "1C1", "rgr", "1r1");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.CONNECTOR_ROUTING)
                        .key('g', Tags.Items.NUGGETS_GOLD)
                        .key('C', CableSetup.CONNECTOR)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "rrr", "gCg", "rrr");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.ADVANCED_CONNECTOR_BLUE)
                        .key('C', CableSetup.CONNECTOR_BLUE)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "Co", "dr");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.ADVANCED_CONNECTOR_YELLOW)
                        .key('C', CableSetup.CONNECTOR_YELLOW)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "Co", "dr");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.ADVANCED_CONNECTOR_RED)
                        .key('C', CableSetup.CONNECTOR_RED)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "Co", "dr");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.ADVANCED_CONNECTOR_GREEN)
                        .key('C', CableSetup.CONNECTOR_GREEN)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "Co", "dr");
        build(consumer, ShapedRecipeBuilder.shapedRecipe(CableSetup.ADVANCED_CONNECTOR_ROUTING)
                        .key('C', CableSetup.CONNECTOR_ROUTING)
                        .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)),
                "Co", "dr");
        build(consumer, new ResourceLocation(XNet.MODID, "netcable_blue_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.NETCABLE_BLUE)
                .addIngredient(Tags.Items.DYES_BLUE)
                .addIngredient(CableSetup.NETCABLE)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "netcable_red_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.NETCABLE_RED)
                .addIngredient(Tags.Items.DYES_RED)
                .addIngredient(CableSetup.NETCABLE)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "netcable_green_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.NETCABLE_GREEN)
                .addIngredient(Tags.Items.DYES_GREEN)
                .addIngredient(CableSetup.NETCABLE)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "netcable_yellow_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.NETCABLE_YELLOW)
                .addIngredient(Tags.Items.DYES_YELLOW)
                .addIngredient(CableSetup.NETCABLE)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "connector_blue_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.CONNECTOR_BLUE)
                .addIngredient(Tags.Items.DYES_BLUE)
                .addIngredient(CableSetup.CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "connector_red_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.CONNECTOR_RED)
                .addIngredient(Tags.Items.DYES_RED)
                .addIngredient(CableSetup.CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "connector_green_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.CONNECTOR_GREEN)
                .addIngredient(Tags.Items.DYES_GREEN)
                .addIngredient(CableSetup.CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "connector_yellow_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.CONNECTOR_YELLOW)
                .addIngredient(Tags.Items.DYES_YELLOW)
                .addIngredient(CableSetup.CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "advanced_connector_blue_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.ADVANCED_CONNECTOR_BLUE)
                .addIngredient(Tags.Items.DYES_BLUE)
                .addIngredient(CableSetup.ADVANCED_CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "advanced_connector_red_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.ADVANCED_CONNECTOR_RED)
                .addIngredient(Tags.Items.DYES_RED)
                .addIngredient(CableSetup.ADVANCED_CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "advanced_connector_green_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.ADVANCED_CONNECTOR_GREEN)
                .addIngredient(Tags.Items.DYES_GREEN)
                .addIngredient(CableSetup.ADVANCED_CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "advanced_connector_yellow_dye"), ShapelessRecipeBuilder.shapelessRecipe(CableSetup.ADVANCED_CONNECTOR_YELLOW)
                .addIngredient(Tags.Items.DYES_YELLOW)
                .addIngredient(CableSetup.ADVANCED_CONNECTOR)
                .addCriterion("chest", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.CHEST)));
        build(consumer, new ResourceLocation(XNet.MODID, "redstoneproxy_update"), ShapelessRecipeBuilder.shapelessRecipe(VariousSetup.REDSTONE_PROXY_UPD)
                .addIngredient(VariousSetup.REDSTONE_PROXY)
                .addIngredient(Items.REDSTONE_TORCH)
                .addCriterion("torch", InventoryChangeTrigger.Instance.forItems(ModItems.MACHINE_FRAME, Items.REDSTONE_TORCH)));
//        build(consumer, CopyNBTRecipeBuilder.shapedRecipe(PowerCellSetup.CELL3)
//                        .key('K', mcjty.rftoolspower.items.ModItems.POWER_CORE3)
//                        .key('P', PowerCellSetup.CELL2)
//                        .addCriterion("cell", InventoryChangeTrigger.Instance.forItems(PowerCellSetup.CELL2)),
//                "rKr", "KPK", "rKr");
    }
}