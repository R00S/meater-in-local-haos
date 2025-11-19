package Tb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LTb/e;", "T", "LTb/h;", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(LTb/h;ZLBa/l;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "LTb/h;", "b", "Z", "c", "LBa/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean sendWhen;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<T, Boolean> predicate;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Tb/e$a", "", "Loa/F;", "b", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "B", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "C", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "D", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T> iterator;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int nextState = -1;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private T nextItem;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ e<T> f16675E;

        a(e<T> eVar) {
            this.f16675E = eVar;
            this.iterator = ((e) eVar).sequence.iterator();
        }

        private final void b() {
            while (this.iterator.hasNext()) {
                T next = this.iterator.next();
                if (((Boolean) ((e) this.f16675E).predicate.invoke(next)).booleanValue() == ((e) this.f16675E).sendWhen) {
                    this.nextItem = next;
                    this.nextState = 1;
                    return;
                }
            }
            this.nextState = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                b();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState == -1) {
                b();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.nextItem;
            this.nextItem = null;
            this.nextState = -1;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(h<? extends T> sequence, boolean z10, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(sequence, "sequence");
        C3862t.g(predicate, "predicate");
        this.sequence = sequence;
        this.sendWhen = z10;
        this.predicate = predicate;
    }

    @Override // Tb.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}
