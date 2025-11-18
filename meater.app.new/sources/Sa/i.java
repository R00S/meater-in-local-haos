package Sa;

import Sa.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: AnnotationsImpl.kt */
/* loaded from: classes3.dex */
public final class i implements h {

    /* renamed from: B, reason: collision with root package name */
    private final List<c> f15633B;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends c> annotations) {
        C3862t.g(annotations, "annotations");
        this.f15633B = annotations;
    }

    @Override // Sa.h
    public boolean P(qb.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // Sa.h
    public boolean isEmpty() {
        return this.f15633B.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return this.f15633B.iterator();
    }

    @Override // Sa.h
    public c o(qb.c cVar) {
        return h.b.a(this, cVar);
    }

    public String toString() {
        return this.f15633B.toString();
    }
}
