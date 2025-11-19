package D1;

import D1.g;
import androidx.datastore.preferences.protobuf.AbstractC2077x;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class h extends AbstractC2077x<h, a> implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: PreferencesProto.java */
    public static final class a extends AbstractC2077x.a<h, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a B(boolean z10) {
            t();
            ((h) this.f25164C).d0(z10);
            return this;
        }

        public a C(double d10) {
            t();
            ((h) this.f25164C).e0(d10);
            return this;
        }

        public a D(float f10) {
            t();
            ((h) this.f25164C).f0(f10);
            return this;
        }

        public a E(int i10) {
            t();
            ((h) this.f25164C).g0(i10);
            return this;
        }

        public a F(long j10) {
            t();
            ((h) this.f25164C).h0(j10);
            return this;
        }

        public a G(String str) {
            t();
            ((h) this.f25164C).i0(str);
            return this;
        }

        public a H(g.a aVar) {
            t();
            ((h) this.f25164C).j0(aVar);
            return this;
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* renamed from: B, reason: collision with root package name */
        private final int f3345B;

        b(int i10) {
            this.f3345B = i10;
        }

        public static b c(int i10) {
            switch (i10) {
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
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC2077x.I(h.class, hVar);
    }

    private h() {
    }

    public static h U() {
        return DEFAULT_INSTANCE;
    }

    public static a c0() {
        return DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(g.a aVar) {
        this.value_ = aVar.e();
        this.valueCase_ = 6;
    }

    public boolean T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double V() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float W() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int X() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long Y() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String Z() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g a0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.P();
    }

    public b b0() {
        return b.c(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2077x
    protected final Object w(AbstractC2077x.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f3334a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2077x.F(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<h> bVar = PARSER;
                if (bVar == null) {
                    synchronized (h.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC2077x.b<>(DEFAULT_INSTANCE);
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
