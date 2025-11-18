package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlinx.coroutines.C11045s0;
import okhttp3.HttpUrl;

/* compiled from: InlineList.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m32267d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "forEachReversed", HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lkotlin/Function1;", "forEachReversed-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode-impl", "(Ljava/lang/Object;)I", "plus", "element", "plus-FjFbRPM", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.m, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class InlineList<E> {
    /* renamed from: a */
    public static <E> Object m39534a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m39535b(Object obj, int i2, C9789g c9789g) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return m39534a(obj);
    }

    /* renamed from: c */
    public static final Object m39536c(Object obj, E e2) {
        if (C11045s0.m39681a() && !(!(e2 instanceof List))) {
            throw new AssertionError();
        }
        if (obj == null) {
            return m39534a(e2);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e2);
            return m39534a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e2);
        return m39534a(arrayList);
    }
}
