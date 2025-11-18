package io.sentry;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import io.sentry.protocol.C9558q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TraceContext.java */
@ApiStatus.Experimental
/* renamed from: io.sentry.o5 */
/* loaded from: classes2.dex */
public final class C9528o5 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final C9558q f36539f;

    /* renamed from: g */
    private final String f36540g;

    /* renamed from: h */
    private final String f36541h;

    /* renamed from: i */
    private final String f36542i;

    /* renamed from: j */
    private final String f36543j;

    /* renamed from: k */
    private final String f36544k;

    /* renamed from: l */
    private final String f36545l;

    /* renamed from: m */
    private final String f36546m;

    /* renamed from: n */
    private final String f36547n;

    /* renamed from: o */
    private Map<String, Object> f36548o;

    /* compiled from: TraceContext.java */
    /* renamed from: io.sentry.o5$b */
    public static final class b implements InterfaceC9504l2<C9528o5> {
        /* renamed from: c */
        private Exception m31133c(String str, InterfaceC9670w1 interfaceC9670w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x0112 A[PHI: r4
          0x0112: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:66:0x0101, B:69:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.C9528o5 mo30683a(io.sentry.C9518n2 r19, io.sentry.InterfaceC9670w1 r20) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.C9528o5.b.mo30683a(io.sentry.n2, io.sentry.w1):io.sentry.o5");
        }
    }

    /* compiled from: TraceContext.java */
    @Deprecated
    /* renamed from: io.sentry.o5$c */
    private static final class c {

        /* renamed from: a */
        private String f36549a;

        /* renamed from: b */
        private String f36550b;

        /* renamed from: c */
        private Map<String, Object> f36551c;

        /* compiled from: TraceContext.java */
        /* renamed from: io.sentry.o5$c$a */
        public static final class a implements InterfaceC9504l2<c> {
            @Override // io.sentry.InterfaceC9504l2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
                c9518n2.m31884b();
                String strM31090N0 = null;
                String strM31090N02 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (c9518n2.m31882N() == EnumC9666b.NAME) {
                    String strM31879B = c9518n2.m31879B();
                    strM31879B.hashCode();
                    if (strM31879B.equals(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID)) {
                        strM31090N0 = c9518n2.m31090N0();
                    } else if (strM31879B.equals("segment")) {
                        strM31090N02 = c9518n2.m31090N0();
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, concurrentHashMap, strM31879B);
                    }
                }
                c cVar = new c(strM31090N0, strM31090N02);
                cVar.m31137c(concurrentHashMap);
                c9518n2.m31889j();
                return cVar;
            }
        }

        /* renamed from: a */
        public String m31135a() {
            return this.f36549a;
        }

        /* renamed from: b */
        public String m31136b() {
            return this.f36550b;
        }

        /* renamed from: c */
        public void m31137c(Map<String, Object> map) {
            this.f36551c = map;
        }

        private c(String str, String str2) {
            this.f36549a = str;
            this.f36550b = str2;
        }
    }

    C9528o5(C9558q c9558q, String str) {
        this(c9558q, str, null, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public String m31131a() {
        return this.f36546m;
    }

    /* renamed from: b */
    public void m31132b(Map<String, Object> map) {
        this.f36548o = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        interfaceC9448h3.mo30828k("trace_id").mo30824g(interfaceC9670w1, this.f36539f);
        interfaceC9448h3.mo30828k("public_key").mo30819b(this.f36540g);
        if (this.f36541h != null) {
            interfaceC9448h3.mo30828k("release").mo30819b(this.f36541h);
        }
        if (this.f36542i != null) {
            interfaceC9448h3.mo30828k("environment").mo30819b(this.f36542i);
        }
        if (this.f36543j != null) {
            interfaceC9448h3.mo30828k(TimeLineFollowFragment.BundleKeys.USER_ID).mo30819b(this.f36543j);
        }
        if (this.f36544k != null) {
            interfaceC9448h3.mo30828k("user_segment").mo30819b(this.f36544k);
        }
        if (this.f36545l != null) {
            interfaceC9448h3.mo30828k("transaction").mo30819b(this.f36545l);
        }
        if (this.f36546m != null) {
            interfaceC9448h3.mo30828k("sample_rate").mo30819b(this.f36546m);
        }
        if (this.f36547n != null) {
            interfaceC9448h3.mo30828k("sampled").mo30819b(this.f36547n);
        }
        Map<String, Object> map = this.f36548o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36548o.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9528o5(C9558q c9558q, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f36539f = c9558q;
        this.f36540g = str;
        this.f36541h = str2;
        this.f36542i = str3;
        this.f36543j = str4;
        this.f36544k = str5;
        this.f36545l = str6;
        this.f36546m = str7;
        this.f36547n = str8;
    }
}
