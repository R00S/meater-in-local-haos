package android.view;

import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/e;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/e;Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "B", "Landroidx/lifecycle/e;", "C", "Landroidx/lifecycle/s;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2099f implements InterfaceC2111s {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2097e defaultLifecycleObserver;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2111s lifecycleEventObserver;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25954a;

        static {
            int[] iArr = new int[AbstractC2106m.a.values().length];
            try {
                iArr[AbstractC2106m.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2106m.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2106m.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC2106m.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC2106m.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC2106m.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC2106m.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f25954a = iArr;
        }
    }

    public C2099f(InterfaceC2097e defaultLifecycleObserver, InterfaceC2111s interfaceC2111s) {
        C3862t.g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = interfaceC2111s;
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v source, AbstractC2106m.a event) {
        C3862t.g(source, "source");
        C3862t.g(event, "event");
        switch (a.f25954a[event.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.e(source);
                break;
            case 2:
                this.defaultLifecycleObserver.onStart(source);
                break;
            case 3:
                this.defaultLifecycleObserver.d(source);
                break;
            case 4:
                this.defaultLifecycleObserver.j(source);
                break;
            case 5:
                this.defaultLifecycleObserver.onStop(source);
                break;
            case 6:
                this.defaultLifecycleObserver.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC2111s interfaceC2111s = this.lifecycleEventObserver;
        if (interfaceC2111s != null) {
            interfaceC2111s.f(source, event);
        }
    }
}
