package D8;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2899i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Y;

/* compiled from: AesCmacKey.java */
/* renamed from: D8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0983a extends AbstractC2913x<C0983a, b> implements Q {
    private static final C0983a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Y<C0983a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2898h keyValue_ = AbstractC2898h.f37801C;
    private C0985c params_;
    private int version_;

    /* compiled from: AesCmacKey.java */
    /* renamed from: D8.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0056a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3529a;

        static {
            int[] iArr = new int[AbstractC2913x.f.values().length];
            f3529a = iArr;
            try {
                iArr[AbstractC2913x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3529a[AbstractC2913x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3529a[AbstractC2913x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3529a[AbstractC2913x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3529a[AbstractC2913x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3529a[AbstractC2913x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3529a[AbstractC2913x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AesCmacKey.java */
    /* renamed from: D8.a$b */
    public static final class b extends AbstractC2913x.a<C0983a, b> implements Q {
        /* synthetic */ b(C0056a c0056a) {
            this();
        }

        public b D(AbstractC2898h abstractC2898h) {
            s();
            ((C0983a) this.f38040C).h0(abstractC2898h);
            return this;
        }

        public b E(C0985c c0985c) {
            s();
            ((C0983a) this.f38040C).i0(c0985c);
            return this;
        }

        public b F(int i10) {
            s();
            ((C0983a) this.f38040C).j0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2891a.AbstractC0485a, com.google.crypto.tink.shaded.protobuf.P.a
        public /* bridge */ /* synthetic */ P.a G0(P p10) {
            return super.G0(p10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ P c() {
            return super.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a, com.google.crypto.tink.shaded.protobuf.P.a
        public /* bridge */ /* synthetic */ P e() {
            return super.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a, com.google.crypto.tink.shaded.protobuf.P.a
        public /* bridge */ /* synthetic */ P.a f0(AbstractC2899i abstractC2899i, C2905o c2905o) {
            return super.f0(abstractC2899i, c2905o);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a, com.google.crypto.tink.shaded.protobuf.P.a
        public /* bridge */ /* synthetic */ P j() {
            return super.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a, com.google.crypto.tink.shaded.protobuf.AbstractC2891a.AbstractC0485a
        protected /* bridge */ /* synthetic */ AbstractC2891a.AbstractC0485a m(AbstractC2891a abstractC2891a) {
            return super.m((AbstractC2913x) abstractC2891a);
        }

        private b() {
            super(C0983a.DEFAULT_INSTANCE);
        }
    }

    static {
        C0983a c0983a = new C0983a();
        DEFAULT_INSTANCE = c0983a;
        AbstractC2913x.U(C0983a.class, c0983a);
    }

    private C0983a() {
    }

    public static b e0() {
        return DEFAULT_INSTANCE.w();
    }

    public static C0983a g0(AbstractC2898h abstractC2898h, C2905o c2905o) {
        return (C0983a) AbstractC2913x.O(DEFAULT_INSTANCE, abstractC2898h, c2905o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(AbstractC2898h abstractC2898h) {
        abstractC2898h.getClass();
        this.keyValue_ = abstractC2898h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(C0985c c0985c) {
        c0985c.getClass();
        this.params_ = c0985c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i10) {
        this.version_ = i10;
    }

    public AbstractC2898h b0() {
        return this.keyValue_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ P c() {
        return super.c();
    }

    public C0985c c0() {
        C0985c c0985c = this.params_;
        return c0985c == null ? C0985c.Z() : c0985c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ P.a d() {
        return super.d();
    }

    public int d0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ P.a g() {
        return super.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x
    protected final Object z(AbstractC2913x.f fVar, Object obj, Object obj2) {
        C0056a c0056a = null;
        switch (C0056a.f3529a[fVar.ordinal()]) {
            case 1:
                return new C0983a();
            case 2:
                return new b(c0056a);
            case 3:
                return AbstractC2913x.M(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<C0983a> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0983a.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC2913x.b<>(DEFAULT_INSTANCE);
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
