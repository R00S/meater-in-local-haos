package kotlin;

import Ba.l;
import Ha.f;
import androidx.compose.foundation.lazy.layout.c;
import kotlin.AbstractC0973l;
import kotlin.InterfaceC0966d;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import s.C4385G;
import s.M;
import s.N;

/* compiled from: LazyLayoutKeyIndexMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LC/H;", "Landroidx/compose/foundation/lazy/layout/c;", "LHa/f;", "nearestRange", "LC/l;", "intervalContent", "<init>", "(LHa/f;LC/l;)V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "b", "(I)Ljava/lang/Object;", "Ls/M;", "Ls/M;", "map", "", "[Ljava/lang/Object;", "keys", "d", "I", "keysStartIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H implements c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final M<Object> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int keysStartIndex;

    /* compiled from: LazyLayoutKeyIndexMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LC/d$a;", "LC/l$a;", "it", "Loa/F;", "a", "(LC/d$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<InterfaceC0966d.a<? extends AbstractC0973l.a>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f2003B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f2004C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C4385G<Object> f2005D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ H f2006E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, C4385G<Object> c4385g, H h10) {
            super(1);
            this.f2003B = i10;
            this.f2004C = i11;
            this.f2005D = c4385g;
            this.f2006E = h10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(kotlin.InterfaceC0966d.a<? extends kotlin.AbstractC0973l.a> r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                C.l$a r0 = (kotlin.AbstractC0973l.a) r0
                Ba.l r0 = r0.getKey()
                int r1 = r6.f2003B
                int r2 = r7.getStartIndex()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f2004C
                int r3 = r7.getStartIndex()
                int r4 = r7.getSize()
                int r3 = r3 + r4
                int r3 = r3 + (-1)
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L57
            L27:
                if (r0 == 0) goto L39
                int r3 = r7.getStartIndex()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L3d
            L39:
                java.lang.Object r3 = kotlin.F.a(r1)
            L3d:
                s.G<java.lang.Object> r4 = r6.f2005D
                r4.s(r3, r1)
                C.H r4 = r6.f2006E
                java.lang.Object[] r4 = kotlin.H.a(r4)
                C.H r5 = r6.f2006E
                int r5 = kotlin.H.d(r5)
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L57
                int r1 = r1 + 1
                goto L27
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C.H.a.a(C.d$a):void");
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0966d.a<? extends AbstractC0973l.a> aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public H(f fVar, AbstractC0973l<?> abstractC0973l) {
        InterfaceC0966d<Interval> interfaceC0966dC = abstractC0973l.c();
        int first = fVar.getFirst();
        if (first < 0) {
            throw new IllegalStateException("negative nearestRange.first");
        }
        int iMin = Math.min(fVar.getLast(), interfaceC0966dC.getSize() - 1);
        if (iMin < first) {
            this.map = N.a();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i10 = (iMin - first) + 1;
            this.keys = new Object[i10];
            this.keysStartIndex = first;
            C4385G c4385g = new C4385G(i10);
            interfaceC0966dC.b(first, iMin, new a(first, iMin, c4385g, this));
            this.map = c4385g;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public Object b(int index) {
        Object[] objArr = this.keys;
        int i10 = index - this.keysStartIndex;
        if (i10 < 0 || i10 > C3831l.c0(objArr)) {
            return null;
        }
        return objArr[i10];
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public int c(Object key) {
        M<Object> m10 = this.map;
        int iB = m10.b(key);
        if (iB >= 0) {
            return m10.values[iB];
        }
        return -1;
    }
}
