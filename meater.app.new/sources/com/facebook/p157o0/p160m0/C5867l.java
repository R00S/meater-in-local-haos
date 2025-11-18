package com.facebook.p157o0.p160m0;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.AccessToken;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.EnumC5659g0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5680h0;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p160m0.C5867l;
import com.facebook.p157o0.p160m0.p161n.C5873e;
import com.facebook.p157o0.p160m0.p161n.C5874f;
import com.facebook.p157o0.p165q0.C5902g;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewIndexer.kt */
/* renamed from: com.facebook.o0.m0.l */
/* loaded from: classes.dex */
public final class C5867l {

    /* renamed from: a */
    public static final a f15204a = new a(null);

    /* renamed from: b */
    private static final String f15205b;

    /* renamed from: c */
    private static C5867l f15206c;

    /* renamed from: d */
    private final Handler f15207d;

    /* renamed from: e */
    private final WeakReference<Activity> f15208e;

    /* renamed from: f */
    private Timer f15209f;

    /* renamed from: g */
    private String f15210g;

    /* compiled from: ViewIndexer.kt */
    /* renamed from: com.facebook.o0.m0.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m12430b(C5653d0 c5653d0) {
            C9801m.m32346f(c5653d0, "it");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5867l.f15205b, "App index sent to FB!");
        }

        /* renamed from: a */
        public final GraphRequest m12432a(String str, AccessToken accessToken, String str2, String str3) {
            C9801m.m32346f(str3, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.C5632c c5632c = GraphRequest.f14159a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str4 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C9801m.m32345e(str4, "java.lang.String.format(locale, format, *args)");
            GraphRequest graphRequestM11222A = c5632c.m11222A(accessToken, str4, null, null);
            Bundle bundleM11186t = graphRequestM11222A.m11186t();
            if (bundleM11186t == null) {
                bundleM11186t = new Bundle();
            }
            bundleM11186t.putString("tree", str);
            C5902g c5902g = C5902g.f15370a;
            bundleM11186t.putString("app_version", C5902g.m12627d());
            bundleM11186t.putString("platform", "android");
            bundleM11186t.putString("request_type", str3);
            if (C9801m.m32341a(str3, "app_indexing")) {
                C5864i c5864i = C5864i.f15174a;
                bundleM11186t.putString("device_session_id", C5864i.m12383e());
            }
            graphRequestM11222A.m11177H(bundleM11186t);
            graphRequestM11222A.m11173D(new GraphRequest.InterfaceC5631b() { // from class: com.facebook.o0.m0.f
                @Override // com.facebook.GraphRequest.InterfaceC5631b
                /* renamed from: b */
                public final void mo11196b(C5653d0 c5653d0) {
                    C5867l.a.m12430b(c5653d0);
                }
            });
            return graphRequestM11222A;
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* renamed from: com.facebook.o0.m0.l$b */
    private static final class b implements Callable<String> {

        /* renamed from: f */
        private final WeakReference<View> f15211f;

        public b(View view) {
            C9801m.m32346f(view, "rootView");
            this.f15211f = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.f15211f.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            C9801m.m32345e(strEncodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    /* compiled from: ViewIndexer.kt */
    /* renamed from: com.facebook.o0.m0.l$c */
    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() throws JSONException {
            try {
                Activity activity = (Activity) C5867l.this.f15208e.get();
                C5902g c5902g = C5902g.f15370a;
                View viewM12628e = C5902g.m12628e(activity);
                if (activity != null && viewM12628e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    C5864i c5864i = C5864i.f15174a;
                    if (C5864i.m12384f()) {
                        C5680h0 c5680h0 = C5680h0.f14422a;
                        if (C5680h0.m11442b()) {
                            C5873e c5873e = C5873e.f15254a;
                            C5873e.m12464a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(viewM12628e));
                        C5867l.this.f15207d.post(futureTask);
                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e2) {
                            Log.e(C5867l.f15205b, "Failed to take screenshot.", e2);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            C5874f c5874f = C5874f.f15257a;
                            jSONArray.put(C5874f.m12471d(viewM12628e));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(C5867l.f15205b, "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        C9801m.m32345e(string, "viewTree.toString()");
                        C5867l.this.m12425j(string);
                    }
                }
            } catch (Exception e3) {
                Log.e(C5867l.f15205b, "UI Component tree indexing failure!", e3);
            }
        }
    }

    static {
        String canonicalName = C5867l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        f15205b = canonicalName;
    }

    public C5867l(Activity activity) {
        C9801m.m32346f(activity, "activity");
        this.f15208e = new WeakReference<>(activity);
        this.f15210g = null;
        this.f15207d = new Handler(Looper.getMainLooper());
        f15206c = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m12424i(C5867l c5867l, TimerTask timerTask) {
        C9801m.m32346f(c5867l, "this$0");
        C9801m.m32346f(timerTask, "$indexingTask");
        try {
            Timer timer = c5867l.f15209f;
            if (timer != null) {
                timer.cancel();
            }
            c5867l.f15210g = null;
            Timer timer2 = new Timer();
            timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
            c5867l.f15209f = timer2;
        } catch (Exception e2) {
            Log.e(f15205b, "Error scheduling indexing job", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m12425j(final String str) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.e
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C5867l.m12426k(str, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m12426k(String str, C5867l c5867l) throws JSONException {
        C9801m.m32346f(str, "$tree");
        C9801m.m32346f(c5867l, "this$0");
        C5696p0 c5696p0 = C5696p0.f14478a;
        String strM11581m0 = C5696p0.m11581m0(str);
        AccessToken accessTokenM11105e = AccessToken.f14054f.m11105e();
        if (strM11581m0 == null || !C9801m.m32341a(strM11581m0, c5867l.f15210g)) {
            a aVar = f15204a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            c5867l.m12427g(aVar.m12432a(str, accessTokenM11105e, C5641a0.m11285d(), "app_indexing"), strM11581m0);
        }
    }

    /* renamed from: g */
    public final void m12427g(GraphRequest graphRequest, String str) throws JSONException {
        if (graphRequest == null) {
            return;
        }
        C5653d0 c5653d0M11179j = graphRequest.m11179j();
        try {
            JSONObject jSONObjectM11339c = c5653d0M11179j.m11339c();
            if (jSONObjectM11339c == null) {
                Log.e(f15205b, C9801m.m32354n("Error sending UI component tree to Facebook: ", c5653d0M11179j.m11338b()));
                return;
            }
            if (C9801m.m32341a("true", jSONObjectM11339c.optString(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION))) {
                C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, f15205b, "Successfully send UI component tree to server");
                this.f15210g = str;
            }
            if (jSONObjectM11339c.has("is_app_indexing_enabled")) {
                boolean z = jSONObjectM11339c.getBoolean("is_app_indexing_enabled");
                C5864i c5864i = C5864i.f15174a;
                C5864i.m12392n(z);
            }
        } catch (JSONException e2) {
            Log.e(f15205b, "Error decoding server response.", e2);
        }
    }

    /* renamed from: h */
    public final void m12428h() {
        final c cVar = new c();
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.m0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C5867l.m12424i(this.f15161f, cVar);
                }
            });
        } catch (RejectedExecutionException e2) {
            Log.e(f15205b, "Error scheduling indexing job", e2);
        }
    }

    /* renamed from: l */
    public final void m12429l() {
        if (this.f15208e.get() == null) {
            return;
        }
        try {
            Timer timer = this.f15209f;
            if (timer != null) {
                timer.cancel();
            }
            this.f15209f = null;
        } catch (Exception e2) {
            Log.e(f15205b, "Error unscheduling indexing job", e2);
        }
    }
}
