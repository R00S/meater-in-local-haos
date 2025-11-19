package db;

import Oa.p;
import Sa.h;
import bb.C2278d;
import hb.InterfaceC3508a;
import hb.InterfaceC3511d;
import java.util.Iterator;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyJavaAnnotations.kt */
/* renamed from: db.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3092g implements Sa.h {

    /* renamed from: B, reason: collision with root package name */
    private final C3096k f39905B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3511d f39906C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f39907D;

    /* renamed from: E, reason: collision with root package name */
    private final Gb.h<InterfaceC3508a, Sa.c> f39908E;

    public C3092g(C3096k c10, InterfaceC3511d annotationOwner, boolean z10) {
        C3862t.g(c10, "c");
        C3862t.g(annotationOwner, "annotationOwner");
        this.f39905B = c10;
        this.f39906C = annotationOwner;
        this.f39907D = z10;
        this.f39908E = c10.a().u().e(new C3091f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sa.c h(C3092g c3092g, InterfaceC3508a annotation) {
        C3862t.g(annotation, "annotation");
        return C2278d.f30713a.e(annotation, c3092g.f39905B, c3092g.f39907D);
    }

    @Override // Sa.h
    public boolean P(qb.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // Sa.h
    public boolean isEmpty() {
        return this.f39906C.getAnnotations().isEmpty() && !this.f39906C.l();
    }

    @Override // java.lang.Iterable
    public Iterator<Sa.c> iterator() {
        return Tb.k.s(Tb.k.E(Tb.k.A(r.Z(this.f39906C.getAnnotations()), this.f39908E), C2278d.f30713a.a(p.a.f13489y, this.f39906C, this.f39905B))).iterator();
    }

    @Override // Sa.h
    public Sa.c o(qb.c fqName) {
        Sa.c cVarInvoke;
        C3862t.g(fqName, "fqName");
        InterfaceC3508a interfaceC3508aO = this.f39906C.o(fqName);
        return (interfaceC3508aO == null || (cVarInvoke = this.f39908E.invoke(interfaceC3508aO)) == null) ? C2278d.f30713a.a(fqName, this.f39906C, this.f39905B) : cVarInvoke;
    }

    public /* synthetic */ C3092g(C3096k c3096k, InterfaceC3511d interfaceC3511d, boolean z10, int i10, C3854k c3854k) {
        this(c3096k, interfaceC3511d, (i10 & 4) != 0 ? false : z10);
    }
}
