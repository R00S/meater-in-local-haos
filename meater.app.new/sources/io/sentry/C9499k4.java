package io.sentry;

import io.sentry.EnumC9580r4;
import io.sentry.util.C9646q;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeItemHeader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.k4 */
/* loaded from: classes2.dex */
public final class C9499k4 implements InterfaceC9578r2 {

    /* renamed from: f */
    private final String f36402f;

    /* renamed from: g */
    private final String f36403g;

    /* renamed from: h */
    private final EnumC9580r4 f36404h;

    /* renamed from: i */
    private final int f36405i;

    /* renamed from: j */
    private final Callable<Integer> f36406j;

    /* renamed from: k */
    private final String f36407k;

    /* renamed from: l */
    private Map<String, Object> f36408l;

    /* compiled from: SentryEnvelopeItemHeader.java */
    /* renamed from: io.sentry.k4$a */
    public static final class a implements InterfaceC9504l2<C9499k4> {
        /* renamed from: c */
        private Exception m30921c(String str, InterfaceC9670w1 interfaceC9670w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9499k4 mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            c9518n2.m31884b();
            HashMap map = null;
            EnumC9580r4 enumC9580r4 = null;
            String strM31090N0 = null;
            String strM31090N02 = null;
            String strM31090N03 = null;
            int iM31894z = 0;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "length":
                        iM31894z = c9518n2.m31894z();
                        break;
                    case "filename":
                        strM31090N02 = c9518n2.m31090N0();
                        break;
                    case "attachment_type":
                        strM31090N03 = c9518n2.m31090N0();
                        break;
                    case "type":
                        enumC9580r4 = (EnumC9580r4) c9518n2.m31089M0(interfaceC9670w1, new EnumC9580r4.a());
                        break;
                    case "content_type":
                        strM31090N0 = c9518n2.m31090N0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                        break;
                }
            }
            if (enumC9580r4 == null) {
                throw m30921c("type", interfaceC9670w1);
            }
            C9499k4 c9499k4 = new C9499k4(enumC9580r4, iM31894z, strM31090N0, strM31090N02, strM31090N03);
            c9499k4.m30920c(map);
            c9518n2.m31889j();
            return c9499k4;
        }
    }

    @ApiStatus.Internal
    public C9499k4(EnumC9580r4 enumC9580r4, int i2, String str, String str2, String str3) {
        this.f36404h = (EnumC9580r4) C9646q.m31802c(enumC9580r4, "type is required");
        this.f36402f = str;
        this.f36405i = i2;
        this.f36403g = str2;
        this.f36406j = null;
        this.f36407k = str3;
    }

    /* renamed from: a */
    public int m30918a() {
        Callable<Integer> callable = this.f36406j;
        if (callable == null) {
            return this.f36405i;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public EnumC9580r4 m30919b() {
        return this.f36404h;
    }

    /* renamed from: c */
    public void m30920c(Map<String, Object> map) {
        this.f36408l = map;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.f36402f != null) {
            interfaceC9448h3.mo30828k("content_type").mo30819b(this.f36402f);
        }
        if (this.f36403g != null) {
            interfaceC9448h3.mo30828k("filename").mo30819b(this.f36403g);
        }
        interfaceC9448h3.mo30828k("type").mo30824g(interfaceC9670w1, this.f36404h);
        if (this.f36407k != null) {
            interfaceC9448h3.mo30828k("attachment_type").mo30819b(this.f36407k);
        }
        interfaceC9448h3.mo30828k("length").mo30818a(m30918a());
        Map<String, Object> map = this.f36408l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36408l.get(str);
                interfaceC9448h3.mo30828k(str);
                interfaceC9448h3.mo30824g(interfaceC9670w1, obj);
            }
        }
        interfaceC9448h3.mo30821d();
    }

    C9499k4(EnumC9580r4 enumC9580r4, Callable<Integer> callable, String str, String str2, String str3) {
        this.f36404h = (EnumC9580r4) C9646q.m31802c(enumC9580r4, "type is required");
        this.f36402f = str;
        this.f36405i = -1;
        this.f36403g = str2;
        this.f36406j = callable;
        this.f36407k = str3;
    }

    C9499k4(EnumC9580r4 enumC9580r4, Callable<Integer> callable, String str, String str2) {
        this(enumC9580r4, callable, str, str2, (String) null);
    }
}
