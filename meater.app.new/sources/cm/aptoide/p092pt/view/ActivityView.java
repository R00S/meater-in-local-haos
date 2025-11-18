package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.analytics.view.AnalyticsActivity;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import com.trello.rxlifecycle.p234g.EnumC8761a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public abstract class ActivityView extends AnalyticsActivity implements View {

    /* renamed from: cm.aptoide.pt.view.ActivityView$1 */
    static /* synthetic */ class C46801 {
        static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent;

        static {
            int[] iArr = new int[EnumC8761a.values().length];
            $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent = iArr;
            try {
                iArr[EnumC8761a.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[EnumC8761a.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[EnumC8761a.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[EnumC8761a.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[EnumC8761a.STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[EnumC8761a.DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToEvent, reason: merged with bridge method [inline-methods] */
    public View.LifecycleEvent m8883b(EnumC8761a enumC8761a) {
        switch (C46801.$SwitchMap$com$trello$rxlifecycle$android$ActivityEvent[enumC8761a.ordinal()]) {
            case 1:
                return View.LifecycleEvent.CREATE;
            case 2:
                return View.LifecycleEvent.START;
            case 3:
                return View.LifecycleEvent.RESUME;
            case 4:
                return View.LifecycleEvent.PAUSE;
            case 5:
                return View.LifecycleEvent.STOP;
            case 6:
                return View.LifecycleEvent.DESTROY;
            default:
                throw new IllegalStateException("Unrecognized event: " + enumC8761a.name());
        }
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public final <T> InterfaceC8756b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C8757c.m27898b(getLifecycleEvent(), lifecycleEvent);
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11234e<View.LifecycleEvent> getLifecycleEvent() {
        return lifecycle().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11781f.m8883b((EnumC8761a) obj);
            }
        });
    }
}
