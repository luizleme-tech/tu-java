package br.com.luizleme.tech.tujava.transacao;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class ClienteConverter extends SimpleArgumentConverter {

	@Override
	protected Object convert(Object source, Class<?> aClass) throws ArgumentConversionException {
		String[] data = source.toString().split(",");
		return new Cliente(data[0], Integer.parseInt(data[1]));
	}
}
