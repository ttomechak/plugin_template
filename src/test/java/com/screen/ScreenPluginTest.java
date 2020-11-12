package com.screen;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ScreenPluginTest
{
	@Test
	void shouldShowSimpleAssertion(){
		Assertions.assertEquals(1, 1);
	}

	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ScreenPlugin.class);
		RuneLite.main(args);
	}

}