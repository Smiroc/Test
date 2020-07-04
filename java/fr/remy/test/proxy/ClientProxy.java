package fr.remy.test.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.remy.test.entity.EntityPotatoArrow;
import fr.remy.test.render.Renderpo;

public class ClientProxy extends CommonProxy
{
// classe chargée seulement par le client
		@Override
		public void registerRenders()
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityPotatoArrow.class, new Renderpo());
		}
}