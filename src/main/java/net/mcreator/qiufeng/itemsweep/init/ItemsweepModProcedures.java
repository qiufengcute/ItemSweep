/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.qiufeng.itemsweep.init;

import net.mcreator.qiufeng.itemsweep.procedures.SweepProcedure;
import net.mcreator.qiufeng.itemsweep.procedures.SweepInitProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ItemsweepModProcedures {
	public static void load() {
		new SweepInitProcedure();
		new SweepProcedure();
	}
}