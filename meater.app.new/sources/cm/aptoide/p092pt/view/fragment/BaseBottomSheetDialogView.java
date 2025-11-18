package cm.aptoide.p092pt.view.fragment;

import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import com.trello.rxlifecycle.C8757c;
import com.trello.rxlifecycle.InterfaceC8756b;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class BaseBottomSheetDialogView extends BaseBottomSheetDialogFragment implements View {

    /* renamed from: cm.aptoide.pt.view.fragment.BaseBottomSheetDialogView$1 */
    static /* synthetic */ class C48121 {
        static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent;

        static {
            int[] iArr = new int[EnumC8762b.values().length];
            $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent = iArr;
            try {
                iArr[EnumC8762b.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.DETACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.CREATE_VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.RESUME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.PAUSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.STOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8762b.DESTROY_VIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11234e<View.LifecycleEvent> convertToEvent(EnumC8762b enumC8762b) {
        switch (C48121.$SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[enumC8762b.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C11234e.m40016B();
            case 5:
                return C11234e.m40025S(View.LifecycleEvent.CREATE);
            case 6:
                return C11234e.m40025S(View.LifecycleEvent.START);
            case 7:
                return C11234e.m40025S(View.LifecycleEvent.RESUME);
            case 8:
                return C11234e.m40025S(View.LifecycleEvent.PAUSE);
            case 9:
                return C11234e.m40025S(View.LifecycleEvent.STOP);
            case 10:
                return C11234e.m40025S(View.LifecycleEvent.DESTROY);
            default:
                throw new IllegalStateException("Unrecognized event: " + enumC8762b.name());
        }
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public <T> InterfaceC8756b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C8757c.m27898b(getLifecycleEvent(), lifecycleEvent);
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11234e<View.LifecycleEvent> getLifecycleEvent() {
        return lifecycle().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.fragment.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11838f.convertToEvent((EnumC8762b) obj);
            }
        });
    }
}
