package mc;

import java.util.Iterator;
import kc.j;
import kc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: Enums.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lmc/o;", "Lmc/H;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lkc/f;", "e", "(I)Lkc/f;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "Lkc/j;", "l", "Lkc/j;", "i", "()Lkc/j;", "kind", "", "m", "Loa/i;", "o", "()[Lkc/f;", "elementDescriptors", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4035o extends H {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final kc.j kind;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i elementDescriptors;

    /* compiled from: Enums.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lkc/f;", "a", "()[Lkc/f;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc.o$a */
    static final class a extends AbstractC3864v implements Ba.a<kc.f[]> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f45508B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f45509C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C4035o f45510D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, String str, C4035o c4035o) {
            super(0);
            this.f45508B = i10;
            this.f45509C = str;
            this.f45510D = c4035o;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kc.f[] invoke() {
            int i10 = this.f45508B;
            kc.f[] fVarArr = new kc.f[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fVarArr[i11] = kc.i.b(this.f45509C + '.' + this.f45510D.d(i11), k.c.f43921a, new kc.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4035o(String name, int i10) {
        super(name, null, i10, 2, null);
        C3862t.g(name, "name");
        this.kind = j.b.f43918a;
        this.elementDescriptors = C4165j.a(new a(i10, name, this));
    }

    private final kc.f[] o() {
        return (kc.f[]) this.elementDescriptors.getValue();
    }

    @Override // mc.H, kc.f
    public kc.f e(int index) {
        return o()[index];
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof kc.f)) {
            return false;
        }
        kc.f fVar = (kc.f) other;
        return fVar.getKind() == j.b.f43918a && C3862t.b(getSerialName(), fVar.getSerialName()) && C3862t.b(G.a(this), G.a(fVar));
    }

    @Override // mc.H
    public int hashCode() {
        int iHashCode = getSerialName().hashCode();
        Iterator<String> it = kc.h.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i10 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i10 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // mc.H, kc.f
    /* renamed from: i, reason: from getter */
    public kc.j getKind() {
        return this.kind;
    }

    @Override // mc.H
    public String toString() {
        return kotlin.collections.r.s0(kc.h.b(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }
}
