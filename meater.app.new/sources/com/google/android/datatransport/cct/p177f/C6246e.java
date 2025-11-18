package com.google.android.datatransport.cct.p177f;

import com.google.android.datatransport.cct.p177f.AbstractC6252k;

/* compiled from: AutoValue_ClientInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.e */
/* loaded from: classes2.dex */
final class C6246e extends AbstractC6252k {

    /* renamed from: a */
    private final AbstractC6252k.b f16663a;

    /* renamed from: b */
    private final AbstractC6242a f16664b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.e$b */
    static final class b extends AbstractC6252k.a {

        /* renamed from: a */
        private AbstractC6252k.b f16665a;

        /* renamed from: b */
        private AbstractC6242a f16666b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6252k.a
        /* renamed from: a */
        public AbstractC6252k mo13454a() {
            return new C6246e(this.f16665a, this.f16666b);
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6252k.a
        /* renamed from: b */
        public AbstractC6252k.a mo13455b(AbstractC6242a abstractC6242a) {
            this.f16666b = abstractC6242a;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p177f.AbstractC6252k.a
        /* renamed from: c */
        public AbstractC6252k.a mo13456c(AbstractC6252k.b bVar) {
            this.f16665a = bVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6252k
    /* renamed from: b */
    public AbstractC6242a mo13452b() {
        return this.f16664b;
    }

    @Override // com.google.android.datatransport.cct.p177f.AbstractC6252k
    /* renamed from: c */
    public AbstractC6252k.b mo13453c() {
        return this.f16663a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6252k)) {
            return false;
        }
        AbstractC6252k abstractC6252k = (AbstractC6252k) obj;
        AbstractC6252k.b bVar = this.f16663a;
        if (bVar != null ? bVar.equals(abstractC6252k.mo13453c()) : abstractC6252k.mo13453c() == null) {
            AbstractC6242a abstractC6242a = this.f16664b;
            if (abstractC6242a == null) {
                if (abstractC6252k.mo13452b() == null) {
                    return true;
                }
            } else if (abstractC6242a.equals(abstractC6252k.mo13452b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC6252k.b bVar = this.f16663a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC6242a abstractC6242a = this.f16664b;
        return iHashCode ^ (abstractC6242a != null ? abstractC6242a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f16663a + ", androidClientInfo=" + this.f16664b + "}";
    }

    private C6246e(AbstractC6252k.b bVar, AbstractC6242a abstractC6242a) {
        this.f16663a = bVar;
        this.f16664b = abstractC6242a;
    }
}
