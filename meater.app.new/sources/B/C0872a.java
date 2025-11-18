package B;

import androidx.compose.foundation.lazy.layout.d;
import kotlin.EnumC5037q;
import kotlin.Metadata;
import y.C5089a;

/* compiled from: LazyGridPrefetchStrategy.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, d2 = {"LB/a;", "LB/A;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "LB/z;", "", "delta", "LB/s;", "layoutInfo", "Loa/F;", "b", "(LB/z;FLB/s;)V", "a", "(LB/z;LB/s;)V", "LC/I;", "firstVisibleItemIndex", "d", "(LC/I;I)V", "I", "lineToPrefetch", "LQ/b;", "Landroidx/compose/foundation/lazy/layout/d$b;", "c", "LQ/b;", "currentLinePrefetchHandles", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0872a implements A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int nestedPrefetchItemCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lineToPrefetch = -1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Q.b<d.b> currentLinePrefetchHandles = new Q.b<>(new d.b[16], 0);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    public C0872a(int i10) {
        this.nestedPrefetchItemCount = i10;
    }

    @Override // B.A
    public void a(z zVar, s sVar) {
        int iH;
        if (this.lineToPrefetch == -1 || sVar.n().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            InterfaceC0882k interfaceC0882k = (InterfaceC0882k) kotlin.collections.r.u0(sVar.n());
            iH = (sVar.c() == EnumC5037q.Vertical ? interfaceC0882k.h() : interfaceC0882k.m()) + 1;
        } else {
            InterfaceC0882k interfaceC0882k2 = (InterfaceC0882k) kotlin.collections.r.j0(sVar.n());
            iH = (sVar.c() == EnumC5037q.Vertical ? interfaceC0882k2.h() : interfaceC0882k2.m()) - 1;
        }
        if (this.lineToPrefetch != iH) {
            this.lineToPrefetch = -1;
            Q.b<d.b> bVar = this.currentLinePrefetchHandles;
            int size = bVar.getSize();
            if (size > 0) {
                d.b[] bVarArrT = bVar.t();
                int i10 = 0;
                do {
                    bVarArrT[i10].cancel();
                    i10++;
                } while (i10 < size);
            }
            this.currentLinePrefetchHandles.l();
        }
    }

    @Override // B.A
    public void b(z zVar, float f10, s sVar) {
        int iH;
        int index;
        Q.b<d.b> bVar;
        int size;
        Q.b<d.b> bVar2;
        int size2;
        Q.b<d.b> bVar3;
        int size3;
        if (sVar.n().isEmpty()) {
            return;
        }
        int i10 = 0;
        boolean z10 = f10 < 0.0f;
        if (z10) {
            InterfaceC0882k interfaceC0882k = (InterfaceC0882k) kotlin.collections.r.u0(sVar.n());
            iH = (sVar.c() == EnumC5037q.Vertical ? interfaceC0882k.h() : interfaceC0882k.m()) + 1;
            index = ((InterfaceC0882k) kotlin.collections.r.u0(sVar.n())).getIndex() + 1;
        } else {
            InterfaceC0882k interfaceC0882k2 = (InterfaceC0882k) kotlin.collections.r.j0(sVar.n());
            iH = (sVar.c() == EnumC5037q.Vertical ? interfaceC0882k2.h() : interfaceC0882k2.m()) - 1;
            index = ((InterfaceC0882k) kotlin.collections.r.j0(sVar.n())).getIndex() - 1;
        }
        if (index < 0 || index >= sVar.i()) {
            return;
        }
        if (iH != this.lineToPrefetch && iH >= 0) {
            if (this.wasScrollingForward != z10 && (size3 = (bVar3 = this.currentLinePrefetchHandles).getSize()) > 0) {
                d.b[] bVarArrT = bVar3.t();
                int i11 = 0;
                do {
                    bVarArrT[i11].cancel();
                    i11++;
                } while (i11 < size3);
            }
            this.wasScrollingForward = z10;
            this.lineToPrefetch = iH;
            this.currentLinePrefetchHandles.l();
            Q.b<d.b> bVar4 = this.currentLinePrefetchHandles;
            bVar4.h(bVar4.getSize(), zVar.a(iH));
        }
        if (!z10) {
            if (sVar.m() - C5089a.a((InterfaceC0882k) kotlin.collections.r.j0(sVar.n()), sVar.c()) >= f10 || (size = (bVar = this.currentLinePrefetchHandles).getSize()) <= 0) {
                return;
            }
            d.b[] bVarArrT2 = bVar.t();
            do {
                bVarArrT2[i10].a();
                i10++;
            } while (i10 < size);
            return;
        }
        InterfaceC0882k interfaceC0882k3 = (InterfaceC0882k) kotlin.collections.r.u0(sVar.n());
        if (((C5089a.a(interfaceC0882k3, sVar.c()) + C5089a.b(interfaceC0882k3, sVar.c())) + sVar.l()) - sVar.h() >= (-f10) || (size2 = (bVar2 = this.currentLinePrefetchHandles).getSize()) <= 0) {
            return;
        }
        d.b[] bVarArrT3 = bVar2.t();
        do {
            bVarArrT3[i10].a();
            i10++;
        } while (i10 < size2);
    }

    @Override // B.A
    public void d(kotlin.I i10, int i11) {
        int i12 = this.nestedPrefetchItemCount;
        for (int i13 = 0; i13 < i12; i13++) {
            i10.a(i11 + i13);
        }
    }
}
