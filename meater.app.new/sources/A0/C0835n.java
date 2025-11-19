package A0;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import x0.C5047a;

/* compiled from: DepthSortedSet.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001cj\b\u0012\u0004\u0012\u00020\u0006`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, d2 = {"LA0/n;", "", "", "extraAssertions", "<init>", "(Z)V", "LA0/G;", "node", "b", "(LA0/G;)Z", "Loa/F;", "a", "(LA0/G;)V", "f", "e", "()LA0/G;", "d", "()Z", "", "toString", "()Ljava/lang/String;", "Z", "", "", "Loa/i;", "c", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "LA0/C0;", "LA0/C0;", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i mapOfOriginalDepth = C4165j.b(EnumC4168m.f46628D, b.f651B);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Comparator<G> DepthComparator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C0<G> set;

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"A0/n$a", "Ljava/util/Comparator;", "LA0/G;", "Lkotlin/Comparator;", "a", "b", "", "(LA0/G;LA0/G;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.n$a */
    public static final class a implements Comparator<G> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(G a10, G b10) {
            int i10 = C3862t.i(a10.getDepth(), b10.getDepth());
            return i10 != 0 ? i10 : C3862t.i(a10.hashCode(), b10.hashCode());
        }
    }

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LA0/G;", "", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.n$b */
    static final class b extends AbstractC3864v implements Ba.a<Map<G, Integer>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f651B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<G, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public C0835n(boolean z10) {
        this.extraAssertions = z10;
        a aVar = new a();
        this.DepthComparator = aVar;
        this.set = new C0<>(aVar);
    }

    private final Map<G, Integer> c() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final void a(G node) {
        if (!node.K0()) {
            C5047a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            Integer num = c().get(node);
            if (num == null) {
                c().put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (!(num.intValue() == node.getDepth())) {
                    C5047a.b("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean b(G node) {
        boolean zContains = this.set.contains(node);
        if (this.extraAssertions) {
            if (!(zContains == c().containsKey(node))) {
                C5047a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.set.isEmpty();
    }

    public final G e() {
        G gFirst = this.set.first();
        f(gFirst);
        return gFirst;
    }

    public final boolean f(G node) {
        if (!node.K0()) {
            C5047a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(node);
        if (this.extraAssertions) {
            if (!C3862t.b(c().remove(node), zRemove ? Integer.valueOf(node.getDepth()) : null)) {
                C5047a.b("invalid node depth");
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.set.toString();
    }
}
