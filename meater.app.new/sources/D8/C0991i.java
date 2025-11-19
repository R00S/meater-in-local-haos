package D8;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2899i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Y;

/* compiled from: AesEaxKey.java */
/* renamed from: D8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0991i extends AbstractC2913x<C0991i, b> implements Q {
    private static final C0991i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Y<C0991i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2898h keyValue_ = AbstractC2898h.f37801C;
    private C0993k params_;
    private int version_;

    /* compiled from: AesEaxKey.java */
    /* renamed from: D8.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3537a;

        static {
            int[] iArr = new int[AbstractC2913x.f.values().length];
            f3537a = iArr;
            try {
                iArr[AbstractC2913x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3537a[AbstractC2913x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3537a[AbstractC2913x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3537a[AbstractC2913x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3537a[AbstractC2913x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3537a[AbstractC2913x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3537a[AbstractC2913x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AesEaxKey.java */
    /* renamed from: D8.i$b */
    public static final class b extends AbstractC2913x.a<C0991i, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(AbstractC2898h abstractC2898h) {
            s();
            ((C0991i) this.f38040C).h0(abstractC2898h);
            return this;
        }

        public b E(C0993k c0993k) {
            s();
            ((C0991i) this.f38040C).i0(c0993k);
            return this;
        }

        public b F(int i10) {
            s();
            ((C0991i) this.f38040C).j0(i10);
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
            super(C0991i.DEFAULT_INSTANCE);
        }
    }

    static {
        C0991i c0991i = new C0991i();
        DEFAULT_INSTANCE = c0991i;
        AbstractC2913x.U(C0991i.class, c0991i);
    }

    private C0991i() {
    }

    public static b e0() {
        return DEFAULT_INSTANCE.w();
    }

    public static C0991i g0(AbstractC2898h abstractC2898h, C2905o c2905o) {
        return (C0991i) AbstractC2913x.O(DEFAULT_INSTANCE, abstractC2898h, c2905o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(AbstractC2898h abstractC2898h) {
        abstractC2898h.getClass();
        this.keyValue_ = abstractC2898h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(C0993k c0993k) {
        c0993k.getClass();
        this.params_ = c0993k;
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

    public C0993k c0() {
        C0993k c0993k = this.params_;
        return c0993k == null ? C0993k.Z() : c0993k;
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
        a aVar = null;
        switch (a.f3537a[fVar.ordinal()]) {
            case 1:
                return new C0991i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2913x.M(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<C0991i> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0991i.class) {
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
