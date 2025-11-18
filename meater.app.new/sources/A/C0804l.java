package A;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ContextualFlowLayout.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LA/l;", "", "Ly0/H;", "", "hasNext", "()Z", "h", "()Ly0/H;", "LA/w;", "info", "d", "(LA/w;)Ly0/H;", "", "B", "I", "itemCount", "Lkotlin/Function2;", "", "C", "LBa/p;", "getMeasurables", "", "D", "Ljava/util/List;", "_list", "E", "itemIndex", "F", "listIndex", "b", "()Ljava/util/List;", "list", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804l implements Iterator<y0.H>, Ca.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int itemCount;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<Integer, C0814w, List<y0.H>> getMeasurables;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<y0.H> _list;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int itemIndex;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int listIndex;

    public static /* synthetic */ y0.H g(C0804l c0804l, C0814w c0814w, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0814w = new C0814w(0, 0, 0.0f, 0.0f, 15, null);
        }
        return c0804l.d(c0814w);
    }

    public final List<y0.H> b() {
        return this._list;
    }

    public final y0.H d(C0814w info) {
        if (this.listIndex < b().size()) {
            y0.H h10 = b().get(this.listIndex);
            this.listIndex++;
            return h10;
        }
        int i10 = this.itemIndex;
        if (i10 >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List<y0.H> listInvoke = this.getMeasurables.invoke(Integer.valueOf(i10), info);
        this.itemIndex++;
        if (listInvoke.isEmpty()) {
            return next();
        }
        y0.H h11 = (y0.H) kotlin.collections.r.j0(listInvoke);
        this._list.addAll(listInvoke);
        this.listIndex++;
        return h11;
    }

    @Override // java.util.Iterator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public y0.H next() {
        return g(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < b().size() || this.itemIndex < this.itemCount;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
