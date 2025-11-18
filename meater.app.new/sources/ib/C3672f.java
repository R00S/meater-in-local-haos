package ib;

import Sa.h;
import java.util.Iterator;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeEnhancement.kt */
/* renamed from: ib.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3672f implements Sa.h {

    /* renamed from: B, reason: collision with root package name */
    private final qb.c f43240B;

    public C3672f(qb.c fqNameToMatch) {
        C3862t.g(fqNameToMatch, "fqNameToMatch");
        this.f43240B = fqNameToMatch;
    }

    @Override // Sa.h
    public boolean P(qb.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // Sa.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3671e o(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        if (C3862t.b(fqName, this.f43240B)) {
            return C3671e.f43238a;
        }
        return null;
    }

    @Override // Sa.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Sa.c> iterator() {
        return kotlin.collections.r.m().iterator();
    }
}
