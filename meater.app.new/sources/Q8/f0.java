package Q8;

import S8.EventMetadata;
import T8.F;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final C f14442a;

    /* renamed from: b, reason: collision with root package name */
    private final W8.e f14443b;

    /* renamed from: c, reason: collision with root package name */
    private final X8.b f14444c;

    /* renamed from: d, reason: collision with root package name */
    private final S8.f f14445d;

    /* renamed from: e, reason: collision with root package name */
    private final S8.p f14446e;

    /* renamed from: f, reason: collision with root package name */
    private final L f14447f;

    /* renamed from: g, reason: collision with root package name */
    private final R8.f f14448g;

    f0(C c10, W8.e eVar, X8.b bVar, S8.f fVar, S8.p pVar, L l10, R8.f fVar2) {
        this.f14442a = c10;
        this.f14443b = eVar;
        this.f14444c = bVar;
        this.f14445d = fVar;
        this.f14446e = pVar;
        this.f14447f = l10;
        this.f14448g = fVar2;
    }

    private F.e.d d(F.e.d dVar, S8.f fVar, S8.p pVar) {
        return e(dVar, fVar, pVar, Collections.emptyMap());
    }

    private F.e.d e(F.e.d dVar, S8.f fVar, S8.p pVar, Map<String, String> map) {
        F.e.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(F.e.d.AbstractC0250d.a().b(strC).a());
        } else {
            N8.g.f().i("No log data to include with this event.");
        }
        List<F.c> listO = o(pVar.g(map));
        List<F.c> listO2 = o(pVar.h());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    private F.e.d f(F.e.d dVar, Map<String, String> map) {
        return g(e(dVar, this.f14445d, this.f14446e, map), this.f14446e);
    }

    private F.e.d g(F.e.d dVar, S8.p pVar) {
        List<F.e.d.AbstractC0251e> listI = pVar.i();
        if (listI.isEmpty()) {
            return dVar;
        }
        F.e.d.b bVarH = dVar.h();
        bVarH.e(F.e.d.f.a().b(listI).a());
        return bVarH.a();
    }

    private static F.a h(ApplicationExitInfo applicationExitInfo) throws IOException {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e10) {
            N8.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public static String i(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static f0 j(Context context, L l10, W8.g gVar, C1614b c1614b, S8.f fVar, S8.p pVar, Z8.d dVar, Y8.j jVar, Q q10, C1626n c1626n, R8.f fVar2) {
        return new f0(new C(context, l10, c1614b, dVar, jVar), new W8.e(gVar, jVar, c1626n), X8.b.b(context, jVar, q10), fVar, pVar, l10, fVar2);
    }

    private D k(D d10) {
        if (d10.b().h() != null && d10.b().g() != null) {
            return d10;
        }
        FirebaseInstallationId firebaseInstallationIdD = this.f14447f.d(true);
        return D.a(d10.b().t(firebaseInstallationIdD.getFid()).s(firebaseInstallationIdD.getAuthToken()), d10.d(), d10.c());
    }

    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long jQ = this.f14443b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = S.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List<F.c> o(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(F.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: Q8.e0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f0.q((F.c) obj, (F.c) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int q(F.c cVar, F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(F.e.d dVar, EventMetadata eventMetadata, boolean z10) {
        N8.g.f().b("disk worker: log non-fatal event to persistence");
        this.f14443b.y(dVar, eventMetadata.getSessionId(), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(AbstractC5208j<D> abstractC5208j) {
        if (!abstractC5208j.o()) {
            N8.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC5208j.j());
            return false;
        }
        D dK = abstractC5208j.k();
        N8.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + dK.d());
        File fileC = dK.c();
        if (fileC.delete()) {
            N8.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        N8.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void v(Throwable th, Thread thread, String str, final EventMetadata eventMetadata, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final F.e.d dVarF = f(this.f14442a.d(th, thread, str, eventMetadata.getTimestamp(), 4, 8, z10), eventMetadata.a());
        if (z10) {
            this.f14443b.y(dVarF, eventMetadata.getSessionId(), zEquals);
        } else {
            this.f14448g.diskWrite.g(new Runnable() { // from class: Q8.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14432B.r(dVarF, eventMetadata, zEquals);
                }
            });
        }
    }

    public AbstractC5208j<Void> A(Executor executor) {
        return B(executor, null);
    }

    public AbstractC5208j<Void> B(Executor executor, String str) {
        List<D> listW = this.f14443b.w();
        ArrayList arrayList = new ArrayList();
        for (D d10 : listW) {
            if (str == null || str.equals(d10.d())) {
                arrayList.add(this.f14444c.c(k(d10), str != null).h(executor, new InterfaceC5201c() { // from class: Q8.d0
                    @Override // z7.InterfaceC5201c
                    public final Object a(AbstractC5208j abstractC5208j) {
                        return Boolean.valueOf(this.f14439a.u(abstractC5208j));
                    }
                }));
            }
        }
        return C5211m.f(arrayList);
    }

    public void l(String str, List<O> list, F.a aVar) {
        N8.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<O> it = list.iterator();
        while (it.hasNext()) {
            F.d.b bVarM = it.next().m();
            if (bVarM != null) {
                arrayList.add(bVarM);
            }
        }
        this.f14443b.l(str, F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j10, String str) {
        this.f14443b.k(str, j10);
    }

    public boolean p() {
        return this.f14443b.r();
    }

    public SortedSet<String> s() {
        return this.f14443b.p();
    }

    public void t(String str, long j10) {
        this.f14443b.z(this.f14442a.e(str, j10));
    }

    public void w(Throwable th, Thread thread, String str, long j10) {
        N8.g.f().i("Persisting fatal event for session " + str);
        v(th, thread, "crash", new EventMetadata(str, j10), true);
    }

    public void x(Throwable th, Thread thread, EventMetadata eventMetadata) {
        N8.g.f().i("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        v(th, thread, "error", eventMetadata, false);
    }

    public void y(String str, List<ApplicationExitInfo> list, S8.f fVar, S8.p pVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            N8.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d dVarC = this.f14442a.c(h(applicationExitInfoN));
        N8.g.f().b("Persisting anr for session " + str);
        this.f14443b.y(g(d(dVarC, fVar, pVar), pVar), str, true);
    }

    public void z() {
        this.f14443b.i();
    }
}
