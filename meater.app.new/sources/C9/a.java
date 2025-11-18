package C9;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* compiled from: AndroidApplicationInfo.java */
/* loaded from: classes2.dex */
public final class a extends AbstractC2962w<a, b> implements Q {
    private static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Y<a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* compiled from: AndroidApplicationInfo.java */
    /* renamed from: C9.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0047a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3131a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3131a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3131a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3131a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3131a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3131a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3131a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3131a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AndroidApplicationInfo.java */
    public static final class b extends AbstractC2962w.a<a, b> implements Q {
        /* synthetic */ b(C0047a c0047a) {
            this();
        }

        public b L(String str) {
            C();
            ((a) this.f39470C).i0(str);
            return this;
        }

        public b M(String str) {
            C();
            ((a) this.f39470C).j0(str);
            return this;
        }

        public b N(String str) {
            C();
            ((a) this.f39470C).k0(str);
            return this;
        }

        private b() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        AbstractC2962w.X(a.class, aVar);
    }

    private a() {
    }

    public static a e0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        C0047a c0047a = null;
        switch (C0047a.f3131a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0047a);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<a> bVar = PARSER;
                if (bVar == null) {
                    synchronized (a.class) {
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

    public boolean f0() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean g0() {
        return (this.bitField0_ & 2) != 0;
    }
}
