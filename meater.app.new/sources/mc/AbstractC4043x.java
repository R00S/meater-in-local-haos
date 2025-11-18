package mc;

import kc.f;
import kc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: CollectionDescriptors.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0001#¨\u0006$"}, d2 = {"Lmc/x;", "Lkc/f;", "elementDescriptor", "<init>", "(Lkc/f;)V", "", "index", "", "d", "(I)Ljava/lang/String;", "", "f", "(I)Z", "e", "(I)Lkc/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkc/f;", "getElementDescriptor", "()Lkc/f;", "b", "I", "c", "elementsCount", "Lkc/j;", "i", "()Lkc/j;", "kind", "Lmc/K;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4043x implements kc.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kc.f elementDescriptor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    public /* synthetic */ AbstractC4043x(kc.f fVar, C3854k c3854k) {
        this(fVar);
    }

    @Override // kc.f
    /* renamed from: c, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kc.f
    public String d(int index) {
        return String.valueOf(index);
    }

    @Override // kc.f
    public kc.f e(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + a() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbstractC4043x)) {
            return false;
        }
        AbstractC4043x abstractC4043x = (AbstractC4043x) other;
        return C3862t.b(this.elementDescriptor, abstractC4043x.elementDescriptor) && C3862t.b(a(), abstractC4043x.a());
    }

    @Override // kc.f
    public boolean f(int index) {
        if (index >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.elementDescriptor.hashCode() * 31) + a().hashCode();
    }

    @Override // kc.f
    public kc.j i() {
        return k.b.f43920a;
    }

    @Override // kc.f
    public boolean isInline() {
        return f.a.a(this);
    }

    public String toString() {
        return a() + '(' + this.elementDescriptor + ')';
    }

    private AbstractC4043x(kc.f fVar) {
        this.elementDescriptor = fVar;
        this.elementsCount = 1;
    }
}
