package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Iterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.f0.y.e.j0.m.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10467c<T> implements Iterable<T>, KMappedMarker {
    private AbstractC10467c() {
    }

    public /* synthetic */ AbstractC10467c(C9789g c9789g) {
        this();
    }

    /* renamed from: c */
    public abstract int mo37188c();

    /* renamed from: f */
    public abstract void mo37189f(int i2, T t);

    public abstract T get(int i2);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
