package fc;

import Ba.l;
import Ba.q;
import Xb.InterfaceC1828b0;
import Xb.InterfaceC1845k;
import Xb.InterfaceC1847l;
import Xb.Z0;
import cc.AbstractC2358C;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.g;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0016J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u000e\u0018\u00010\tR\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010(\u001a\u0014\u0012\u000e\u0012\f0\tR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u0011\u00101\u001a\b\u0012\u0004\u0012\u00020\u0003008\u0002X\u0082\u0004¨\u00062"}, d2 = {"Lfc/a;", "R", "LXb/k;", "", "clauseObject", "internalResult", "", "h", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Lfc/a$a;", "e", "(Ljava/lang/Object;)Lfc/a$a;", "Lcc/C;", "segment", "index", "Loa/F;", "c", "(Lcc/C;I)V", "d", "(Ljava/lang/Object;)V", "result", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lfc/d;", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Lfc/d;", "", "cause", "b", "(Ljava/lang/Throwable;)V", "Lta/g;", "B", "Lta/g;", "getContext", "()Lta/g;", "context", "", "C", "Ljava/util/List;", "clauses", "D", "Ljava/lang/Object;", "disposableHandleOrSegment", "E", "I", "indexInSegment", "F", "Lkotlinx/atomicfu/AtomicRef;", "state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3365a<R> implements InterfaceC1845k, InterfaceC3366b, Z0 {

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41452G = AtomicReferenceFieldUpdater.newUpdater(C3365a.class, Object.class, "state$volatile");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final g context;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private List<C3365a<R>.C0521a> clauses;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Object disposableHandleOrSegment;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int indexInSegment;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Object internalResult;
    private volatile /* synthetic */ Object state$volatile;

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fRH\u0010\u0013\u001a6\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lfc/a$a;", "", "Loa/F;", "b", "()V", "Lfc/b;", "select", "internalResult", "Lkotlin/Function1;", "", "a", "(Lfc/b;Ljava/lang/Object;)LBa/l;", "Ljava/lang/Object;", "clauseObject", "param", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "LBa/q;", "onCancellationConstructor", "d", "disposableHandleOrSegment", "", "e", "I", "indexInSegment", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fc.a$a, reason: collision with other inner class name */
    public final class C0521a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Object clauseObject;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object param;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final q<InterfaceC3366b<?>, Object, Object, l<Throwable, C4153F>> onCancellationConstructor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public Object disposableHandleOrSegment;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int indexInSegment;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3365a<R> f41463f;

        public final l<Throwable, C4153F> a(InterfaceC3366b<?> select, Object internalResult) {
            q<InterfaceC3366b<?>, Object, Object, l<Throwable, C4153F>> qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return qVar.g(select, this.param, internalResult);
            }
            return null;
        }

        public final void b() {
            Object obj = this.disposableHandleOrSegment;
            C3365a<R> c3365a = this.f41463f;
            if (obj instanceof AbstractC2358C) {
                ((AbstractC2358C) obj).s(this.indexInSegment, null, c3365a.getContext());
                return;
            }
            InterfaceC1828b0 interfaceC1828b0 = obj instanceof InterfaceC1828b0 ? (InterfaceC1828b0) obj : null;
            if (interfaceC1828b0 != null) {
                interfaceC1828b0.c();
            }
        }
    }

    private final C3365a<R>.C0521a e(Object clauseObject) {
        List<C3365a<R>.C0521a> list = this.clauses;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C0521a) next).clauseObject == clauseObject) {
                obj = next;
                break;
            }
        }
        C3365a<R>.C0521a c0521a = (C0521a) obj;
        if (c0521a != null) {
            return c0521a;
        }
        throw new IllegalStateException(("Clause with object " + clauseObject + " is not found").toString());
    }

    private final int h(Object clauseObject, Object internalResult) {
        while (true) {
            Object obj = f41452G.get(this);
            if (obj instanceof InterfaceC1847l) {
                C3365a<R>.C0521a c0521aE = e(clauseObject);
                if (c0521aE == null) {
                    continue;
                } else {
                    l<Throwable, C4153F> lVarA = c0521aE.a(this, internalResult);
                    if (androidx.concurrent.futures.b.a(f41452G, this, obj, c0521aE)) {
                        this.internalResult = internalResult;
                        if (C3367c.h((InterfaceC1847l) obj, lVarA)) {
                            return 0;
                        }
                        this.internalResult = C3367c.f41468e;
                        return 2;
                    }
                }
            } else {
                if (C3862t.b(obj, C3367c.f41466c) ? true : obj instanceof C0521a) {
                    return 3;
                }
                if (C3862t.b(obj, C3367c.f41467d)) {
                    return 2;
                }
                if (C3862t.b(obj, C3367c.f41465b)) {
                    if (androidx.concurrent.futures.b.a(f41452G, this, obj, r.e(clauseObject))) {
                        return 1;
                    }
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj).toString());
                    }
                    if (androidx.concurrent.futures.b.a(f41452G, this, obj, r.G0((Collection) obj, clauseObject))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // fc.InterfaceC3366b
    public boolean a(Object clauseObject, Object result) {
        return h(clauseObject, result) == 0;
    }

    @Override // Xb.InterfaceC1845k
    public void b(Throwable cause) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41452G;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C3367c.f41466c) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, C3367c.f41467d));
        List<C3365a<R>.C0521a> list = this.clauses;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((C0521a) it.next()).b();
        }
        this.internalResult = C3367c.f41468e;
        this.clauses = null;
    }

    @Override // Xb.Z0
    public void c(AbstractC2358C<?> segment, int index) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = index;
    }

    @Override // fc.InterfaceC3366b
    public void d(Object internalResult) {
        this.internalResult = internalResult;
    }

    public final EnumC3368d g(Object clauseObject, Object result) {
        return C3367c.a(h(clauseObject, result));
    }

    @Override // fc.InterfaceC3366b
    public g getContext() {
        return this.context;
    }
}
