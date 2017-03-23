package com.twelvemonkeys.imageio.plugins.psd;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;

public class PSDLayerGroupsEnabled extends PSDImageResource {
	// 2 bytes count + <count> 4 byte layer IDs
	int[] enabled;

	PSDLayerGroupsEnabled(final short pId, final ImageInputStream pInput) throws IOException {
		super(pId, pInput);
	}

	@Override
	protected void readData(final ImageInputStream pInput) throws IOException {
		// FIXME: This should probably be a boolean array
		enabled = new int[(int) size];
		for (int j = 0; j < size; j++) {
			enabled[j] = pInput.readUnsignedByte();
		}
	}
}
