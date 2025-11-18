package f7;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: f7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3344a<T> implements InterfaceC3345b<T> {

    /* renamed from: B, reason: collision with root package name */
    protected final DataHolder f41374B;

    protected AbstractC3344a(DataHolder dataHolder) {
        this.f41374B = dataHolder;
    }

    @Override // d7.InterfaceC3050d
    public void c() {
        DataHolder dataHolder = this.f41374B;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new c(this);
    }
}
