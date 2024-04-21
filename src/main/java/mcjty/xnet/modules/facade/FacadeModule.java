package mcjty.xnet.modules.facade;

import mcjty.lib.datagen.DataGen;
import mcjty.lib.datagen.Dob;
import mcjty.lib.modules.IModule;
import mcjty.lib.setup.DeferredBlock;
import mcjty.lib.setup.DeferredItem;
import mcjty.xnet.modules.cables.blocks.GenericCableBlock;
import mcjty.xnet.modules.facade.blocks.FacadeBlock;
import mcjty.xnet.modules.facade.blocks.FacadeBlockItem;
import mcjty.xnet.modules.facade.blocks.FacadeTileEntity;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.function.Supplier;

import static mcjty.lib.datagen.DataGen.has;
import static mcjty.xnet.XNet.tab;
import static mcjty.xnet.apiimpl.Constants.ITEM_FACADE;
import static mcjty.xnet.setup.Registration.BLOCKS;
import static mcjty.xnet.setup.Registration.ITEMS;
import static mcjty.xnet.setup.Registration.TILES;

public class FacadeModule implements IModule {

    public static final DeferredBlock<FacadeBlock> FACADE = BLOCKS.register(ITEM_FACADE, () -> new FacadeBlock(GenericCableBlock.CableBlockType.FACADE)); // @todo 1.14
    public static final DeferredItem<Item> FACADE_ITEM = ITEMS.register(ITEM_FACADE, tab(() -> new FacadeBlockItem(FACADE.get())));
    public static final Supplier<BlockEntityType<?>> TYPE_FACADE = TILES.register(ITEM_FACADE, () -> BlockEntityType.Builder.of(FacadeTileEntity::new, FACADE.get()).build(null));

    @Override
    public void init(FMLCommonSetupEvent event) {

    }

    @Override
    public void initClient(FMLClientSetupEvent event) {
    }

    @Override
    public void initConfig(IEventBus bus) {

    }

    @Override
    public void initDatagen(DataGen dataGen) {
        dataGen.add(
                Dob.blockBuilder(FACADE)
                        .ironPickaxeTags()
                        .shaped(builder -> builder
                                        .define('w', ItemTags.WOOL)
                                        .unlockedBy("glass", has(Items.GLASS)),
                                16,
                                "pwp", "wGw", "pwp")
        );
    }
}
