package Q1;

import Ba.l;
import android.view.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: InitializerViewModelFactory.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LQ1/f;", "Landroidx/lifecycle/Y;", "T", "", "LIa/d;", "clazz", "Lkotlin/Function1;", "LQ1/a;", "initializer", "<init>", "(LIa/d;LBa/l;)V", "a", "LIa/d;", "()LIa/d;", "b", "LBa/l;", "()LBa/l;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<T extends Y> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ia.d<T> clazz;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<a, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Ia.d<T> clazz, l<? super a, ? extends T> initializer) {
        C3862t.g(clazz, "clazz");
        C3862t.g(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final Ia.d<T> a() {
        return this.clazz;
    }

    public final l<a, T> b() {
        return this.initializer;
    }
}
