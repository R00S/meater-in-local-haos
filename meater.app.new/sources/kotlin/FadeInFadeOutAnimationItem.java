package kotlin;

import Ba.p;
import Ba.q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u001c\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR-\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"LI/G;", "T", "", "key", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loa/F;", "Landroidx/compose/material/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;LBa/q;)V", "a", "()Ljava/lang/Object;", "b", "()LBa/q;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "LBa/q;", "getTransition", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.G, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class FadeInFadeOutAnimationItem<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q<p<? super InterfaceC1554l, ? super Integer, C4153F>, InterfaceC1554l, Integer, C4153F> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t10, q<? super p<? super InterfaceC1554l, ? super Integer, C4153F>, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
        this.key = t10;
        this.transition = qVar;
    }

    public final T a() {
        return this.key;
    }

    public final q<p<? super InterfaceC1554l, ? super Integer, C4153F>, InterfaceC1554l, Integer, C4153F> b() {
        return this.transition;
    }

    public final T c() {
        return this.key;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) other;
        return C3862t.b(this.key, fadeInFadeOutAnimationItem.key) && C3862t.b(this.transition, fadeInFadeOutAnimationItem.transition);
    }

    public int hashCode() {
        T t10 = this.key;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
