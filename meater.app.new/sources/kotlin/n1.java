package kotlin;

import Ba.a;
import Q.b;
import W.IntRef;
import kotlin.Metadata;

/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "LO/x1;", "c", "(LBa/a;)LO/x1;", "LO/l1;", "policy", "d", "(LO/l1;LBa/a;)LO/x1;", "LQ/b;", "LO/I;", "b", "()LQ/b;", "LO/s1;", "LW/d;", "a", "LO/s1;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final s1<IntRef> f12947a = new s1<>();

    /* renamed from: b, reason: collision with root package name */
    private static final s1<b<InterfaceC1504I>> f12948b = new s1<>();

    public static final b<InterfaceC1504I> b() {
        s1<b<InterfaceC1504I>> s1Var = f12948b;
        b<InterfaceC1504I> bVarA = s1Var.a();
        if (bVarA != null) {
            return bVarA;
        }
        b<InterfaceC1504I> bVar = new b<>(new InterfaceC1504I[0], 0);
        s1Var.b(bVar);
        return bVar;
    }

    public static final <T> x1<T> c(a<? extends T> aVar) {
        return new C1500G(aVar, null);
    }

    public static final <T> x1<T> d(l1<T> l1Var, a<? extends T> aVar) {
        return new C1500G(aVar, l1Var);
    }
}
