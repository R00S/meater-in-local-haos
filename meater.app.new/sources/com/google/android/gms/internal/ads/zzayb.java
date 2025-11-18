package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzayb {

    /* renamed from: a */
    private final Context f22666a;

    /* renamed from: b */
    private String f22667b;

    /* renamed from: c */
    private String f22668c;

    /* renamed from: d */
    private String f22669d;

    /* renamed from: e */
    private String f22670e;

    /* renamed from: f */
    private int f22671f;

    /* renamed from: g */
    private int f22672g;

    /* renamed from: h */
    private PointF f22673h;

    /* renamed from: i */
    private PointF f22674i;

    /* renamed from: j */
    private Handler f22675j;

    /* renamed from: k */
    private Runnable f22676k;

    public zzayb(Context context) {
        this.f22671f = 0;
        this.f22676k = new Runnable(this) { // from class: com.google.android.gms.internal.ads.m5

            /* renamed from: f */
            private final zzayb f19882f;

            {
                this.f19882f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19882f.m17230m();
            }
        };
        this.f22666a = context;
        this.f22672g = ViewConfiguration.get(context).getScaledTouchSlop();
        zzk.zzlu().m17276b();
        this.f22675j = zzk.zzlu().m17275a();
    }

    /* renamed from: c */
    private static int m17218c(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    /* renamed from: f */
    private final boolean m17219f(float f2, float f3, float f4, float f5) {
        return Math.abs(this.f22673h.x - f2) < ((float) this.f22672g) && Math.abs(this.f22673h.y - f3) < ((float) this.f22672g) && Math.abs(this.f22674i.x - f4) < ((float) this.f22672g) && Math.abs(this.f22674i.y - f5) < ((float) this.f22672g);
    }

    /* renamed from: a */
    public final void m17220a(String str) {
        this.f22668c = str;
    }

    /* renamed from: b */
    public final void m17221b() {
        try {
            if (!(this.f22666a instanceof Activity)) {
                zzbad.m17352h("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzk.zzlq().m17242l()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzk.zzlq().m17243m() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            final int iM17218c = m17218c(arrayList, "Ad Information", true);
            final int iM17218c2 = m17218c(arrayList, str, true);
            final int iM17218c3 = m17218c(arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f22666a, zzk.zzli().mo17207v());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, iM17218c, iM17218c2, iM17218c3) { // from class: com.google.android.gms.internal.ads.n5

                /* renamed from: f */
                private final zzayb f19986f;

                /* renamed from: g */
                private final int f19987g;

                /* renamed from: h */
                private final int f19988h;

                /* renamed from: i */
                private final int f19989i;

                {
                    this.f19986f = this;
                    this.f19987g = iM17218c;
                    this.f19988h = iM17218c2;
                    this.f19989i = iM17218c3;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f19986f.m17222d(this.f19987g, this.f19988h, this.f19989i, dialogInterface, i2);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zzawz.m17081l(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void m17222d(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L9b
            android.content.Context r1 = r0.f22666a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto Le
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzbad.m17352h(r1)
            return
        Le:
            java.lang.String r1 = r0.f22667b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzk.zzlg()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzaxi.m17139X(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L3f
        L62:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            goto L73
        L71:
            java.lang.String r1 = "No debug information"
        L73:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f22666a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.o5 r3 = new com.google.android.gms.internal.ads.o5
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.DialogInterfaceOnClickListenerC7031p5.f20279f
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L9b:
            if (r5 != r2) goto Lab
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzbad.m17349e(r1)
            com.google.android.gms.internal.ads.q5 r1 = new com.google.android.gms.internal.ads.q5
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaxg.m17119b(r1)
            return
        Lab:
            if (r5 != r3) goto Lba
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzbad.m17349e(r1)
            com.google.android.gms.internal.ads.r5 r1 = new com.google.android.gms.internal.ads.r5
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaxg.m17119b(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayb.m17222d(int, int, int, android.content.DialogInterface, int):void");
    }

    /* renamed from: e */
    final /* synthetic */ void m17223e(String str, DialogInterface dialogInterface, int i2) {
        zzk.zzlg();
        zzaxi.m17155i(this.f22666a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17224g(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L21
            r10.f22671f = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.f22673h = r0
            return
        L21:
            int r4 = r10.f22671f
            r5 = -1
            if (r4 != r5) goto L27
            return
        L27:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L56
            if (r0 != r6) goto L56
            r10.f22671f = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.f22674i = r0
            android.os.Handler r11 = r10.f22675j
            java.lang.Runnable r0 = r10.f22676k
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.f21638H3
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r1 = r2.m16421c(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L56:
            if (r4 != r6) goto La0
            r4 = 2
            if (r2 == r4) goto L5d
        L5b:
            r3 = 1
            goto L95
        L5d:
            if (r0 != r4) goto L95
            r0 = 0
            r2 = 0
        L61:
            if (r0 >= r1) goto L7d
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.m17219f(r4, r6, r8, r9)
            if (r4 != 0) goto L7a
            r2 = 1
        L7a:
            int r0 = r0 + 1
            goto L61
        L7d:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.m17219f(r0, r1, r3, r11)
            if (r11 != 0) goto L94
            goto L5b
        L94:
            r3 = r2
        L95:
            if (r3 == 0) goto La0
            r10.f22671f = r5
            android.os.Handler r11 = r10.f22675j
            java.lang.Runnable r0 = r10.f22676k
            r11.removeCallbacks(r0)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayb.m17224g(android.view.MotionEvent):void");
    }

    /* renamed from: h */
    public final void m17225h(String str) {
        this.f22667b = str;
    }

    /* renamed from: i */
    public final void m17226i(String str) {
        this.f22670e = str;
    }

    /* renamed from: j */
    public final void m17227j(String str) {
        this.f22669d = str;
    }

    /* renamed from: k */
    final /* synthetic */ void m17228k() {
        zzk.zzlq().m17239a(this.f22666a, this.f22668c, this.f22669d, this.f22670e);
    }

    /* renamed from: l */
    final /* synthetic */ void m17229l() {
        zzk.zzlq().m17241g(this.f22666a, this.f22668c, this.f22669d);
    }

    /* renamed from: m */
    final /* synthetic */ void m17230m() {
        this.f22671f = 4;
        m17221b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f22667b);
        sb.append(",DebugSignal: ");
        sb.append(this.f22670e);
        sb.append(",AFMA Version: ");
        sb.append(this.f22669d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f22668c);
        sb.append("}");
        return sb.toString();
    }

    public zzayb(Context context, String str) {
        this(context);
        this.f22667b = str;
    }
}
