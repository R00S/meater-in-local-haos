package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONException;

@zzard
/* loaded from: classes2.dex */
public final class zzaqa extends zzaqb implements zzaho<zzbgz> {

    /* renamed from: c */
    private final zzbgz f22264c;

    /* renamed from: d */
    private final Context f22265d;

    /* renamed from: e */
    private final WindowManager f22266e;

    /* renamed from: f */
    private final zzacf f22267f;

    /* renamed from: g */
    private DisplayMetrics f22268g;

    /* renamed from: h */
    private float f22269h;

    /* renamed from: i */
    private int f22270i;

    /* renamed from: j */
    private int f22271j;

    /* renamed from: k */
    private int f22272k;

    /* renamed from: l */
    private int f22273l;

    /* renamed from: m */
    private int f22274m;

    /* renamed from: n */
    private int f22275n;

    /* renamed from: o */
    private int f22276o;

    public zzaqa(zzbgz zzbgzVar, Context context, zzacf zzacfVar) {
        super(zzbgzVar);
        this.f22270i = -1;
        this.f22271j = -1;
        this.f22273l = -1;
        this.f22274m = -1;
        this.f22275n = -1;
        this.f22276o = -1;
        this.f22264c = zzbgzVar;
        this.f22265d = context;
        this.f22267f = zzacfVar;
        this.f22266e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) throws JSONException {
        this.f22268g = new DisplayMetrics();
        Display defaultDisplay = this.f22266e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f22268g);
        this.f22269h = this.f22268g.density;
        this.f22272k = defaultDisplay.getRotation();
        zzyt.m20844a();
        DisplayMetrics displayMetrics = this.f22268g;
        this.f22270i = zzazt.m17306k(displayMetrics, displayMetrics.widthPixels);
        zzyt.m20844a();
        DisplayMetrics displayMetrics2 = this.f22268g;
        this.f22271j = zzazt.m17306k(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityMo14897a = this.f22264c.mo14897a();
        if (activityMo14897a == null || activityMo14897a.getWindow() == null) {
            this.f22273l = this.f22270i;
            this.f22274m = this.f22271j;
        } else {
            zzk.zzlg();
            int[] iArrM17135P = zzaxi.m17135P(activityMo14897a);
            zzyt.m20844a();
            this.f22273l = zzazt.m17306k(this.f22268g, iArrM17135P[0]);
            zzyt.m20844a();
            this.f22274m = zzazt.m17306k(this.f22268g, iArrM17135P[1]);
        }
        if (this.f22264c.mo14925o().m17741e()) {
            this.f22275n = this.f22270i;
            this.f22276o = this.f22271j;
        } else {
            this.f22264c.measure(0, 0);
        }
        m16863c(this.f22270i, this.f22271j, this.f22273l, this.f22274m, this.f22269h, this.f22272k);
        this.f22264c.mo14915j("onDeviceFeaturesReceived", new zzapx(new zzapz().m16855i(this.f22267f.m16397b()).m16854h(this.f22267f.m16398c()).m16856j(this.f22267f.m16400e()).m16852b(this.f22267f.m16399d()).m16853c(true)).m16846a());
        int[] iArr = new int[2];
        this.f22264c.getLocationOnScreen(iArr);
        m16861h(zzyt.m20844a().m17323j(this.f22265d, iArr[0]), zzyt.m20844a().m17323j(this.f22265d, iArr[1]));
        if (zzbad.m17345a(2)) {
            zzbad.m17352h("Dispatching Ready Event.");
        }
        m16866f(this.f22264c.mo14899b().f22750f);
    }

    /* renamed from: h */
    public final void m16861h(int i2, int i3) {
        int i4 = this.f22265d instanceof Activity ? zzk.zzlg().m17175W((Activity) this.f22265d)[0] : 0;
        if (this.f22264c.mo14925o() == null || !this.f22264c.mo14925o().m17741e()) {
            this.f22275n = zzyt.m20844a().m17323j(this.f22265d, this.f22264c.getWidth());
            this.f22276o = zzyt.m20844a().m17323j(this.f22265d, this.f22264c.getHeight());
        }
        m16864d(i2, i3 - i4, this.f22275n, this.f22276o);
        this.f22264c.mo14926p().mo17685g(i2, i3);
    }
}
