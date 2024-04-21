package mcjty.xnet.modules.facade;

import mcjty.lib.varia.NBTTools;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

import static mcjty.xnet.apiimpl.Constants.TAG_MIMIC;

public class MimicBlockSupport {

    @Nullable
    private BlockState mimicBlock = null;

    @Nullable
    public BlockState getMimicBlock() {
        return mimicBlock;
    }

    public void setMimicBlock(@Nullable BlockState mimicBlock) {
        this.mimicBlock = mimicBlock;
    }


    public void readFromNBT(CompoundTag tagCompound) {
        if (tagCompound != null && tagCompound.contains(TAG_MIMIC)) {
            mimicBlock = NBTTools.readBlockState(tagCompound.getCompound(TAG_MIMIC));
        } else {
            mimicBlock = null;
        }
    }

    public void writeToNBT(CompoundTag tagCompound) {
        if (mimicBlock != null) {
            CompoundTag tag = NbtUtils.writeBlockState(mimicBlock);
            tagCompound.put(TAG_MIMIC, tag);
        }
    }
}
