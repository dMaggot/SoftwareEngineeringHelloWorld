package org.softwareengineering.swhelloworld.output;

import org.softwareengineering.swhelloworld.output.providers.HelloWorldOutputDeviceConsole;

public class HelloWorldOutputDeviceFactory
{
	public IHelloWorldOutputDevice getOutputDevice(HelloWorldAvailableOutputDevices device)
	{
		switch (device)
		{
		case CONSOLE:
		default:
			return new HelloWorldOutputDeviceConsole();
		}
	}
}
