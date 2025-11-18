package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableCollection;
import okhttp3.HttpUrl;

/* compiled from: AbstractMutableCollection.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, m32267d2 = {"Lkotlin/collections/AbstractMutableCollection;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/AbstractCollection;", "()V", "add", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Object;)Z", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class AbstractMutableCollection<E> extends AbstractCollection<E> implements Collection<E>, KMutableCollection {
    protected AbstractMutableCollection() {
    }

    /* renamed from: c */
    public abstract int mo38623c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo38623c();
    }
}
