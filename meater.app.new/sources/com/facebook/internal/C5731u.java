package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C5641a0;
import com.facebook.login.C5797q;
import java.util.ArrayList;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import p024c.p038c.p039b.C0859c;

/* compiled from: CustomTab.kt */
/* renamed from: com.facebook.internal.u */
/* loaded from: classes2.dex */
public class C5731u {

    /* renamed from: a */
    public static final a f14621a = new a(null);

    /* renamed from: b */
    private Uri f14622b;

    /* compiled from: CustomTab.kt */
    /* renamed from: com.facebook.internal.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public Uri m11800a(String str, Bundle bundle) {
            C9801m.m32346f(str, "action");
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5692n0 c5692n0 = C5692n0.f14464a;
            String strM11511b = C5692n0.m11511b();
            StringBuilder sb = new StringBuilder();
            C5641a0 c5641a0 = C5641a0.f14199a;
            sb.append(C5641a0.m11295n());
            sb.append("/dialog/");
            sb.append(str);
            return C5696p0.m11564e(strM11511b, sb.toString(), bundle);
        }
    }

    public C5731u(String str, Bundle bundle) {
        Uri uriM11800a;
        C9801m.m32346f(str, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        EnumC5674e0[] enumC5674e0ArrValuesCustom = EnumC5674e0.valuesCustom();
        ArrayList arrayList = new ArrayList(enumC5674e0ArrValuesCustom.length);
        for (EnumC5674e0 enumC5674e0 : enumC5674e0ArrValuesCustom) {
            arrayList.add(enumC5674e0.m11433k());
        }
        if (arrayList.contains(str)) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5692n0 c5692n0 = C5692n0.f14464a;
            uriM11800a = C5696p0.m11564e(C5692n0.m11516g(), C9801m.m32354n("/dialog/", str), bundle);
        } else {
            uriM11800a = f14621a.m11800a(str, bundle);
        }
        this.f14622b = uriM11800a;
    }

    /* renamed from: a */
    public final boolean m11798a(Activity activity, String str) {
        C9801m.m32346f(activity, "activity");
        C0859c c0859cM5400c = new C0859c.a(C5797q.f14816f.m12054b()).m5400c();
        c0859cM5400c.f5675a.setPackage(str);
        try {
            c0859cM5400c.m5397a(activity, this.f14622b);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    protected final void m11799b(Uri uri) {
        C9801m.m32346f(uri, "<set-?>");
        this.f14622b = uri;
    }
}
