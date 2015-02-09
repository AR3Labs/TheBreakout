package com.ar3games.game.state;

import android.view.MotionEvent;
import com.ar3games.framework.util.Painter;
import com.ar3games.thebreakout.Assets;

public class LoadState extends State {
	@Override
	public void init() {
		Assets.load();
	}

	@Override
	public void update(float delta) {
		setCurrentState(new MenuState());
	}

	@Override
	public void render(Painter g) {
	}

	@Override
	public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
		return false;
	}
}