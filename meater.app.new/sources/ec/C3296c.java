package ec;

import kotlin.Metadata;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lec/c;", "Lec/f;", "<init>", "()V", "Loa/F;", "close", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ec.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3296c extends f {

    /* renamed from: J, reason: collision with root package name */
    public static final C3296c f40984J = new C3296c();

    private C3296c() {
        super(l.f40997c, l.f40998d, l.f40999e, l.f40995a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Xb.E
    public String toString() {
        return "Dispatchers.Default";
    }
}
