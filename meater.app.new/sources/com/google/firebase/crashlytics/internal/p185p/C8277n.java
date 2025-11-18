package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* renamed from: com.google.firebase.crashlytics.h.p.n */
/* loaded from: classes2.dex */
final class C8277n extends AbstractC8258f0.e.d.a.b {

    /* renamed from: a */
    private final List<AbstractC8258f0.e.d.a.b.AbstractC11508e> f31445a;

    /* renamed from: b */
    private final AbstractC8258f0.e.d.a.b.c f31446b;

    /* renamed from: c */
    private final AbstractC8258f0.a f31447c;

    /* renamed from: d */
    private final AbstractC8258f0.e.d.a.b.AbstractC11506d f31448d;

    /* renamed from: e */
    private final List<AbstractC8258f0.e.d.a.b.AbstractC11502a> f31449e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.n$b */
    static final class b extends AbstractC8258f0.e.d.a.b.AbstractC11504b {

        /* renamed from: a */
        private List<AbstractC8258f0.e.d.a.b.AbstractC11508e> f31450a;

        /* renamed from: b */
        private AbstractC8258f0.e.d.a.b.c f31451b;

        /* renamed from: c */
        private AbstractC8258f0.a f31452c;

        /* renamed from: d */
        private AbstractC8258f0.e.d.a.b.AbstractC11506d f31453d;

        /* renamed from: e */
        private List<AbstractC8258f0.e.d.a.b.AbstractC11502a> f31454e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11504b
        /* renamed from: a */
        public AbstractC8258f0.e.d.a.b mo25792a() {
            AbstractC8258f0.e.d.a.b.AbstractC11506d abstractC11506d = this.f31453d;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (abstractC11506d == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " signal";
            }
            if (this.f31454e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C8277n(this.f31450a, this.f31451b, this.f31452c, this.f31453d, this.f31454e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11504b
        /* renamed from: b */
        public AbstractC8258f0.e.d.a.b.AbstractC11504b mo25793b(AbstractC8258f0.a aVar) {
            this.f31452c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11504b
        /* renamed from: c */
        public AbstractC8258f0.e.d.a.b.AbstractC11504b mo25794c(List<AbstractC8258f0.e.d.a.b.AbstractC11502a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f31454e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11504b
        /* renamed from: d */
        public AbstractC8258f0.e.d.a.b.AbstractC11504b mo25795d(AbstractC8258f0.e.d.a.b.c cVar) {
            this.f31451b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11504b
        /* renamed from: e */
        public AbstractC8258f0.e.d.a.b.AbstractC11504b mo25796e(AbstractC8258f0.e.d.a.b.AbstractC11506d abstractC11506d) {
            if (abstractC11506d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f31453d = abstractC11506d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b.AbstractC11504b
        /* renamed from: f */
        public AbstractC8258f0.e.d.a.b.AbstractC11504b mo25797f(List<AbstractC8258f0.e.d.a.b.AbstractC11508e> list) {
            this.f31450a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b
    /* renamed from: b */
    public AbstractC8258f0.a mo25775b() {
        return this.f31447c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b
    /* renamed from: c */
    public List<AbstractC8258f0.e.d.a.b.AbstractC11502a> mo25776c() {
        return this.f31449e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b
    /* renamed from: d */
    public AbstractC8258f0.e.d.a.b.c mo25777d() {
        return this.f31446b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b
    /* renamed from: e */
    public AbstractC8258f0.e.d.a.b.AbstractC11506d mo25778e() {
        return this.f31448d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.a.b)) {
            return false;
        }
        AbstractC8258f0.e.d.a.b bVar = (AbstractC8258f0.e.d.a.b) obj;
        List<AbstractC8258f0.e.d.a.b.AbstractC11508e> list = this.f31445a;
        if (list != null ? list.equals(bVar.mo25779f()) : bVar.mo25779f() == null) {
            AbstractC8258f0.e.d.a.b.c cVar = this.f31446b;
            if (cVar != null ? cVar.equals(bVar.mo25777d()) : bVar.mo25777d() == null) {
                AbstractC8258f0.a aVar = this.f31447c;
                if (aVar != null ? aVar.equals(bVar.mo25775b()) : bVar.mo25775b() == null) {
                    if (this.f31448d.equals(bVar.mo25778e()) && this.f31449e.equals(bVar.mo25776c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.a.b
    /* renamed from: f */
    public List<AbstractC8258f0.e.d.a.b.AbstractC11508e> mo25779f() {
        return this.f31445a;
    }

    public int hashCode() {
        List<AbstractC8258f0.e.d.a.b.AbstractC11508e> list = this.f31445a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC8258f0.e.d.a.b.c cVar = this.f31446b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC8258f0.a aVar = this.f31447c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f31448d.hashCode()) * 1000003) ^ this.f31449e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f31445a + ", exception=" + this.f31446b + ", appExitInfo=" + this.f31447c + ", signal=" + this.f31448d + ", binaries=" + this.f31449e + "}";
    }

    private C8277n(List<AbstractC8258f0.e.d.a.b.AbstractC11508e> list, AbstractC8258f0.e.d.a.b.c cVar, AbstractC8258f0.a aVar, AbstractC8258f0.e.d.a.b.AbstractC11506d abstractC11506d, List<AbstractC8258f0.e.d.a.b.AbstractC11502a> list2) {
        this.f31445a = list;
        this.f31446b = cVar;
        this.f31447c = aVar;
        this.f31448d = abstractC11506d;
        this.f31449e = list2;
    }
}
