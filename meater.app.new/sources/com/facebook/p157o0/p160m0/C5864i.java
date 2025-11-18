package com.facebook.p157o0.p160m0;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C5641a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5697q;
import com.facebook.p157o0.p160m0.C5868m;
import com.facebook.p157o0.p165q0.C5902g;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CodelessManager.kt */
/* renamed from: com.facebook.o0.m0.i */
/* loaded from: classes.dex */
public final class C5864i {

    /* renamed from: c */
    private static SensorManager f15176c;

    /* renamed from: d */
    private static C5867l f15177d;

    /* renamed from: e */
    private static String f15178e;

    /* renamed from: h */
    private static volatile boolean f15181h;

    /* renamed from: a */
    public static final C5864i f15174a = new C5864i();

    /* renamed from: b */
    private static final C5868m f15175b = new C5868m();

    /* renamed from: f */
    private static final AtomicBoolean f15179f = new AtomicBoolean(true);

    /* renamed from: g */
    private static final AtomicBoolean f15180g = new AtomicBoolean(false);

    private C5864i() {
    }

    /* renamed from: a */
    private final void m12379a(final String str) {
        if (f15181h) {
            return;
        }
        f15181h = true;
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.b
            @Override // java.lang.Runnable
            public final void run() {
                C5864i.m12380b(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12380b(String str) {
        Bundle bundle = new Bundle();
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5697q c5697qM11628e = C5697q.f14488a.m11628e(C5641a0.m11284c());
        JSONArray jSONArray = new JSONArray();
        String str2 = Build.MODEL;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONArray.put(str2);
        if ((c5697qM11628e == null ? null : c5697qM11628e.m11618h()) != null) {
            jSONArray.put(c5697qM11628e.m11618h());
        } else {
            jSONArray.put(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        jSONArray.put("0");
        C5902g c5902g = C5902g.f15370a;
        jSONArray.put(C5902g.m12629f() ? "1" : "0");
        C5696p0 c5696p0 = C5696p0.f14478a;
        Locale localeM11602y = C5696p0.m11602y();
        jSONArray.put(localeM11602y.getLanguage() + '_' + ((Object) localeM11602y.getCountry()));
        String string = jSONArray.toString();
        C9801m.m32345e(string, "extInfoArray.toString()");
        bundle.putString("device_session_id", m12383e());
        bundle.putString("extinfo", string);
        GraphRequest.C5632c c5632c = GraphRequest.f14159a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str3 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
        C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
        JSONObject jSONObjectM11339c = c5632c.m11223B(null, str3, bundle, null).m11179j().m11339c();
        AtomicBoolean atomicBoolean = f15180g;
        atomicBoolean.set(jSONObjectM11339c != null && jSONObjectM11339c.optBoolean("is_app_indexing_enabled", false));
        if (atomicBoolean.get()) {
            C5867l c5867l = f15177d;
            if (c5867l != null) {
                c5867l.m12428h();
            }
        } else {
            f15178e = null;
        }
        f15181h = false;
    }

    /* renamed from: c */
    public static final void m12381c() {
        f15179f.set(false);
    }

    /* renamed from: d */
    public static final void m12382d() {
        f15179f.set(true);
    }

    /* renamed from: e */
    public static final String m12383e() {
        if (f15178e == null) {
            f15178e = UUID.randomUUID().toString();
        }
        String str = f15178e;
        if (str != null) {
            return str;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: f */
    public static final boolean m12384f() {
        return f15180g.get();
    }

    /* renamed from: g */
    private final boolean m12385g() {
        return false;
    }

    /* renamed from: j */
    public static final void m12388j(Activity activity) {
        C9801m.m32346f(activity, "activity");
        C5865j.f15182a.m12403a().m12401e(activity);
    }

    /* renamed from: k */
    public static final void m12389k(Activity activity) {
        C9801m.m32346f(activity, "activity");
        if (f15179f.get()) {
            C5865j.f15182a.m12403a().m12402h(activity);
            C5867l c5867l = f15177d;
            if (c5867l != null) {
                c5867l.m12429l();
            }
            SensorManager sensorManager = f15176c;
            if (sensorManager == null) {
                return;
            }
            sensorManager.unregisterListener(f15175b);
        }
    }

    /* renamed from: l */
    public static final void m12390l(Activity activity) {
        C9801m.m32346f(activity, "activity");
        if (f15179f.get()) {
            C5865j.f15182a.m12403a().m12400d(activity);
            Context applicationContext = activity.getApplicationContext();
            C5641a0 c5641a0 = C5641a0.f14199a;
            final String strM11285d = C5641a0.m11285d();
            C5672d0 c5672d0 = C5672d0.f14392a;
            final C5670c0 c5670c0M11417c = C5672d0.m11417c(strM11285d);
            if (C9801m.m32341a(c5670c0M11417c == null ? null : Boolean.valueOf(c5670c0M11417c.m11398b()), Boolean.TRUE) || f15174a.m12385g()) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                f15176c = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                C5867l c5867l = new C5867l(activity);
                f15177d = c5867l;
                C5868m c5868m = f15175b;
                c5868m.m12434a(new C5868m.b() { // from class: com.facebook.o0.m0.c
                    @Override // com.facebook.p157o0.p160m0.C5868m.b
                    /* renamed from: a */
                    public final void mo12370a() {
                        C5864i.m12391m(c5670c0M11417c, strM11285d);
                    }
                });
                sensorManager.registerListener(c5868m, defaultSensor, 2);
                if (c5670c0M11417c != null && c5670c0M11417c.m11398b()) {
                    c5867l.m12428h();
                }
            }
            C5864i c5864i = f15174a;
            if (!c5864i.m12385g() || f15180g.get()) {
                return;
            }
            c5864i.m12379a(strM11285d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m12391m(C5670c0 c5670c0, String str) {
        C9801m.m32346f(str, "$appId");
        boolean z = c5670c0 != null && c5670c0.m11398b();
        C5641a0 c5641a0 = C5641a0.f14199a;
        boolean z2 = C5641a0.m11291j();
        if (z && z2) {
            f15174a.m12379a(str);
        }
    }

    /* renamed from: n */
    public static final void m12392n(boolean z) {
        f15180g.set(z);
    }
}
