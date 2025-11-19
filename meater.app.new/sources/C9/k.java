package C9;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.C2964y;
import com.google.protobuf.InterfaceC2965z;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* compiled from: PerfSession.java */
/* loaded from: classes2.dex */
public final class k extends AbstractC2962w<k, c> implements Q {
    private static final k DEFAULT_INSTANCE;
    private static volatile Y<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC2965z<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C2964y.g sessionVerbosity_ = AbstractC2962w.G();

    /* compiled from: PerfSession.java */
    class a implements InterfaceC2965z<Integer, l> {
        a() {
        }
    }

    /* compiled from: PerfSession.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3169a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3169a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3169a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3169a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3169a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3169a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3169a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3169a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfSession.java */
    public static final class c extends AbstractC2962w.a<k, c> implements Q {
        /* synthetic */ c(a aVar) {
            this();
        }

        public c L(l lVar) {
            C();
            ((k) this.f39470C).d0(lVar);
            return this;
        }

        public c M(String str) {
            C();
            ((k) this.f39470C).i0(str);
            return this;
        }

        private c() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC2962w.X(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(l lVar) {
        lVar.getClass();
        e0();
        this.sessionVerbosity_.X(lVar.e());
    }

    private void e0() {
        C2964y.g gVar = this.sessionVerbosity_;
        if (gVar.q()) {
            return;
        }
        this.sessionVerbosity_ = AbstractC2962w.R(gVar);
    }

    public static c h0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (b.f3169a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.n()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<k> bVar = PARSER;
                if (bVar == null) {
                    synchronized (k.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC2962w.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public l f0(int i10) {
        l lVarJ = l.j(this.sessionVerbosity_.getInt(i10));
        return lVarJ == null ? l.SESSION_VERBOSITY_NONE : lVarJ;
    }

    public int g0() {
        return this.sessionVerbosity_.size();
    }
}
