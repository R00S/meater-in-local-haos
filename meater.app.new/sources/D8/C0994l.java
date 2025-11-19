package D8;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2899i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.Y;

/* compiled from: AesGcmKey.java */
/* renamed from: D8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0994l extends AbstractC2913x<C0994l, b> implements Q {
    private static final C0994l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Y<C0994l> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2898h keyValue_ = AbstractC2898h.f37801C;
    private int version_;

    /* compiled from: AesGcmKey.java */
    /* renamed from: D8.l$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3540a;

        static {
            int[] iArr = new int[AbstractC2913x.f.values().length];
            f3540a = iArr;
            try {
                iArr[AbstractC2913x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3540a[AbstractC2913x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3540a[AbstractC2913x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3540a[AbstractC2913x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3540a[AbstractC2913x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3540a[AbstractC2913x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3540a[AbstractC2913x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AesGcmKey.java */
    /* renamed from: D8.l$b */
    public static final class b extends AbstractC2913x.a<C0994l, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b D(AbstractC2898h abstractC2898h) {
            s();
            ((C0994l) this.f38040C).e0(abstractC2898h);
            return this;
        }

        public b E(int i10) {
            s();
            ((C0994l) this.f38040C).g0(i10);
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
            super(C0994l.DEFAULT_INSTANCE);
        }
    }

    static {
        C0994l c0994l = new C0994l();
        DEFAULT_INSTANCE = c0994l;
        AbstractC2913x.U(C0994l.class, c0994l);
    }

    private C0994l() {
    }

    public static b c0() {
        return DEFAULT_INSTANCE.w();
    }

    public static C0994l d0(AbstractC2898h abstractC2898h, C2905o c2905o) {
        return (C0994l) AbstractC2913x.O(DEFAULT_INSTANCE, abstractC2898h, c2905o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(AbstractC2898h abstractC2898h) {
        abstractC2898h.getClass();
        this.keyValue_ = abstractC2898h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10) {
        this.version_ = i10;
    }

    public AbstractC2898h a0() {
        return this.keyValue_;
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
        switch (a.f3540a[fVar.ordinal()]) {
            case 1:
                return new C0994l();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2913x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<C0994l> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0994l.class) {
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
