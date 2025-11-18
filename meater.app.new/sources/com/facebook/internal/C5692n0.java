package com.facebook.internal;

import com.facebook.C5641a0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: ServerProtocol.kt */
/* renamed from: com.facebook.internal.n0 */
/* loaded from: classes2.dex */
public final class C5692n0 {

    /* renamed from: a */
    public static final C5692n0 f14464a = new C5692n0();

    /* renamed from: b */
    private static final String f14465b = C5692n0.class.getName();

    private C5692n0() {
    }

    /* renamed from: a */
    public static final String m11510a() {
        return "v16.0";
    }

    /* renamed from: b */
    public static final String m11511b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{C5641a0.m11293l()}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: c */
    public static final String m11512c() {
        return "CONNECTION_FAILURE";
    }

    /* renamed from: d */
    public static final Collection<String> m11513d() {
        return C10817u.m38891m("service_disabled", "AndroidAuthKillSwitchException");
    }

    /* renamed from: e */
    public static final Collection<String> m11514e() {
        return C10817u.m38891m("access_denied", "OAuthAccessDeniedException");
    }

    /* renamed from: f */
    public static final String m11515f() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C5641a0.m11293l()}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: g */
    public static final String m11516g() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str = String.format("%s", Arrays.copyOf(new Object[]{C5641a0.m11294m()}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: h */
    public static final String m11517h() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C5641a0.m11296o()}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: i */
    public static final String m11518i(String str) {
        C9801m.m32346f(str, "subdomain");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("https://graph.%s", Arrays.copyOf(new Object[]{str}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* renamed from: j */
    public static final String m11519j() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C5641a0.m11296o()}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: k */
    public static final String m11520k() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        String str = String.format("m.%s", Arrays.copyOf(new Object[]{C5641a0.m11297p()}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        return str;
    }
}
