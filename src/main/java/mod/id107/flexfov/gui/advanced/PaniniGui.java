package mod.id107.flexfov.gui.advanced;

import java.util.List;

import mod.id107.flexfov.projection.Panini;
import mod.id107.flexfov.projection.Projection;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class PaniniGui implements Advanced {

	@Override
	public void initGui(List<GuiButton> buttonList, int width, int height) {
		
	}

	@Override
	public void actionPerformed(GuiButton guiButton, GuiScreen parentScreen) {
		
	}

	@Override
	public Projection getProjection() {
		return new Panini();
	}

}
