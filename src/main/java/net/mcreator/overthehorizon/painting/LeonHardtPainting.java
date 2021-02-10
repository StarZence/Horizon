
package net.mcreator.overthehorizon.painting;

@OverthehorizonModElements.ModElement.Tag
public class LeonHardtPainting extends OverthehorizonModElements.ModElement {

	public LeonHardtPainting(OverthehorizonModElements instance) {
		super(instance, 13);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 64).setRegistryName("leon_hardt"));
	}

}
