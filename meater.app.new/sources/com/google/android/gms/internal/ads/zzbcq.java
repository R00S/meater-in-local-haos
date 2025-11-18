package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
public final class zzbcq extends FrameLayout implements zzbcn {

    /* renamed from: f */
    private final zzbdf f22788f;

    /* renamed from: g */
    private final FrameLayout f22789g;

    /* renamed from: h */
    private final zzadi f22790h;

    /* renamed from: i */
    private final RunnableC6664f8 f22791i;

    /* renamed from: j */
    private final long f22792j;

    /* renamed from: k */
    private zzbco f22793k;

    /* renamed from: l */
    private boolean f22794l;

    /* renamed from: m */
    private boolean f22795m;

    /* renamed from: n */
    private boolean f22796n;

    /* renamed from: o */
    private boolean f22797o;

    /* renamed from: p */
    private long f22798p;

    /* renamed from: q */
    private long f22799q;

    /* renamed from: r */
    private String f22800r;

    /* renamed from: s */
    private String[] f22801s;

    /* renamed from: t */
    private Bitmap f22802t;

    /* renamed from: u */
    private ImageView f22803u;

    /* renamed from: v */
    private boolean f22804v;

    public zzbcq(Context context, zzbdf zzbdfVar, int i2, boolean z, zzadi zzadiVar, zzbde zzbdeVar) {
        super(context);
        this.f22788f = zzbdfVar;
        this.f22790h = zzadiVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22789g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.m14372k(zzbdfVar.mo14901c());
        zzbco zzbcoVarMo17432a = zzbdfVar.mo14901c().zzbqs.mo17432a(context, zzbdfVar, i2, z, zzadiVar, zzbdeVar);
        this.f22793k = zzbcoVarMo17432a;
        if (zzbcoVarMo17432a != null) {
            frameLayout.addView(zzbcoVarMo17432a, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21652K)).booleanValue()) {
                m17445F();
            }
        }
        this.f22803u = new ImageView(context);
        this.f22792j = ((Long) zzyt.m20848e().m16421c(zzacu.f21676O)).longValue();
        boolean zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21664M)).booleanValue();
        this.f22797o = zBooleanValue;
        if (zzadiVar != null) {
            zzadiVar.m16451d("spinner_used", zBooleanValue ? "1" : "0");
        }
        this.f22791i = new RunnableC6664f8(this);
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar != null) {
            zzbcoVar.mo17413k(this);
        }
        if (this.f22793k == null) {
            mo17417b("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: H */
    private final boolean m17433H() {
        return this.f22803u.getParent() != null;
    }

    /* renamed from: I */
    private final void m17434I() {
        if (this.f22788f.mo14897a() == null || !this.f22795m || this.f22796n) {
            return;
        }
        this.f22788f.mo14897a().getWindow().clearFlags(128);
        this.f22795m = false;
    }

    /* renamed from: p */
    public static void m17436p(zzbdf zzbdfVar, String str) {
        HashMap map = new HashMap();
        map.put("event", "decoderProps");
        map.put("error", str);
        zzbdfVar.mo14940y("onVideoEvent", map);
    }

    /* renamed from: q */
    public static void m17437q(zzbdf zzbdfVar, Map<String, List<Map<String, Object>>> map) {
        HashMap map2 = new HashMap();
        map2.put("event", "decoderProps");
        map2.put("mimeTypes", map);
        zzbdfVar.mo14940y("onVideoEvent", map2);
    }

    /* renamed from: s */
    public static void m17438s(zzbdf zzbdfVar) {
        HashMap map = new HashMap();
        map.put("event", "no_video_view");
        zzbdfVar.mo14940y("onVideoEvent", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m17439x(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f22788f.mo14940y("onVideoEvent", map);
    }

    /* renamed from: A */
    public final void m17440A(int i2) {
        this.f22793k.mo17430q(i2);
    }

    @TargetApi(14)
    /* renamed from: B */
    public final void m17441B(MotionEvent motionEvent) {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: C */
    public final void m17442C() {
        if (this.f22793k == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f22800r)) {
            m17439x("no_src", new String[0]);
        } else {
            this.f22793k.mo17425l(this.f22800r, this.f22801s);
        }
    }

    /* renamed from: D */
    public final void m17443D() {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.f22787g.m17491b(true);
        zzbcoVar.mo15161b();
    }

    /* renamed from: E */
    public final void m17444E() {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.f22787g.m17491b(false);
        zzbcoVar.mo15161b();
    }

    @TargetApi(14)
    /* renamed from: F */
    public final void m17445F() {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        TextView textView = new TextView(zzbcoVar.getContext());
        String strValueOf = String.valueOf(this.f22793k.mo17414r());
        textView.setText(strValueOf.length() != 0 ? "AdMob - ".concat(strValueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f22789g.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f22789g.bringChildToFront(textView);
    }

    /* renamed from: G */
    final void m17446G() {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        long currentPosition = zzbcoVar.getCurrentPosition();
        if (this.f22798p == currentPosition || currentPosition <= 0) {
            return;
        }
        m17439x("timeupdate", "time", String.valueOf(currentPosition / 1000.0f));
        this.f22798p = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: a */
    public final void mo17416a() {
        if (this.f22793k != null && this.f22799q == 0) {
            m17439x("canplaythrough", "duration", String.valueOf(r0.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.f22793k.getVideoWidth()), "videoHeight", String.valueOf(this.f22793k.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: b */
    public final void mo17417b(String str, String str2) {
        m17439x("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: c */
    public final void mo17418c() {
        this.f22791i.m15140b();
        zzaxi.f22654a.post(new RunnableC7366y7(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: d */
    public final void mo17419d(int i2, int i3) {
        if (this.f22797o) {
            zzacj<Integer> zzacjVar = zzacu.f21670N;
            int iMax = Math.max(i2 / ((Integer) zzyt.m20848e().m16421c(zzacjVar)).intValue(), 1);
            int iMax2 = Math.max(i3 / ((Integer) zzyt.m20848e().m16421c(zzacjVar)).intValue(), 1);
            Bitmap bitmap = this.f22802t;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f22802t.getHeight() == iMax2) {
                return;
            }
            this.f22802t = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f22804v = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: e */
    public final void mo17420e() {
        m17439x("pause", new String[0]);
        m17434I();
        this.f22794l = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: f */
    public final void mo17421f() {
        if (this.f22794l && m17433H()) {
            this.f22789g.removeView(this.f22803u);
        }
        if (this.f22802t != null) {
            long jMo14609b = zzk.zzln().mo14609b();
            if (this.f22793k.getBitmap(this.f22802t) != null) {
                this.f22804v = true;
            }
            long jMo14609b2 = zzk.zzln().mo14609b() - jMo14609b;
            if (zzawz.m17083n()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(jMo14609b2);
                sb.append("ms");
                zzawz.m17082m(sb.toString());
            }
            if (jMo14609b2 > this.f22792j) {
                zzbad.m17353i("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f22797o = false;
                this.f22802t = null;
                zzadi zzadiVar = this.f22790h;
                if (zzadiVar != null) {
                    zzadiVar.m16451d("spinner_jank", Long.toString(jMo14609b2));
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f22791i.m15139a();
            zzbco zzbcoVar = this.f22793k;
            if (zzbcoVar != null) {
                Executor executor = zzbbm.f22757a;
                zzbcoVar.getClass();
                executor.execute(RunnableC7292w7.m15977a(zzbcoVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: g */
    public final void mo17422g() {
        if (this.f22804v && this.f22802t != null && !m17433H()) {
            this.f22803u.setImageBitmap(this.f22802t);
            this.f22803u.invalidate();
            this.f22789g.addView(this.f22803u, new FrameLayout.LayoutParams(-1, -1));
            this.f22789g.bringChildToFront(this.f22803u);
        }
        this.f22791i.m15139a();
        this.f22799q = this.f22798p;
        zzaxi.f22654a.post(new RunnableC7403z7(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: h */
    public final void mo17423h() {
        m17439x("ended", new String[0]);
        m17434I();
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    /* renamed from: i */
    public final void mo17424i() {
        if (this.f22788f.mo14897a() != null && !this.f22795m) {
            boolean z = (this.f22788f.mo14897a().getWindow().getAttributes().flags & 128) != 0;
            this.f22796n = z;
            if (!z) {
                this.f22788f.mo14897a().getWindow().addFlags(128);
                this.f22795m = true;
            }
        }
        this.f22794l = true;
    }

    /* renamed from: j */
    public final void m17447j() {
        this.f22791i.m15139a();
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar != null) {
            zzbcoVar.mo17411i();
        }
        m17434I();
    }

    /* renamed from: k */
    public final void m17448k() {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.mo17408c();
    }

    /* renamed from: l */
    public final void m17449l() {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.mo17409d();
    }

    /* renamed from: m */
    public final void m17450m(int i2) {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.mo17410h(i2);
    }

    /* renamed from: n */
    public final void m17451n(float f2, float f3) {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar != null) {
            zzbcoVar.mo17412j(f2, f3);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f22791i.m15140b();
        } else {
            this.f22791i.m15139a();
            this.f22799q = this.f22798p;
        }
        zzaxi.f22654a.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.x7

            /* renamed from: f */
            private final zzbcq f20951f;

            /* renamed from: g */
            private final boolean f20952g;

            {
                this.f20951f = this;
                this.f20952g = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20951f.m17452r(this.f20952g);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbcn
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.f22791i.m15140b();
            z = true;
        } else {
            this.f22791i.m15139a();
            this.f22799q = this.f22798p;
            z = false;
        }
        zzaxi.f22654a.post(new RunnableC6479a8(this, z));
    }

    /* renamed from: r */
    final /* synthetic */ void m17452r(boolean z) {
        m17439x("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void setVolume(float f2) {
        zzbco zzbcoVar = this.f22793k;
        if (zzbcoVar == null) {
            return;
        }
        zzbcoVar.f22787g.m17492c(f2);
        zzbcoVar.mo15161b();
    }

    /* renamed from: t */
    public final void m17453t(String str, String[] strArr) {
        this.f22800r = str;
        this.f22801s = strArr;
    }

    /* renamed from: u */
    public final void m17454u(int i2) {
        this.f22793k.mo17426m(i2);
    }

    /* renamed from: v */
    public final void m17455v(int i2) {
        this.f22793k.mo17427n(i2);
    }

    /* renamed from: w */
    public final void m17456w(int i2, int i3, int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.f22789g.setLayoutParams(layoutParams);
        requestLayout();
    }

    /* renamed from: y */
    public final void m17457y(int i2) {
        this.f22793k.mo17428o(i2);
    }

    /* renamed from: z */
    public final void m17458z(int i2) {
        this.f22793k.mo17429p(i2);
    }
}
