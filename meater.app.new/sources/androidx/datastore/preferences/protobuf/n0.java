package androidx.datastore.preferences.protobuf;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
class n0 extends l0<m0, m0> {
    n0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m0 g(Object obj) {
        return ((AbstractC2077x) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(m0 m0Var) {
        return m0Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(m0 m0Var) {
        return m0Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m0 k(m0 m0Var, m0 m0Var2) {
        return m0Var2.equals(m0.e()) ? m0Var : m0.k(m0Var, m0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public m0 n() {
        return m0.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m0 m0Var) {
        p(obj, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m0 m0Var) {
        ((AbstractC2077x) obj).unknownFields = m0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m0 r(m0 m0Var) {
        m0Var.j();
        return m0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(m0 m0Var, s0 s0Var) {
        m0Var.o(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(m0 m0Var, s0 s0Var) {
        m0Var.q(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    boolean q(e0 e0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(m0 m0Var, int i10, int i11) {
        m0Var.n(r0.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(m0 m0Var, int i10, long j10) {
        m0Var.n(r0.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(m0 m0Var, int i10, m0 m0Var2) {
        m0Var.n(r0.c(i10, 3), m0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(m0 m0Var, int i10, AbstractC2062h abstractC2062h) {
        m0Var.n(r0.c(i10, 2), abstractC2062h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(m0 m0Var, int i10, long j10) {
        m0Var.n(r0.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m0 f(Object obj) {
        m0 m0VarG = g(obj);
        if (m0VarG != m0.e()) {
            return m0VarG;
        }
        m0 m0VarL = m0.l();
        p(obj, m0VarL);
        return m0VarL;
    }
}
