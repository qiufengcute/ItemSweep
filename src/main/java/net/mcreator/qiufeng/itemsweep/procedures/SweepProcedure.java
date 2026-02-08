package net.mcreator.qiufeng.itemsweep.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.ChatFormatting;

import net.mcreator.qiufeng.itemsweep.network.ItemsweepModVariables;
import net.mcreator.qiufeng.itemsweep.init.ItemsweepModGameRules;
import net.mcreator.qiufeng.itemsweep.event.PlayerEvents;

public class SweepProcedure {
	public static boolean eventResult = true;

	public SweepProcedure() {
		PlayerEvents.END_PLAYER_TICK.register(entity -> {
			execute(entity.level());
		});
	}

	public static void execute(LevelAccessor world) {
		if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 600) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] 30 " + Component.translatable("sweep.remaining").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 200) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] 10 " + Component.translatable("sweep.remaining").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 100) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] 5 " + Component.translatable("sweep.remaining").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 60) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] 3 " + Component.translatable("sweep.remaining").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 40) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] 2 " + Component.translatable("sweep.remaining").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 20) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] 1 " + Component.translatable("sweep.remaining").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
		} else if (ItemsweepModVariables.MapVariables.get(world).SweepSeconds == 0) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"kill @e[type=item]");
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("[ItemSweep] " + Component.translatable("sweep.end").getString())).withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
			ItemsweepModVariables.MapVariables.get(world).SweepSeconds = (world instanceof ServerLevel _serverLevelGR15 ? _serverLevelGR15.getGameRules().getInt(ItemsweepModGameRules.SWEEP_INTERVAL_SECONDS) : 0) * 20;
			ItemsweepModVariables.MapVariables.get(world).markSyncDirty();
		}
		ItemsweepModVariables.MapVariables.get(world).SweepSeconds = ItemsweepModVariables.MapVariables.get(world).SweepSeconds - 1;
		ItemsweepModVariables.MapVariables.get(world).markSyncDirty();
	}
}