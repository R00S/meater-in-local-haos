package io.sentry;

import io.sentry.C9519n3;
import io.sentry.profilemeasurements.C9536a;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ProfilingTraceData.java */
@ApiStatus.Internal
/* renamed from: io.sentry.m3 */
/* loaded from: classes2.dex */
public final class C9512m3 implements InterfaceC9578r2 {

    /* renamed from: A */
    private String f36473A;

    /* renamed from: B */
    private String f36474B;

    /* renamed from: C */
    private String f36475C;

    /* renamed from: D */
    private String f36476D;

    /* renamed from: E */
    private final Map<String, C9536a> f36477E;

    /* renamed from: F */
    private String f36478F;

    /* renamed from: G */
    private Map<String, Object> f36479G;

    /* renamed from: f */
    private final File f36480f;

    /* renamed from: g */
    private final Callable<List<Integer>> f36481g;

    /* renamed from: h */
    private int f36482h;

    /* renamed from: i */
    private String f36483i;

    /* renamed from: j */
    private String f36484j;

    /* renamed from: k */
    private String f36485k;

    /* renamed from: l */
    private String f36486l;

    /* renamed from: m */
    private String f36487m;

    /* renamed from: n */
    private String f36488n;

    /* renamed from: o */
    private boolean f36489o;

    /* renamed from: p */
    private String f36490p;

    /* renamed from: q */
    private List<Integer> f36491q;

    /* renamed from: r */
    private String f36492r;

    /* renamed from: s */
    private String f36493s;

    /* renamed from: t */
    private String f36494t;

    /* renamed from: u */
    private List<C9519n3> f36495u;

    /* renamed from: v */
    private String f36496v;

    /* renamed from: w */
    private String f36497w;

    /* renamed from: x */
    private String f36498x;

    /* renamed from: y */
    private String f36499y;

    /* renamed from: z */
    private String f36500z;

