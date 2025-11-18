package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: InternalJvm.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\n\"'\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"T", "", "list", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "Loa/F;", "redactElements", "(Ljava/util/List;Lcom/squareup/wire/ProtoAdapter;)V", "", "map", "(Ljava/util/Map;Lcom/squareup/wire/ProtoAdapter;)V", "Lcom/squareup/wire/WireEnum;", "E", "Ljava/lang/Class;", "getIdentityOrNull", "(Ljava/lang/Class;)Lcom/squareup/wire/WireEnum;", "identityOrNull", "wire-runtime"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
/* loaded from: classes2.dex */
final /* synthetic */ class Internal__InternalJvmKt {
    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        E e10;
        C3862t.g(cls, "<this>");
        E[] enumConstants = cls.getEnumConstants();
        C3862t.f(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                e10 = null;
                break;
            }
            e10 = enumConstants[i10];
            E e11 = e10;
            C3862t.e(e11, "null cannot be cast to non-null type com.squareup.wire.WireEnum");
            if (e11.getValue() == 0) {
                break;
            }
            i10++;
        }
        return e10;
    }

    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> adapter) {
        C3862t.g(list, "list");
        C3862t.g(adapter, "adapter");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.set(i10, adapter.redact(list.get(i10)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> adapter) {
        C3862t.g(map, "map");
        C3862t.g(adapter, "adapter");
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(adapter.redact(entry.getValue()));
        }
    }
}
