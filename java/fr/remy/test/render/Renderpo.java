package fr.remy.test.render;

import org.lwjgl.opengl.GL11;

import fr.remy.test.references;
import fr.remy.test.model.ModelMun;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class Renderpo extends Render {
    
    private static final ResourceLocation texture = new ResourceLocation(references.MOD_ID, "textures/items/pgun.png");
     private ModelBase model;
  
     public Renderpo()
     {
         model = new ModelMun();
     }
  
     @Override
     public ResourceLocation getEntityTexture(Entity entity)
     {
         return texture;
     }
  
     @Override
     public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick)
     {
         GL11.glPushMatrix();
         bindTexture(texture);
         GL11.glTranslated(x, y - 1.25D, z);
         model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
         GL11.glPopMatrix();
     }

}