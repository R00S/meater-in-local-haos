package com.google.firebase.crashlytics.internal.p183n;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p184o.C8240f;
import com.google.firebase.crashlytics.internal.p184o.C8246l;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p188r.C8297e;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import com.google.firebase.crashlytics.internal.p189s.C8302d;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i;
import com.google.firebase.crashlytics.internal.p191u.InterfaceC8319d;
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

/* compiled from: SessionReportingCoordinator.java */
/* renamed from: com.google.firebase.crashlytics.h.n.o0 */
/* loaded from: classes2.dex */
public class C8221o0 {

    /* renamed from: a */
    private final C8193a0 f30948a;

    /* renamed from: b */
    private final C8297e f30949b;

    /* renamed from: c */
    private final C8302d f30950c;

    /* renamed from: d */
    private final C8240f f30951d;

    /* renamed from: e */
    private final C8246l f30952e;

    /* renamed from: f */
    private final C8209i0 f30953f;

    C8221o0(C8193a0 c8193a0, C8297e c8297e, C8302d c8302d, C8240f c8240f, C8246l c8246l, C8209i0 c8209i0) {
        this.f30948a = c8193a0;
        this.f30949b = c8297e;
        this.f30950c = c8302d;
        this.f30951d = c8240f;
        this.f30952e = c8246l;
        this.f30953f = c8209i0;
    }

    /* renamed from: a */
    private AbstractC8258f0.e.d m25281a(AbstractC8258f0.e.d dVar, C8240f c8240f, C8246l c8246l) {
        AbstractC8258f0.e.d.b bVarMo25756h = dVar.mo25756h();
        String strM25476c = c8240f.m25476c();
        if (strM25476c != null) {
            bVarMo25756h.mo25851d(AbstractC8258f0.e.d.AbstractC11513d.m25869a().mo25872b(strM25476c).mo25871a());
        } else {
            C8179h.m25176f().m25183i("No log data to include with this event.");
        }
        List<AbstractC8258f0.c> listM25289k = m25289k(c8246l.m25541d());
        List<AbstractC8258f0.c> listM25289k2 = m25289k(c8246l.m25542e());
        if (!listM25289k.isEmpty() || !listM25289k2.isEmpty()) {
            bVarMo25756h.mo25849b(dVar.mo25750b().mo25765i().mo25770e(listM25289k).mo25772g(listM25289k2).mo25766a());
        }
        return bVarMo25756h.mo25848a();
    }

    /* renamed from: b */
    private AbstractC8258f0.e.d m25282b(AbstractC8258f0.e.d dVar) {
        return m25283c(m25281a(dVar, this.f30951d, this.f30952e), this.f30952e);
    }

    /* renamed from: c */
    private AbstractC8258f0.e.d m25283c(AbstractC8258f0.e.d dVar, C8246l c8246l) {
        List<AbstractC8258f0.e.d.AbstractC11514e> listM25543f = c8246l.m25543f();
        if (listM25543f.isEmpty()) {
            return dVar;
        }
        AbstractC8258f0.e.d.b bVarMo25756h = dVar.mo25756h();
        bVarMo25756h.mo25852e(AbstractC8258f0.e.d.f.m25889a().mo25892b(listM25543f).mo25891a());
        return bVarMo25756h.mo25848a();
    }

