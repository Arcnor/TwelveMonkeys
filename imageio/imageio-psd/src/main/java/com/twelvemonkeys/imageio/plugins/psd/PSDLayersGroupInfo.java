package com.twelvemonkeys.imageio.plugins.psd;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class PSDLayersGroupInfo extends PSDImageResource {
	// 1 byte per layer
	int[] layers;

	PSDLayersGroupInfo(final short pId, final ImageInputStream pInput) throws IOException {
		super(pId, pInput);
	}

	@Override
	protected void readData(final ImageInputStream pInput) throws IOException {
		layers = new int[(int) size / 2];
		for (int j = 0; j < layers.length; j++) {
			layers[j] = pInput.readUnsignedShort();
		}
	}
}
