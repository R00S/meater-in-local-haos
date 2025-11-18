package Fb;

import Sa.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: DeserializedAnnotations.kt */
/* renamed from: Fb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1020a implements Sa.h {

    /* renamed from: C, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f4622C = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C1020a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: B, reason: collision with root package name */
    private final Gb.i f4623B;

    public C1020a(Gb.n storageManager, Ba.a<? extends List<? extends Sa.c>> compute) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(compute, "compute");
        this.f4623B = storageManager.g(compute);
    }

    private final List<Sa.c> c() {
        return (List) Gb.m.a(this.f4623B, this, f4622C[0]);
    }

    @Override // Sa.h
    public boolean P(qb.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // Sa.h
    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Sa.c> iterator() {
        return c().iterator();
    }

    @Override // Sa.h
    public Sa.c o(qb.c cVar) {
        return h.b.a(this, cVar);
    }
}
