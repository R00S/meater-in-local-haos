package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.sdk.C6019d.c;
import com.flurry.sdk.C6068i2;
import com.flurry.sdk.C6182v3;
import com.flurry.sdk.C6217z6.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p241e.p252d.p253a.C8780f;
import p241e.p252d.p253a.EnumC8778d;
import p241e.p252d.p253a.InterfaceC8777c;
import p241e.p252d.p253a.InterfaceC8779e;

/* renamed from: com.flurry.sdk.a */
/* loaded from: classes2.dex */
public final class C5992a extends C6095l2 {

    /* renamed from: o */
    public static AtomicBoolean f15620o = new AtomicBoolean(false);

    /* renamed from: p */
    private static C5992a f15621p = null;

    /* renamed from: q */
    public List<InterfaceC8779e> f15622q;

    /* renamed from: com.flurry.sdk.a$a */
    public class a extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ long f15623h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC8777c f15624i;

        public a(long j2, InterfaceC8777c interfaceC8777c) {
            this.f15623h = j2;
            this.f15624i = interfaceC8777c;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6037e7.m13055a().f15832l.f15768s = this.f15623h;
            C6037e7.m13055a().f15832l.m13023A(this.f15624i);
        }
    }

    /* renamed from: com.flurry.sdk.a$b */
    public class b extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ Context f15626h;

        /* renamed from: i */
        final /* synthetic */ List f15627i;

        public b(Context context, List list) {
            this.f15626h = context;
            this.f15627i = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6104m2 c6104m2M13180a = C6104m2.m13180a();
            c6104m2M13180a.f16135d.mo13132a();
            c6104m2M13180a.f16133b.f16377a.m13383a();
            C6217z6 c6217z6 = c6104m2M13180a.f16134c;
            File[] fileArrListFiles = new File(C6140q2.m13271c()).listFiles();
            if (fileArrListFiles != null) {
                for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                    if (fileArrListFiles[i2].isFile()) {
                        C6021d1.m13030c(3, "StreamingFileUtil", "File " + fileArrListFiles[i2].getName());
                    } else if (fileArrListFiles[i2].isDirectory()) {
                        C6021d1.m13030c(3, "StreamingFileUtil", "Directory " + fileArrListFiles[i2].getName());
                    }
                }
            }
            System.out.println();
            C6021d1.m13030c(2, "VNodeFileProcessor", "Number of files already pending: in startWatching " + fileArrListFiles.length);
            c6217z6.m13390e(Arrays.asList(fileArrListFiles));
            c6217z6.mo13007m(c6217z6.new a(c6217z6));
            C6059h2.m13088a();
            C6049g1.m13075a(this.f15626h);
            C6059h2.m13090c(this.f15627i);
            C6059h2.m13089b(this.f15626h);
        }
    }

    /* renamed from: com.flurry.sdk.a$c */
    public class c extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ String f15629h;

        /* renamed from: i */
        final /* synthetic */ String f15630i;

        public c(String str, String str2) {
            this.f15629h = str;
            this.f15630i = str2;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6126o6.m13229j(this.f15629h, this.f15630i);
        }
    }

    /* renamed from: com.flurry.sdk.a$d */
    public class d extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ int f15632h;

        /* renamed from: i */
        final /* synthetic */ Context f15633i;

        public d(int i2, Context context) {
            this.f15632h = i2;
            this.f15633i = context;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            if (this.f15632h != C8780f.f33389a) {
                C6121o1.m13222a().m13223b(this.f15633i, null);
            }
            int i2 = this.f15632h;
            int i3 = C8780f.f33390b;
            if ((i2 & i3) == i3) {
                C6112n1 c6112n1M13193a = C6112n1.m13193a();
                c6112n1M13193a.f16163h = true;
                if (c6112n1M13193a.f16164i) {
                    c6112n1M13193a.m13201f();
                }
            }
            int i4 = this.f15632h;
            int i5 = C8780f.f33391c;
            if ((i4 & i5) == i5) {
                C6139q1.m13266a().f16281e = true;
            }
        }
    }

    /* renamed from: com.flurry.sdk.a$e */
    public class e extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f15635h;

        public e(boolean z) {
            this.f15635h = z;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6037e7.m13055a().f15837q.m13170x(this.f15635h);
        }
    }

    /* renamed from: com.flurry.sdk.a$f */
    final class f extends AbstractRunnableC6041f2 {
        f() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6134p5.m13260h();
            C6037e7.m13055a().f15832l.m13024C(EnumC6039f0.FOREGROUND, true);
        }
    }

    /* renamed from: com.flurry.sdk.a$g */
    public class g extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f15638h;

        /* renamed from: i */
        final /* synthetic */ boolean f15639i;

        public g(boolean z, boolean z2) {
            this.f15638h = z;
            this.f15639i = z2;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Resources.NotFoundException {
            int identifier;
            C6019d c6019d = C6037e7.m13055a().f15829i;
            String strM13143b = C6084k0.m13141a().m13143b();
            boolean z = this.f15638h;
            boolean z2 = this.f15639i;
            c6019d.f15742p = strM13143b;
            c6019d.f15743q = z;
            c6019d.f15744r = z2;
            c6019d.mo13007m(c6019d.new c());
            String property = System.getProperty("os.arch");
            boolean zIsEmpty = TextUtils.isEmpty(property);
            String string = HttpUrl.FRAGMENT_ENCODE_SET;
            if (zIsEmpty) {
                property = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            HashMap map = new HashMap();
            map.put("device.model", Build.MODEL);
            map.put("build.brand", Build.BRAND);
            map.put("build.id", Build.ID);
            map.put("version.release", Build.VERSION.RELEASE);
            map.put("build.device", Build.DEVICE);
            map.put("build.product", Build.PRODUCT);
            C6093l0.m13174a();
            Context contextM12964a = C6002b0.m12964a();
            if (contextM12964a != null && (identifier = contextM12964a.getResources().getIdentifier("com.flurry.crash.map_id", "string", contextM12964a.getPackageName())) != 0) {
                string = contextM12964a.getResources().getString(identifier);
            }
            map.put("proguard.build.uuid", string);
            map.put("device.arch", property);
            C6104m2.m13180a().m13181b(new C6116n5(new C6125o5(map)));
            C6025d5.m13045h();
            C6134p5.m13260h();
            Map<String, List<String>> mapM13321a = new C6179v0().m13321a();
            if (mapM13321a.size() > 0) {
                C6104m2.m13180a().m13181b(new C6054g6(new C6063h6(mapM13321a)));
            }
            C6044f5.m13061h(C6037e7.m13055a().f15824d.f16270q);
        }
    }

    /* renamed from: com.flurry.sdk.a$h */
    public class h extends AbstractRunnableC6041f2 {
        public h() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6037e7.m13055a().f15832l.m13025D(EnumC6039f0.FOREGROUND, false);
        }
    }

    /* renamed from: com.flurry.sdk.a$i */
    final class i extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ String f15642h;

        /* renamed from: i */
        final /* synthetic */ C6182v3.a f15643i;

        /* renamed from: j */
        final /* synthetic */ Map f15644j;

        /* renamed from: k */
        final /* synthetic */ boolean f15645k;

        /* renamed from: l */
        final /* synthetic */ boolean f15646l;

        /* renamed from: m */
        final /* synthetic */ long f15647m;

        /* renamed from: n */
        final /* synthetic */ long f15648n;

        i(String str, C6182v3.a aVar, Map map, boolean z, boolean z2, long j2, long j3) {
            this.f15642h = str;
            this.f15643i = aVar;
            this.f15644j = map;
            this.f15645k = z;
            this.f15646l = z2;
            this.f15647m = j2;
            this.f15648n = j3;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6174u3.m13318h(this.f15642h, this.f15643i, this.f15644j, this.f15645k, this.f15646l, this.f15647m, this.f15648n);
        }
    }

    /* renamed from: com.flurry.sdk.a$j */
    public class j extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ String f15650h;

        /* renamed from: i */
        final /* synthetic */ long f15651i;

        /* renamed from: j */
        final /* synthetic */ String f15652j;

        /* renamed from: k */
        final /* synthetic */ Throwable f15653k;

        /* renamed from: l */
        final /* synthetic */ Map f15654l;

        public j(String str, long j2, String str2, Throwable th, Map map) {
            this.f15650h = str;
            this.f15651i = j2;
            this.f15652j = str2;
            this.f15653k = th;
            this.f15654l = map;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            C6037e7.m13055a().f15827g.m12979x(this.f15650h, this.f15651i, this.f15652j, this.f15653k.getClass().getName(), this.f15653k, C6127o7.m13230a(), this.f15654l);
        }
    }

    public C5992a() {
        super("FlurryAgentImpl", C6068i2.m13111a(C6068i2.b.PUBLIC_API));
        this.f15622q = new ArrayList();
    }

    /* renamed from: v */
    public static C5992a m12944v() {
        if (f15621p == null) {
            f15621p = new C5992a();
        }
        return f15621p;
    }

    /* renamed from: x */
    public static boolean m12945x() {
        return f15620o.get();
    }

    /* renamed from: s */
    public final EnumC8778d m12946s(String str, C6182v3.a aVar, Map<String, String> map) {
        return !C6013c2.m12991g(16) ? EnumC8778d.kFlurryEventFailed : m12947t(str, aVar, map, false, false);
    }

    /* renamed from: t */
    public final EnumC8778d m12947t(String str, C6182v3.a aVar, Map<String, String> map, boolean z, boolean z2) {
        if (!f15620o.get()) {
            C6021d1.m13041n("FlurryAgentImpl", "Invalid call to logEvent. Flurry is not initialized");
            return null;
        }
        if (C6013c2.m12986b(str).length() == 0) {
            return EnumC8778d.kFlurryEventFailed;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        EnumC8778d enumC8778d = map2.size() > 10 ? EnumC8778d.kFlurryEventParamsCountExceeded : EnumC8778d.kFlurryEventRecorded;
        mo13007m(new i(str, aVar, map2, z, z2, jCurrentTimeMillis, jElapsedRealtime));
        return enumC8778d;
    }

    /* renamed from: u */
    public final EnumC8778d m12948u(String str, Map<String, String> map, boolean z, boolean z2) {
        return m12947t(str, C6182v3.a.CUSTOM, map, z, z2);
    }

    /* renamed from: w */
    public final void m12949w(Context context) {
        if (context instanceof Activity) {
            C6021d1.m13032e("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
        } else if (f15620o.get()) {
            mo13007m(new f());
        } else {
            C6021d1.m13041n("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
        }
    }
}