    /* compiled from: ProfilingTraceData.java */
    /* renamed from: io.sentry.m3$b */
    public static final class b implements InterfaceC9504l2<C9512m3> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9512m3 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            ConcurrentHashMap concurrentHashMap = null;
            C9512m3 c9512m3 = new C9512m3();
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "device_manufacturer":
                        String strM31090N0 = c9518n2.m31090N0();
                        if (strM31090N0 == null) {
                            break;
                        } else {
                            c9512m3.f36484j = strM31090N0;
                            break;
                        }
                    case "android_api_level":
                        Integer numM31084E0 = c9518n2.m31084E0();
                        if (numM31084E0 == null) {
                            break;
                        } else {
                            c9512m3.f36482h = numM31084E0.intValue();
                            break;
                        }
                    case "build_id":
                        String strM31090N02 = c9518n2.m31090N0();
                        if (strM31090N02 == null) {
                            break;
                        } else {
                            c9512m3.f36494t = strM31090N02;
                            break;
                        }
                    case "device_locale":
                        String strM31090N03 = c9518n2.m31090N0();
                        if (strM31090N03 == null) {
                            break;
                        } else {
                            c9512m3.f36483i = strM31090N03;
                            break;
                        }
                    case "profile_id":
                        String strM31090N04 = c9518n2.m31090N0();
                        if (strM31090N04 == null) {
                            break;
                        } else {
                            c9512m3.f36474B = strM31090N04;
                            break;
                        }
                    case "device_os_build_number":
                        String strM31090N05 = c9518n2.m31090N0();
                        if (strM31090N05 == null) {
                            break;
                        } else {
                            c9512m3.f36486l = strM31090N05;
                            break;
                        }
                    case "device_model":
                        String strM31090N06 = c9518n2.m31090N0();
                        if (strM31090N06 == null) {
                            break;
                        } else {
                            c9512m3.f36485k = strM31090N06;
                            break;
                        }
                    case "device_is_emulator":
                        Boolean boolM31093p0 = c9518n2.m31093p0();
                        if (boolM31093p0 == null) {
                            break;
                        } else {
                            c9512m3.f36489o = boolM31093p0.booleanValue();
                            break;
                        }
                    case "duration_ns":
                        String strM31090N07 = c9518n2.m31090N0();
                        if (strM31090N07 == null) {
                            break;
                        } else {
                            c9512m3.f36497w = strM31090N07;
                            break;
                        }
                    case "measurements":
                        Map mapM31087J0 = c9518n2.m31087J0(interfaceC9670w1, new C9536a.a());
                        if (mapM31087J0 == null) {
                            break;
                        } else {
                            c9512m3.f36477E.putAll(mapM31087J0);
                            break;
                        }
                    case "device_physical_memory_bytes":
                        String strM31090N08 = c9518n2.m31090N0();
                        if (strM31090N08 == null) {
                            break;
                        } else {
                            c9512m3.f36492r = strM31090N08;
                            break;
                        }
                    case "device_cpu_frequencies":
                        List list = (List) c9518n2.m31088K0();
                        if (list == null) {
                            break;
                        } else {
                            c9512m3.f36491q = list;
                            break;
                        }
                    case "version_code":
                        String strM31090N09 = c9518n2.m31090N0();
                        if (strM31090N09 == null) {
                            break;
                        } else {
                            c9512m3.f36498x = strM31090N09;
                            break;
                        }
                    case "version_name":
                        String strM31090N010 = c9518n2.m31090N0();
                        if (strM31090N010 == null) {
                            break;
                        } else {
                            c9512m3.f36499y = strM31090N010;
                            break;
                        }
                    case "environment":
                        String strM31090N011 = c9518n2.m31090N0();
                        if (strM31090N011 == null) {
                            break;
                        } else {
                            c9512m3.f36475C = strM31090N011;
                            break;
                        }
                    case "transaction_name":
                        String strM31090N012 = c9518n2.m31090N0();
                        if (strM31090N012 == null) {
                            break;
                        } else {
                            c9512m3.f36496v = strM31090N012;
                            break;
                        }
                    case "device_os_name":
                        String strM31090N013 = c9518n2.m31090N0();
                        if (strM31090N013 == null) {
                            break;
                        } else {
                            c9512m3.f36487m = strM31090N013;
                            break;
                        }
                    case "architecture":
                        String strM31090N014 = c9518n2.m31090N0();
                        if (strM31090N014 == null) {
                            break;
                        } else {
                            c9512m3.f36490p = strM31090N014;
                            break;
                        }
                    case "transaction_id":
                        String strM31090N015 = c9518n2.m31090N0();
                        if (strM31090N015 == null) {
                            break;
                        } else {
                            c9512m3.f36500z = strM31090N015;
                            break;
                        }
                    case "device_os_version":
                        String strM31090N016 = c9518n2.m31090N0();
                        if (strM31090N016 == null) {
                            break;
                        } else {
                            c9512m3.f36488n = strM31090N016;
                            break;
                        }
                    case "truncation_reason":
                        String strM31090N017 = c9518n2.m31090N0();
                        if (strM31090N017 == null) {
                            break;
                        } else {
                            c9512m3.f36476D = strM31090N017;
                            break;
                        }
                    case "trace_id":
                        String strM31090N018 = c9518n2.m31090N0();
                        if (strM31090N018 == null) {
                            break;
                        } else {
                            c9512m3.f36473A = strM31090N018;
                            break;
                        }
                    case "platform":
                        String strM31090N019 = c9518n2.m31090N0();
                        if (strM31090N019 == null) {
                            break;
                        } else {
                            c9512m3.f36493s = strM31090N019;
                            break;
                        }
                    case "sampled_profile":
                        String strM31090N020 = c9518n2.m31090N0();
                        if (strM31090N020 == null) {
                            break;
                        } else {
                            c9512m3.f36478F = strM31090N020;
                            break;
                        }
                    case "transactions":
                        List listM31085F0 = c9518n2.m31085F0(interfaceC9670w1, new C9519n3.a());
                        if (listM31085F0 == null) {
                            break;
                        } else {
                            c9512m3.f36495u.addAll(listM31085F0);
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                        break;
                }
            }
            c9512m3.m31060F(concurrentHashMap);
            c9518n2.m31889j();
            return c9512m3;
        }
    }

    /* renamed from: B */
    private boolean m31030B() {
        return this.f36476D.equals("normal") || this.f36476D.equals("timeout") || this.f36476D.equals("backgrounded");
    }

    /* renamed from: C */
    static /* synthetic */ List m31031C() throws Exception {
        return new ArrayList();
    }

    /* renamed from: A */
    public File m31057A() {
        return this.f36480f;
    }

    /* renamed from: D */
    public void m31058D() {
        try {
            this.f36491q = this.f36481g.call();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: E */
    public void m31059E(String str) {
        this.f36478F = str;
    }

    /* renamed from: F */
    public void m31060F(Map<String, Object> map) {
        this.f36479G = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("android_api_level").mo30824g(interfaceC9670w1, Integer.valueOf(this.f36482h));
        interfaceC9448h3.mo30828k("device_locale").mo30824g(interfaceC9670w1, this.f36483i);
        interfaceC9448h3.mo30828k("device_manufacturer").mo30819b(this.f36484j);
        interfaceC9448h3.mo30828k("device_model").mo30819b(this.f36485k);
        interfaceC9448h3.mo30828k("device_os_build_number").mo30819b(this.f36486l);
        interfaceC9448h3.mo30828k("device_os_name").mo30819b(this.f36487m);
        interfaceC9448h3.mo30828k("device_os_version").mo30819b(this.f36488n);
        interfaceC9448h3.mo30828k("device_is_emulator").mo30820c(this.f36489o);
        interfaceC9448h3.mo30828k("architecture").mo30824g(interfaceC9670w1, this.f36490p);
        interfaceC9448h3.mo30828k("device_cpu_frequencies").mo30824g(interfaceC9670w1, this.f36491q);
        interfaceC9448h3.mo30828k("device_physical_memory_bytes").mo30819b(this.f36492r);
        interfaceC9448h3.mo30828k("platform").mo30819b(this.f36493s);
        interfaceC9448h3.mo30828k("build_id").mo30819b(this.f36494t);
        interfaceC9448h3.mo30828k("transaction_name").mo30819b(this.f36496v);
        interfaceC9448h3.mo30828k("duration_ns").mo30819b(this.f36497w);
        interfaceC9448h3.mo30828k("version_name").mo30819b(this.f36499y);
        interfaceC9448h3.mo30828k("version_code").mo30819b(this.f36498x);
        if (!this.f36495u.isEmpty()) {
            interfaceC9448h3.mo30828k("transactions").mo30824g(interfaceC9670w1, this.f36495u);
        }
        interfaceC9448h3.mo30828k("transaction_id").mo30819b(this.f36500z);
        interfaceC9448h3.mo30828k("trace_id").mo30819b(this.f36473A);
        interfaceC9448h3.mo30828k("profile_id").mo30819b(this.f36474B);
        interfaceC9448h3.mo30828k("environment").mo30819b(this.f36475C);
        interfaceC9448h3.mo30828k("truncation_reason").mo30819b(this.f36476D);
        if (this.f36478F != null) {
            interfaceC9448h3.mo30828k("sampled_profile").mo30819b(this.f36478F);
        }
        interfaceC9448h3.mo30828k("measurements").mo30824g(interfaceC9670w1, this.f36477E);
        Map<String, Object> map = this.f36479G;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36479G.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    /* renamed from: z */
    public String m31061z() {
        return this.f36474B;
    }

    private C9512m3() {
        this(new File("dummy"), C9420d3.m30717r());
    }

    public C9512m3(File file, InterfaceC9426e2 interfaceC9426e2) {
        this(file, new ArrayList(), interfaceC9426e2, "0", 0, HttpUrl.FRAGMENT_ENCODE_SET, new Callable() { // from class: io.sentry.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9512m3.m31031C();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public C9512m3(File file, List<C9519n3> list, InterfaceC9426e2 interfaceC9426e2, String str, int i2, String str2, Callable<List<Integer>> callable, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, Map<String, C9536a> map) {
        this.f36491q = new ArrayList();
        this.f36478F = null;
        this.f36480f = file;
        this.f36490p = str2;
        this.f36481g = callable;
        this.f36482h = i2;
        this.f36483i = Locale.getDefault().toString();
        String str11 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36484j = str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36485k = str4 != null ? str4 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36488n = str5 != null ? str5 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36489o = bool != null ? bool.booleanValue() : false;
        this.f36492r = str6 != null ? str6 : "0";
        this.f36486l = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36487m = "android";
        this.f36493s = "android";
        this.f36494t = str7 != null ? str7 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36495u = list;
        this.f36496v = interfaceC9426e2.getName();
        this.f36497w = str;
        this.f36498x = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f36499y = str8 != null ? str8 : str11;
        this.f36500z = interfaceC9426e2.mo30525k().toString();
        this.f36473A = interfaceC9426e2.mo30527m().m30803k().toString();
        this.f36474B = UUID.randomUUID().toString();
        this.f36475C = str9 != null ? str9 : "production";
        this.f36476D = str10;
        if (!m31030B()) {
            this.f36476D = "normal";
        }
        this.f36477E = map;
    }
}
