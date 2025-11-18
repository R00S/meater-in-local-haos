package android.view;

import R1.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewModel.jvm.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/Y;", "", "<init>", "()V", "Loa/F;", "g", "e", "", "key", "Ljava/lang/AutoCloseable;", "closeable", "d", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "T", "f", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "LR1/f;", "a", "LR1/f;", "impl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f impl = new f();

    public final void d(String key, AutoCloseable closeable) {
        C3862t.g(key, "key");
        C3862t.g(closeable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.d(key, closeable);
        }
    }

    public final void e() {
        f fVar = this.impl;
        if (fVar != null) {
            fVar.e();
        }
        g();
    }

    public final <T extends AutoCloseable> T f(String key) {
        C3862t.g(key, "key");
        f fVar = this.impl;
        if (fVar != null) {
            return (T) fVar.g(key);
        }
        return null;
    }

    protected void g() {
    }
}
