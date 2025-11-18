package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* renamed from: com.google.firebase.crashlytics.h.p.p */
/* loaded from: classes2.dex */
final class C8279p extends AbstractC8258f0.e.d.a.b.c {

    /* renamed from: a */
    private final String f31463a;

    /* renamed from: b */
    private final String f31464b;

    /* renamed from: c */
    private final List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> f31465c;

    /* renamed from: d */
    private final AbstractC8258f0.e.d.a.b.c f31466d;

    /* renamed from: e */
    private final int f31467e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.p$b */
    static final class b extends AbstractC8258f0.e.d.a.b.c.AbstractC11505a {

        /* renamed from: a */
        private String f31468a;

        /* renamed from: b */
        private String f31469b;

        /* renamed from: c */
        private List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> f31470c;

        /* renamed from: d */
        private AbstractC8258f0.e.d.a.b.c f31471d;

        /* renamed from: e */
        private Integer f31472e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c.AbstractC11505a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.b.c mo25804a() {
            String str = this.f31468a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " type";
            }
            if (this.f31470c == null) {
                str2 = str2 + " frames";
            }
            if (this.f31472e == null) {
                str2 = str2 + " overflowCount";
            }
            if (str2.isEmpty()) {
                return new C8279p(this.f31468a, this.f31469b, this.f31470c, this.f31471d, this.f31472e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c.AbstractC11505a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.b.c.AbstractC11505a mo25805b(AbstractC8258f0.e.d.a.b.c cVar) {
            this.f31471d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c.AbstractC11505a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.b.c.AbstractC11505a mo25806c(List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f31470c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c.AbstractC11505a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.b.c.AbstractC11505a mo25807d(int i2) {
            this.f31472e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c.AbstractC11505a
        /* renamed from: e */
        public AbstractC8258f0.e.d.a.b.c.AbstractC11505a mo25808e(String str) {
            this.f31469b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c.AbstractC11505a
        /* renamed from: f */
        public AbstractC8258f0.e.d.a.b.c.AbstractC11505a mo25809f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f31468a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c
    /* renamed from: b */
    public AbstractC8258f0.e.d.a.b.c mo25799b() {
        return this.f31466d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c
    /* renamed from: c */
    public List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> mo25800c() {
        return this.f31465c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c
    /* renamed from: d */
    public int mo25801d() {
        return this.f31467e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c
    /* renamed from: e */
    public String mo25802e() {
        return this.f31464b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC8258f0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.b.c)) {
            return false;
        }
        AbstractC8258f0.e.d.a.b.c cVar2 = (AbstractC8258f0.e.d.a.b.c) obj;
        return this.f31463a.equals(cVar2.mo25803f()) && ((str = this.f31464b) != null ? str.equals(cVar2.mo25802e()) : cVar2.mo25802e() == null) && this.f31465c.equals(cVar2.mo25800c()) && ((cVar = this.f31466d) != null ? cVar.equals(cVar2.mo25799b()) : cVar2.mo25799b() == null) && this.f31467e == cVar2.mo25801d();
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.c
    /* renamed from: f */
    public String mo25803f() {
        return this.f31463a;
    }

    public int hashCode() {
        int iHashCode = (this.f31463a.hashCode() ^ 1000003) * 1000003;
        String str = this.f31464b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f31465c.hashCode()) * 1000003;
        AbstractC8258f0.e.d.a.b.c cVar = this.f31466d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f31467e;
    }

    public String toString() {
        return "Exception{type=" + this.f31463a + ", reason=" + this.f31464b + ", frames=" + this.f31465c + ", causedBy=" + this.f31466d + ", overflowCount=" + this.f31467e + "}";
    }

    private C8279p(String str, String str2, List<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> list, AbstractC8258f0.e.d.a.b.c cVar, int i2) {
        this.f31463a = str;
        this.f31464b = str2;
        this.f31465c = list;
        this.f31466d = cVar;
        this.f31467e = i2;
    }
}
