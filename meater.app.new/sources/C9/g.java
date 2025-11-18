package C9;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.C2964y;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* compiled from: GaugeMetric.java */
/* loaded from: classes2.dex */
public final class g extends AbstractC2962w<g, b> implements Q {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Y<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private C2964y.i<e> cpuMetricReadings_ = AbstractC2962w.H();
    private C2964y.i<C9.b> androidMemoryReadings_ = AbstractC2962w.H();

    /* compiled from: GaugeMetric.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3145a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3145a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3145a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3145a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3145a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3145a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3145a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3145a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetric.java */
    public static final class b extends AbstractC2962w.a<g, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(C9.b bVar) {
            C();
            ((g) this.f39470C).f0(bVar);
            return this;
        }

        public b M(e eVar) {
            C();
            ((g) this.f39470C).g0(eVar);
            return this;
        }

        public b N(f fVar) {
            C();
            ((g) this.f39470C).q0(fVar);
            return this;
        }

        public b O(String str) {
            C();
            ((g) this.f39470C).r0(str);
            return this;
        }

        private b() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC2962w.X(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C9.b bVar) {
        bVar.getClass();
        h0();
        this.androidMemoryReadings_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(e eVar) {
        eVar.getClass();
        i0();
        this.cpuMetricReadings_.add(eVar);
    }

    private void h0() {
        C2964y.i<C9.b> iVar = this.androidMemoryReadings_;
        if (iVar.q()) {
            return;
        }
        this.androidMemoryReadings_ = AbstractC2962w.S(iVar);
    }

    private void i0() {
        C2964y.i<e> iVar = this.cpuMetricReadings_;
        if (iVar.q()) {
            return;
        }
        this.cpuMetricReadings_ = AbstractC2962w.S(iVar);
    }

    public static g l0() {
        return DEFAULT_INSTANCE;
    }

    public static b p0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3145a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", C9.b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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

    public int j0() {
        return this.androidMemoryReadings_.size();
    }

    public int k0() {
        return this.cpuMetricReadings_.size();
    }

    public f m0() {
        f fVar = this.gaugeMetadata_;
        return fVar == null ? f.e0() : fVar;
    }

    public boolean n0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean o0() {
        return (this.bitField0_ & 1) != 0;
    }
}
