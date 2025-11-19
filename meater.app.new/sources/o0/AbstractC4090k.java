package o0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lo0/k;", "", "<init>", "()V", "Loa/F;", "c", "Lk0/f;", "a", "(Lk0/f;)V", "Lkotlin/Function1;", "LBa/l;", "b", "()LBa/l;", "d", "(LBa/l;)V", "invalidateListener", "Lo0/c;", "Lo0/f;", "Lo0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4090k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super AbstractC4090k, C4153F> invalidateListener;

    public /* synthetic */ AbstractC4090k(C3854k c3854k) {
        this();
    }

    public abstract void a(k0.f fVar);

    public Ba.l<AbstractC4090k, C4153F> b() {
        return this.invalidateListener;
    }

    public final void c() {
        Ba.l<AbstractC4090k, C4153F> lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(Ba.l<? super AbstractC4090k, C4153F> lVar) {
        this.invalidateListener = lVar;
    }

    private AbstractC4090k() {
    }
}
