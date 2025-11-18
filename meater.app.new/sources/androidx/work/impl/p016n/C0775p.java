package androidx.work.impl.p016n;

import androidx.work.AbstractC0807n;
import androidx.work.C0704c;
import androidx.work.C0706e;
import androidx.work.C0817x;
import androidx.work.EnumC0701a;
import androidx.work.EnumC0811r;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p024c.p033b.p034a.p037c.InterfaceC0855a;

/* compiled from: WorkSpec.java */
/* renamed from: androidx.work.impl.n.p */
/* loaded from: classes.dex */
public final class C0775p {

    /* renamed from: a */
    private static final String f4797a = AbstractC0807n.m5223f("WorkSpec");

    /* renamed from: b */
    public static final InterfaceC0855a<List<c>, List<C0817x>> f4798b = new a();

    /* renamed from: c */
    public String f4799c;

    /* renamed from: d */
    public C0817x.a f4800d;

    /* renamed from: e */
    public String f4801e;

    /* renamed from: f */
    public String f4802f;

    /* renamed from: g */
    public C0706e f4803g;

    /* renamed from: h */
    public C0706e f4804h;

    /* renamed from: i */
    public long f4805i;

    /* renamed from: j */
    public long f4806j;

    /* renamed from: k */
    public long f4807k;

    /* renamed from: l */
    public C0704c f4808l;

    /* renamed from: m */
    public int f4809m;

    /* renamed from: n */
    public EnumC0701a f4810n;

    /* renamed from: o */
    public long f4811o;

    /* renamed from: p */
    public long f4812p;

    /* renamed from: q */
    public long f4813q;

    /* renamed from: r */
    public long f4814r;

    /* renamed from: s */
    public boolean f4815s;

    /* renamed from: t */
    public EnumC0811r f4816t;

    /* compiled from: WorkSpec.java */
    /* renamed from: androidx.work.impl.n.p$a */
    class a implements InterfaceC0855a<List<c>, List<C0817x>> {
        a() {
        }

        @Override // p024c.p033b.p034a.p037c.InterfaceC0855a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<C0817x> mo3385a(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m5097a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec.java */
    /* renamed from: androidx.work.impl.n.p$b */
    public static class b {

        /* renamed from: a */
        public String f4817a;

        /* renamed from: b */
        public C0817x.a f4818b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4818b != bVar.f4818b) {
                return false;
            }
            return this.f4817a.equals(bVar.f4817a);
        }

