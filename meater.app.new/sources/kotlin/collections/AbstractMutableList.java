package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableList;
import okhttp3.HttpUrl;

/* compiled from: AbstractMutableList.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m32267d2 = {"Lkotlin/collections/AbstractMutableList;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/AbstractList;", "()V", "add", HttpUrl.FRAGMENT_ENCODE_SET, "index", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class AbstractMutableList<E> extends AbstractList<E> implements List<E>, KMutableList {
    protected AbstractMutableList() {
    }

    /* renamed from: c */
    public abstract int mo38626c();

    /* renamed from: f */
    public abstract E mo38627f(int i2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i2) {
        return mo38627f(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo38626c();
    }
}
