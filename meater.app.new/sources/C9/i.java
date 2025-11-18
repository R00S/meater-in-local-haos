package C9;

import C9.c;
import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.Y;

/* compiled from: PerfMetric.java */
/* loaded from: classes2.dex */
public final class i extends AbstractC2962w<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Y<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* compiled from: PerfMetric.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3168a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3168a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3168a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3168a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3168a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3168a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3168a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3168a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfMetric.java */
    public static final class b extends AbstractC2962w.a<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(c.b bVar) {
            C();
            ((i) this.f39470C).i0(bVar.e());
            return this;
        }

        public b M(g gVar) {
            C();
            ((i) this.f39470C).j0(gVar);
            return this;
        }

        public b N(h hVar) {
            C();
            ((i) this.f39470C).k0(hVar);
            return this;
        }

        public b O(m mVar) {
            C();
            ((i) this.f39470C).l0(mVar);
            return this;
        }

        @Override // C9.j
        public boolean k() {
            return ((i) this.f39470C).k();
        }

        @Override // C9.j
        public boolean m() {
            return ((i) this.f39470C).m();
        }

        @Override // C9.j
        public m n() {
            return ((i) this.f39470C).n();
        }

        @Override // C9.j
        public boolean o() {
            return ((i) this.f39470C).o();
        }

        @Override // C9.j
        public h p() {
            return ((i) this.f39470C).p();
        }

        @Override // C9.j
        public g q() {
            return ((i) this.f39470C).q();
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC2962w.X(i.class, iVar);
    }

    private i() {
    }

    public static b h0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3168a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<i> bVar = PARSER;
                if (bVar == null) {
                    synchronized (i.class) {
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

    public c f0() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.h0() : cVar;
    }

    public boolean g0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // C9.j
    public boolean k() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // C9.j
    public boolean m() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // C9.j
    public m n() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.u0() : mVar;
    }

    @Override // C9.j
    public boolean o() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // C9.j
    public h p() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.s0() : hVar;
    }

    @Override // C9.j
    public g q() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.l0() : gVar;
    }
}
