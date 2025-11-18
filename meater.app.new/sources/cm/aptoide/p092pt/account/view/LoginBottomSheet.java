package cm.aptoide.p092pt.account.view;

import p456rx.C11234e;

/* loaded from: classes.dex */
public interface LoginBottomSheet {

    public enum State {
        EXPANDED,
        COLLAPSED
    }

    void collapse();

    void expand();

    C11234e<State> state();
}
