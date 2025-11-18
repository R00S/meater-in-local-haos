package cm.aptoide.p092pt.presenter;

import com.trello.rxlifecycle.InterfaceC8756b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface View {

    public enum LifecycleEvent {
        CREATE,
        START,
        RESUME,
        PAUSE,
        STOP,
        DESTROY
    }

    void attachPresenter(Presenter presenter);

    <T> InterfaceC8756b<T> bindUntilEvent(LifecycleEvent lifecycleEvent);

    C11234e<LifecycleEvent> getLifecycleEvent();
}
