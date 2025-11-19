package f7;

import g7.C3445p;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public class c<T> implements Iterator<T> {

    /* renamed from: B, reason: collision with root package name */
    protected final InterfaceC3345b f41375B;

    /* renamed from: C, reason: collision with root package name */
    protected int f41376C = -1;

    public c(InterfaceC3345b interfaceC3345b) {
        this.f41375B = (InterfaceC3345b) C3445p.k(interfaceC3345b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41376C < this.f41375B.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            InterfaceC3345b interfaceC3345b = this.f41375B;
            int i10 = this.f41376C + 1;
            this.f41376C = i10;
            return interfaceC3345b.get(i10);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f41376C);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
