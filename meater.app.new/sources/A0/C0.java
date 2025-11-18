package A0;

import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Metadata;

/* compiled from: JvmTreeSet.jvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LA0/C0;", "E", "Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "<init>", "(Ljava/util/Comparator;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C0<E> extends TreeSet<E> {
    public C0(Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int c() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
