package androidx.lifecycle;

import androidx.lifecycle.AbstractC0511g;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements InterfaceC0513i {

    /* renamed from: a */
    private final InterfaceC0508e f3419a;

    /* renamed from: b */
    private final InterfaceC0513i f3420b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0491a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3421a;

        static {
            int[] iArr = new int[AbstractC0511g.b.values().length];
            f3421a = iArr;
            try {
                iArr[AbstractC0511g.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3421a[AbstractC0511g.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3421a[AbstractC0511g.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3421a[AbstractC0511g.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3421a[AbstractC0511g.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3421a[AbstractC0511g.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3421a[AbstractC0511g.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(InterfaceC0508e interfaceC0508e, InterfaceC0513i interfaceC0513i) {
        this.f3419a = interfaceC0508e;
        this.f3420b = interfaceC0513i;
    }

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
        switch (C0491a.f3421a[bVar.ordinal()]) {
            case 1:
                this.f3419a.onCreate(interfaceC0515k);
                break;
            case 2:
                this.f3419a.onStart(interfaceC0515k);
                break;
            case 3:
                this.f3419a.onResume(interfaceC0515k);
                break;
            case 4:
                this.f3419a.onPause(interfaceC0515k);
                break;
            case 5:
                this.f3419a.onStop(interfaceC0515k);
                break;
            case 6:
                this.f3419a.onDestroy(interfaceC0515k);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0513i interfaceC0513i = this.f3420b;
        if (interfaceC0513i != null) {
            interfaceC0513i.mo124a(interfaceC0515k, bVar);
        }
    }
}
