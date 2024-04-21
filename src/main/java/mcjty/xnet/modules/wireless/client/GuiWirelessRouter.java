package mcjty.xnet.modules.wireless.client;

import mcjty.lib.container.GenericContainer;
import mcjty.lib.gui.GenericGuiContainer;
import mcjty.lib.gui.Window;
import mcjty.xnet.XNet;
import mcjty.xnet.modules.wireless.WirelessRouterModule;
import mcjty.xnet.modules.wireless.blocks.TileEntityWirelessRouter;
import net.minecraft.client.gui.GuiGraphics;
import mcjty.xnet.setup.XNetMessages;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import javax.annotation.Nonnull;

public class GuiWirelessRouter extends GenericGuiContainer<TileEntityWirelessRouter, GenericContainer> {

    public GuiWirelessRouter(TileEntityWirelessRouter router, GenericContainer container, Inventory inventory) {
        super(router, container, inventory, WirelessRouterModule.WIRELESS_ROUTER.get().getManualEntry());
    }

    public static void register() {
        register(WirelessRouterModule.CONTAINER_WIRELESS_ROUTER.get(), GuiWirelessRouter::new);
    }

    @Override
    public void init() {
        window = new Window(this, tileEntity, new ResourceLocation(XNet.MODID, "gui/wireless_router.gui"));
        super.init();
    }


    @Override
    protected void renderBg(@Nonnull GuiGraphics graphics, float partialTicks, int mouseX, int mouseY) {
        drawWindow(graphics);
    }
}
