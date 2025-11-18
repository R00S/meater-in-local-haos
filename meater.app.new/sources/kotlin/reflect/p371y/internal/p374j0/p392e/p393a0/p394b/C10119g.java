package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import okhttp3.HttpUrl;

/* compiled from: JvmNameResolverBase.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.g */
/* loaded from: classes3.dex */
public class C10119g implements InterfaceC10151c {

    /* renamed from: a */
    public static final a f38599a = new a(null);

    /* renamed from: b */
    private static final String f38600b;

    /* renamed from: c */
    private static final List<String> f38601c;

    /* renamed from: d */
    private static final Map<String, Integer> f38602d;

    /* renamed from: e */
    private final String[] f38603e;

    /* renamed from: f */
    private final Set<Integer> f38604f;

    /* renamed from: g */
    private final List<C10112a.e.c> f38605g;

    /* compiled from: JvmNameResolverBase.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: JvmNameResolverBase.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.g$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38606a;

        static {
            int[] iArr = new int[C10112a.e.c.EnumC11553c.values().length];
            iArr[C10112a.e.c.EnumC11553c.NONE.ordinal()] = 1;
            iArr[C10112a.e.c.EnumC11553c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[C10112a.e.c.EnumC11553c.DESC_TO_CLASS_ID.ordinal()] = 3;
            f38606a = iArr;
        }
    }

    static {
        String strM38599e0 = C10782c0.m38599e0(C10817u.m38891m('k', 'o', 't', 'l', 'i', 'n'), HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
        f38600b = strM38599e0;
        List<String> listM38891m = C10817u.m38891m(strM38599e0 + "/Any", strM38599e0 + "/Nothing", strM38599e0 + "/Unit", strM38599e0 + "/Throwable", strM38599e0 + "/Number", strM38599e0 + "/Byte", strM38599e0 + "/Double", strM38599e0 + "/Float", strM38599e0 + "/Int", strM38599e0 + "/Long", strM38599e0 + "/Short", strM38599e0 + "/Boolean", strM38599e0 + "/Char", strM38599e0 + "/CharSequence", strM38599e0 + "/String", strM38599e0 + "/Comparable", strM38599e0 + "/Enum", strM38599e0 + "/Array", strM38599e0 + "/ByteArray", strM38599e0 + "/DoubleArray", strM38599e0 + "/FloatArray", strM38599e0 + "/IntArray", strM38599e0 + "/LongArray", strM38599e0 + "/ShortArray", strM38599e0 + "/BooleanArray", strM38599e0 + "/CharArray", strM38599e0 + "/Cloneable", strM38599e0 + "/Annotation", strM38599e0 + "/collections/Iterable", strM38599e0 + "/collections/MutableIterable", strM38599e0 + "/collections/Collection", strM38599e0 + "/collections/MutableCollection", strM38599e0 + "/collections/List", strM38599e0 + "/collections/MutableList", strM38599e0 + "/collections/Set", strM38599e0 + "/collections/MutableSet", strM38599e0 + "/collections/Map", strM38599e0 + "/collections/MutableMap", strM38599e0 + "/collections/Map.Entry", strM38599e0 + "/collections/MutableMap.MutableEntry", strM38599e0 + "/collections/Iterator", strM38599e0 + "/collections/MutableIterator", strM38599e0 + "/collections/ListIterator", strM38599e0 + "/collections/MutableListIterator");
        f38601c = listM38891m;
        Iterable<IndexedValue> iterableM38578K0 = C10782c0.m38578K0(listM38891m);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(iterableM38578K0, 10)), 16));
        for (IndexedValue indexedValue : iterableM38578K0) {
            linkedHashMap.put((String) indexedValue.m38650d(), Integer.valueOf(indexedValue.m38649c()));
        }
        f38602d = linkedHashMap;
    }

    public C10119g(String[] strArr, Set<Integer> set, List<C10112a.e.c> list) {
        C9801m.m32346f(strArr, "strings");
        C9801m.m32346f(set, "localNameIndices");
        C9801m.m32346f(list, "records");
        this.f38603e = strArr;
        this.f38604f = set;
        this.f38605g = list;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c
    /* renamed from: a */
    public String mo34253a(int i2) {
        return getString(i2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c
    /* renamed from: b */
    public boolean mo34254b(int i2) {
        return this.f38604f.contains(Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10119g.getString(int):java.lang.String");
    }
}
