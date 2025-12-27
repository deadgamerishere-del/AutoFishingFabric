
package autofishing;

import net.fabricmc.api.ClientModInitializer;

public class AutoFishingFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("AutoFishingFabric loaded");
    }
}
