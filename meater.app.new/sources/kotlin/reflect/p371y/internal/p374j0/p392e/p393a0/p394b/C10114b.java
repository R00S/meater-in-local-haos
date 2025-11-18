package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782c0;
import kotlin.collections.C10817u;
import kotlin.internal.C10869c;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: ClassMapperLite.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.b */
/* loaded from: classes3.dex */
public final class C10114b {

    /* renamed from: a */
    public static final C10114b f38583a = new C10114b();

    /* renamed from: b */
    private static final String f38584b = C10782c0.m38599e0(C10817u.m38891m('k', 'o', 't', 'l', 'i', 'n'), HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);

    /* renamed from: c */
    private static final Map<String, String> f38585c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM38891m = C10817u.m38891m("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM39068c = C10869c.m39068c(0, listM38891m.size() - 1, 2);
        if (iM39068c >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f38584b;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM38891m.get(i2));
                int i3 = i2 + 1;
                linkedHashMap.put(sb.toString(), listM38891m.get(i3));
                linkedHashMap.put(str + '/' + ((String) listM38891m.get(i2)) + "Array", '[' + ((String) listM38891m.get(i3)));
                if (i2 == iM39068c) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        linkedHashMap.put(f38584b + "/Unit", "V");
        m34244a(linkedHashMap, "Any", "java/lang/Object");
        m34244a(linkedHashMap, "Nothing", "java/lang/Void");
        m34244a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C10817u.m38891m("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m34244a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : C10817u.m38891m("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m34244a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m34244a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m34244a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m34244a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m34244a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m34244a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i4 = 0; i4 < 23; i4++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f38584b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i4);
            m34244a(linkedHashMap, "Function" + i4, sb2.toString());
            m34244a(linkedHashMap, "reflect/KFunction" + i4, str4 + "/reflect/KFunction");
        }
        for (String str5 : C10817u.m38891m("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m34244a(linkedHashMap, str5 + ".Companion", f38584b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f38585c = linkedHashMap;
    }

    private C10114b() {
    }

    /* renamed from: a */
    private static final void m34244a(Map<String, String> map, String str, String str2) {
        map.put(f38584b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m34245b(String str) {
        C9801m.m32346f(str, "classId");
        String str2 = f38585c.get(str);
        if (str2 != null) {
            return str2;
        }
        return 'L' + C10546u.m37524z(str, '.', '$', false, 4, null) + ';';
    }
}
