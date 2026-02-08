/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.qiufeng.itemsweep.init;

import net.minecraft.world.level.GameRules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class ItemsweepModGameRules {
	public static GameRules.Key<GameRules.IntegerValue> SWEEP_INTERVAL_SECONDS;

	public static void load() {
		SWEEP_INTERVAL_SECONDS = GameRuleRegistry.register("sweepIntervalSeconds", GameRules.Category.PLAYER, GameRuleFactory.createIntRule(120));
	}
}