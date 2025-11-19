package va;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.collections.AbstractC3822c;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: EnumEntries.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lva/c;", "", "T", "Lva/a;", "Lkotlin/collections/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "index", "h", "(I)Ljava/lang/Enum;", "element", "", "c", "(Ljava/lang/Enum;)Z", "i", "(Ljava/lang/Enum;)I", "j", "B", "[Ljava/lang/Enum;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: va.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4930c<T extends Enum<T>> extends AbstractC3822c<T> implements InterfaceC4928a<T>, Serializable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final T[] entries;

    public C4930c(T[] entries) {
        C3862t.g(entries, "entries");
        this.entries = entries;
    }

    public boolean c(T element) {
        C3862t.g(element, "element");
        return ((Enum) C3831l.e0(this.entries, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return c((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a
    /* renamed from: getSize */
    public int get_size() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public T get(int index) {
        AbstractC3822c.INSTANCE.b(index, this.entries.length);
        return this.entries[index];
    }

    public int i(T element) {
        C3862t.g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C3831l.e0(this.entries, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }

    public int j(T element) {
        C3862t.g(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }
}