        public int hashCode() {
            return (this.f4817a.hashCode() * 31) + this.f4818b.hashCode();
        }
    }

    /* compiled from: WorkSpec.java */
    /* renamed from: androidx.work.impl.n.p$c */
    public static class c {

        /* renamed from: a */
        public String f4819a;

        /* renamed from: b */
        public C0817x.a f4820b;

        /* renamed from: c */
        public C0706e f4821c;

        /* renamed from: d */
        public int f4822d;

        /* renamed from: e */
        public List<String> f4823e;

        /* renamed from: f */
        public List<C0706e> f4824f;

        /* renamed from: a */
        public C0817x m5097a() {
            List<C0706e> list = this.f4824f;
            return new C0817x(UUID.fromString(this.f4819a), this.f4820b, this.f4821c, this.f4823e, (list == null || list.isEmpty()) ? C0706e.f4511b : this.f4824f.get(0), this.f4822d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f4822d != cVar.f4822d) {
                return false;
            }
            String str = this.f4819a;
            if (str == null ? cVar.f4819a != null : !str.equals(cVar.f4819a)) {
                return false;
            }
            if (this.f4820b != cVar.f4820b) {
                return false;
            }
            C0706e c0706e = this.f4821c;
            if (c0706e == null ? cVar.f4821c != null : !c0706e.equals(cVar.f4821c)) {
                return false;
            }
            List<String> list = this.f4823e;
            if (list == null ? cVar.f4823e != null : !list.equals(cVar.f4823e)) {
                return false;
            }
            List<C0706e> list2 = this.f4824f;
            List<C0706e> list3 = cVar.f4824f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f4819a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            C0817x.a aVar = this.f4820b;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C0706e c0706e = this.f4821c;
            int iHashCode3 = (((iHashCode2 + (c0706e != null ? c0706e.hashCode() : 0)) * 31) + this.f4822d) * 31;
            List<String> list = this.f4823e;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C0706e> list2 = this.f4824f;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public C0775p(String str, String str2) {
        this.f4800d = C0817x.a.ENQUEUED;
        C0706e c0706e = C0706e.f4511b;
        this.f4803g = c0706e;
        this.f4804h = c0706e;
        this.f4808l = C0704c.f4490a;
        this.f4810n = EnumC0701a.EXPONENTIAL;
        this.f4811o = 30000L;
        this.f4814r = -1L;
        this.f4816t = EnumC0811r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f4799c = str;
        this.f4801e = str2;
    }

    /* renamed from: a */
    public long m5090a() {
        if (m5092c()) {
            return this.f4812p + Math.min(18000000L, this.f4810n == EnumC0701a.LINEAR ? this.f4811o * this.f4809m : (long) Math.scalb(this.f4811o, this.f4809m - 1));
        }
        if (!m5093d()) {
            long jCurrentTimeMillis = this.f4812p;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f4805i;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.f4812p;
        long j3 = j2 == 0 ? jCurrentTimeMillis2 + this.f4805i : j2;
        long j4 = this.f4807k;
        long j5 = this.f4806j;
        if (j4 != j5) {
            return j3 + j5 + (j2 == 0 ? j4 * (-1) : 0L);
        }
        return j3 + (j2 != 0 ? j5 : 0L);
    }

    /* renamed from: b */
    public boolean m5091b() {
        return !C0704c.f4490a.equals(this.f4808l);
    }

    /* renamed from: c */
    public boolean m5092c() {
        return this.f4800d == C0817x.a.ENQUEUED && this.f4809m > 0;
    }

    /* renamed from: d */
    public boolean m5093d() {
        return this.f4806j != 0;
    }

    /* renamed from: e */
    public void m5094e(long j2) {
        if (j2 < 900000) {
            AbstractC0807n.m5221c().mo5228h(f4797a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j2 = 900000;
        }
        m5095f(j2, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0775p.class != obj.getClass()) {
            return false;
        }
        C0775p c0775p = (C0775p) obj;
        if (this.f4805i != c0775p.f4805i || this.f4806j != c0775p.f4806j || this.f4807k != c0775p.f4807k || this.f4809m != c0775p.f4809m || this.f4811o != c0775p.f4811o || this.f4812p != c0775p.f4812p || this.f4813q != c0775p.f4813q || this.f4814r != c0775p.f4814r || this.f4815s != c0775p.f4815s || !this.f4799c.equals(c0775p.f4799c) || this.f4800d != c0775p.f4800d || !this.f4801e.equals(c0775p.f4801e)) {
            return false;
        }
        String str = this.f4802f;
        if (str == null ? c0775p.f4802f == null : str.equals(c0775p.f4802f)) {
            return this.f4803g.equals(c0775p.f4803g) && this.f4804h.equals(c0775p.f4804h) && this.f4808l.equals(c0775p.f4808l) && this.f4810n == c0775p.f4810n && this.f4816t == c0775p.f4816t;
        }
        return false;
    }

    /* renamed from: f */
    public void m5095f(long j2, long j3) {
        if (j2 < 900000) {
            AbstractC0807n.m5221c().mo5228h(f4797a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j2 = 900000;
        }
        if (j3 < LocalNotificationSyncManager.FIVE_MINUTES) {
            AbstractC0807n.m5221c().mo5228h(f4797a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", Long.valueOf(LocalNotificationSyncManager.FIVE_MINUTES)), new Throwable[0]);
            j3 = 300000;
        }
        if (j3 > j2) {
            AbstractC0807n.m5221c().mo5228h(f4797a, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j2)), new Throwable[0]);
            j3 = j2;
        }
        this.f4806j = j2;
        this.f4807k = j3;
    }

    public int hashCode() {
        int iHashCode = ((((this.f4799c.hashCode() * 31) + this.f4800d.hashCode()) * 31) + this.f4801e.hashCode()) * 31;
        String str = this.f4802f;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f4803g.hashCode()) * 31) + this.f4804h.hashCode()) * 31;
        long j2 = this.f4805i;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f4806j;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f4807k;
        int iHashCode3 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f4808l.hashCode()) * 31) + this.f4809m) * 31) + this.f4810n.hashCode()) * 31;
        long j5 = this.f4811o;
        int i4 = (iHashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f4812p;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f4813q;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f4814r;
        return ((((i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f4815s ? 1 : 0)) * 31) + this.f4816t.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f4799c + "}";
    }

    public C0775p(C0775p c0775p) {
        this.f4800d = C0817x.a.ENQUEUED;
        C0706e c0706e = C0706e.f4511b;
        this.f4803g = c0706e;
        this.f4804h = c0706e;
        this.f4808l = C0704c.f4490a;
        this.f4810n = EnumC0701a.EXPONENTIAL;
        this.f4811o = 30000L;
        this.f4814r = -1L;
        this.f4816t = EnumC0811r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f4799c = c0775p.f4799c;
        this.f4801e = c0775p.f4801e;
        this.f4800d = c0775p.f4800d;
        this.f4802f = c0775p.f4802f;
        this.f4803g = new C0706e(c0775p.f4803g);
        this.f4804h = new C0706e(c0775p.f4804h);
        this.f4805i = c0775p.f4805i;
        this.f4806j = c0775p.f4806j;
        this.f4807k = c0775p.f4807k;
        this.f4808l = new C0704c(c0775p.f4808l);
        this.f4809m = c0775p.f4809m;
        this.f4810n = c0775p.f4810n;
        this.f4811o = c0775p.f4811o;
        this.f4812p = c0775p.f4812p;
        this.f4813q = c0775p.f4813q;
        this.f4814r = c0775p.f4814r;
        this.f4815s = c0775p.f4815s;
        this.f4816t = c0775p.f4816t;
    }
}
