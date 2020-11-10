package com.screen;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
		name = "Screen",
		description = "Puts a screen over the game",
		tags = {"random", "other"},
		loadWhenOutdated = true,
		enabledByDefault = false
)
public class ScreenPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ScreenConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Provides
	ScreenConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ScreenConfig.class);
	}
}
