package Xc;

import Ba.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Callbacks.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LXc/c;", "T", "", "Lkotlin/Function1;", "Loa/F;", "Lorg/koin/core/definition/OnCloseCallback;", "onClose", "<init>", "(LBa/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBa/l;", "getOnClose", "()LBa/l;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Xc.c, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class Callbacks<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<T, C4153F> onClose;

    public Callbacks() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Callbacks) && C3862t.b(this.onClose, ((Callbacks) other).onClose);
    }

    public int hashCode() {
        l<T, C4153F> lVar = this.onClose;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.onClose + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks(l<? super T, C4153F> lVar) {
        this.onClose = lVar;
    }

    public /* synthetic */ Callbacks(l lVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : lVar);
    }
}
