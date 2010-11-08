package org.softwareengineering.swhelloworld.output.providers;

import org.softwareengineering.swhelloworld.output.IHelloWorldOutputDevice;

public class HelloWorldOutputDeviceConsole implements IHelloWorldOutputDevice
{
	@Override
	public void printHelloWorld(String helloWorldString)
	{
		System.out.println(helloWorldString);
	}
}
