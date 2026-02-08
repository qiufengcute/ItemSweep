package net.mcreator.qiufeng.itemsweep.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.qiufeng.itemsweep.network.ItemsweepModVariables;
import net.mcreator.qiufeng.itemsweep.init.ItemsweepModGameRules;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;

public class SweepInitProcedure {
	public static boolean eventResult = true;

	public SweepInitProcedure() {
		ServerWorldEvents.LOAD.register((server, world) -> {
			execute(world);
		});
	}

	public static void execute(LevelAccessor world) {
		ItemsweepModVariables.MapVariables.get(world).SweepSeconds = (world instanceof ServerLevel _serverLevelGR0 ? _serverLevelGR0.getGameRules().getInt(ItemsweepModGameRules.SWEEP_INTERVAL_SECONDS) : 0) * 20;
		ItemsweepModVariables.MapVariables.get(world).markSyncDirty();
	}
}