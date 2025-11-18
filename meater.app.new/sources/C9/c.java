package C9;

import C9.a;
import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.Q;
import com.google.protobuf.Y;
import com.google.protobuf.r0;
import java.util.Map;

/* compiled from: ApplicationInfo.java */
/* loaded from: classes2.dex */
public final class c extends AbstractC2962w<c, b> implements Q {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Y<c> PARSER;
    private C9.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private J<String, String> customAttributes_ = J.g();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* compiled from: ApplicationInfo.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3133a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3133a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3133a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3133a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3133a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3133a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3133a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3133a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ApplicationInfo.java */
    public static final class b extends AbstractC2962w.a<c, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean L() {
            return ((c) this.f39470C).k0();
        }

        public b M(Map<String, String> map) {
            C();
            ((c) this.f39470C).i0().putAll(map);
            return this;
        }

        public b N(a.b bVar) {
            C();
            ((c) this.f39470C).p0(bVar.e());
            return this;
        }

        public b O(String str) {
            C();
            ((c) this.f39470C).q0(str);
            return this;
        }

        public b P(d dVar) {
            C();
            ((c) this.f39470C).r0(dVar);
            return this;
        }

        public b Q(String str) {
            C();
            ((c) this.f39470C).s0(str);
            return this;
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: C9.c$c, reason: collision with other inner class name */
    private static final class C0049c {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, String> f3134a;

        static {
            r0.b bVar = r0.b.f39365L;
            f3134a = I.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        AbstractC2962w.X(c.class, cVar);
    }

    private c() {
    }

    public static c h0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> i0() {
        return n0();
    }

    private J<String, String> n0() {
        if (!this.customAttributes_.l()) {
            this.customAttributes_ = this.customAttributes_.o();
        }
        return this.customAttributes_;
    }

    public static b o0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(C9.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(d dVar) {
        this.applicationProcessState_ = dVar.e();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3133a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.n(), "customAttributes_", C0049c.f3134a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<c> bVar = PARSER;
                if (bVar == null) {
                    synchronized (c.class) {
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

    public C9.a g0() {
        C9.a aVar = this.androidAppInfo_;
        return aVar == null ? C9.a.e0() : aVar;
    }

    public boolean j0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean k0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean l0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean m0() {
        return (this.bitField0_ & 1) != 0;
    }
}
