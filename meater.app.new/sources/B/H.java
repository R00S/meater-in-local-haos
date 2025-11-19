package B;

import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC0966d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;

/* compiled from: LazyGridSpanLayoutProvider.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0019\n\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R*\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b#\u0010-\"\u0004\b*\u0010.R\u0014\u00100\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010-R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010-¨\u00062"}, d2 = {"LB/H;", "", "LB/j;", "gridContent", "<init>", "(LB/j;)V", "", "currentSlotsPerLine", "", "LB/c;", "b", "(I)Ljava/util/List;", "Loa/F;", "g", "()V", "lineIndex", "LB/H$c;", "c", "(I)LB/H$c;", "itemIndex", "d", "(I)I", "maxSpan", "i", "(II)I", "a", "LB/j;", "Ljava/util/ArrayList;", "LB/H$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "e", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "Ljava/util/List;", "cachedBucket", "h", "previousDefaultSpans", "value", "()I", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C0881j gridContent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<a> buckets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastLineIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartItemIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int cachedBucketIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> cachedBucket;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<C0874c> previousDefaultSpans;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int slotsPerLine;

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"LB/H$b;", "LB/q;", "<init>", "()V", "", "b", "I", "getMaxCurrentLineSpan", "()I", "a", "(I)V", "maxCurrentLineSpan", "c", "getMaxLineSpan", "maxLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1190a = new b();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static int maxLineSpan;

        private b() {
        }

        public void a(int i10) {
            maxCurrentLineSpan = i10;
        }

        public void b(int i10) {
            maxLineSpan = i10;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LB/H$c;", "", "", "firstItemIndex", "", "LB/c;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<C0874c> spans;

        public c(int i10, List<C0874c> list) {
            this.firstItemIndex = i10;
            this.spans = list;
        }

        /* renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<C0874c> b() {
            return this.spans;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LB/H$a;", "it", "", "a", "(LB/H$a;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<a, Integer> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f1195B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f1195B = i10;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.getFirstItemIndex() - this.f1195B);
        }
    }

    public H(C0881j c0881j) {
        this.gridContent = c0881j;
        ArrayList<a> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = kotlin.collections.r.m();
    }

    private final int a() {
        return ((int) Math.sqrt((f() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<C0874c> b(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i10 = 0; i10 < currentSlotsPerLine; i10++) {
            arrayList.add(C0874c.a(G.a(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void g() {
        this.buckets.clear();
        int i10 = 0;
        this.buckets.add(new a(i10, i10, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final B.H.c c(int r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.H.c(int):B.H$c");
    }

    public final int d(int itemIndex) {
        int i10 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (itemIndex >= f()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        int iK = kotlin.collections.r.k(this.buckets, 0, 0, new d(itemIndex), 3, null);
        int i11 = 2;
        if (iK < 0) {
            iK = (-iK) - 2;
        }
        int iA = a() * iK;
        int firstItemIndex = this.buckets.get(iK).getFirstItemIndex();
        if (firstItemIndex > itemIndex) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i12 = 0;
        while (firstItemIndex < itemIndex) {
            int i13 = firstItemIndex + 1;
            int i14 = i(firstItemIndex, this.slotsPerLine - i12);
            i12 += i14;
            int i15 = this.slotsPerLine;
            if (i12 >= i15) {
                if (i12 == i15) {
                    iA++;
                    i12 = 0;
                } else {
                    iA++;
                    i12 = i14;
                }
            }
            if (iA % a() == 0 && iA / a() >= this.buckets.size()) {
                this.buckets.add(new a(i13 - (i12 > 0 ? 1 : 0), i10, i11, null));
            }
            firstItemIndex = i13;
        }
        return i12 + i(itemIndex, this.slotsPerLine - i12) > this.slotsPerLine ? iA + 1 : iA;
    }

    /* renamed from: e, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int f() {
        return this.gridContent.c().getSize();
    }

    public final void h(int i10) {
        if (i10 != this.slotsPerLine) {
            this.slotsPerLine = i10;
            g();
        }
    }

    public final int i(int itemIndex, int maxSpan) {
        b bVar = b.f1190a;
        bVar.a(maxSpan);
        bVar.b(this.slotsPerLine);
        InterfaceC0966d.a<C0880i> aVar = this.gridContent.c().get(itemIndex);
        return C0874c.d(aVar.c().c().invoke(bVar, Integer.valueOf(itemIndex - aVar.getStartIndex())).getPackedValue());
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LB/H$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "a", "I", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int firstItemKnownSpan;

        public a(int i10, int i11) {
            this.firstItemIndex = i10;
            this.firstItemKnownSpan = i11;
        }

        /* renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* renamed from: b, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ a(int i10, int i11, int i12, C3854k c3854k) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
