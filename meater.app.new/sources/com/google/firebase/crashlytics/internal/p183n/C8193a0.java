package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i;
import com.google.firebase.crashlytics.internal.p191u.C8320e;
import com.google.firebase.crashlytics.internal.p191u.InterfaceC8319d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* renamed from: com.google.firebase.crashlytics.h.n.a0 */
/* loaded from: classes2.dex */
public class C8193a0 {

    /* renamed from: a */
    private static final Map<String, Integer> f30874a;

    /* renamed from: b */
    static final String f30875b;

    /* renamed from: c */
    private final Context f30876c;

    /* renamed from: d */
    private final C8209i0 f30877d;

    /* renamed from: e */
    private final C8214l f30878e;

    /* renamed from: f */
    private final InterfaceC8319d f30879f;

    /* renamed from: g */
    private final InterfaceC8312i f30880g;

    /* renamed from: h */
    private final ProcessDetailsProvider f30881h = ProcessDetailsProvider.f30863a;

    static {
        HashMap map = new HashMap();
        f30874a = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f30875b = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.6.1");
    }

    public C8193a0(Context context, C8209i0 c8209i0, C8214l c8214l, InterfaceC8319d interfaceC8319d, InterfaceC8312i interfaceC8312i) {
        this.f30876c = context;
        this.f30877d = c8209i0;
        this.f30878e = c8214l;
        this.f30879f = interfaceC8319d;
        this.f30880g = interfaceC8312i;
    }

    /* renamed from: A */
    private AbstractC8258f0.e.d.a.c m25198A(AbstractC8258f0.a aVar) {
        return this.f30881h.m25189a(aVar.mo25612e(), aVar.mo25611d(), aVar.mo25610c());
    }

