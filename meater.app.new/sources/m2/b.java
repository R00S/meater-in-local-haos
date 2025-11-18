package m2;

import U1.E;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.c;
import java.io.InputStream;
import java.util.List;
import m2.InterfaceC3947a;

/* compiled from: FilteringManifestParser.java */
/* loaded from: classes.dex */
public final class b<T extends InterfaceC3947a<T>> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final c.a<? extends T> f45036a;

    /* renamed from: b, reason: collision with root package name */
    private final List<E> f45037b;

    public b(c.a<? extends T> aVar, List<E> list) {
        this.f45036a = aVar;
        this.f45037b = list;
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) {
        T tA = this.f45036a.a(uri, inputStream);
        List<E> list = this.f45037b;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f45037b);
    }
}
