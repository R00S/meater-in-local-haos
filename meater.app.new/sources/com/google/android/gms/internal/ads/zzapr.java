package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import cm.aptoide.p092pt.BuildConfig;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzapr extends zzaqb {

    /* renamed from: c */
    private static final Set<String> f22230c = CollectionUtils.m14616g("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: d */
    private String f22231d;

    /* renamed from: e */
    private boolean f22232e;

    /* renamed from: f */
    private int f22233f;

    /* renamed from: g */
    private int f22234g;

    /* renamed from: h */
    private int f22235h;

    /* renamed from: i */
    private int f22236i;

    /* renamed from: j */
    private int f22237j;

    /* renamed from: k */
    private int f22238k;

    /* renamed from: l */
    private final Object f22239l;

    /* renamed from: m */
    private final zzbgz f22240m;

    /* renamed from: n */
    private final Activity f22241n;

    /* renamed from: o */
    private zzbin f22242o;

    /* renamed from: p */
    private ImageView f22243p;

    /* renamed from: q */
    private LinearLayout f22244q;

    /* renamed from: r */
    private zzaqc f22245r;

    /* renamed from: s */
    private PopupWindow f22246s;

    /* renamed from: t */
    private RelativeLayout f22247t;

    /* renamed from: u */
    private ViewGroup f22248u;

    public zzapr(zzbgz zzbgzVar, zzaqc zzaqcVar) {
        super(zzbgzVar, "resize");
        this.f22231d = "top-right";
        this.f22232e = true;
        this.f22233f = 0;
        this.f22234g = 0;
        this.f22235h = -1;
        this.f22236i = 0;
        this.f22237j = 0;
        this.f22238k = -1;
        this.f22239l = new Object();
        this.f22240m = zzbgzVar;
        this.f22241n = zzbgzVar.mo14897a();
        this.f22245r = zzaqcVar;
    }

    /* renamed from: h */
    public final void m16838h(int i2, int i3, boolean z) {
        synchronized (this.f22239l) {
            this.f22233f = i2;
            this.f22234g = i3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0235 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:138:0x0291, B:139:0x0296, B:141:0x0298, B:143:0x02ba, B:145:0x02be, B:147:0x02ce, B:149:0x02fe, B:153:0x0330, B:154:0x0364, B:184:0x03ba, B:191:0x03e9, B:192:0x0401, B:193:0x0420, B:195:0x0428, B:196:0x042f, B:197:0x0455, B:200:0x0458, B:202:0x0468, B:204:0x0472, B:206:0x0484, B:207:0x049b, B:203:0x046d, B:185:0x03c1, B:186:0x03c8, B:187:0x03cf, B:188:0x03d6, B:189:0x03dc, B:190:0x03e3, B:156:0x0368, B:159:0x0372, B:162:0x037c, B:165:0x0386, B:168:0x0390, B:171:0x039a, B:148:0x02fb, B:209:0x049d, B:210:0x04a2, B:121:0x0235, B:123:0x0239, B:124:0x024a, B:130:0x0276, B:132:0x027a, B:136:0x0289, B:133:0x027d, B:135:0x0285, B:127:0x026e, B:129:0x0274, B:68:0x014b, B:70:0x014f, B:71:0x0155, B:98:0x01a2, B:106:0x0213, B:108:0x0216, B:110:0x0219, B:112:0x021d, B:99:0x01b0, B:102:0x01e0, B:100:0x01c1, B:101:0x01d4, B:103:0x01e3, B:104:0x01fa, B:105:0x020a, B:73:0x0159, B:76:0x0163, B:79:0x016d, B:82:0x0177, B:85:0x0181, B:88:0x018b, B:116:0x0225, B:117:0x022b, B:212:0x04a4, B:213:0x04a9), top: B:220:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0291 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:138:0x0291, B:139:0x0296, B:141:0x0298, B:143:0x02ba, B:145:0x02be, B:147:0x02ce, B:149:0x02fe, B:153:0x0330, B:154:0x0364, B:184:0x03ba, B:191:0x03e9, B:192:0x0401, B:193:0x0420, B:195:0x0428, B:196:0x042f, B:197:0x0455, B:200:0x0458, B:202:0x0468, B:204:0x0472, B:206:0x0484, B:207:0x049b, B:203:0x046d, B:185:0x03c1, B:186:0x03c8, B:187:0x03cf, B:188:0x03d6, B:189:0x03dc, B:190:0x03e3, B:156:0x0368, B:159:0x0372, B:162:0x037c, B:165:0x0386, B:168:0x0390, B:171:0x039a, B:148:0x02fb, B:209:0x049d, B:210:0x04a2, B:121:0x0235, B:123:0x0239, B:124:0x024a, B:130:0x0276, B:132:0x027a, B:136:0x0289, B:133:0x027d, B:135:0x0285, B:127:0x026e, B:129:0x0274, B:68:0x014b, B:70:0x014f, B:71:0x0155, B:98:0x01a2, B:106:0x0213, B:108:0x0216, B:110:0x0219, B:112:0x021d, B:99:0x01b0, B:102:0x01e0, B:100:0x01c1, B:101:0x01d4, B:103:0x01e3, B:104:0x01fa, B:105:0x020a, B:73:0x0159, B:76:0x0163, B:79:0x016d, B:82:0x0177, B:85:0x0181, B:88:0x018b, B:116:0x0225, B:117:0x022b, B:212:0x04a4, B:213:0x04a9), top: B:220:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0298 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:22:0x0041, B:24:0x0043, B:26:0x0051, B:27:0x0062, B:29:0x0070, B:30:0x0081, B:32:0x008f, B:33:0x00a0, B:35:0x00ae, B:36:0x00bf, B:38:0x00cd, B:39:0x00db, B:41:0x00e9, B:42:0x00eb, B:44:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:138:0x0291, B:139:0x0296, B:141:0x0298, B:143:0x02ba, B:145:0x02be, B:147:0x02ce, B:149:0x02fe, B:153:0x0330, B:154:0x0364, B:184:0x03ba, B:191:0x03e9, B:192:0x0401, B:193:0x0420, B:195:0x0428, B:196:0x042f, B:197:0x0455, B:200:0x0458, B:202:0x0468, B:204:0x0472, B:206:0x0484, B:207:0x049b, B:203:0x046d, B:185:0x03c1, B:186:0x03c8, B:187:0x03cf, B:188:0x03d6, B:189:0x03dc, B:190:0x03e3, B:156:0x0368, B:159:0x0372, B:162:0x037c, B:165:0x0386, B:168:0x0390, B:171:0x039a, B:148:0x02fb, B:209:0x049d, B:210:0x04a2, B:121:0x0235, B:123:0x0239, B:124:0x024a, B:130:0x0276, B:132:0x027a, B:136:0x0289, B:133:0x027d, B:135:0x0285, B:127:0x026e, B:129:0x0274, B:68:0x014b, B:70:0x014f, B:71:0x0155, B:98:0x01a2, B:106:0x0213, B:108:0x0216, B:110:0x0219, B:112:0x021d, B:99:0x01b0, B:102:0x01e0, B:100:0x01c1, B:101:0x01d4, B:103:0x01e3, B:104:0x01fa, B:105:0x020a, B:73:0x0159, B:76:0x0163, B:79:0x016d, B:82:0x0177, B:85:0x0181, B:88:0x018b, B:116:0x0225, B:117:0x022b, B:212:0x04a4, B:213:0x04a9), top: B:220:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16839i(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapr.m16839i(java.util.Map):void");
    }

    /* renamed from: j */
    public final void m16840j(int i2, int i3) {
        this.f22233f = i2;
        this.f22234g = i3;
    }

    /* renamed from: k */
    public final boolean m16841k() {
        boolean z;
        synchronized (this.f22239l) {
            z = this.f22246s != null;
        }
        return z;
    }

    /* renamed from: l */
    public final void m16842l(boolean z) {
        synchronized (this.f22239l) {
            PopupWindow popupWindow = this.f22246s;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f22247t.removeView(this.f22240m.getView());
                ViewGroup viewGroup = this.f22248u;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f22243p);
                    this.f22248u.addView(this.f22240m.getView());
                    this.f22240m.mo14874A(this.f22242o);
                }
                if (z) {
                    m16867g(BuildConfig.APTOIDE_THEME);
                    zzaqc zzaqcVar = this.f22245r;
                    if (zzaqcVar != null) {
                        zzaqcVar.mo15075c();
                    }
                }
                this.f22246s = null;
                this.f22247t = null;
                this.f22248u = null;
                this.f22244q = null;
            }
        }
    }
}
