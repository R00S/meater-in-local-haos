package com.facebook.p157o0.p167s0;

import android.os.Bundle;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.C5941v;
import com.facebook.p157o0.p162n0.C5876a;
import com.facebook.p157o0.p167s0.C5927e;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;

/* compiled from: RemoteServiceParametersHelper.kt */
/* renamed from: com.facebook.o0.s0.d */
/* loaded from: classes2.dex */
public final class C5926d {

    /* renamed from: a */
    public static final C5926d f15460a = new C5926d();

    /* renamed from: b */
    private static final String f15461b = C5927e.class.getSimpleName();

    private C5926d() {
    }

    /* renamed from: a */
    public static final Bundle m12748a(C5927e.a aVar, String str, List<C5941v> list) {
        C9801m.m32346f(aVar, "eventType");
        C9801m.m32346f(str, "applicationId");
        C9801m.m32346f(list, "appEvents");
        Bundle bundle = new Bundle();
        bundle.putString("event", aVar.toString());
        bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, str);
        if (C5927e.a.CUSTOM_APP_EVENTS == aVar) {
            JSONArray jSONArrayM12749b = f15460a.m12749b(list, str);
            if (jSONArrayM12749b.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayM12749b.toString());
        }
        return bundle;
    }

    /* renamed from: b */
    private final JSONArray m12749b(List<C5941v> list, String str) {
        JSONArray jSONArray = new JSONArray();
        List<C5941v> listM38571G0 = C10782c0.m38571G0(list);
        C5876a c5876a = C5876a.f15262a;
        C5876a.m12490d(listM38571G0);
        boolean zM12750c = m12750c(str);
        for (C5941v c5941v : listM38571G0) {
            if (!c5941v.m12839g()) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5696p0.m11575j0(f15461b, C9801m.m32354n("Event with invalid checksum: ", c5941v));
            } else if ((!c5941v.m12840h()) || (c5941v.m12840h() && zM12750c)) {
                jSONArray.put(c5941v.m12837e());
            }
        }
        return jSONArray;
    }

    /* renamed from: c */
    private final boolean m12750c(String str) {
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5670c0 c5670c0M11428o = C5672d0.m11428o(str, false);
        if (c5670c0M11428o != null) {
            return c5670c0M11428o.m11410n();
        }
        return false;
    }
}
