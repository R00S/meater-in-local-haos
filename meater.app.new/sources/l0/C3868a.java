package l0;

import i0.K0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s.C4389K;

/* compiled from: ChildLayerDependenciesTracker.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll0/a;", "", "<init>", "()V", "Ll0/c;", "graphicsLayer", "", "i", "(Ll0/c;)Z", "a", "Ll0/c;", "dependency", "b", "oldDependency", "Ls/K;", "c", "Ls/K;", "dependenciesSet", "d", "oldDependenciesSet", "e", "Z", "trackingInProgress", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3868a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C3870c dependency;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C3870c oldDependency;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C4389K<C3870c> dependenciesSet;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C4389K<C3870c> oldDependenciesSet;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean trackingInProgress;

    public final boolean i(C3870c graphicsLayer) {
        if (!this.trackingInProgress) {
            K0.a("Only add dependencies during a tracking");
        }
        C4389K<C3870c> c4389k = this.dependenciesSet;
        if (c4389k != null) {
            C3862t.d(c4389k);
            c4389k.h(graphicsLayer);
        } else if (this.dependency != null) {
            C4389K<C3870c> c4389kA = s.W.a();
            C3870c c3870c = this.dependency;
            C3862t.d(c3870c);
            c4389kA.h(c3870c);
            c4389kA.h(graphicsLayer);
            this.dependenciesSet = c4389kA;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        C4389K<C3870c> c4389k2 = this.oldDependenciesSet;
        if (c4389k2 != null) {
            C3862t.d(c4389k2);
            return !c4389k2.x(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }
}
