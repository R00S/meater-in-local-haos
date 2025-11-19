package Tb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"LTb/i;", "T", "LTb/j;", "", "Lta/d;", "Loa/F;", "<init>", "()V", "i", "()Ljava/lang/Object;", "", "h", "()Ljava/lang/Throwable;", "", "hasNext", "()Z", "next", "value", "b", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "iterator", "g", "(Ljava/util/Iterator;Lta/d;)Ljava/lang/Object;", "Loa/q;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "B", "I", "state", "C", "Ljava/lang/Object;", "nextValue", "D", "Ljava/util/Iterator;", "nextIterator", "E", "Lta/d;", "getNextStep", "()Lta/d;", "j", "(Lta/d;)V", "nextStep", "Lta/g;", "getContext", "()Lta/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class i<T> extends j<T> implements Iterator<T>, InterfaceC4588d<C4153F>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private T nextValue;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Iterator<? extends T> nextIterator;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4588d<? super C4153F> nextStep;

    private final Throwable h() {
        int i10 = this.state;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    private final T i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // Tb.j
    public Object b(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        this.nextValue = t10;
        this.state = 3;
        this.nextStep = interfaceC4588d;
        Object objE = C4696b.e();
        if (objE == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }

    @Override // Tb.j
    public Object g(Iterator<? extends T> it, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (!it.hasNext()) {
            return C4153F.f46609a;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = interfaceC4588d;
        Object objE = C4696b.e();
        if (objE == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }

    @Override // ta.InterfaceC4588d
    public ta.g getContext() {
        return ta.h.f50000B;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.state;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw h();
                }
                Iterator<? extends T> it = this.nextIterator;
                C3862t.d(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            InterfaceC4588d<? super C4153F> interfaceC4588d = this.nextStep;
            C3862t.d(interfaceC4588d);
            this.nextStep = null;
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
        }
    }

    public final void j(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        this.nextStep = interfaceC4588d;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.state;
        if (i10 == 0 || i10 == 1) {
            return i();
        }
        if (i10 == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            C3862t.d(it);
            return it.next();
        }
        if (i10 != 3) {
            throw h();
        }
        this.state = 0;
        T t10 = this.nextValue;
        this.nextValue = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ta.InterfaceC4588d
    public void resumeWith(Object result) {
        C4173r.b(result);
        this.state = 4;
    }
}
