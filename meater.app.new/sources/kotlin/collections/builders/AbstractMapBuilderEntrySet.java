package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: MapBuilder.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0002H&¨\u0006\f"}, m32267d2 = {"Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "K", "V", "Lkotlin/collections/AbstractMutableSet;", "()V", "contains", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/util/Map$Entry;)Z", "containsEntry", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class AbstractMapBuilderEntrySet<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m38934f((Map.Entry) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m38934f(E e2) {
        C9801m.m32346f(e2, "element");
        return mo38935h(e2);
    }

    /* renamed from: h */
    public abstract boolean mo38935h(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: i */
    public abstract /* bridge */ boolean mo38936i(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return mo38936i((Map.Entry) obj);
        }
        return false;
    }
}
