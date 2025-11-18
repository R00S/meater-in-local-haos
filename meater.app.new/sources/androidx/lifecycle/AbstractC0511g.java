package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle.java */
/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public abstract class AbstractC0511g {

    /* renamed from: a */
    AtomicReference<Object> f3470a = new AtomicReference<>();

    /* compiled from: Lifecycle.java */
    /* renamed from: androidx.lifecycle.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3471a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3472b;

        static {
            int[] iArr = new int[b.values().length];
            f3472b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3472b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3472b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3472b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3472b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3472b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3472b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f3471a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3471a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3471a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3471a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3471a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: Lifecycle.java */
    /* renamed from: androidx.lifecycle.g$b */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        /* renamed from: g */
        public static b m3864g(c cVar) {
            int i2 = a.f3471a[cVar.ordinal()];
            if (i2 == 1) {
                return ON_DESTROY;
            }
            if (i2 == 2) {
                return ON_STOP;
            }
            if (i2 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        /* renamed from: q */
        public static b m3865q(c cVar) {
            int i2 = a.f3471a[cVar.ordinal()];
            if (i2 == 1) {
                return ON_START;
            }
            if (i2 == 2) {
                return ON_RESUME;
            }
            if (i2 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        /* renamed from: k */
        public c m3866k() {
            switch (a.f3472b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.java */
    /* renamed from: androidx.lifecycle.g$c */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: g */
        public boolean m3867g(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo3861a(InterfaceC0514j interfaceC0514j);

    /* renamed from: b */
    public abstract c mo3862b();

    /* renamed from: c */
    public abstract void mo3863c(InterfaceC0514j interfaceC0514j);
}
