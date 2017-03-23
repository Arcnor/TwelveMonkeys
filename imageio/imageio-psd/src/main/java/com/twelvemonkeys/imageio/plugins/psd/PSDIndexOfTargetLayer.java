package com.twelvemonkeys.imageio.plugins.psd;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class PSDIndexOfTargetLayer extends PSDImageResource {
	// 2 bytes
	int index;

	PSDIndexOfTargetLayer(final short pId, final ImageInputStream pInput) throws IOException {
		super(pId, pInput);
	}

	@Override
	protected void readData(final ImageInputStream pInput) throws IOException {
		index = pInput.readUnsignedShort();
	}
}
