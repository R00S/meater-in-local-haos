package S;

import R.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC3822c;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: AbstractPersistentList.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LS/b;", "E", "LR/e;", "Lkotlin/collections/c;", "<init>", "()V", "", "fromIndex", "toIndex", "LR/c;", "subList", "(II)LR/c;", "", "elements", "addAll", "(Ljava/util/Collection;)LR/e;", "element", "remove", "(Ljava/lang/Object;)LR/e;", "removeAll", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b<E> extends AbstractC3822c<E> implements R.e<E> {

    /* compiled from: AbstractPersistentList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<E, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Collection<E> f15230B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f15230B = collection;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f15230B.contains(e10));
        }
    }

    @Override // java.util.Collection, java.util.List, R.e
    public R.e<E> addAll(Collection<? extends E> elements) {
        e.a<E> aVarT = t();
        aVarT.addAll(elements);
        return aVarT.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, R.e
    public R.e<E> remove(E element) {
        int iIndexOf = indexOf(element);
        return iIndexOf != -1 ? o0(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, R.e
    public R.e<E> removeAll(Collection<? extends E> elements) {
        return z1(new a(elements));
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List, R.c
    public R.c<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }
}
