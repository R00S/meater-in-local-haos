package p024c.p064l.p065b;

import androidx.datastore.preferences.protobuf.AbstractC0423y;
import androidx.datastore.preferences.protobuf.InterfaceC0408r0;
import androidx.datastore.preferences.protobuf.InterfaceC0424y0;
import okhttp3.HttpUrl;
import p024c.p064l.p065b.C0974g;

/* compiled from: PreferencesProto.java */
/* renamed from: c.l.b.h */
/* loaded from: classes.dex */
public final class C0975h extends AbstractC0423y<C0975h, a> implements InterfaceC0408r0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C0975h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC0424y0<C0975h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: PreferencesProto.java */
    /* renamed from: c.l.b.h$a */
    public static final class a extends AbstractC0423y.a<C0975h, a> implements InterfaceC0408r0 {
        /* synthetic */ a(C0972e c0972e) {
            this();
        }

        /* renamed from: A */
        public a m6229A(double d2) {
            m3352r();
            ((C0975h) this.f3018g).m6215c0(d2);
            return this;
        }

        /* renamed from: B */
        public a m6230B(float f2) {
            m3352r();
            ((C0975h) this.f3018g).m6216d0(f2);
            return this;
        }

        /* renamed from: C */
        public a m6231C(int i2) {
            m3352r();
            ((C0975h) this.f3018g).m6217e0(i2);
            return this;
        }

        /* renamed from: D */
        public a m6232D(long j2) {
            m3352r();
            ((C0975h) this.f3018g).m6218f0(j2);
            return this;
        }

        /* renamed from: E */
        public a m6233E(String str) {
            m3352r();
            ((C0975h) this.f3018g).m6219g0(str);
            return this;
        }

        /* renamed from: F */
        public a m6234F(C0974g.a aVar) {
            m3352r();
            ((C0975h) this.f3018g).m6220h0(aVar);
            return this;
        }

        /* renamed from: w */
        public a m6235w(boolean z) {
            m3352r();
            ((C0975h) this.f3018g).m6214b0(z);
            return this;
        }

        private a() {
            super(C0975h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* renamed from: c.l.b.h$b */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* renamed from: o */
        private final int f6481o;

        b(int i2) {
            this.f6481o = i2;
        }

        /* renamed from: g */
        public static b m6236g(int i2) {
            switch (i2) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        C0975h c0975h = new C0975h();
        DEFAULT_INSTANCE = c0975h;
        AbstractC0423y.m3334H(C0975h.class, c0975h);
    }

    private C0975h() {
    }

    /* renamed from: S */
    public static C0975h m6212S() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public static a m6213a0() {
        return DEFAULT_INSTANCE.m3343r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m6214b0(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m6215c0(double d2) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m6216d0(float f2) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m6217e0(int i2) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m6218f0(long j2) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m6219g0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m6220h0(C0974g.a aVar) {
        this.value_ = aVar.mo3158c();
        this.valueCase_ = 6;
    }

    /* renamed from: R */
    public boolean m6221R() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: T */
    public double m6222T() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: U */
    public float m6223U() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: V */
    public int m6224V() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: W */
    public long m6225W() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: X */
    public String m6226X() {
        return this.valueCase_ == 5 ? (String) this.value_ : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: Y */
    public C0974g m6227Y() {
        return this.valueCase_ == 6 ? (C0974g) this.value_ : C0974g.m6200N();
    }

    /* renamed from: Z */
    public b m6228Z() {
        return b.m6236g(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0423y
    /* renamed from: u */
    protected final Object mo3346u(AbstractC0423y.f fVar, Object obj, Object obj2) {
        C0972e c0972e = null;
        switch (C0972e.f6470a[fVar.ordinal()]) {
            case 1:
                return new C0975h();
            case 2:
                return new a(c0972e);
            case 3:
                return AbstractC0423y.m3331E(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C0974g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0424y0<C0975h> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0975h.class) {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0423y.b<>(DEFAULT_INSTANCE);
                            PARSER = bVar;
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
