package io.sentry.clientreport;

import io.sentry.C9244a1;
import io.sentry.C9449h4;
import io.sentry.C9492j4;
import io.sentry.C9680x4;
import io.sentry.EnumC9580r4;
import io.sentry.EnumC9587s4;
import io.sentry.EnumC9688z0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReportRecorder.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.d */
/* loaded from: classes2.dex */
public final class C9400d implements InterfaceC9403g {

    /* renamed from: a */
    private final InterfaceC9404h f36245a = new C9397a();

    /* renamed from: b */
    private final C9680x4 f36246b;

    public C9400d(C9680x4 c9680x4) {
        this.f36246b = c9680x4;
    }

    /* renamed from: e */
    private EnumC9688z0 m30687e(EnumC9580r4 enumC9580r4) {
        return EnumC9580r4.Event.equals(enumC9580r4) ? EnumC9688z0.Error : EnumC9580r4.Session.equals(enumC9580r4) ? EnumC9688z0.Session : EnumC9580r4.Transaction.equals(enumC9580r4) ? EnumC9688z0.Transaction : EnumC9580r4.UserFeedback.equals(enumC9580r4) ? EnumC9688z0.UserReport : EnumC9580r4.Profile.equals(enumC9580r4) ? EnumC9688z0.Profile : EnumC9580r4.Attachment.equals(enumC9580r4) ? EnumC9688z0.Attachment : EnumC9688z0.Default;
    }

    /* renamed from: f */
    private void m30688f(String str, String str2, Long l) {
        this.f36245a.mo30679b(new C9399c(str, str2), l);
    }

    /* renamed from: h */
    private void m30689h(C9398b c9398b) {
        if (c9398b == null) {
            return;
        }
        for (C9402f c9402f : c9398b.m30680a()) {
            m30688f(c9402f.m30697c(), c9402f.m30695a(), c9402f.m30696b());
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9403g
    /* renamed from: a */
    public void mo30690a(EnumC9401e enumC9401e, EnumC9688z0 enumC9688z0) {
        try {
            m30688f(enumC9401e.getReason(), enumC9688z0.getCategory(), 1L);
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9587s4.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9403g
    /* renamed from: b */
    public void mo30691b(EnumC9401e enumC9401e, C9449h4 c9449h4) {
        if (c9449h4 == null) {
            return;
        }
        try {
            Iterator<C9492j4> it = c9449h4.m30832c().iterator();
            while (it.hasNext()) {
                mo30693d(enumC9401e, it.next());
            }
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9587s4.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9403g
    /* renamed from: c */
    public C9449h4 mo30692c(C9449h4 c9449h4) {
        C9398b c9398bM30694g = m30694g();
        if (c9398bM30694g == null) {
            return c9449h4;
        }
        try {
            this.f36246b.getLogger().mo30214c(EnumC9587s4.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<C9492j4> it = c9449h4.m30832c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(C9492j4.m30889c(this.f36246b.getSerializer(), c9398bM30694g));
            return new C9449h4(c9449h4.m30831b(), arrayList);
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9587s4.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c9449h4;
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9403g
    /* renamed from: d */
    public void mo30693d(EnumC9401e enumC9401e, C9492j4 c9492j4) {
        if (c9492j4 == null) {
            return;
        }
        try {
            EnumC9580r4 enumC9580r4M30919b = c9492j4.m30910i().m30919b();
            if (EnumC9580r4.ClientReport.equals(enumC9580r4M30919b)) {
                try {
                    m30689h(c9492j4.m30908g(this.f36246b.getSerializer()));
                } catch (Exception unused) {
                    this.f36246b.getLogger().mo30214c(EnumC9587s4.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                m30688f(enumC9401e.getReason(), m30687e(enumC9580r4M30919b).getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9587s4.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    /* renamed from: g */
    C9398b m30694g() {
        Date dateM30008c = C9244a1.m30008c();
        List<C9402f> listMo30678a = this.f36245a.mo30678a();
        if (listMo30678a.isEmpty()) {
            return null;
        }
        return new C9398b(dateM30008c, listMo30678a);
    }
}