    /* renamed from: a */
    private AbstractC8258f0.a m25199a(AbstractC8258f0.a aVar) {
        List<AbstractC8258f0.a.AbstractC11498a> listUnmodifiableList;
        if (!this.f30880g.mo26060b().f31595b.f31604c || this.f30878e.f30935c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C8224q c8224q : this.f30878e.f30935c) {
                arrayList.add(AbstractC8258f0.a.AbstractC11498a.m25672a().mo25640d(c8224q.m25311c()).mo25638b(c8224q.m25309a()).mo25639c(c8224q.m25310b()).mo25637a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return AbstractC8258f0.a.m25671a().mo25620c(aVar.mo25610c()).mo25622e(aVar.mo25612e()).mo25624g(aVar.mo25614g()).mo25626i(aVar.mo25616i()).mo25621d(aVar.mo25611d()).mo25623f(aVar.mo25613f()).mo25625h(aVar.mo25615h()).mo25627j(aVar.mo25617j()).mo25619b(listUnmodifiableList).mo25618a();
    }

    /* renamed from: b */
    private AbstractC8258f0.b m25200b() {
        return AbstractC8258f0.m25664b().mo25604k("18.6.1").mo25600g(this.f30878e.f30933a).mo25601h(this.f30877d.mo25261a().mo25270c()).mo25599f(this.f30877d.mo25261a().mo25271d()).mo25597d(this.f30878e.f30938f).mo25598e(this.f30878e.f30939g).mo25603j(4);
    }

    /* renamed from: f */
    private static long m25201f(long j2) {
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    /* renamed from: g */
    private static int m25202g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f30874a.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: h */
    private AbstractC8258f0.e.d.a.b.AbstractC11502a m25203h() {
        return AbstractC8258f0.e.d.a.b.AbstractC11502a.m25780a().mo25787b(0L).mo25789d(0L).mo25788c(this.f30878e.f30937e).mo25790e(this.f30878e.f30934b).mo25786a();
    }

    /* renamed from: i */
    private List<AbstractC8258f0.e.d.a.b.AbstractC11502a> m25204i() {
        return Collections.singletonList(m25203h());
    }

    /* renamed from: j */
    private AbstractC8258f0.e.d.a m25205j(int i2, AbstractC8258f0.a aVar) {
        return AbstractC8258f0.e.d.a.m25757a().mo25768c(Boolean.valueOf(aVar.mo25610c() != 100)).mo25769d(m25198A(aVar)).mo25773h(i2).mo25771f(m25210o(aVar)).mo25766a();
    }

    /* renamed from: k */
    private AbstractC8258f0.e.d.a m25206k(int i2, C8320e c8320e, Thread thread, int i3, int i4, boolean z) {
        Boolean boolValueOf;
        AbstractC8258f0.e.d.a.c cVarM25192e = this.f30881h.m25192e(this.f30876c);
        if (cVarM25192e.mo25839b() > 0) {
            boolValueOf = Boolean.valueOf(cVarM25192e.mo25839b() != 100);
        } else {
            boolValueOf = null;
        }
        return AbstractC8258f0.e.d.a.m25757a().mo25768c(boolValueOf).mo25769d(cVarM25192e).mo25767b(this.f30881h.m25191d(this.f30876c)).mo25773h(i2).mo25771f(m25211p(c8320e, thread, i3, i4, z)).mo25766a();
    }

    /* renamed from: l */
    private AbstractC8258f0.e.d.c m25207l(int i2) {
        C8222p c8222pM25304a = C8222p.m25304a(this.f30876c);
        Float fM25307b = c8222pM25304a.m25307b();
        Double dValueOf = fM25307b != null ? Double.valueOf(fM25307b.doubleValue()) : null;
        int iM25308c = c8222pM25304a.m25308c();
        boolean zM25343n = C8228t.m25343n(this.f30876c);
        return AbstractC8258f0.e.d.c.m25855a().mo25863b(dValueOf).mo25864c(iM25308c).mo25867f(zM25343n).mo25866e(i2).mo25868g(m25201f(C8228t.m25331b(this.f30876c) - C8228t.m25330a(this.f30876c))).mo25865d(C8228t.m25332c(Environment.getDataDirectory().getPath())).mo25862a();
    }

    /* renamed from: m */
    private AbstractC8258f0.e.d.a.b.c m25208m(C8320e c8320e, int i2, int i3) {
        return m25209n(c8320e, i2, i3, 0);
    }

    /* renamed from: n */
    private AbstractC8258f0.e.d.a.b.c m25209n(C8320e c8320e, int i2, int i3, int i4) {
        String str = c8320e.f31637b;
        String str2 = c8320e.f31636a;
        StackTraceElement[] stackTraceElementArr = c8320e.f31638c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C8320e c8320e2 = c8320e.f31639d;
        if (i4 >= i3) {
            C8320e c8320e3 = c8320e2;
            while (c8320e3 != null) {
                c8320e3 = c8320e3.f31639d;
                i5++;
            }
        }
        AbstractC8258f0.e.d.a.b.c.AbstractC11505a abstractC11505aMo25807d = AbstractC8258f0.e.d.a.b.c.m25798a().mo25809f(str).mo25808e(str2).mo25806c(m25213r(stackTraceElementArr, i2)).mo25807d(i5);
        if (c8320e2 != null && i5 == 0) {
            abstractC11505aMo25807d.mo25805b(m25209n(c8320e2, i2, i3, i4 + 1));
        }
        return abstractC11505aMo25807d.mo25804a();
    }

    /* renamed from: o */
    private AbstractC8258f0.e.d.a.b m25210o(AbstractC8258f0.a aVar) {
        return AbstractC8258f0.e.d.a.b.m25774a().mo25793b(aVar).mo25796e(m25218w()).mo25794c(m25204i()).mo25792a();
    }

    /* renamed from: p */
    private AbstractC8258f0.e.d.a.b m25211p(C8320e c8320e, Thread thread, int i2, int i3, boolean z) {
        return AbstractC8258f0.e.d.a.b.m25774a().mo25797f(m25221z(c8320e, thread, i2, z)).mo25795d(m25208m(c8320e, i2, i3)).mo25796e(m25218w()).mo25794c(m25204i()).mo25792a();
    }

    /* renamed from: q */
    private AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b m25212q(StackTraceElement stackTraceElement, AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a abstractC11511a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC11511a.mo25836e(jMax).mo25837f(str).mo25833b(fileName).mo25835d(lineNumber).mo25832a();
    }

    /* renamed from: r */
    private List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> m25213r(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m25212q(stackTraceElement, AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.m25826a().mo25834c(i2)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: s */
    private AbstractC8258f0.e.a m25214s() {
        return AbstractC8258f0.e.a.m25699a().mo25711e(this.f30877d.m25263f()).mo25713g(this.f30878e.f30938f).mo25710d(this.f30878e.f30939g).mo25712f(this.f30877d.mo25261a().mo25270c()).mo25708b(this.f30878e.f30940h.m25171d()).mo25709c(this.f30878e.f30940h.m25172e()).mo25707a();
    }

    /* renamed from: t */
    private AbstractC8258f0.e m25215t(String str, long j2) {
        return AbstractC8258f0.e.m25681a().mo25727m(j2).mo25724j(str).mo25722h(f30875b).mo25716b(m25214s()).mo25726l(m25217v()).mo25719e(m25216u()).mo25723i(3).mo25715a();
    }

    /* renamed from: u */
    private AbstractC8258f0.e.c m25216u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iM25202g = m25202g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM25331b = C8228t.m25331b(this.f30876c);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zM25352w = C8228t.m25352w();
        int iM25341l = C8228t.m25341l();
        return AbstractC8258f0.e.c.m25729a().mo25740b(iM25202g).mo25744f(Build.MODEL).mo25741c(iAvailableProcessors).mo25746h(jM25331b).mo25742d(blockCount).mo25747i(zM25352w).mo25748j(iM25341l).mo25743e(Build.MANUFACTURER).mo25745g(Build.PRODUCT).mo25739a();
    }

    /* renamed from: v */
    private AbstractC8258f0.e.AbstractC11515e m25217v() {
        return AbstractC8258f0.e.AbstractC11515e.m25893a().mo25901d(3).mo25902e(Build.VERSION.RELEASE).mo25899b(Build.VERSION.CODENAME).mo25900c(C8228t.m25353x()).mo25898a();
    }

    /* renamed from: w */
    private AbstractC8258f0.e.d.a.b.AbstractC11506d m25218w() {
        return AbstractC8258f0.e.d.a.b.AbstractC11506d.m25810a().mo25817d("0").mo25816c("0").mo25815b(0L).mo25814a();
    }

    /* renamed from: x */
    private AbstractC8258f0.e.d.a.b.AbstractC11508e m25219x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m25220y(thread, stackTraceElementArr, 0);
    }

    /* renamed from: y */
    private AbstractC8258f0.e.d.a.b.AbstractC11508e m25220y(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return AbstractC8258f0.e.d.a.b.AbstractC11508e.m25818a().mo25825d(thread.getName()).mo25824c(i2).mo25823b(m25213r(stackTraceElementArr, i2)).mo25822a();
    }

    /* renamed from: z */
    private List<AbstractC8258f0.e.d.a.b.AbstractC11508e> m25221z(C8320e c8320e, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m25220y(thread, c8320e.f31638c, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m25219x(key, this.f30879f.mo26070a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    public AbstractC8258f0.e.d m25222c(AbstractC8258f0.a aVar) {
        int i2 = this.f30876c.getResources().getConfiguration().orientation;
        return AbstractC8258f0.e.d.m25749a().mo25854g("anr").mo25853f(aVar.mo25616i()).mo25849b(m25205j(i2, m25199a(aVar))).mo25850c(m25207l(i2)).mo25848a();
    }

    /* renamed from: d */
    public AbstractC8258f0.e.d m25223d(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.f30876c.getResources().getConfiguration().orientation;
        return AbstractC8258f0.e.d.m25749a().mo25854g(str).mo25853f(j2).mo25849b(m25206k(i4, C8320e.m26073a(th, this.f30879f), thread, i2, i3, z)).mo25850c(m25207l(i4)).mo25848a();
    }

    /* renamed from: e */
    public AbstractC8258f0 m25224e(String str, long j2) {
        return m25200b().mo25605l(m25215t(str, j2)).mo25594a();
    }
}
