package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* renamed from: com.google.firebase.crashlytics.h.p.m */
/* loaded from: classes2.dex */
final class C8276m extends AbstractC8258f0.e.d.a {

    /* renamed from: a */
    private final AbstractC8258f0.e.d.a.b f31431a;

    /* renamed from: b */
    private final List<AbstractC8258f0.c> f31432b;

    /* renamed from: c */
    private final List<AbstractC8258f0.c> f31433c;

    /* renamed from: d */
    private final Boolean f31434d;

    /* renamed from: e */
    private final AbstractC8258f0.e.d.a.c f31435e;

    /* renamed from: f */
    private final List<AbstractC8258f0.e.d.a.c> f31436f;

    /* renamed from: g */
    private final int f31437g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.m$b */
    static final class b extends AbstractC8258f0.e.d.a.AbstractC11501a {

        /* renamed from: a */
        private AbstractC8258f0.e.d.a.b f31438a;

        /* renamed from: b */
        private List<AbstractC8258f0.c> f31439b;

        /* renamed from: c */
        private List<AbstractC8258f0.c> f31440c;

        /* renamed from: d */
        private Boolean f31441d;

        /* renamed from: e */
        private AbstractC8258f0.e.d.a.c f31442e;

        /* renamed from: f */
        private List<AbstractC8258f0.e.d.a.c> f31443f;

        /* renamed from: g */
        private Integer f31444g;

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: a */
        public AbstractC8258f0.e.d.a mo25766a() {
            AbstractC8258f0.e.d.a.b bVar = this.f31438a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (bVar == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " execution";
            }
            if (this.f31444g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C8276m(this.f31438a, this.f31439b, this.f31440c, this.f31441d, this.f31442e, this.f31443f, this.f31444g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25767b(List<AbstractC8258f0.e.d.a.c> list) {
            this.f31443f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25768c(Boolean bool) {
            this.f31441d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25769d(AbstractC8258f0.e.d.a.c cVar) {
            this.f31442e = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: e */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25770e(List<AbstractC8258f0.c> list) {
            this.f31439b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: f */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25771f(AbstractC8258f0.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f31438a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: g */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25772g(List<AbstractC8258f0.c> list) {
            this.f31440c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.AbstractC11501a
        /* renamed from: h */
        public AbstractC8258f0.e.d.a.AbstractC11501a mo25773h(int i2) {
            this.f31444g = Integer.valueOf(i2);
            return this;
        }

        b() {
        }

        private b(AbstractC8258f0.e.d.a aVar) {
            this.f31438a = aVar.mo25762f();
            this.f31439b = aVar.mo25761e();
            this.f31440c = aVar.mo25763g();
            this.f31441d = aVar.mo25759c();
            this.f31442e = aVar.mo25760d();
            this.f31443f = aVar.mo25758b();
            this.f31444g = Integer.valueOf(aVar.mo25764h());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: b */
    public List<AbstractC8258f0.e.d.a.c> mo25758b() {
        return this.f31436f;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: c */
    public Boolean mo25759c() {
        return this.f31434d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: d */
    public AbstractC8258f0.e.d.a.c mo25760d() {
        return this.f31435e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: e */
    public List<AbstractC8258f0.c> mo25761e() {
        return this.f31432b;
    }

    public boolean equals(Object obj) {
        List<AbstractC8258f0.c> list;
        List<AbstractC8258f0.c> list2;
        Boolean bool;
        AbstractC8258f0.e.d.a.c cVar;
        List<AbstractC8258f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a)) {
            return false;
        }
        AbstractC8258f0.e.d.a aVar = (AbstractC8258f0.e.d.a) obj;
        return this.f31431a.equals(aVar.mo25762f()) && ((list = this.f31432b) != null ? list.equals(aVar.mo25761e()) : aVar.mo25761e() == null) && ((list2 = this.f31433c) != null ? list2.equals(aVar.mo25763g()) : aVar.mo25763g() == null) && ((bool = this.f31434d) != null ? bool.equals(aVar.mo25759c()) : aVar.mo25759c() == null) && ((cVar = this.f31435e) != null ? cVar.equals(aVar.mo25760d()) : aVar.mo25760d() == null) && ((list3 = this.f31436f) != null ? list3.equals(aVar.mo25758b()) : aVar.mo25758b() == null) && this.f31437g == aVar.mo25764h();
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: f */
    public AbstractC8258f0.e.d.a.b mo25762f() {
        return this.f31431a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: g */
    public List<AbstractC8258f0.c> mo25763g() {
        return this.f31433c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: h */
    public int mo25764h() {
        return this.f31437g;
    }

    public int hashCode() {
        int iHashCode = (this.f31431a.hashCode() ^ 1000003) * 1000003;
        List<AbstractC8258f0.c> list = this.f31432b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<AbstractC8258f0.c> list2 = this.f31433c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f31434d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC8258f0.e.d.a.c cVar = this.f31435e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC8258f0.e.d.a.c> list3 = this.f31436f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f31437g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a
    /* renamed from: i */
    public AbstractC8258f0.e.d.a.AbstractC11501a mo25765i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f31431a + ", customAttributes=" + this.f31432b + ", internalKeys=" + this.f31433c + ", background=" + this.f31434d + ", currentProcessDetails=" + this.f31435e + ", appProcessDetails=" + this.f31436f + ", uiOrientation=" + this.f31437g + "}";
    }

    private C8276m(AbstractC8258f0.e.d.a.b bVar, List<AbstractC8258f0.c> list, List<AbstractC8258f0.c> list2, Boolean bool, AbstractC8258f0.e.d.a.c cVar, List<AbstractC8258f0.e.d.a.c> list3, int i2) {
        this.f31431a = bVar;
        this.f31432b = list;
        this.f31433c = list2;
        this.f31434d = bool;
        this.f31435e = cVar;
        this.f31436f = list3;
        this.f31437g = i2;
    }
}
