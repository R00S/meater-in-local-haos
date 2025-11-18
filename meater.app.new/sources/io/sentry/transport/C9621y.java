package io.sentry.transport;

import io.sentry.C9449h4;
import io.sentry.C9492j4;
import io.sentry.C9517n1;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.EnumC9688z0;
import io.sentry.clientreport.EnumC9401e;
import io.sentry.hints.InterfaceC9461k;
import io.sentry.hints.InterfaceC9466p;
import io.sentry.util.C9642m;
import io.sentry.util.C9654u;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* compiled from: RateLimiter.java */
/* renamed from: io.sentry.transport.y */
/* loaded from: classes2.dex */
public final class C9621y {

    /* renamed from: a */
    private final InterfaceC9613q f36908a;

    /* renamed from: b */
    private final C9680x4 f36909b;

    /* renamed from: c */
    private final Map<EnumC9688z0, Date> f36910c;

    public C9621y(InterfaceC9613q interfaceC9613q, C9680x4 c9680x4) {
        this.f36910c = new ConcurrentHashMap();
        this.f36908a = interfaceC9613q;
        this.f36909b = c9680x4;
    }

    /* renamed from: a */
    private void m31709a(EnumC9688z0 enumC9688z0, Date date) {
        Date date2 = this.f36910c.get(enumC9688z0);
        if (date2 == null || date.after(date2)) {
            this.f36910c.put(enumC9688z0, date);
        }
    }

    /* renamed from: c */
    private EnumC9688z0 m31710c(String str) {
        str.hashCode();
        switch (str) {
            case "attachment":
                return EnumC9688z0.Attachment;
            case "profile":
                return EnumC9688z0.Profile;
            case "event":
                return EnumC9688z0.Error;
            case "session":
                return EnumC9688z0.Session;
            case "transaction":
                return EnumC9688z0.Transaction;
            default:
                return EnumC9688z0.Unknown;
        }
    }

    /* renamed from: d */
    private boolean m31711d(String str) {
        Date date;
        EnumC9688z0 enumC9688z0M31710c = m31710c(str);
        Date date2 = new Date(this.f36908a.mo30147a());
        Date date3 = this.f36910c.get(EnumC9688z0.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC9688z0.Unknown.equals(enumC9688z0M31710c) || (date = this.f36910c.get(enumC9688z0M31710c)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    /* renamed from: g */
    private static void m31714g(C9517n1 c9517n1, final boolean z) {
        C9642m.m31788k(c9517n1, InterfaceC9466p.class, new C9642m.a() { // from class: io.sentry.transport.l
            @Override // io.sentry.util.C9642m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9466p) obj).mo30475c(false);
            }
        });
        C9642m.m31788k(c9517n1, InterfaceC9461k.class, new C9642m.a() { // from class: io.sentry.transport.k
            @Override // io.sentry.util.C9642m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                ((InterfaceC9461k) obj).mo30476d(z);
            }
        });
    }

    /* renamed from: h */
    private long m31715h(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    /* renamed from: b */
    public C9449h4 m31716b(C9449h4 c9449h4, C9517n1 c9517n1) {
        ArrayList arrayList = null;
        for (C9492j4 c9492j4 : c9449h4.m30832c()) {
            if (m31711d(c9492j4.m30910i().m30919b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c9492j4);
                this.f36909b.getClientReportRecorder().mo30693d(EnumC9401e.RATELIMIT_BACKOFF, c9492j4);
            }
        }
        if (arrayList == null) {
            return c9449h4;
        }
        this.f36909b.getLogger().mo30214c(EnumC9587s4.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (C9492j4 c9492j42 : c9449h4.m30832c()) {
            if (!arrayList.contains(c9492j42)) {
                arrayList2.add(c9492j42);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C9449h4(c9449h4.m30831b(), arrayList2);
        }
        this.f36909b.getLogger().mo30214c(EnumC9587s4.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
        m31714g(c9517n1, false);
        return null;
    }

    /* renamed from: i */
    public void m31717i(String str, String str2, int i2) {
        if (str == null) {
            if (i2 == 429) {
                m31709a(EnumC9688z0.All, new Date(this.f36908a.mo30147a() + m31715h(str2)));
                return;
            }
            return;
        }
        int i3 = -1;
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        int i4 = 0;
        while (i4 < length) {
            String[] strArrSplit2 = strArrSplit[i4].replace(" ", HttpUrl.FRAGMENT_ENCODE_SET).split(":", i3);
            if (strArrSplit2.length > 0) {
                long jM31715h = m31715h(strArrSplit2[0]);
                if (strArrSplit2.length > 1) {
                    String str3 = strArrSplit2[1];
                    Date date = new Date(this.f36908a.mo30147a() + jM31715h);
                    if (str3 == null || str3.isEmpty()) {
                        m31709a(EnumC9688z0.All, date);
                    } else {
                        for (String str4 : str3.split(";", i3)) {
                            EnumC9688z0 enumC9688z0ValueOf = EnumC9688z0.Unknown;
                            try {
                                String strM31818b = C9654u.m31818b(str4);
                                if (strM31818b != null) {
                                    enumC9688z0ValueOf = EnumC9688z0.valueOf(strM31818b);
                                } else {
                                    this.f36909b.getLogger().mo30214c(EnumC9587s4.ERROR, "Couldn't capitalize: %s", str4);
                                }
                            } catch (IllegalArgumentException e2) {
                                this.f36909b.getLogger().mo30212a(EnumC9587s4.INFO, e2, "Unknown category: %s", str4);
                            }
                            if (!EnumC9688z0.Unknown.equals(enumC9688z0ValueOf)) {
                                m31709a(enumC9688z0ValueOf, date);
                            }
                        }
                    }
                }
            }
            i4++;
            i3 = -1;
        }
    }

    public C9621y(C9680x4 c9680x4) {
        this(C9611o.m31694b(), c9680x4);
    }
}
