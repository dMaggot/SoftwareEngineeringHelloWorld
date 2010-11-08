package org.softwareengineering.swhelloworld.encoding.providers;

import java.nio.charset.Charset;

import org.softwareengineering.swhelloworld.encoding.IHelloWorldEncoding;

public class HelloWorldEncodingUTFISO88591 implements IHelloWorldEncoding
{
	@Override
	public Charset getEncoder()
	{
		return Charset.forName("ISO-8859-1");
	}
}
