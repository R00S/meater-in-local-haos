package X8;

import K6.h;
import M6.u;
import Q8.D;
import Q8.Q;
import T8.F;
import U8.j;
import android.content.Context;
import java.nio.charset.Charset;
import z7.AbstractC5208j;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final j f18897c = new j();

    /* renamed from: d, reason: collision with root package name */
    private static final String f18898d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f18899e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f, reason: collision with root package name */
    private static final h<F, byte[]> f18900f = new h() { // from class: X8.a
        @Override // K6.h
        public final Object apply(Object obj) {
            return b.d((F) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final e f18901a;

    /* renamed from: b, reason: collision with root package name */
    private final h<F, byte[]> f18902b;

    b(e eVar, h<F, byte[]> hVar) {
        this.f18901a = eVar;
        this.f18902b = hVar;
    }

    public static b b(Context context, Y8.j jVar, Q q10) {
        u.f(context);
        K6.j jVarG = u.c().g(new com.google.android.datatransport.cct.a(f18898d, f18899e));
        K6.c cVarB = K6.c.b("json");
        h<F, byte[]> hVar = f18900f;
        return new b(new e(jVarG.a("FIREBASE_CRASHLYTICS_REPORT", F.class, cVarB, hVar), jVar.b(), q10), hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(F f10) {
        return f18897c.M(f10).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public AbstractC5208j<D> c(D d10, boolean z10) {
        return this.f18901a.i(d10, z10).a();
    }
}
