package B;

import kotlin.AbstractC0973l;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: LazyGridIntervalContent.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 )2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJy\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"LB/j;", "LB/C;", "LC/l;", "LB/i;", "Lkotlin/Function1;", "Loa/F;", "content", "<init>", "(LBa/l;)V", "", "count", "", "key", "Lkotlin/Function2;", "LB/q;", "LB/c;", "span", "contentType", "LB/o;", "itemContent", "a", "(ILBa/l;LBa/p;LBa/l;LBa/r;)V", "LB/H;", "LB/H;", "h", "()LB/H;", "spanLayoutProvider", "LC/G;", "b", "LC/G;", "g", "()LC/G;", "intervals", "", "c", "Z", "f", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "hasCustomSpans", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881j extends AbstractC0973l<C0880i> implements C {

    /* renamed from: d, reason: collision with root package name */
    private static final b f1275d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f1276e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static final Ba.p<q, Integer, C0874c> f1277f = a.f1281B;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final H spanLayoutProvider = new H(this);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kotlin.G<C0880i> intervals = new kotlin.G<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasCustomSpans;

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB/q;", "", "it", "LB/c;", "a", "(LB/q;I)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B.j$a */
    static final class a extends AbstractC3864v implements Ba.p<q, Integer, C0874c> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f1281B = new a();

        a() {
            super(2);
        }

        public final long a(q qVar, int i10) {
            return G.a(1);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C0874c invoke(q qVar, Integer num) {
            return C0874c.a(a(qVar, num.intValue()));
        }
    }

    /* compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LB/j$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B.j$b */
    private static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    public C0881j(Ba.l<? super C, C4153F> lVar) {
        lVar.invoke(this);
    }

    @Override // B.C
    public void a(int count, Ba.l<? super Integer, ? extends Object> key, Ba.p<? super q, ? super Integer, C0874c> span, Ba.l<? super Integer, ? extends Object> contentType, Ba.r<? super o, ? super Integer, ? super InterfaceC1554l, ? super Integer, C4153F> itemContent) {
        c().c(count, new C0880i(key, span == null ? f1277f : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    /* renamed from: f, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @Override // kotlin.AbstractC0973l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public kotlin.G<C0880i> c() {
        return this.intervals;
    }

    /* renamed from: h, reason: from getter */
    public final H getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }
}
