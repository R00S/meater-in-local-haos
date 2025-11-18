package s;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ObjectList.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJY\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\r2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010\u001f\u0012\u0004\b \u0010!R\u001c\u0010%\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000b\u0010#\u0012\u0004\b$\u0010!\u0082\u0001\u0001&¨\u0006'"}, d2 = {"Ls/O;", "E", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "a", "(Ljava/lang/Object;)Z", "b", "(Ljava/lang/Object;)I", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "c", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LBa/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[Ljava/lang/Object;", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "Ls/H;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class O<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Object[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    /* compiled from: ObjectList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<E, CharSequence> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<E> f48649B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O<E> o10) {
            super(1);
            this.f48649B = o10;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e10) {
            return e10 == this.f48649B ? "(this)" : String.valueOf(e10);
        }
    }

    public /* synthetic */ O(int i10, C3854k c3854k) {
        this(i10);
    }

    public static /* synthetic */ String d(O o10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Ba.l lVar, int i11, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return o10.c(charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public final boolean a(E element) {
        return b(element) >= 0;
    }

    public final int b(E element) {
        int i10 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i11 = this._size;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        while (i10 < i12) {
            if (element.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Ba.l<? super E, ? extends CharSequence> transform) {
        C3862t.g(separator, "separator");
        C3862t.g(prefix, "prefix");
        C3862t.g(postfix, "postfix");
        C3862t.g(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append(postfix);
                break;
            }
            Object obj = objArr[i11];
            if (i11 == limit) {
                sb2.append(truncated);
                break;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            if (transform == null) {
                sb2.append(obj);
            } else {
                sb2.append(transform.invoke(obj));
            }
            i11++;
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public boolean equals(Object other) {
        if (other instanceof O) {
            O o10 = (O) other;
            int i10 = o10._size;
            int i11 = this._size;
            if (i10 == i11) {
                Object[] objArr = this.content;
                Object[] objArr2 = o10.content;
                Ha.f fVarP = Ha.g.p(0, i11);
                int first = fVarP.getFirst();
                int last = fVarP.getLast();
                if (first > last) {
                    return true;
                }
                while (C3862t.b(objArr[first], objArr2[first])) {
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

    public int hashCode() {
        Object[] objArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return d(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    private O(int i10) {
        this.content = i10 == 0 ? P.f48650a : new Object[i10];
    }
}
