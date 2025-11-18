package pb;

import Ub.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import wa.C5013c;

/* compiled from: ClassMapperLite.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f47721a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f47722b = r.s0(r.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f47723c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listP = r.p("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iB = C5013c.b(0, listP.size() - 1, 2);
        if (iB >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f47722b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listP.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listP.get(i11));
                linkedHashMap.put(str + '/' + ((String) listP.get(i10)) + "Array", '[' + ((String) listP.get(i11)));
                if (i10 == iB) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f47722b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : r.p("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : r.p("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f47722b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : r.p("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f47722b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f47723c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f47722b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String classId) {
        C3862t.g(classId, "classId");
        String str = f47723c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + n.B(classId, '.', '$', false, 4, null) + ';';
    }
}
