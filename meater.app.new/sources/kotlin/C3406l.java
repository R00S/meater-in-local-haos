package kotlin;

import Ba.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavArgument.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "Lg3/k;", "Lkotlin/Function1;", "", "isArgumentMissing", "", "a", "(Ljava/util/Map;LBa/l;)Ljava/util/List;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3406l {
    public static final List<String> a(Map<String, C3405k> map, l<? super String, Boolean> isArgumentMissing) {
        C3862t.g(map, "<this>");
        C3862t.g(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C3405k> entry : map.entrySet()) {
            C3405k value = entry.getValue();
            Boolean boolValueOf = value != null ? Boolean.valueOf(value.getIsNullable()) : null;
            C3862t.d(boolValueOf);
            if (!boolValueOf.booleanValue() && !value.getIsDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (isArgumentMissing.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
