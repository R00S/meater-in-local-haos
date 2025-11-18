package kotlin.reflect.p371y.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: moduleByClassLoader.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004¨\u0006\u0017"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", HttpUrl.FRAGMENT_ENCODE_SET, "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "identityHashCode", HttpUrl.FRAGMENT_ENCODE_SET, "getIdentityHashCode", "()I", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "temporaryStrongRef", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "setTemporaryStrongRef", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.h0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class WeakClassLoaderBox {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f37369a;

    /* renamed from: b */
    private final int f37370b;

    /* renamed from: c */
    private ClassLoader f37371c;

    public WeakClassLoaderBox(ClassLoader classLoader) {
        C9801m.m32346f(classLoader, "classLoader");
        this.f37369a = new WeakReference<>(classLoader);
        this.f37370b = System.identityHashCode(classLoader);
        this.f37371c = classLoader;
    }

    /* renamed from: a */
    public final void m32610a(ClassLoader classLoader) {
        this.f37371c = classLoader;
    }

    public boolean equals(Object other) {
        return (other instanceof WeakClassLoaderBox) && this.f37369a.get() == ((WeakClassLoaderBox) other).f37369a.get();
    }

    /* renamed from: hashCode, reason: from getter */
    public int getF37370b() {
        return this.f37370b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = this.f37369a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
