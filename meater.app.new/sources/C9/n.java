package C9;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.C2964y;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* compiled from: TransportInfo.java */
/* loaded from: classes2.dex */
public final class n extends AbstractC2962w<n, b> implements Q {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Y<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* compiled from: TransportInfo.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3179a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3179a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3179a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3179a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3179a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3179a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3179a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3179a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: TransportInfo.java */
    public static final class b extends AbstractC2962w.a<n, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TransportInfo.java */
    public enum c implements C2964y.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);


        /* renamed from: E, reason: collision with root package name */
        private static final C2964y.d<c> f3182E = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f3184B;

        /* compiled from: TransportInfo.java */
        class a implements C2964y.d<c> {
            a() {
            }

            @Override // com.google.protobuf.C2964y.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.j(i10);
            }
        }

        /* compiled from: TransportInfo.java */
        private static final class b implements C2964y.e {

            /* renamed from: a, reason: collision with root package name */
            static final C2964y.e f3185a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C2964y.e
            public boolean a(int i10) {
                return c.j(i10) != null;
            }
        }

        c(int i10) {
            this.f3184B = i10;
        }

        public static c j(int i10) {
            if (i10 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static C2964y.e n() {
            return b.f3185a;
        }

        @Override // com.google.protobuf.C2964y.c
        public final int e() {
            return this.f3184B;
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        AbstractC2962w.X(n.class, nVar);
    }

    private n() {
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3179a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.n()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<n> bVar = PARSER;
                if (bVar == null) {
                    synchronized (n.class) {
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
}
