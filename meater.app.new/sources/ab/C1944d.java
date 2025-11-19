package ab;

import Ra.InterfaceC1692e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import vb.AbstractC4943g;
import vb.C4938b;
import xb.C5087e;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* renamed from: ab.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1944d extends AbstractC1942b<Sa.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1944d(C1923D javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        C3862t.g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    private final List<String> B(AbstractC4943g<?> abstractC4943g) {
        if (!(abstractC4943g instanceof C4938b)) {
            return abstractC4943g instanceof vb.k ? kotlin.collections.r.e(((vb.k) abstractC4943g).c().p()) : kotlin.collections.r.m();
        }
        List<? extends AbstractC4943g<?>> listB = ((C4938b) abstractC4943g).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList, B((AbstractC4943g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC1942b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterable<Sa.c> m(Sa.c cVar) {
        Sa.h annotations;
        C3862t.g(cVar, "<this>");
        InterfaceC1692e interfaceC1692eL = C5087e.l(cVar);
        return (interfaceC1692eL == null || (annotations = interfaceC1692eL.getAnnotations()) == null) ? kotlin.collections.r.m() : annotations;
    }

    @Override // ab.AbstractC1942b
    public boolean o() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC1942b
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<String> c(Sa.c cVar, boolean z10) {
        C3862t.g(cVar, "<this>");
        Map<qb.f, AbstractC4943g<?>> mapB = cVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<qb.f, AbstractC4943g<?>> entry : mapB.entrySet()) {
            kotlin.collections.r.D(arrayList, (!z10 || C3862t.b(entry.getKey(), C1928I.f20141c)) ? B(entry.getValue()) : kotlin.collections.r.m());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC1942b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public qb.c k(Sa.c cVar) {
        C3862t.g(cVar, "<this>");
        return cVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC1942b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Object l(Sa.c cVar) {
        C3862t.g(cVar, "<this>");
        InterfaceC1692e interfaceC1692eL = C5087e.l(cVar);
        C3862t.d(interfaceC1692eL);
        return interfaceC1692eL;
    }
}
