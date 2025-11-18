package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: SignatureBuildingComponents.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.x */
/* loaded from: classes3.dex */
public final class C10108x {

    /* renamed from: a */
    public static final C10108x f38488a = new C10108x();

    /* compiled from: SignatureBuildingComponents.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.x$a */
    static final class a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: f */
        public static final a f38489f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            C9801m.m32346f(str, "it");
            return C10108x.f38488a.m34046c(str);
        }
    }

    private C10108x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final String m34046c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* renamed from: b */
    public final String[] m34047b(String... strArr) {
        C9801m.m32346f(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: d */
    public final Set<String> m34048d(String str, String... strArr) {
        C9801m.m32346f(str, "internalName");
        C9801m.m32346f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Set<String> m34049e(String str, String... strArr) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(strArr, "signatures");
        return m34048d(m34052h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final Set<String> m34050f(String str, String... strArr) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(strArr, "signatures");
        return m34048d(m34053i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final String m34051g(String str) {
        C9801m.m32346f(str, "name");
        return "java/util/function/" + str;
    }

    /* renamed from: h */
    public final String m34052h(String str) {
        C9801m.m32346f(str, "name");
        return "java/lang/" + str;
    }

    /* renamed from: i */
    public final String m34053i(String str) {
        C9801m.m32346f(str, "name");
        return "java/util/" + str;
    }

    /* renamed from: j */
    public final String m34054j(String str, List<String> list, String str2) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(list, "parameters");
        C9801m.m32346f(str2, "ret");
        return str + '(' + C10782c0.m38599e0(list, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, a.f38489f, 30, null) + ')' + m34046c(str2);
    }

    /* renamed from: k */
    public final String m34055k(String str, String str2) {
        C9801m.m32346f(str, "internalName");
        C9801m.m32346f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
