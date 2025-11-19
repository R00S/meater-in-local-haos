package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.N3;
import com.google.android.gms.internal.measurement.O3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class N3<MessageType extends O3<MessageType, BuilderType>, BuilderType extends N3<MessageType, BuilderType>> implements InterfaceC2541n5 {
    protected static <T> void m(Iterable<T> iterable, List<? super T> list) {
        I4.e(iterable);
        if (iterable instanceof U4) {
            List<?> listA = ((U4) iterable).a();
            U4 u42 = (U4) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (u42.size() - size) + " is null.";
                    for (int size2 = u42.size() - 1; size2 >= size; size2--) {
                        u42.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof Y3) {
                    u42.p0((Y3) obj);
                } else if (obj instanceof byte[]) {
                    u42.p0(Y3.v((byte[]) obj));
                } else {
                    u42.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC2604v5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof B5) {
                ((B5) list).f(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    n(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            A.B b10 = (Object) list2.get(i10);
            if (b10 == null) {
                n(list, size4);
            }
            list.add(b10);
        }
    }

    private static void n(List<?> list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        for (int size = list.size() - 1; size >= i10; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2541n5
    public final /* synthetic */ InterfaceC2541n5 a0(byte[] bArr, C2571r4 c2571r4) {
        return l(bArr, 0, bArr.length, c2571r4);
    }

    public abstract /* synthetic */ Object clone();

    public abstract BuilderType k(byte[] bArr, int i10, int i11);

    public abstract BuilderType l(byte[] bArr, int i10, int i11, C2571r4 c2571r4);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2541n5
    public final /* synthetic */ InterfaceC2541n5 r0(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }
}
