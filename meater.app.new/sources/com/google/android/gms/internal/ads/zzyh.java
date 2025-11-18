package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

@zzard
/* loaded from: classes2.dex */
public class zzyh {

    /* renamed from: a */
    private final zzxx f27460a;

    /* renamed from: b */
    private final zzxw f27461b;

    /* renamed from: c */
    private final zzabk f27462c;

    /* renamed from: d */
    private final zzagk f27463d;

    /* renamed from: e */
    private final zzatf f27464e;

    /* renamed from: f */
    private final zzauj f27465f;

    /* renamed from: g */
    private final zzaqf f27466g;

    /* renamed from: h */
    private final zzagl f27467h;

    public zzyh(zzxx zzxxVar, zzxw zzxwVar, zzabk zzabkVar, zzagk zzagkVar, zzatf zzatfVar, zzauj zzaujVar, zzaqf zzaqfVar, zzagl zzaglVar) {
        this.f27460a = zzxxVar;
        this.f27461b = zzxwVar;
        this.f27462c = zzabkVar;
        this.f27463d = zzagkVar;
        this.f27464e = zzatfVar;
        this.f27465f = zzaujVar;
        this.f27466g = zzaqfVar;
        this.f27467h = zzaglVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m20831d(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzyt.m20844a().m17320d(context, zzyt.m20850g().f22750f, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final zzaem m20839a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new d60(this, frameLayout, frameLayout2, context).m15264b(context, false);
    }

    /* renamed from: b */
    public final zzaer m20840b(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        return new e60(this, view, map, map2).m15264b(view.getContext(), false);
    }

    /* renamed from: e */
    public final zzaqg m20841e(Activity activity) {
        y50 y50Var = new y50(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzbad.m17351g("useClientJar flag not found in activity intent extras.");
        }
        return y50Var.m15264b(activity, booleanExtra);
    }

    /* renamed from: g */
    public final zzzf m20842g(Context context, String str, zzamp zzampVar) {
        return new b60(this, context, str, zzampVar).m15264b(context, false);
    }

    /* renamed from: j */
    public final zzatt m20843j(Context context, String str, zzamp zzampVar) {
        return new g60(this, context, str, zzampVar).m15264b(context, false);
    }
}
