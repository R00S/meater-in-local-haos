package kotlin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: FontVariation.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LL0/A;", "", "", "LL0/z;", "settings", "<init>", "([LL0/z;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC1355z> settings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean needsDensity;

    public C1308A(InterfaceC1355z... interfaceC1355zArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = false;
        for (InterfaceC1355z interfaceC1355z : interfaceC1355zArr) {
            String strB = interfaceC1355z.b();
            Object arrayList = linkedHashMap.get(strB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strB, arrayList);
            }
            ((List) arrayList).add(interfaceC1355z);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + r.s0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
            }
            r.D(arrayList2, list);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.settings = arrayList3;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((InterfaceC1355z) arrayList3.get(i10)).a()) {
                z10 = true;
                break;
            }
            i10++;
        }
        this.needsDensity = z10;
    }

    public final List<InterfaceC1355z> a() {
        return this.settings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C1308A) && C3862t.b(this.settings, ((C1308A) other).settings);
    }

    public int hashCode() {
        return this.settings.hashCode();
    }
}
