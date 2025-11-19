package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: FontMatcher.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LL0/v;", "", "<init>", "()V", "", "LL0/k;", "fontList", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "a", "(Ljava/util/List;LL0/B;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351v {
    public final List<InterfaceC1340k> a(List<? extends InterfaceC1340k> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1340k interfaceC1340k = fontList.get(i11);
            InterfaceC1340k interfaceC1340k2 = interfaceC1340k;
            if (C3862t.b(interfaceC1340k2.b(), fontWeight) && C1352w.f(interfaceC1340k2.c(), fontStyle)) {
                arrayList.add(interfaceC1340k);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC1340k interfaceC1340k3 = fontList.get(i12);
            if (C1352w.f(interfaceC1340k3.c(), fontStyle)) {
                arrayList2.add(interfaceC1340k3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends InterfaceC1340k> list = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.f()) < 0) {
            int size3 = list.size();
            FontWeight fontWeight3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= size3) {
                    break;
                }
                FontWeight fontWeightB = list.get(i13).b();
                if (fontWeightB.compareTo(fontWeight) >= 0) {
                    if (fontWeightB.compareTo(fontWeight) <= 0) {
                        fontWeight3 = fontWeightB;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || fontWeightB.compareTo(fontWeight3) < 0) {
                        fontWeight3 = fontWeightB;
                    }
                } else if (fontWeight2 == null || fontWeightB.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB;
                }
                i13++;
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                InterfaceC1340k interfaceC1340k4 = list.get(i10);
                if (C3862t.b(interfaceC1340k4.b(), fontWeight3)) {
                    arrayList3.add(interfaceC1340k4);
                }
                i10++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.g()) > 0) {
            int size5 = list.size();
            FontWeight fontWeight4 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size5) {
                    break;
                }
                FontWeight fontWeightB2 = list.get(i14).b();
                if (fontWeightB2.compareTo(fontWeight) >= 0) {
                    if (fontWeightB2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = fontWeightB2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || fontWeightB2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeightB2;
                    }
                } else if (fontWeight2 == null || fontWeightB2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB2;
                }
                i14++;
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i10 < size6) {
                InterfaceC1340k interfaceC1340k5 = list.get(i10);
                if (C3862t.b(interfaceC1340k5.b(), fontWeight4)) {
                    arrayList4.add(interfaceC1340k5);
                }
                i10++;
            }
            return arrayList4;
        }
        FontWeight fontWeightG = companion.g();
        int size7 = list.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i15 = 0;
        while (true) {
            if (i15 >= size7) {
                break;
            }
            FontWeight fontWeightB3 = list.get(i15).b();
            if (fontWeightG == null || fontWeightB3.compareTo(fontWeightG) <= 0) {
                if (fontWeightB3.compareTo(fontWeight) >= 0) {
                    if (fontWeightB3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = fontWeightB3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || fontWeightB3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = fontWeightB3;
                    }
                } else if (fontWeight5 == null || fontWeightB3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = fontWeightB3;
                }
            }
            i15++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i16 = 0; i16 < size8; i16++) {
            InterfaceC1340k interfaceC1340k6 = list.get(i16);
            if (C3862t.b(interfaceC1340k6.b(), fontWeight5)) {
                arrayList5.add(interfaceC1340k6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightG2 = FontWeight.INSTANCE.g();
        int size9 = list.size();
        FontWeight fontWeight7 = null;
        int i17 = 0;
        while (true) {
            if (i17 >= size9) {
                break;
            }
            FontWeight fontWeightB4 = list.get(i17).b();
            if (fontWeightG2 == null || fontWeightB4.compareTo(fontWeightG2) >= 0) {
                if (fontWeightB4.compareTo(fontWeight) >= 0) {
                    if (fontWeightB4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightB4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || fontWeightB4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = fontWeightB4;
                    }
                } else if (fontWeight2 == null || fontWeightB4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightB4;
                }
            }
            i17++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i10 < size10) {
            InterfaceC1340k interfaceC1340k7 = list.get(i10);
            if (C3862t.b(interfaceC1340k7.b(), fontWeight2)) {
                arrayList6.add(interfaceC1340k7);
            }
            i10++;
        }
        return arrayList6;
    }
}
