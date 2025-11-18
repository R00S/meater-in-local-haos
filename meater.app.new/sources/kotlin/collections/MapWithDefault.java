package kotlin.collections;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: MapWithDefault.kt */
@Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\bb\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J\u0015\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tR\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m32267d2 = {"Lkotlin/collections/MapWithDefault;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "map", "getMap", "()Ljava/util/Map;", "getOrImplicitDefault", RoomNotification.KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.m0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
interface MapWithDefault<K, V> extends Map<K, V>, KMappedMarker {
    /* renamed from: g */
    V m38720g(K k2);
}
