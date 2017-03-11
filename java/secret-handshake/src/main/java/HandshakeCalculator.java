import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

final class HandshakeCalculator {

	public Object calculateHandshake(int input) {
		List<Signal> handshake = new LinkedList<Signal>();
		if ((input & 0b1) == 0b1) handshake.add(Signal.WINK);
		if ((input & 0b10) == 0b10) handshake.add(Signal.DOUBLE_BLINK);
		if ((input & 0b100) == 0b100) handshake.add(Signal.CLOSE_YOUR_EYES);
		if ((input & 0b1000) == 0b1000) handshake.add(Signal.JUMP);
		if ((input & 0b10000) == 0b10000) Collections.reverse(handshake);
		return handshake;
	}



}
