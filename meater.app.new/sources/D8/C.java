package D8;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2899i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.C2915z;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Y;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: Keyset.java */
/* loaded from: classes2.dex */
public final class C extends AbstractC2913x<C, b> implements Q {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Y<C> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C2915z.i<c> key_ = AbstractC2913x.A();
    private int primaryKeyId_;

    /* compiled from: Keyset.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3511a;

        static {
            int[] iArr = new int[AbstractC2913x.f.values().length];
            f3511a = iArr;
            try {
                iArr[AbstractC2913x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3511a[AbstractC2913x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3511a[AbstractC2913x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3511a[AbstractC2913x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3511a[AbstractC2913x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3511a[AbstractC2913x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3511a[AbstractC2913x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Keyset.java */
    public static final class b extends AbstractC2913x.a<C, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(c cVar) {
            s();
            ((C) this.f38040C).a0(cVar);
            return this;
        }

        public c E(int i10) {
            return ((C) this.f38040C).c0(i10);
        }

        public int F() {
            return ((C) this.f38040C).d0();
        }

        public List<c> G() {
            return Collections.unmodifiableList(((C) this.f38040C).e0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2891a.AbstractC0485a, com.google.crypto.tink.shaded.protobuf.P.a
        public /* bridge */ /* synthetic */ P.a G0(P p10) {
            return super.G0(p10);
        }

        public b H(int i10) {
            s();
            ((C) this.f38040C).k0(i10);
            return this;
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
            super(C.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Keyset.java */
    public static final class c extends AbstractC2913x<c, a> implements Q {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Y<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* compiled from: Keyset.java */
        public static final class a extends AbstractC2913x.a<c, a> implements Q {
            /* synthetic */ a(a aVar) {
                this();
            }

            public a D(y yVar) {
                s();
                ((c) this.f38040C).j0(yVar);
                return this;
            }

            public a E(int i10) {
                s();
                ((c) this.f38040C).k0(i10);
                return this;
            }

            public a F(I i10) {
                s();
                ((c) this.f38040C).l0(i10);
                return this;
            }

            public a G(z zVar) {
                s();
                ((c) this.f38040C).m0(zVar);
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

            private a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC2913x.U(c.class, cVar);
        }

        private c() {
        }

        public static a i0() {
            return DEFAULT_INSTANCE.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(I i10) {
            this.outputPrefixType_ = i10.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m0(z zVar) {
            this.status_ = zVar.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ P c() {
            return super.c();
        }

        public y c0() {
            y yVar = this.keyData_;
            return yVar == null ? y.b0() : yVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        public int d0() {
            return this.keyId_;
        }

        public I e0() {
            I iC = I.c(this.outputPrefixType_);
            return iC == null ? I.UNRECOGNIZED : iC;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ P.a g() {
            return super.g();
        }

        public z g0() {
            z zVarC = z.c(this.status_);
            return zVarC == null ? z.UNRECOGNIZED : zVarC;
        }

        public boolean h0() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x
        protected final Object z(AbstractC2913x.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f3511a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC2913x.M(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Y<c> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (c.class) {
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

    static {
        C c10 = new C();
        DEFAULT_INSTANCE = c10;
        AbstractC2913x.U(C.class, c10);
    }

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(c cVar) {
        cVar.getClass();
        b0();
        this.key_.add(cVar);
    }

    private void b0() {
        C2915z.i<c> iVar = this.key_;
        if (iVar.q()) {
            return;
        }
        this.key_ = AbstractC2913x.K(iVar);
    }

    public static b h0() {
        return DEFAULT_INSTANCE.w();
    }

    public static C i0(InputStream inputStream, C2905o c2905o) {
        return (C) AbstractC2913x.P(DEFAULT_INSTANCE, inputStream, c2905o);
    }

    public static C j0(byte[] bArr, C2905o c2905o) {
        return (C) AbstractC2913x.Q(DEFAULT_INSTANCE, bArr, c2905o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ P c() {
        return super.c();
    }

    public c c0(int i10) {
        return this.key_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ P.a d() {
        return super.d();
    }

    public int d0() {
        return this.key_.size();
    }

    public List<c> e0() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ P.a g() {
        return super.g();
    }

    public int g0() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x
    protected final Object z(AbstractC2913x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3511a[fVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2913x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<C> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C.class) {
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
