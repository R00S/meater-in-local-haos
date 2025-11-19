package B;

import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC0966d;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: LazyGridItemProvider.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"LB/m;", "LB/l;", "LB/I;", "state", "LB/j;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "<init>", "(LB/I;LB/j;Landroidx/compose/foundation/lazy/layout/c;)V", "", "index", "", "b", "(I)Ljava/lang/Object;", "d", "key", "Loa/F;", "f", "(ILjava/lang/Object;LO/l;I)V", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "LB/I;", "LB/j;", "Landroidx/compose/foundation/lazy/layout/c;", "e", "()Landroidx/compose/foundation/lazy/layout/c;", "itemCount", "LB/H;", "g", "()LB/H;", "spanLayoutProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class m implements l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C0881j intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.c keyIndexMap;

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f1286C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f1286C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(726189336, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            C0881j c0881j = m.this.intervalContent;
            int i11 = this.f1286C;
            InterfaceC0966d.a<C0880i> aVar = c0881j.c().get(i11);
            aVar.c().b().k(p.f1294a, Integer.valueOf(i11 - aVar.getStartIndex()), interfaceC1554l, 6);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyGridItemProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f1288C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Object f1289D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1290E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f1288C = i10;
            this.f1289D = obj;
            this.f1290E = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            m.this.f(this.f1288C, this.f1289D, interfaceC1554l, C1509K0.a(this.f1290E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public m(I i10, C0881j c0881j, androidx.compose.foundation.lazy.layout.c cVar) {
        this.state = i10;
        this.intervalContent = c0881j;
        this.keyIndexMap = cVar;
    }

    @Override // kotlin.q
    public int a() {
        return this.intervalContent.d();
    }

    @Override // kotlin.q
    public Object b(int index) {
        Object objB = getKeyIndexMap().b(index);
        return objB == null ? this.intervalContent.e(index) : objB;
    }

    @Override // kotlin.q
    public int c(Object key) {
        return getKeyIndexMap().c(key);
    }

    @Override // kotlin.q
    public Object d(int index) {
        return this.intervalContent.b(index);
    }

    @Override // B.l
    /* renamed from: e, reason: from getter */
    public androidx.compose.foundation.lazy.layout.c getKeyIndexMap() {
        return this.keyIndexMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m) {
            return C3862t.b(this.intervalContent, ((m) other).intervalContent);
        }
        return false;
    }

    @Override // kotlin.q
    public void f(int i10, Object obj, InterfaceC1554l interfaceC1554l, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1493551140);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1554lR.h(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1554lR.l(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1554lR.R(this) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1493551140, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            kotlin.A.a(obj, i10, this.state.getPinnedItems(), W.c.d(726189336, true, new a(i10), interfaceC1554lR, 54), interfaceC1554lR, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(i10, obj, i11));
        }
    }

    @Override // B.l
    public H g() {
        return this.intervalContent.getSpanLayoutProvider();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
