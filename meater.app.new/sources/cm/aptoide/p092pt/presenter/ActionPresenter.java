package cm.aptoide.p092pt.presenter;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: ActionPresenter.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H$J\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/presenter/ActionPresenter;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "eventObservable", "Lrx/Observable;", "getEventObservable", "()Lrx/Observable;", "setEventObservable", "(Lrx/Observable;)V", "lifecycleView", "Lcm/aptoide/pt/presenter/View;", "getLifecycleView", "()Lcm/aptoide/pt/presenter/View;", "setLifecycleView", "(Lcm/aptoide/pt/presenter/View;)V", "present", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class ActionPresenter<T> {
    protected C11234e<T> eventObservable;
    protected View lifecycleView;

    protected final C11234e<T> getEventObservable() {
        C11234e<T> c11234e = this.eventObservable;
        if (c11234e != null) {
            return c11234e;
        }
        C9801m.m32363w("eventObservable");
        return null;
    }

    protected final View getLifecycleView() {
        View view = this.lifecycleView;
        if (view != null) {
            return view;
        }
        C9801m.m32363w("lifecycleView");
        return null;
    }

    protected abstract void present();

    public final void present(C11234e<T> c11234e, View view) {
        C9801m.m32346f(c11234e, "eventObservable");
        C9801m.m32346f(view, "lifecycleView");
        setEventObservable(c11234e);
        setLifecycleView(view);
        present();
    }

    protected final void setEventObservable(C11234e<T> c11234e) {
        C9801m.m32346f(c11234e, "<set-?>");
        this.eventObservable = c11234e;
    }

    protected final void setLifecycleView(View view) {
        C9801m.m32346f(view, "<set-?>");
        this.lifecycleView = view;
    }
}
