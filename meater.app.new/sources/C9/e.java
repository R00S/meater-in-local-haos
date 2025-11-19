package C9;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* compiled from: CpuMetricReading.java */
/* loaded from: classes2.dex */
public final class e extends AbstractC2962w<e, b> implements Q {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile Y<e> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* compiled from: CpuMetricReading.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3143a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3143a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3143a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3143a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3143a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3143a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3143a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3143a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CpuMetricReading.java */
    public static final class b extends AbstractC2962w.a<e, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(long j10) {
            C();
            ((e) this.f39470C).f0(j10);
            return this;
        }

        public b M(long j10) {
            C();
            ((e) this.f39470C).g0(j10);
            return this;
        }

        public b N(long j10) {
            C();
            ((e) this.f39470C).h0(j10);
            return this;
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC2962w.X(e.class, eVar);
    }

    private e() {
    }

    public static b e0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j10) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(long j10) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j10;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3143a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<e> bVar = PARSER;
                if (bVar == null) {
                    synchronized (e.class) {
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
