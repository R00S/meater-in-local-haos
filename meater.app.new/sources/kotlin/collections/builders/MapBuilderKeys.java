package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMutableSet;
import okhttp3.HttpUrl;

/* compiled from: MapBuilder.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\b\u0000\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010\u0015\u001a\u00020\fH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0019\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u001a\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m32267d2 = {"Lkotlin/collections/builders/MapBuilderKeys;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/AbstractMutableSet;", "backing", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "size", HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "add", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Object;)Z", "addAll", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "clear", HttpUrl.FRAGMENT_ENCODE_SET, "contains", "isEmpty", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "remove", "removeAll", "retainAll", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class MapBuilderKeys<E> extends AbstractMutableSet<E> implements Set<E>, KMutableSet {

    /* renamed from: f */
    private final MapBuilder<E, ?> f41509f;

    public MapBuilderKeys(MapBuilder<E, ?> mapBuilder) {
        C9801m.m32346f(mapBuilder, "backing");
        this.f41509f = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        C9801m.m32346f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: c */
    public int mo38643c() {
        return this.f41509f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f41509f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.f41509f.containsKey(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f41509f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f41509f.m38986D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        return this.f41509f.m38988K(element) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C9801m.m32346f(elements, "elements");
        this.f41509f.m38993k();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C9801m.m32346f(elements, "elements");
        this.f41509f.m38993k();
        return super.retainAll(elements);
    }
}
