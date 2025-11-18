package kotlin.collections;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
import okhttp3.HttpUrl;

/* compiled from: AbstractMutableMap.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/collections/AbstractMutableMap;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/AbstractMap;", "()V", "put", RoomNotification.KEY, "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class AbstractMutableMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, KMutableMap {
    protected AbstractMutableMap() {
    }

    /* renamed from: a */
    public abstract Set mo27885a();

    /* renamed from: b */
    public /* bridge */ Set<Object> m38633b() {
        return super.keySet();
    }

    /* renamed from: c */
    public /* bridge */ int m38634c() {
        return super.size();
    }

    /* renamed from: d */
    public /* bridge */ Collection<Object> m38635d() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo27885a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) m38633b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m38634c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) m38635d();
    }
}
