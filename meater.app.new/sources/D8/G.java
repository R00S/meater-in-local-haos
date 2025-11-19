package D8;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2899i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Y;

/* compiled from: KmsEnvelopeAeadKey.java */
/* loaded from: classes2.dex */
public final class G extends AbstractC2913x<G, b> implements Q {
    private static final G DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Y<G> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private H params_;
    private int version_;

    /* compiled from: KmsEnvelopeAeadKey.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3515a;

        static {
            int[] iArr = new int[AbstractC2913x.f.values().length];
            f3515a = iArr;
            try {
                iArr[AbstractC2913x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3515a[AbstractC2913x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3515a[AbstractC2913x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3515a[AbstractC2913x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3515a[AbstractC2913x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3515a[AbstractC2913x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3515a[AbstractC2913x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: KmsEnvelopeAeadKey.java */
    public static final class b extends AbstractC2913x.a<G, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(H h10) {
            s();
            ((G) this.f38040C).e0(h10);
            return this;
        }

        public b E(int i10) {
            s();
            ((G) this.f38040C).g0(i10);
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
            super(G.DEFAULT_INSTANCE);
        }
    }

    static {
        G g10 = new G();
        DEFAULT_INSTANCE = g10;
        AbstractC2913x.U(G.class, g10);
    }

    private G() {
    }

    public static b c0() {
        return DEFAULT_INSTANCE.w();
    }

    public static G d0(AbstractC2898h abstractC2898h, C2905o c2905o) {
        return (G) AbstractC2913x.O(DEFAULT_INSTANCE, abstractC2898h, c2905o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(H h10) {
        h10.getClass();
        this.params_ = h10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10) {
        this.version_ = i10;
    }

    public H a0() {
        H h10 = this.params_;
        return h10 == null ? H.Y() : h10;
    }

    public int b0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ P c() {
        return super.c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ P.a d() {
        return super.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ P.a g() {
        return super.g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x
    protected final Object z(AbstractC2913x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3515a[fVar.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2913x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<G> bVar = PARSER;
                if (bVar == null) {
                    synchronized (G.class) {
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
