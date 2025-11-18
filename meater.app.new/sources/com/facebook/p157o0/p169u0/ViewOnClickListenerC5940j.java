package com.facebook.p157o0.p169u0;

import android.os.Bundle;
import android.view.View;
import com.facebook.C5641a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.C5825g0;
import com.facebook.p157o0.p160m0.p161n.C5874f;
import com.facebook.p157o0.p166r0.C5919h;
import com.facebook.p157o0.p169u0.ViewOnClickListenerC5940j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewOnClickListener.kt */
/* renamed from: com.facebook.o0.u0.j */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5940j implements View.OnClickListener {

    /* renamed from: f */
    public static final a f15522f = new a(null);

    /* renamed from: g */
    private static final Set<Integer> f15523g = new HashSet();

    /* renamed from: h */
    private final View.OnClickListener f15524h;

    /* renamed from: i */
    private final WeakReference<View> f15525i;

    /* renamed from: j */
    private final WeakReference<View> f15526j;

    /* renamed from: k */
    private final String f15527k;

    /* compiled from: ViewOnClickListener.kt */
    /* renamed from: com.facebook.o0.u0.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m12827e(String str, String str2, float[] fArr) throws JSONException {
            C5938h c5938h = C5938h.f15513a;
            if (C5938h.m12805e(str)) {
                C5641a0 c5641a0 = C5641a0.f14199a;
                new C5825g0(C5641a0.m11284c()).m12243e(str, str2);
            } else if (C5938h.m12804d(str)) {
                m12830h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final boolean m12828f(String str, final String str2) {
            C5936f c5936f = C5936f.f15507a;
            final String strM12795d = C5936f.m12795d(str);
            if (strM12795d == null) {
                return false;
            }
            if (C9801m.m32341a(strM12795d, "other")) {
                return true;
            }
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11527B0(new Runnable() { // from class: com.facebook.o0.u0.c
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ViewOnClickListenerC5940j.a.m12829g(strM12795d, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m12829g(String str, String str2) throws JSONException {
            C9801m.m32346f(str, "$queriedEvent");
            C9801m.m32346f(str2, "$buttonText");
            ViewOnClickListenerC5940j.f15522f.m12827e(str, str2, new float[0]);
        }

        /* renamed from: h */
        private final void m12830h(String str, String str2, float[] fArr) throws JSONException {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                int length = fArr.length;
                int i2 = 0;
                while (i2 < length) {
                    float f2 = fArr[i2];
                    i2++;
                    sb.append(f2);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.C5632c c5632c = GraphRequest.f14159a;
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                Locale locale = Locale.US;
                C5641a0 c5641a0 = C5641a0.f14199a;
                String str3 = String.format(locale, "%s/suggested_events", Arrays.copyOf(new Object[]{C5641a0.m11285d()}, 1));
                C9801m.m32345e(str3, "java.lang.String.format(locale, format, *args)");
                GraphRequest graphRequestM11222A = c5632c.m11222A(null, str3, null, null);
                graphRequestM11222A.m11177H(bundle);
                graphRequestM11222A.m11179j();
            } catch (JSONException unused) {
            }
        }

        /* renamed from: c */
        public final void m12831c(View view, View view2, String str) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            C9801m.m32346f(view, "hostView");
            C9801m.m32346f(view2, "rootView");
            C9801m.m32346f(str, "activityName");
            int iHashCode = view.hashCode();
            if (ViewOnClickListenerC5940j.f15523g.contains(Integer.valueOf(iHashCode))) {
                return;
            }
            C5874f c5874f = C5874f.f15257a;
            C5874f.m12484r(view, new ViewOnClickListenerC5940j(view, view2, str, null));
            ViewOnClickListenerC5940j.f15523g.add(Integer.valueOf(iHashCode));
        }
    }

    private ViewOnClickListenerC5940j(View view, View view2, String str) {
        C5874f c5874f = C5874f.f15257a;
        this.f15524h = C5874f.m12474g(view);
        this.f15525i = new WeakReference<>(view2);
        this.f15526j = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f15527k = C10546u.m37507A(lowerCase, "activity", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
    }

    public /* synthetic */ ViewOnClickListenerC5940j(View view, View view2, String str, C9789g c9789g) {
        this(view, view2, str);
    }

    /* renamed from: c */
    private final void m12821c(final String str, final String str2, final JSONObject jSONObject) {
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11527B0(new Runnable() { // from class: com.facebook.o0.u0.d
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC5940j.m12822d(jSONObject, str2, this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12822d(JSONObject jSONObject, String str, ViewOnClickListenerC5940j viewOnClickListenerC5940j, String str2) {
        C9801m.m32346f(jSONObject, "$viewData");
        C9801m.m32346f(str, "$buttonText");
        C9801m.m32346f(viewOnClickListenerC5940j, "this$0");
        C9801m.m32346f(str2, "$pathID");
        try {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            String strM11592s = C5696p0.m11592s(C5641a0.m11284c());
            if (strM11592s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strM11592s.toLowerCase();
            C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
            C5935e c5935e = C5935e.f15501a;
            float[] fArrM12778a = C5935e.m12778a(jSONObject, lowerCase);
            String strM12780c = C5935e.m12780c(str, viewOnClickListenerC5940j.f15527k, lowerCase);
            if (fArrM12778a == null) {
                return;
            }
            C5919h c5919h = C5919h.f15431a;
            String[] strArrM12699q = C5919h.m12699q(C5919h.a.MTML_APP_EVENT_PREDICTION, new float[][]{fArrM12778a}, new String[]{strM12780c});
            if (strArrM12699q == null) {
                return;
            }
            String str3 = strArrM12699q[0];
            C5936f c5936f = C5936f.f15507a;
            C5936f.m12792a(str2, str3);
            if (C9801m.m32341a(str3, "other")) {
                return;
            }
            f15522f.m12827e(str3, str, fArrM12778a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final void m12823e() throws JSONException {
        View view = this.f15525i.get();
        View view2 = this.f15526j.get();
        if (view == null || view2 == null) {
            return;
        }
        try {
            C5937g c5937g = C5937g.f15511a;
            String strM12799d = C5937g.m12799d(view2);
            C5936f c5936f = C5936f.f15507a;
            String strM12793b = C5936f.m12793b(view2, strM12799d);
            if (strM12793b == null || f15522f.m12828f(strM12793b, strM12799d)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view", C5937g.m12797b(view, view2));
            jSONObject.put("screenname", this.f15527k);
            m12821c(strM12793b, strM12799d, jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws JSONException {
        C9801m.m32346f(view, "view");
        View.OnClickListener onClickListener = this.f15524h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        m12823e();
    }
}
