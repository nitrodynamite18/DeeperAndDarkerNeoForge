package com.kyanite.deeperdarker.content.blocks;

import com.kyanite.deeperdarker.DeeperDarker;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DDBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DeeperDarker.MODID);

    // Echo wood set.
    private static final BlockSetType ECHO_SET = BlockSetType.register(new BlockSetType("echo"));
    public static final WoodType ECHO = WoodType.register(new WoodType("echo", ECHO_SET));
    public static final DeferredBlock<RotatedPillarBlock> ECHO_LOG = BLOCKS.register("echo_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).mapColor(blockState -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.COLOR_LIGHT_GRAY : MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<RotatedPillarBlock> ECHO_WOOD = BLOCKS.register("echo_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ECHO_LOG = BLOCKS.register("stripped_echo_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ECHO_WOOD = BLOCKS.register("stripped_echo_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<Block> ECHO_PLANKS = BLOCKS.registerSimpleBlock("echo_planks", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_LIGHT_GRAY));
    public static final DeferredBlock<StairBlock> ECHO_STAIRS = BLOCKS.register("echo_stairs", () -> new StairBlock(() -> ECHO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<SlabBlock> ECHO_SLAB = BLOCKS.register("echo_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<FenceBlock> ECHO_FENCE = BLOCKS.register("echo_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<FenceGateBlock> ECHO_FENCE_GATE = BLOCKS.register("echo_fence_gate", () -> new FenceGateBlock(ECHO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<DoorBlock> ECHO_DOOR = BLOCKS.register("echo_door", () -> new DoorBlock(ECHO_SET, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<TrapDoorBlock> ECHO_TRAPDOOR = BLOCKS.register("echo_trapdoor", () -> new TrapDoorBlock(ECHO_SET, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<PressurePlateBlock> ECHO_PRESSURE_PLATE = BLOCKS.register("echo_pressure_plate", () -> new PressurePlateBlock(ECHO_SET, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<ButtonBlock> ECHO_BUTTON = BLOCKS.register("echo_button", () -> new ButtonBlock(ECHO_SET, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<LeavesBlock> ECHO_LEAVES = BLOCKS.register("echo_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
}
