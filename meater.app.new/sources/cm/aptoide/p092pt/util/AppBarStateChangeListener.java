package cm.aptoide.p092pt.util;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class AppBarStateChangeListener implements AppBarLayout.InterfaceC7928e {
    private State mCurrentState = State.IDLE;

    public enum State {
        EXPANDED,
        MOVING,
        IDLE,
        COLLAPSED
    }

    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC7926c
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
        if (i2 == 0) {
            State state = this.mCurrentState;
            State state2 = State.EXPANDED;
            if (state != state2) {
                onStateChanged(appBarLayout, state2);
            }
            this.mCurrentState = state2;
            return;
        }
        if (Math.abs(i2) - appBarLayout.getTotalScrollRange() == 0) {
            State state3 = this.mCurrentState;
            State state4 = State.COLLAPSED;
            if (state3 != state4) {
                onStateChanged(appBarLayout, state4);
            }
            this.mCurrentState = state4;
            return;
        }
        if (Math.abs(i2) >= appBarLayout.getTotalScrollRange()) {
            State state5 = this.mCurrentState;
            State state6 = State.MOVING;
            if (state5 != state6) {
                onStateChanged(appBarLayout, state6);
            }
            this.mCurrentState = state6;
            return;
        }
        State state7 = this.mCurrentState;
        State state8 = State.IDLE;
        if (state7 != state8) {
            onStateChanged(appBarLayout, state8);
        }
        this.mCurrentState = state8;
    }

    public abstract void onStateChanged(AppBarLayout appBarLayout, State state);
}
