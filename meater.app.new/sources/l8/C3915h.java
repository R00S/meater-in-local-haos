package l8;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: Joiner.java */
/* renamed from: l8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3915h {

    /* renamed from: a, reason: collision with root package name */
    private final String f44435a;

    /* compiled from: Joiner.java */
    /* renamed from: l8.h$a */
    class a extends C3915h {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3915h f44437c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3915h c3915h, C3915h c3915h2, String str) {
            super(c3915h2, null);
            this.f44436b = str;
            this.f44437c = c3915h;
        }

        @Override // l8.C3915h
        CharSequence i(Object obj) {
            return obj == null ? this.f44436b : this.f44437c.i(obj);
        }

        @Override // l8.C3915h
        public C3915h j(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* synthetic */ C3915h(C3915h c3915h, a aVar) {
        this(c3915h);
    }

    public static C3915h g(char c10) {
        return new C3915h(String.valueOf(c10));
    }

    public static C3915h h(String str) {
        return new C3915h(str);
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) throws IOException {
        m.l(a10);
        if (it.hasNext()) {
            a10.append(i(it.next()));
            while (it.hasNext()) {
                a10.append(this.f44435a);
                a10.append(i(it.next()));
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it) {
        return c(new StringBuilder(), it).toString();
    }

    public final String f(Object[] objArr) {
        return d(Arrays.asList(objArr));
    }

    CharSequence i(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public C3915h j(String str) {
        m.l(str);
        return new a(this, this, str);
    }

    private C3915h(String str) {
        this.f44435a = (String) m.l(str);
    }

    private C3915h(C3915h c3915h) {
        this.f44435a = c3915h.f44435a;
    }
}
