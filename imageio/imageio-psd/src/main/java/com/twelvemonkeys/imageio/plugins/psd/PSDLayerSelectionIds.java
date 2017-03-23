package com.twelvemonkeys.imageio.plugins.psd;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class PSDLayerSelectionIds extends PSDImageResource {
	// 2 bytes count + <count> 4 byte layer IDs
	int[] index;

	PSDLayerSelectionIds(final short pId, final ImageInputStream pInput) throws IOException {
		super(pId, pInput);
	}

	@Override
	protected void readData(final ImageInputStream pInput) throws IOException {
		int count = pInput.readUnsignedShort();
		index = new int[count];
		for (int j = 0; j < count; j++) {
			index[j] = pInput.readInt();
		}
	}
}
