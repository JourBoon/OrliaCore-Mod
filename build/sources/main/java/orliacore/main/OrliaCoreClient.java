package orliacore.main;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OrliaCoreClient extends OrliaCoreCommonProxy{
	Minecraft mc = Minecraft.getMinecraft();
	
	@Override
    public void preInit(File configFile)
    {
        
        super.preInit(configFile);
        System.out.println("pre init c�t� client");
    }
 
    @Override
    public void init()
    {
    	MinecraftForge.EVENT_BUS.register(this);
        super.init();
    }
    
    @SubscribeEvent
    public void onOpenGuiMain(GuiOpenEvent event)
    {
        if(event.getGui() != null && event.getGui().getClass() == GuiMainMenu.class)
        {
            event.setGui(new GuiCustomMainMenu());
        }
    }
    
    @SubscribeEvent
    public void onOpenGuiIngame(GuiOpenEvent event)
    {
        if(event.getGui() != null && event.getGui().getClass() == GuiIngameMenu.class)
        {
            event.setGui(new GuiCustomIngameMenu());
        }
    }
    


  

}
