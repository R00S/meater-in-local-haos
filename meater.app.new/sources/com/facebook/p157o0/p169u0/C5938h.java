package com.facebook.p157o0.p169u0;

import android.app.Activity;
import com.facebook.C5641a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.p157o0.p165q0.C5901f;
import com.facebook.p157o0.p166r0.C5919h;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SuggestedEventsManager.kt */
/* renamed from: com.facebook.o0.u0.h */
/* loaded from: classes2.dex */
public final class C5938h {

    /* renamed from: a */
    public static final C5938h f15513a = new C5938h();

    /* renamed from: b */
    private static final AtomicBoolean f15514b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final Set<String> f15515c = new LinkedHashSet();

    /* renamed from: d */
    private static final Set<String> f15516d = new LinkedHashSet();

    private C5938h() {
    }

    /* renamed from: a */
    public static final synchronized void m12801a() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.u0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5938h.m12802b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12802b() {
        AtomicBoolean atomicBoolean = f15514b;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        f15513a.m12803c();
    }

    /* renamed from: c */
    private final void m12803c() {
        String strM11409m;
        try {
            C5672d0 c5672d0 = C5672d0.f14392a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5670c0 c5670c0M11428o = C5672d0.m11428o(C5641a0.m11285d(), false);
            if (c5670c0M11428o == null || (strM11409m = c5670c0M11428o.m11409m()) == null) {
                return;
            }
            m12808g(strM11409m);
            if ((!f15515c.isEmpty()) || (!f15516d.isEmpty())) {
                C5919h c5919h = C5919h.f15431a;
                File fileM12691i = C5919h.m12691i(C5919h.a.MTML_APP_EVENT_PREDICTION);
                if (fileM12691i == null) {
                    return;
                }
                C5935e c5935e = C5935e.f15501a;
                C5935e.m12781d(fileM12691i);
                C5901f c5901f = C5901f.f15358a;
                Activity activityM12605g = C5901f.m12605g();
                if (activityM12605g != null) {
                    m12807h(activityM12605g);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final boolean m12804d(String str) {
        C9801m.m32346f(str, "event");
        return f15516d.contains(str);
    }

    /* renamed from: e */
    public static final boolean m12805e(String str) {
        C9801m.m32346f(str, "event");
        return f15515c.contains(str);
    }

    /* renamed from: h */
    public static final void m12807h(Activity activity) {
        C9801m.m32346f(activity, "activity");
        try {
            if (f15514b.get()) {
                C5935e c5935e = C5935e.f15501a;
                if (C5935e.m12783f() && (!f15515c.isEmpty() || !f15516d.isEmpty())) {
                    ViewTreeObserverOnGlobalLayoutListenerC5939i.f15517f.m12817a(activity);
                    return;
                }
            }
            ViewTreeObserverOnGlobalLayoutListenerC5939i.f15517f.m12818b(activity);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public final void m12808g(String str) throws JSONException {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    Set<String> set = f15515c;
                    String string = jSONArray2.getString(i3);
                    C9801m.m32345e(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i4 >= length2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i5 = i2 + 1;
                Set<String> set2 = f15516d;
                String string2 = jSONArray.getString(i2);
                C9801m.m32345e(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i5 >= length) {
                    return;
                } else {
                    i2 = i5;
                }
            }
        } catch (Exception unused) {
        }
    }
}