    /* renamed from: d */
    private static AbstractC8258f0.a m25284d(ApplicationExitInfo applicationExitInfo) throws IOException {
        String strM25285e = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strM25285e = m25285e(traceInputStream);
            }
        } catch (IOException e2) {
            C8179h.m25176f().m25185k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e2);
        }
        return AbstractC8258f0.a.m25671a().mo25620c(applicationExitInfo.getImportance()).mo25622e(applicationExitInfo.getProcessName()).mo25624g(applicationExitInfo.getReason()).mo25626i(applicationExitInfo.getTimestamp()).mo25621d(applicationExitInfo.getPid()).mo25623f(applicationExitInfo.getPss()).mo25625h(applicationExitInfo.getRss()).mo25627j(strM25285e).mo25618a();
    }

    /* renamed from: e */
    public static String m25285e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    /* renamed from: f */
    public static C8221o0 m25286f(Context context, C8209i0 c8209i0, C8298f c8298f, C8214l c8214l, C8240f c8240f, C8246l c8246l, InterfaceC8319d interfaceC8319d, InterfaceC8312i interfaceC8312i, C8219n0 c8219n0, C8230v c8230v) {
        return new C8221o0(new C8193a0(context, c8209i0, c8214l, interfaceC8319d, interfaceC8312i), new C8297e(c8298f, interfaceC8312i, c8230v), C8302d.m26011a(context, interfaceC8312i, c8219n0), c8240f, c8246l, c8209i0);
    }

    /* renamed from: g */
    private AbstractC8195b0 m25287g(AbstractC8195b0 abstractC8195b0) {
        if (abstractC8195b0.mo25226b().mo25586g() != null) {
            return abstractC8195b0;
        }
        return AbstractC8195b0.m25225a(abstractC8195b0.mo25226b().m25668r(this.f30953f.m25262d()), abstractC8195b0.mo25228d(), abstractC8195b0.mo25227c());
    }

    /* renamed from: j */
    private ApplicationExitInfo m25288j(String str, List<ApplicationExitInfo> list) {
        long jM25982m = this.f30949b.m25982m(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < jM25982m) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static List<AbstractC8258f0.c> m25289k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC8258f0.c.m25673a().mo25653b(entry.getKey()).mo25654c(entry.getValue()).mo25652a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.h.n.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((AbstractC8258f0.c) obj).mo25650b().compareTo(((AbstractC8258f0.c) obj2).mo25650b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public boolean m25292q(Task<AbstractC8195b0> task) {
        if (!task.mo23651n()) {
            C8179h.m25176f().m25186l("Crashlytics report could not be enqueued to DataTransport", task.mo23646i());
            return false;
        }
        AbstractC8195b0 abstractC8195b0Mo23647j = task.mo23647j();
        C8179h.m25176f().m25177b("Crashlytics report successfully enqueued to DataTransport: " + abstractC8195b0Mo23647j.mo25228d());
        File fileMo25227c = abstractC8195b0Mo23647j.mo25227c();
        if (fileMo25227c.delete()) {
            C8179h.m25176f().m25177b("Deleted report file: " + fileMo25227c.getPath());
            return true;
        }
        C8179h.m25176f().m25185k("Crashlytics could not delete report file: " + fileMo25227c.getPath());
        return true;
    }

    /* renamed from: r */
    private void m25293r(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        this.f30949b.m25985w(m25282b(this.f30948a.m25223d(th, thread, str2, j2, 4, 8, z)), str, str2.equals("crash"));
    }

    /* renamed from: h */
    public void m25294h(String str, List<InterfaceC8215l0> list, AbstractC8258f0.a aVar) {
        C8179h.m25176f().m25177b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8215l0> it = list.iterator();
        while (it.hasNext()) {
            AbstractC8258f0.d.b bVarMo25253c = it.next().mo25253c();
            if (bVarMo25253c != null) {
                arrayList.add(bVarMo25253c);
            }
        }
        this.f30949b.m25980h(str, AbstractC8258f0.d.m25674a().mo25661b(Collections.unmodifiableList(arrayList)).mo25660a(), aVar);
    }

    /* renamed from: i */
    public void m25295i(long j2, String str) {
        this.f30949b.m25979g(str, j2);
    }

    /* renamed from: l */
    public boolean m25296l() {
        return this.f30949b.m25983n();
    }

    /* renamed from: o */
    public SortedSet<String> m25297o() {
        return this.f30949b.m25981l();
    }

    /* renamed from: p */
    public void m25298p(String str, long j2) {
        this.f30949b.m25986x(this.f30948a.m25224e(str, j2));
    }

    /* renamed from: s */
    public void m25299s(Throwable th, Thread thread, String str, long j2) {
        C8179h.m25176f().m25183i("Persisting fatal event for session " + str);
        m25293r(th, thread, str, "crash", j2, true);
    }

    /* renamed from: t */
    public void m25300t(String str, List<ApplicationExitInfo> list, C8240f c8240f, C8246l c8246l) {
        ApplicationExitInfo applicationExitInfoM25288j = m25288j(str, list);
        if (applicationExitInfoM25288j == null) {
            C8179h.m25176f().m25183i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC8258f0.e.d dVarM25222c = this.f30948a.m25222c(m25284d(applicationExitInfoM25288j));
        C8179h.m25176f().m25177b("Persisting anr for session " + str);
        this.f30949b.m25985w(m25283c(m25281a(dVarM25222c, c8240f, c8246l), c8246l), str, true);
    }

    /* renamed from: u */
    public void m25301u() {
        this.f30949b.m25978e();
    }

    /* renamed from: v */
    public Task<Void> m25302v(Executor executor) {
        return m25303w(executor, null);
    }

    /* renamed from: w */
    public Task<Void> m25303w(Executor executor, String str) {
        List<AbstractC8195b0> listM25984u = this.f30949b.m25984u();
        ArrayList arrayList = new ArrayList();
        for (AbstractC8195b0 abstractC8195b0 : listM25984u) {
            if (str == null || str.equals(abstractC8195b0.mo25228d())) {
                arrayList.add(this.f30950c.m26014b(m25287g(abstractC8195b0), str != null).mo23644g(executor, new Continuation() { // from class: com.google.firebase.crashlytics.h.n.e
                    @Override // com.google.android.gms.tasks.Continuation
                    /* renamed from: a */
                    public final Object mo13777a(Task task) {
                        return Boolean.valueOf(this.f30890a.m25292q(task));
                    }
                }));
            }
        }
        return Tasks.m23664f(arrayList);
    }
}
