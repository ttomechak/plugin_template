package com.screen;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("com.screen")
public interface ScreenConfig extends Config
{
	@ConfigItem(
		keyName = "showScreen",
		name = "Show Screen",
		description = "Puts a dark haze over the game"
	)

	default boolean booleanConfig() { return false; }
}
