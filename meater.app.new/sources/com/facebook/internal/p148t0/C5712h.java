package com.facebook.internal.p148t0;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5641a0;
import com.facebook.C5646c0;
import com.facebook.C5653d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5666a0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.p148t0.C5713i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExceptionAnalyzer.kt */
/* renamed from: com.facebook.internal.t0.h */
/* loaded from: classes2.dex */
public final class C5712h {

    /* renamed from: a */
    public static final C5712h f14569a = new C5712h();

    /* renamed from: b */
    private static boolean f14570b;

    private C5712h() {
    }

    /* renamed from: a */
    public static final void m11714a() {
        C5712h c5712h = f14569a;
        f14570b = true;
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            c5712h.m11719e();
        }
    }

    /* renamed from: b */
    public static final void m11715b(Throwable th) throws IOException {
        if (!f14570b || m11716c() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        C9801m.m32345e(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C5666a0 c5666a0 = C5666a0.f14313a;
            String className = stackTraceElement.getClassName();
            C9801m.m32345e(className, "it.className");
            C5666a0.b bVarM11375d = C5666a0.m11375d(className);
            if (bVarM11375d != C5666a0.b.Unknown) {
                C5666a0.m11374c(bVarM11375d);
                hashSet.add(bVarM11375d.toString());
            }
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g() && (!hashSet.isEmpty())) {
            C5713i.a aVar = C5713i.a.f14579a;
            C5713i.a.m11729c(new JSONArray((Collection) hashSet)).m11726g();
        }
    }

    /* renamed from: c */
    public static final boolean m11716c() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11718f(C5713i c5713i, C5653d0 c5653d0) {
        C9801m.m32346f(c5713i, "$instrumentData");
        C9801m.m32346f(c5653d0, "response");
        try {
            if (c5653d0.m11338b() == null) {
                JSONObject jSONObjectM11340d = c5653d0.m11340d();
                if (C9801m.m32341a(jSONObjectM11340d == null ? null : Boolean.valueOf(jSONObjectM11340d.getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)), Boolean.TRUE)) {
                    c5713i.m11723a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: e */
    public final void m11719e() throws JSONException {
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (C5696p0.m11553X()) {
            return;
        }
        C5715k c5715k = C5715k.f14590a;
        File[] fileArrM11755n = C5715k.m11755n();
        ArrayList arrayList = new ArrayList();
        int length = fileArrM11755n.length;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArrM11755n[i2];
            i2++;
            C5713i.a aVar = C5713i.a.f14579a;
            final C5713i c5713iM11730d = C5713i.a.m11730d(file);
            if (c5713iM11730d.m11725f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", c5713iM11730d.toString());
                    GraphRequest.C5632c c5632c = GraphRequest.f14159a;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                    C5641a0 c5641a0 = C5641a0.f14199a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{C5641a0.m11285d()}, 1));
                    C9801m.m32345e(str, "java.lang.String.format(format, *args)");
                    arrayList.add(c5632c.m11222A(null, str, jSONObject, new GraphRequest.InterfaceC5631b() { // from class: com.facebook.internal.t0.a
                        @Override // com.facebook.GraphRequest.InterfaceC5631b
                        /* renamed from: b */
                        public final void mo11196b(C5653d0 c5653d0) {
                            C5712h.m11718f(c5713iM11730d, c5653d0);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C5646c0(arrayList).m11326o();
    }
}
