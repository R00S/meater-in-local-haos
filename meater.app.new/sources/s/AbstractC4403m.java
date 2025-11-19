package s;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\bJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u00020\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0007\u0010 \u0012\u0004\b!\u0010\"R\u001c\u0010'\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\"R\u0011\u0010(\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b$\u0010\u000f\u0082\u0001\u0001)¨\u0006*"}, d2 = {"Ls/m;", "", "", "initialCapacity", "<init>", "(I)V", "index", "a", "(I)I", "element", "c", "", "d", "()Z", "g", "()I", "", "separator", "prefix", "postfix", "limit", "truncated", "", "e", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "getContent$annotations", "()V", "content", "b", "I", "get_size$annotations", "_size", "size", "Ls/A;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4403m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ AbstractC4403m(int i10, C3854k c3854k) {
        this(i10);
    }

    public static /* synthetic */ String f(AbstractC4403m abstractC4403m, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        return abstractC4403m.e(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public final int a(int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(index);
        sb2.append(" must be in 0..");
        sb2.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: b, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final int c(int element) {
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (element == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this._size == 0;
    }

    public final String e(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append(postfix);
                break;
            }
            int i12 = iArr[i11];
            if (i11 == limit) {
                sb2.append(truncated);
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(i12);
            i11++;
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object other) {
        if (other instanceof AbstractC4403m) {
            AbstractC4403m abstractC4403m = (AbstractC4403m) other;
            int i10 = abstractC4403m._size;
            int i11 = this._size;
            if (i10 == i11) {
                int[] iArr = this.content;
                int[] iArr2 = abstractC4403m.content;
                Ha.f fVarP = Ha.g.p(0, i11);
                int first = fVarP.getFirst();
                int last = fVarP.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int g() {
        if (d()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return f(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC4403m(int i10) {
        this.content = i10 == 0 ? r.a() : new int[i10];
    }
}
