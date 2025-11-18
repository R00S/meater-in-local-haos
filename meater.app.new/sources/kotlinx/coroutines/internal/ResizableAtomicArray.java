package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.ranges.C9848l;
import okhttp3.HttpUrl;

/* compiled from: ResizableAtomicArray.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m32267d2 = {"Lkotlinx/coroutines/internal/ResizableAtomicArray;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "initialLength", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "currentLength", "get", "index", "(I)Ljava/lang/Object;", "setSynchronized", HttpUrl.FRAGMENT_ENCODE_SET, "value", "(ILjava/lang/Object;)V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.b0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class ResizableAtomicArray<T> {
    private volatile AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int i2) {
        this.array = new AtomicReferenceArray<>(i2);
    }

    /* renamed from: a */
    public final int m39444a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T m39445b(int i2) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    /* renamed from: c */
    public final void m39446c(int i2, T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, t);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(C9848l.m32419b(i2 + 1, length * 2));
        for (int i3 = 0; i3 < length; i3++) {
            atomicReferenceArray2.set(i3, atomicReferenceArray.get(i3));
        }
        atomicReferenceArray2.set(i2, t);
        this.array = atomicReferenceArray2;
    }
}
