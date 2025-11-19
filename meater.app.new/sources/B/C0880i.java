package B;

import kotlin.AbstractC0973l;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: LazyGridIntervalContent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"LB/i;", "LC/l$a;", "Lkotlin/Function1;", "", "", "key", "Lkotlin/Function2;", "LB/q;", "LB/c;", "span", "type", "LB/o;", "Loa/F;", "item", "<init>", "(LBa/l;LBa/p;LBa/l;LBa/r;)V", "a", "LBa/l;", "getKey", "()LBa/l;", "b", "LBa/p;", "c", "()LBa/p;", "d", "LBa/r;", "()LBa/r;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880i implements AbstractC0973l.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Integer, Object> key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<q, Integer, C0874c> span;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Integer, Object> type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.r<o, Integer, InterfaceC1554l, Integer, C4153F> item;

    /* JADX WARN: Multi-variable type inference failed */
    public C0880i(Ba.l<? super Integer, ? extends Object> lVar, Ba.p<? super q, ? super Integer, C0874c> pVar, Ba.l<? super Integer, ? extends Object> lVar2, Ba.r<? super o, ? super Integer, ? super InterfaceC1554l, ? super Integer, C4153F> rVar) {
        this.key = lVar;
        this.span = pVar;
        this.type = lVar2;
        this.item = rVar;
    }

    @Override // kotlin.AbstractC0973l.a
    public Ba.l<Integer, Object> a() {
        return this.type;
    }

    public final Ba.r<o, Integer, InterfaceC1554l, Integer, C4153F> b() {
        return this.item;
    }

    public final Ba.p<q, Integer, C0874c> c() {
        return this.span;
    }

    @Override // kotlin.AbstractC0973l.a
    public Ba.l<Integer, Object> getKey() {
        return this.key;
    }
}
