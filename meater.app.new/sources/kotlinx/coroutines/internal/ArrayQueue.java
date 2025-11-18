package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.collections.C10801m;
import okhttp3.HttpUrl;

/* compiled from: ArrayQueue.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002J\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0014R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lkotlinx/coroutines/internal/ArrayQueue;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "[Ljava/lang/Object;", "head", HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "tail", "addLast", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Object;)V", "clear", "ensureCapacity", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.a, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class ArrayQueue<T> {

    /* renamed from: a */
    private Object[] f41761a = new Object[16];

    /* renamed from: b */
    private int f41762b;

    /* renamed from: c */
    private int f41763c;

    /* renamed from: b */
    private final void m39440b() {
        Object[] objArr = this.f41761a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C10801m.m38706g(objArr, objArr2, 0, this.f41762b, 0, 10, null);
        Object[] objArr3 = this.f41761a;
        int length2 = objArr3.length;
        int i2 = this.f41762b;
        C10801m.m38706g(objArr3, objArr2, length2 - i2, 0, i2, 4, null);
        this.f41761a = objArr2;
        this.f41762b = 0;
        this.f41763c = length;
    }

    /* renamed from: a */
    public final void m39441a(T t) {
        Object[] objArr = this.f41761a;
        int i2 = this.f41763c;
        objArr[i2] = t;
        int length = (objArr.length - 1) & (i2 + 1);
        this.f41763c = length;
        if (length == this.f41762b) {
            m39440b();
        }
    }

    /* renamed from: c */
    public final boolean m39442c() {
        return this.f41762b == this.f41763c;
    }

    /* renamed from: d */
    public final T m39443d() {
        int i2 = this.f41762b;
        if (i2 == this.f41763c) {
            return null;
        }
        Object[] objArr = this.f41761a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f41762b = (i2 + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
