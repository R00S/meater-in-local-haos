package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: AbstractIterator.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\tH\u0004J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m32267d2 = {"Lkotlin/collections/AbstractIterator;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "nextValue", "Ljava/lang/Object;", "state", "Lkotlin/collections/State;", "computeNext", HttpUrl.FRAGMENT_ENCODE_SET, "done", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "()Ljava/lang/Object;", "setNext", "value", "(Ljava/lang/Object;)V", "tryToComputeNext", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: f */
    private State f41443f = State.NotReady;

    /* renamed from: g */
    private T f41444g;

    /* compiled from: AbstractIterator.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41445a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.Done.ordinal()] = 1;
            iArr[State.Ready.ordinal()] = 2;
            f41445a = iArr;
        }
    }

    /* renamed from: e */
    private final boolean m38555e() {
        this.f41443f = State.Failed;
        mo37192b();
        return this.f41443f == State.Ready;
    }

    /* renamed from: b */
    protected abstract void mo37192b();

    /* renamed from: c */
    protected final void m38556c() {
        this.f41443f = State.Done;
    }

    /* renamed from: d */
    protected final void m38557d(T t) {
        this.f41444g = t;
        this.f41443f = State.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        State state = this.f41443f;
        if (!(state != State.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = a.f41445a[state.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return m38555e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f41443f = State.NotReady;
        return this.f41444g;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
