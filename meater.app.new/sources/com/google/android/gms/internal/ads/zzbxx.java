package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import cm.aptoide.p092pt.root.execution.Command;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbxx implements zzbzb {

    /* renamed from: a */
    private final Context f23716a;

    /* renamed from: b */
    private final zzbzc f23717b;

    /* renamed from: c */
    private final JSONObject f23718c;

    /* renamed from: d */
    private final zzccj f23719d;

    /* renamed from: e */
    private final zzbyt f23720e;

    /* renamed from: f */
    private final zzdh f23721f;

    /* renamed from: g */
    private final zzbrt f23722g;

    /* renamed from: h */
    private final zzbri f23723h;

    /* renamed from: i */
    private final zzcxm f23724i;

    /* renamed from: j */
    private final zzbai f23725j;

    /* renamed from: k */
    private final zzcxv f23726k;

    /* renamed from: l */
    private final zzbmn f23727l;

    /* renamed from: m */
    private final zzbzq f23728m;

    /* renamed from: n */
    private final Clock f23729n;

    /* renamed from: o */
    private final zzbva f23730o;

    /* renamed from: p */
    private final zzdae f23731p;

    /* renamed from: r */
    private boolean f23733r;

    /* renamed from: y */
    private zzaag f23740y;

    /* renamed from: q */
    private boolean f23732q = false;

    /* renamed from: s */
    private boolean f23734s = false;

    /* renamed from: t */
    private boolean f23735t = false;

    /* renamed from: u */
    private Point f23736u = new Point();

    /* renamed from: v */
    private Point f23737v = new Point();

    /* renamed from: w */
    private long f23738w = 0;

    /* renamed from: x */
    private long f23739x = 0;

    public zzbxx(Context context, zzbzc zzbzcVar, JSONObject jSONObject, zzccj zzccjVar, zzbyt zzbytVar, zzdh zzdhVar, zzbrt zzbrtVar, zzbri zzbriVar, zzcxm zzcxmVar, zzbai zzbaiVar, zzcxv zzcxvVar, zzbmn zzbmnVar, zzbzq zzbzqVar, Clock clock, zzbva zzbvaVar, zzdae zzdaeVar) {
        this.f23716a = context;
        this.f23717b = zzbzcVar;
        this.f23718c = jSONObject;
        this.f23719d = zzccjVar;
        this.f23720e = zzbytVar;
        this.f23721f = zzdhVar;
        this.f23722g = zzbrtVar;
        this.f23723h = zzbriVar;
        this.f23724i = zzcxmVar;
        this.f23725j = zzbaiVar;
        this.f23726k = zzcxvVar;
        this.f23727l = zzbmnVar;
        this.f23728m = zzbzqVar;
        this.f23729n = clock;
        this.f23730o = zzbvaVar;
        this.f23731p = zzdaeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4 A[Catch: JSONException -> 0x0100, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0100, blocks: (B:27:0x00cb, B:41:0x00f3, B:42:0x00f7, B:43:0x00fc, B:32:0x00da, B:35:0x00e4), top: B:51:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc A[Catch: JSONException -> 0x0100, TRY_LEAVE, TryCatch #4 {JSONException -> 0x0100, blocks: (B:27:0x00cb, B:41:0x00f3, B:42:0x00f7, B:43:0x00fc, B:32:0x00da, B:35:0x00e4), top: B:51:0x00cb }] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final org.json.JSONObject m18437A(android.view.View r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxx.m18437A(android.view.View):org.json.JSONObject");
    }

    /* renamed from: B */
    private static JSONObject m18438B(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzk.zzlg();
            jSONObject.put("contained_in_scroll_view", zzaxi.m17150e0(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: C */
    private final JSONObject m18439C(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzk.zzlg();
            jSONObject.put("can_show_on_lock_screen", zzaxi.m17148d0(view));
            zzk.zzlg();
            jSONObject.put("is_keyguard_locked", zzaxi.m17124D(this.f23716a));
        } catch (JSONException unused) {
            zzbad.m17353i("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: D */
    private final String m18440D(View view) {
        try {
            JSONObject jSONObjectOptJSONObject = this.f23718c.optJSONObject("tracking_urls_and_actions");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return this.f23721f.m19455f().zza(this.f23716a, jSONObjectOptJSONObject.optString("click_string"), view);
        } catch (Exception e2) {
            zzbad.m17347c("Exception obtaining click signals", e2);
            return null;
        }
    }

    /* renamed from: E */
    private static int[] m18441E(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* renamed from: p */
    private final JSONObject m18443p(Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrM18441E = m18441E(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<View>> next = it.next();
                View view2 = next.getValue().get();
                if (view2 != null) {
                    int[] iArrM18441E2 = m18441E(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", m18451x(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m18451x(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m18451x(iArrM18441E2[0] - iArrM18441E[0]));
                        jSONObject4.put("y", m18451x(iArrM18441E2[1] - iArrM18441E[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m18450w(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", m18451x(iArrM18441E2[0] - iArrM18441E[0]));
                            jSONObject.put("y", m18451x(iArrM18441E2[1] - iArrM18441E[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put(Command.CommandHandler.TEXT, textView.getText());
                            } catch (JSONException unused) {
                                zzbad.m17353i("Unable to get asset views information");
                                it = it2;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject3.put("is_clickable", map2 != null && map2.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put(next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                    it = it2;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: q */
    private final void m18444q(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) throws JSONException {
        Preconditions.m14367f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f23718c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f23717b.m18570i(this.f23720e.m18537e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f23720e.m18552w());
            jSONObject8.put("view_aware_api_used", z);
            zzady zzadyVar = this.f23726k.f25298i;
            jSONObject8.put("custom_mute_requested", zzadyVar != null && zzadyVar.f21967l);
            jSONObject8.put("custom_mute_enabled", (this.f23720e.m18541i().isEmpty() || this.f23720e.m18554y() == null) ? false : true);
            if (this.f23728m.m18605c() != null && this.f23718c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f23729n.mo14608a());
            if (this.f23735t && m18446s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f23717b.m18570i(this.f23720e.m18537e()) != null);
            jSONObject8.put("click_signals", m18440D(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jMo14608a = this.f23729n.mo14608a();
            jSONObject9.put("time_from_last_touch_down", jMo14608a - this.f23738w);
            jSONObject9.put("time_from_last_touch", jMo14608a - this.f23739x);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbao.m17362a(this.f23719d.m18670i("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzbad.m17347c("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: r */
    private final boolean m18445r(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) throws JSONException {
        Preconditions.m14367f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f23718c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            C7041pf c7041pf = null;
            this.f23719d.m18665d("/logScionEvent", new C7078qf(this));
            this.f23719d.m18665d("/nativeImpression", new C7152sf(this));
            zzbao.m17362a(this.f23719d.m18670i("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z = this.f23732q;
            if (z || this.f23724i.f25268z == null) {
                return true;
            }
            this.f23732q = z | zzk.zzlq().m17240c(this.f23716a, this.f23725j.f22750f, this.f23724i.f25268z.toString(), this.f23726k.f25295f);
            return true;
        } catch (JSONException e2) {
            zzbad.m17347c("Unable to create impression JSON.", e2);
            return false;
        }
    }

    /* renamed from: s */
    private final boolean m18446s() {
        return this.f23718c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: t */
    private final JSONObject m18447t() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m18451x(this.f23736u.x));
            jSONObject.put("y", m18451x(this.f23736u.y));
            jSONObject.put("start_x", m18451x(this.f23737v.x));
            jSONObject.put("start_y", m18451x(this.f23737v.y));
            return jSONObject;
        } catch (JSONException e2) {
            zzbad.m17347c("Error occurred while putting signals into JSON object.", e2);
            return null;
        }
    }

    /* renamed from: v */
    private final String m18449v(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int iM18552w = this.f23720e.m18552w();
        if (iM18552w == 1) {
            return "1099";
        }
        if (iM18552w == 2) {
            return "2099";
        }
        if (iM18552w != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: w */
    private final JSONObject m18450w(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m18451x(rect.right - rect.left));
        jSONObject.put("height", m18451x(rect.bottom - rect.top));
        jSONObject.put("x", m18451x(rect.left));
        jSONObject.put("y", m18451x(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: x */
    private final int m18451x(int i2) {
        return zzyt.m20844a().m17323j(this.f23716a, i2);
    }

    /* renamed from: y */
    private final boolean m18452y(String str) {
        JSONObject jSONObjectOptJSONObject = this.f23718c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    /* renamed from: z */
    private final JSONObject m18453z(String str) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", m18447t());
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                zzbad.m17347c("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: G0 */
    public final void mo18454G0(zzaag zzaagVar) {
        this.f23740y = zzaagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: W */
    public final void mo18455W() {
        if (this.f23718c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f23728m.m18603a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: a */
    public final void mo18456a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f23736u = new Point();
        this.f23737v = new Point();
        if (!this.f23733r) {
            this.f23730o.m18388Y(view);
            this.f23733r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f23727l.m17896F(this);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    view2.setOnTouchListener(onTouchListener);
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    view3.setOnTouchListener(onTouchListener);
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: b */
    public final void mo18457b(Bundle bundle) {
        if (bundle == null) {
            zzbad.m17349e("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!m18452y("touch_reporting")) {
            zzbad.m17351g("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
            return;
        }
        this.f23721f.m19455f().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: c */
    public final void mo18458c(View view) {
        if (!this.f23718c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbad.m17353i("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzbzq zzbzqVar = this.f23728m;
        if (view != null) {
            view.setOnClickListener(zzbzqVar);
            view.setClickable(true);
            zzbzqVar.f23909l = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: d */
    public final void mo18459d() throws JSONException {
        Preconditions.m14367f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f23718c);
            zzbao.m17362a(this.f23719d.m18670i("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: d0 */
    public final void mo18460d0(zzagd zzagdVar) {
        if (this.f23718c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f23728m.m18604b(zzagdVar);
        } else {
            zzbad.m17353i("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void destroy() {
        this.f23719d.m18663a();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: e */
    public final void mo18461e(View view, Map<String, WeakReference<View>> map) {
        this.f23736u = new Point();
        this.f23737v = new Point();
        this.f23730o.m18389f0(view);
        this.f23733r = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: e0 */
    public final void mo18462e0(zzaak zzaakVar) {
        try {
            if (this.f23734s) {
                return;
            }
            if (zzaakVar != null || this.f23720e.m18554y() == null) {
                this.f23734s = true;
                this.f23731p.m19135e(zzaakVar.mo16186Z1());
                mo18472n();
            } else {
                this.f23734s = true;
                this.f23731p.m19135e(this.f23720e.m18554y().mo16186Z1());
                mo18472n();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: f */
    public final void mo18463f(Bundle bundle) throws JSONException {
        if (bundle == null) {
            zzbad.m17349e("Click data is null. No click is reported.");
        } else if (!m18452y("click_reporting")) {
            zzbad.m17351g("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            m18444q(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzk.zzlg().m17178h(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: g */
    public final void mo18464g(View view, MotionEvent motionEvent, View view2) {
        int[] iArrM18441E = m18441E(view2);
        this.f23736u = new Point(((int) motionEvent.getRawX()) - iArrM18441E[0], ((int) motionEvent.getRawY()) - iArrM18441E[1]);
        long jMo14608a = this.f23729n.mo14608a();
        this.f23739x = jMo14608a;
        if (motionEvent.getAction() == 0) {
            this.f23738w = jMo14608a;
            this.f23737v = this.f23736u;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f23736u;
        motionEventObtain.setLocation(point.x, point.y);
        this.f23721f.m19453c(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: h */
    public final void mo18465h(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) throws JSONException {
        JSONObject jSONObjectM18443p = m18443p(map, map2, view2);
        JSONObject jSONObjectM18437A = m18437A(view2);
        JSONObject jSONObjectM18438B = m18438B(view2);
        JSONObject jSONObjectM18439C = m18439C(view2);
        String strM18449v = m18449v(view, map);
        m18444q(view, jSONObjectM18437A, jSONObjectM18443p, jSONObjectM18438B, jSONObjectM18439C, strM18449v, m18453z(strM18449v), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: i */
    public final void mo18466i(String str) throws JSONException {
        m18444q(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: j */
    public final void mo18467j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) throws JSONException {
        m18445r(m18437A(view), m18443p(map, map2, view), m18438B(view), m18439C(view), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: j0 */
    public final void mo18468j0() {
        this.f23735t = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: k */
    public final void mo18469k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) throws JSONException {
        if (!this.f23735t) {
            zzbad.m17349e("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!m18446s()) {
            zzbad.m17349e("Custom click reporting failed. Ad unit id not whitelisted.");
            return;
        }
        JSONObject jSONObjectM18443p = m18443p(map, map2, view);
        JSONObject jSONObjectM18437A = m18437A(view);
        JSONObject jSONObjectM18438B = m18438B(view);
        JSONObject jSONObjectM18439C = m18439C(view);
        String strM18449v = m18449v(null, map);
        m18444q(view, jSONObjectM18437A, jSONObjectM18443p, jSONObjectM18438B, jSONObjectM18439C, strM18449v, m18453z(strM18449v), null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: l */
    public final void mo18470l() throws JSONException {
        m18445r(null, null, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: m */
    public final boolean mo18471m(Bundle bundle) {
        if (m18452y("impression_reporting")) {
            return m18445r(null, null, null, null, zzk.zzlg().m17178h(bundle, null));
        }
        zzbad.m17351g("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: n */
    public final void mo18472n() {
        try {
            zzaag zzaagVar = this.f23740y;
            if (zzaagVar != null) {
                zzaagVar.onAdMuted();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
