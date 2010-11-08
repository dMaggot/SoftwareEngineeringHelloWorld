package org.softwareengineering.swhelloworld.encoding.providers;

import java.nio.charset.Charset;

import org.softwareengineering.swhelloworld.encoding.IHelloWorldEncoding;

public class HelloWorldEncodingUTF8 implements IHelloWorldEncoding
{
	@Override
	public Charset getEncoder()
	{
		return Charset.forName("UTF-8");
	}
}
