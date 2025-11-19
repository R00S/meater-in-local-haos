package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.A;
import com.google.android.gms.internal.wearable.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class A<MessageType extends C<MessageType, BuilderType>, BuilderType extends A<MessageType, BuilderType>> implements M0 {
    private static void f(List list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i10) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    protected static void g(Iterable iterable, List list) {
        byte[] bArr = C2689r0.f34653b;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC2706z0)) {
            if (iterable instanceof U0) {
                list.addAll((Collection) iterable);
                return;
            }
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
            if (list instanceof X0) {
                ((X0) list).h(list.size() + size);
            }
            int size2 = list.size();
            if (!(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        f(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Object obj2 = list2.get(i10);
                if (obj2 == null) {
                    f(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List listA = ((InterfaceC2706z0) iterable).a();
        InterfaceC2706z0 interfaceC2706z0 = (InterfaceC2706z0) list;
        int size4 = list.size();
        for (Object obj3 : listA) {
            if (obj3 == null) {
                String str = "Element at index " + (interfaceC2706z0.size() - size4) + " is null.";
                int size5 = interfaceC2706z0.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        throw new NullPointerException(str);
                    }
                    interfaceC2706z0.remove(size5);
                }
            } else if (obj3 instanceof P) {
                interfaceC2706z0.b();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj3;
                P.x(bArr2, 0, bArr2.length);
                interfaceC2706z0.b();
            } else {
                interfaceC2706z0.add((String) obj3);
            }
        }
    }
}
