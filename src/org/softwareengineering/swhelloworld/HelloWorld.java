package org.softwareengineering.swhelloworld;

import java.nio.ByteBuffer;

import org.softwareengineering.swhelloworld.constants.HelloWorldConstants;
import org.softwareengineering.swhelloworld.encoding.HelloWorldAvailableEncodings;
import org.softwareengineering.swhelloworld.encoding.HelloWorldEncodingFactory;
import org.softwareengineering.swhelloworld.encoding.IHelloWorldEncoding;
import org.softwareengineering.swhelloworld.output.HelloWorldAvailableOutputDevices;
import org.softwareengineering.swhelloworld.output.HelloWorldOutputDeviceFactory;

public class HelloWorld
{
	public static void main(String[] args)
	{
		// Factories
		HelloWorldEncodingFactory encodingFactory = new HelloWorldEncodingFactory();
		HelloWorldOutputDeviceFactory outputFactory = new HelloWorldOutputDeviceFactory();

		// TODO Should pick the desired input encoding from config
		IHelloWorldEncoding helloWorldInputEncoding = encodingFactory.getEncoding(HelloWorldAvailableEncodings.UTF8);
		
		// TODO Should pick the desired Hello World Constant from config -
		// notice that this setting may be different from the encoding
		String helloWorldString = helloWorldInputEncoding.getEncoder().decode(ByteBuffer.wrap(HelloWorldConstants.helloworld_utf8)).toString();

		//TODO Output device selection should also come from encoding
		outputFactory.getOutputDevice(HelloWorldAvailableOutputDevices.CONSOLE).printHelloWorld(helloWorldString);
	}
}
