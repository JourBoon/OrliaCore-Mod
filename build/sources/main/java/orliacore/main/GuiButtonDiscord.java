package orliacore.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
 
public class GuiButtonDiscord extends GuiButton
{
    private static final ResourceLocation DISCORD_ICON = new ResourceLocation(ModOrliaCore.MODID, "textures/gui/discord.png");
    private static final ResourceLocation DISCORD_HOVER_ICON = new ResourceLocation(ModOrliaCore.MODID, "textures/gui/discord_hover.png");
	private int xPosition;
	private int yPosition;
 
    public GuiButtonDiscord(int buttonId, int x, int y)
    {
        super(buttonId, x, y, 20, 20, ""); // taille de 20x20, pas de nom
    }
 
    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if(this.visible)
        {
            boolean mouseHover = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            if(mouseHover) // si la souris est sur le bouton
            {
                mc.getTextureManager().bindTexture(DISCORD_HOVER_ICON);
            }
            else
            {
                mc.getTextureManager().bindTexture(DISCORD_ICON);
            }
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            Gui.drawScaledCustomSizeModalRect(this.xPosition, this.yPosition, 0, 0, 128, 128, 20, 20, 128, 128);
        }
    }
}
