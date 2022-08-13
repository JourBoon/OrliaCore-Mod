package orliacore.main;

import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModOrliaCore.MODID, name = "orliacore", version = "1.0", acceptedMinecraftVersions = "[1.12.2]")
public class ModOrliaCore {
	

	 public static final String MODID = "orliacore";
	 
	 @Instance(ModOrliaCore.MODID)
	    public static ModOrliaCore instance;
	 
	 @SidedProxy(clientSide = "orliacore.main.OrliaCoreClient", serverSide = "� modifier ensuite")
	    public static OrliaCoreCommonProxy proxy;
	 
	    public static Logger logger;
	 
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        logger = event.getModLog();
	        proxy.preInit(event.getSuggestedConfigurationFile());
	        Display.setTitle("OrliaMC | Beta V.1");
	    }
	 
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	    	proxy.init();
	    }
	    
}
