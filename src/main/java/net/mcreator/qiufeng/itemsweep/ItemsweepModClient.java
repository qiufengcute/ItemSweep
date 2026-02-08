package net.mcreator.qiufeng.itemsweep;

import net.mcreator.qiufeng.itemsweep.network.ItemsweepModVariables;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class ItemsweepModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		ClientPlayNetworking.registerGlobalReceiver(ItemsweepModVariables.SavedDataSyncMessage.TYPE, ItemsweepModVariables.SavedDataSyncMessage::handleData);
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}