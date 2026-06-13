package net.davio.create_aquatic_ambitions.compat.rei.category;

import com.simibubi.create.compat.rei.category.ProcessingViaFanCategory;
import com.simibubi.create.compat.rei.category.animations.AnimatedKinetics;

import com.simibubi.create.foundation.gui.AllGuiTextures;
import net.createmod.catnip.gui.element.GuiGameElement;
import net.davio.create_aquatic_ambitions.compat.rei.category.animations.AnimatedConduit;
import net.davio.create_aquatic_ambitions.kinetics.fan.processing.ChannelingRecipe;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.level.block.Blocks;

public class FanChannelingCategory extends ProcessingViaFanCategory.MultiOutput<ChannelingRecipe> {

	private final AnimatedConduit conduit = new AnimatedConduit();

	public FanChannelingCategory(Info<ChannelingRecipe> info) {
		super(info);
	}

	@Override
	protected AllGuiTextures getBlockShadow() {
		return AllGuiTextures.JEI_LIGHT;
	}

	@Override
	protected void renderAttachedBlock(GuiGraphics graphics) {
		conduit.draw(graphics, 0, 0);
	}
}
