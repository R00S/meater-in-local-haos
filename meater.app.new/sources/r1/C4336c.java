package r1;

import android.util.LongSparseArray;
import kotlin.Metadata;
import kotlin.collections.K;

/* compiled from: LongSparseArray.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Landroid/util/LongSparseArray;", "Lkotlin/collections/K;", "a", "(Landroid/util/LongSparseArray;)Lkotlin/collections/K;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4336c {

    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"r1/c$a", "Lkotlin/collections/K;", "", "hasNext", "()Z", "", "b", "()J", "", "B", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: r1.c$a */
    public static final class a extends K {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ LongSparseArray<T> f48338C;

        a(LongSparseArray<T> longSparseArray) {
            this.f48338C = longSparseArray;
        }

        @Override // kotlin.collections.K
        public long b() {
            LongSparseArray<T> longSparseArray = this.f48338C;
            int i10 = this.index;
            this.index = i10 + 1;
            return longSparseArray.keyAt(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f48338C.size();
        }
    }

    public static final <T> K a(LongSparseArray<T> longSparseArray) {
        return new a(longSparseArray);
    }
}
