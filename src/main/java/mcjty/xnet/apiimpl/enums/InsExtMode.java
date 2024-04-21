package mcjty.xnet.apiimpl.enums;

import mcjty.lib.varia.ComponentFactory;
import mcjty.lib.gui.ITranslatableEnum;
import mcjty.xnet.utils.I18nUtils;

public enum InsExtMode implements ITranslatableEnum<InsExtMode> {
    INS("xnet.enum.insextmode.ins"),
    EXT("xnet.enum.insextmode.ext");

    private final String i18n;

    InsExtMode(String i18n) {
        this.i18n = i18n;
    }

    @Override
    public String getI18n() {
        return ComponentFactory.translatable(i18n).getString();
    }

    @Override
    public String[] getI18nSplitedTooltip() {
        return I18nUtils.getSplitedEnumTooltip(i18n);
    }
}
