package pb;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.IndexedValue;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nb.InterfaceC4077c;
import ob.C4176a;

/* compiled from: JvmNameResolverBase.kt */
/* loaded from: classes3.dex */
public class g implements InterfaceC4077c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f47738d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f47739e;

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f47740f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f47741g;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f47742a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f47743b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C4176a.e.c> f47744c;

    /* compiled from: JvmNameResolverBase.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47745a;

        static {
            int[] iArr = new int[C4176a.e.c.EnumC0644c.values().length];
            try {
                iArr[C4176a.e.c.EnumC0644c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C4176a.e.c.EnumC0644c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C4176a.e.c.EnumC0644c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47745a = iArr;
        }
    }

    static {
        String strS0 = r.s0(r.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f47739e = strS0;
        List<String> listP = r.p(strS0 + "/Any", strS0 + "/Nothing", strS0 + "/Unit", strS0 + "/Throwable", strS0 + "/Number", strS0 + "/Byte", strS0 + "/Double", strS0 + "/Float", strS0 + "/Int", strS0 + "/Long", strS0 + "/Short", strS0 + "/Boolean", strS0 + "/Char", strS0 + "/CharSequence", strS0 + "/String", strS0 + "/Comparable", strS0 + "/Enum", strS0 + "/Array", strS0 + "/ByteArray", strS0 + "/DoubleArray", strS0 + "/FloatArray", strS0 + "/IntArray", strS0 + "/LongArray", strS0 + "/ShortArray", strS0 + "/BooleanArray", strS0 + "/CharArray", strS0 + "/Cloneable", strS0 + "/Annotation", strS0 + "/collections/Iterable", strS0 + "/collections/MutableIterable", strS0 + "/collections/Collection", strS0 + "/collections/MutableCollection", strS0 + "/collections/List", strS0 + "/collections/MutableList", strS0 + "/collections/Set", strS0 + "/collections/MutableSet", strS0 + "/collections/Map", strS0 + "/collections/MutableMap", strS0 + "/collections/Map.Entry", strS0 + "/collections/MutableMap.MutableEntry", strS0 + "/collections/Iterator", strS0 + "/collections/MutableIterator", strS0 + "/collections/ListIterator", strS0 + "/collections/MutableListIterator");
        f47740f = listP;
        Iterable<IndexedValue> iterableD1 = r.d1(listP);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(M.d(r.x(iterableD1, 10)), 16));
        for (IndexedValue indexedValue : iterableD1) {
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
        f47741g = linkedHashMap;
    }

    public g(String[] strings, Set<Integer> localNameIndices, List<C4176a.e.c> records) {
        C3862t.g(strings, "strings");
        C3862t.g(localNameIndices, "localNameIndices");
        C3862t.g(records, "records");
        this.f47742a = strings;
        this.f47743b = localNameIndices;
        this.f47744c = records;
    }

    @Override // nb.InterfaceC4077c
    public String a(int i10) {
        return getString(i10);
    }

    @Override // nb.InterfaceC4077c
    public boolean b(int i10) {
        return this.f47743b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // nb.InterfaceC4077c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.g.getString(int):java.lang.String");
    }
}
