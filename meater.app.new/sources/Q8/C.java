package Q8;

import T8.F;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes2.dex */
public class C {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f14370g;

    /* renamed from: h, reason: collision with root package name */
    static final String f14371h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f14372a;

    /* renamed from: b, reason: collision with root package name */
    private final L f14373b;

    /* renamed from: c, reason: collision with root package name */
    private final C1614b f14374c;

    /* renamed from: d, reason: collision with root package name */
    private final Z8.d f14375d;

    /* renamed from: e, reason: collision with root package name */
    private final Y8.j f14376e;

    /* renamed from: f, reason: collision with root package name */
    private final N8.j f14377f = N8.j.f12581a;

    static {
        HashMap map = new HashMap();
        f14370g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f14371h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.4.0");
    }

    public C(Context context, L l10, C1614b c1614b, Z8.d dVar, Y8.j jVar) {
        this.f14372a = context;
        this.f14373b = l10;
        this.f14374c = c1614b;
        this.f14375d = dVar;
        this.f14376e = jVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f14377f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List<F.a.AbstractC0235a> listUnmodifiableList;
        if (!this.f14376e.b().f19463b.f19472c || this.f14374c.f14423c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C1619g c1619g : this.f14374c.f14423c) {
                arrayList.add(F.a.AbstractC0235a.a().d(c1619g.c()).b(c1619g.a()).c(c1619g.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    private F.b b() {
        return T8.F.b().l("19.4.0").h(this.f14374c.f14421a).i(this.f14373b.a().c()).g(this.f14373b.a().e()).f(this.f14373b.a().d()).d(this.f14374c.f14426f).e(this.f14374c.f14427g).k(4);
    }

    private static long f(long j10) {
        if (j10 > 0) {
            return j10;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f14370g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private F.e.d.a.b.AbstractC0239a h() {
        return F.e.d.a.b.AbstractC0239a.a().b(0L).d(0L).c(this.f14374c.f14425e).e(this.f14374c.f14422b).a();
    }

    private List<F.e.d.a.b.AbstractC0239a> i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i10, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i10).f(o(aVar)).a();
    }

    private F.e.d.a k(int i10, Z8.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean boolValueOf;
        F.e.d.a.c cVarE = this.f14377f.e(this.f14372a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f14377f.d(this.f14372a)).h(i10).f(p(eVar, thread, i11, i12, z10)).a();
    }

    private F.e.d.c l(int i10) {
        C1618f c1618fA = C1618f.a(this.f14372a);
        Float fB = c1618fA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c1618fA.c();
        boolean zN = C1622j.n(this.f14372a);
        return F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i10).g(f(C1622j.b(this.f14372a) - C1622j.a(this.f14372a))).d(C1622j.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(Z8.e eVar, int i10, int i11) {
        return n(eVar, i10, i11, 0);
    }

    private F.e.d.a.b.c n(Z8.e eVar, int i10, int i11, int i12) {
        String str = eVar.f19608b;
        String str2 = eVar.f19607a;
        StackTraceElement[] stackTraceElementArr = eVar.f19609c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        Z8.e eVar2 = eVar.f19610d;
        if (i12 >= i11) {
            Z8.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f19610d;
                i13++;
            }
        }
        F.e.d.a.b.c.AbstractC0242a abstractC0242aD = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i10)).d(i13);
        if (eVar2 != null && i13 == 0) {
            abstractC0242aD.b(n(eVar2, i10, i11, i12 + 1));
        }
        return abstractC0242aD.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(Z8.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return F.e.d.a.b.a().f(z(eVar, thread, i10, z10)).d(m(eVar, i10, i11)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.AbstractC0245e.AbstractC0247b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a abstractC0248a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0248a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    private List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> r(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0245e.AbstractC0247b.a().c(i10)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.f14373b.f()).g(this.f14374c.f14426f).d(this.f14374c.f14427g).f(this.f14373b.a().c()).b(this.f14374c.f14428h.d()).c(this.f14374c.f14428h.e()).a();
    }

    private F.e t(String str, long j10) {
        return F.e.a().m(j10).j(str).h(f14371h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = C1622j.b(this.f14372a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zW = C1622j.w();
        int iL = C1622j.l();
        return F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zW).j(iL).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private F.e.AbstractC0252e v() {
        return F.e.AbstractC0252e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C1622j.x()).a();
    }

    private F.e.d.a.b.AbstractC0243d w() {
        return F.e.d.a.b.AbstractC0243d.a().d("0").c("0").b(0L).a();
    }

    private F.e.d.a.b.AbstractC0245e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.AbstractC0245e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return F.e.d.a.b.AbstractC0245e.a().d(thread.getName()).c(i10).b(r(stackTraceElementArr, i10)).a();
    }

    private List<F.e.d.a.b.AbstractC0245e> z(Z8.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f19609c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f14375d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i10 = this.f14372a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i10, a(aVar))).c(l(i10)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f14372a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j10).b(k(i12, Z8.e.a(th, this.f14375d), thread, i10, i11, z10)).c(l(i12)).a();
    }

    public T8.F e(String str, long j10) {
        return b().m(t(str, j10)).a();
    }
}
