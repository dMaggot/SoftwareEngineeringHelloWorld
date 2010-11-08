package org.softwareengineering.swhelloworld.encoding;

import org.softwareengineering.swhelloworld.encoding.providers.*;

public class HelloWorldEncodingFactory
{
	public IHelloWorldEncoding getEncoding(HelloWorldAvailableEncodings encoding)
	{

		switch (encoding)
		{
		case UTF16:
			return new HelloWorldEncodingUTF16();
		case UTF8:
			return new HelloWorldEncodingUTF8();
		case ISO88591:
			return new HelloWorldEncodingUTFISO88591();
		case ASCII:
		default:
			return new HelloWorldEncodingASCII();
		}
	}
}
