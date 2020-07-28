package org.loomdev.loom.entity;

import net.minecraft.entity.ItemEntity;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.EntityType;
import org.loomdev.api.entity.Item;
import org.loomdev.api.item.ItemStack;

import java.util.Optional;
import java.util.UUID;

public class ItemImpl extends EntityImpl implements Item {

    public ItemImpl(ItemEntity entity) {
        super(entity);
    }

    @Override
    public @NonNull EntityType getType() {
        return EntityType.ITEM;
    }

    @Override
    public ItemEntity getMinecraftEntity() {
        return (ItemEntity) super.getMinecraftEntity();
    }

    @Override
    public @NonNull Optional<UUID> getOwner() {
        return Optional.ofNullable(getMinecraftEntity().getOwner());
    }

    @Override
    public void setOwner(@Nullable UUID uuid) {
        getMinecraftEntity().setOwner(uuid);
    }

    @Override
    public @NonNull Optional<UUID> getThrower() {
        return Optional.ofNullable(getMinecraftEntity().getThrower());
    }

    @Override
    public void setThrower(@Nullable UUID uuid) {
        getMinecraftEntity().setThrower(uuid);
    }

    @Override
    public @NonNull ItemStack getItemStack() {
        return null; // TODO transform
    }

    @Override
    public void setItemStack(@NonNull ItemStack itemStack) {
        // TODO transform
    }

    @Override
    public int getPickupDelay() {
        return getMinecraftEntity().pickupDelay;
    }

    @Override
    public void setPickupDelay(int ticks) {
        getMinecraftEntity().setPickupDelay(ticks);
    }
}
