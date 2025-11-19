package C9;

import com.google.protobuf.AbstractC2941a;
import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.C2964y;
import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.Q;
import com.google.protobuf.Y;
import com.google.protobuf.r0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: TraceMetric.java */
/* loaded from: classes2.dex */
public final class m extends AbstractC2962w<m, b> implements Q {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Y<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private J<String, Long> counters_ = J.g();
    private J<String, String> customAttributes_ = J.g();
    private String name_ = "";
    private C2964y.i<m> subtraces_ = AbstractC2962w.H();
    private C2964y.i<k> perfSessions_ = AbstractC2962w.H();

    /* compiled from: TraceMetric.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3176a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3176a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3176a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3176a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3176a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3176a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3176a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3176a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: TraceMetric.java */
    public static final class b extends AbstractC2962w.a<m, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(Iterable<? extends k> iterable) {
            C();
            ((m) this.f39470C).k0(iterable);
            return this;
        }

        public b M(Iterable<? extends m> iterable) {
            C();
            ((m) this.f39470C).l0(iterable);
            return this;
        }

        public b N(k kVar) {
            C();
            ((m) this.f39470C).m0(kVar);
            return this;
        }

        public b O(m mVar) {
            C();
            ((m) this.f39470C).n0(mVar);
            return this;
        }

        public b P(Map<String, Long> map) {
            C();
            ((m) this.f39470C).w0().putAll(map);
            return this;
        }

        public b Q(Map<String, String> map) {
            C();
            ((m) this.f39470C).x0().putAll(map);
            return this;
        }

        public b R(String str, long j10) {
            str.getClass();
            C();
            ((m) this.f39470C).w0().put(str, Long.valueOf(j10));
            return this;
        }

        public b S(String str, String str2) {
            str.getClass();
            str2.getClass();
            C();
            ((m) this.f39470C).x0().put(str, str2);
            return this;
        }

        public b T(long j10) {
            C();
            ((m) this.f39470C).H0(j10);
            return this;
        }

        public b U(long j10) {
            C();
            ((m) this.f39470C).I0(j10);
            return this;
        }

        public b V(String str) {
            C();
            ((m) this.f39470C).J0(str);
            return this;
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TraceMetric.java */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, Long> f3177a = I.d(r0.b.f39365L, "", r0.b.f39359F, 0L);
    }

    /* compiled from: TraceMetric.java */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, String> f3178a;

        static {
            r0.b bVar = r0.b.f39365L;
            f3178a = I.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        AbstractC2962w.X(m.class, mVar);
    }

    private m() {
    }

    private J<String, Long> C0() {
        return this.counters_;
    }

    private J<String, String> D0() {
        return this.customAttributes_;
    }

    private J<String, Long> E0() {
        if (!this.counters_.l()) {
            this.counters_ = this.counters_.o();
        }
        return this.counters_;
    }

    private J<String, String> F0() {
        if (!this.customAttributes_.l()) {
            this.customAttributes_ = this.customAttributes_.o();
        }
        return this.customAttributes_;
    }

    public static b G0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Iterable<? extends k> iterable) {
        p0();
        AbstractC2941a.a(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(Iterable<? extends m> iterable) {
        q0();
        AbstractC2941a.a(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(k kVar) {
        kVar.getClass();
        p0();
        this.perfSessions_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(m mVar) {
        mVar.getClass();
        q0();
        this.subtraces_.add(mVar);
    }

    private void p0() {
        C2964y.i<k> iVar = this.perfSessions_;
        if (iVar.q()) {
            return;
        }
        this.perfSessions_ = AbstractC2962w.S(iVar);
    }

    private void q0() {
        C2964y.i<m> iVar = this.subtraces_;
        if (iVar.q()) {
            return;
        }
        this.subtraces_ = AbstractC2962w.S(iVar);
    }

    public static m u0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> w0() {
        return E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> x0() {
        return F0();
    }

    public List<m> A0() {
        return this.subtraces_;
    }

    public boolean B0() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3176a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f3177a, "subtraces_", m.class, "customAttributes_", d.f3178a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<m> bVar = PARSER;
                if (bVar == null) {
                    synchronized (m.class) {
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

    public boolean o0(String str) {
        str.getClass();
        return D0().containsKey(str);
    }

    public int r0() {
        return C0().size();
    }

    public Map<String, Long> s0() {
        return Collections.unmodifiableMap(C0());
    }

    public Map<String, String> t0() {
        return Collections.unmodifiableMap(D0());
    }

    public long v0() {
        return this.durationUs_;
    }

    public String y0() {
        return this.name_;
    }

    public List<k> z0() {
        return this.perfSessions_;
    }
}
