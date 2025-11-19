package kotlin;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Stack.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0004J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0018j\b\u0012\u0004\u0012\u00028\u0000`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LO/w1;", "T", "", "<init>", "()V", "value", "", "h", "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "e", "", "index", "f", "(I)Ljava/lang/Object;", "c", "()Z", "d", "Loa/F;", "a", "", "i", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "backing", "b", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<T> backing = new ArrayList<>();

    public final void a() {
        this.backing.clear();
    }

    public final int b() {
        return this.backing.size();
    }

    public final boolean c() {
        return this.backing.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.backing.get(b() - 1);
    }

    public final T f(int index) {
        return this.backing.get(index);
    }

    public final T g() {
        return this.backing.remove(b() - 1);
    }

    public final boolean h(T value) {
        return this.backing.add(value);
    }

    public final T[] i() {
        int size = this.backing.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.backing.get(i10);
        }
        return tArr;
    }
}
