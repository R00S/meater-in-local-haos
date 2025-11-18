package oc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import wa.C5013c;

/* compiled from: Headers.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 %2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002&'B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b$\u0010\u001f¨\u0006("}, d2 = {"Loc/u;", "", "Loa/o;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "index", "h", "(I)Ljava/lang/String;", "w", "", "x", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Loc/u$a;", "i", "()Loc/u$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "B", "[Ljava/lang/String;", "size", "C", "a", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements Iterable<C4170o<? extends String, ? extends String>>, Ca.a {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0007J \u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Loc/u$a;", "", "<init>", "()V", "", "line", "c", "(Ljava/lang/String;)Loc/u$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Loc/u$a;", "Loc/u;", "headers", "b", "(Loc/u;)Loc/u$a;", "d", "h", "i", "f", "(Ljava/lang/String;)Ljava/lang/String;", "e", "()Loc/u;", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> namesAndValues = new ArrayList(20);

        public final a a(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            Companion companion = u.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            d(name, value);
            return this;
        }

        public final a b(u headers) {
            C3862t.g(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(headers.h(i10), headers.w(i10));
            }
            return this;
        }

        public final a c(String line) {
            C3862t.g(line, "line");
            int iX = Ub.n.X(line, ':', 1, false, 4, null);
            if (iX != -1) {
                String strSubstring = line.substring(0, iX);
                C3862t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iX + 1);
                C3862t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                d(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                C3862t.f(strSubstring3, "this as java.lang.String).substring(startIndex)");
                d("", strSubstring3);
            } else {
                d("", line);
            }
            return this;
        }

        public final a d(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(Ub.n.U0(value).toString());
            return this;
        }

        public final u e() {
            return new u((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String f(String name) {
            C3862t.g(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iB = C5013c.b(size, 0, -2);
            if (iB > size) {
                return null;
            }
            while (!Ub.n.t(name, this.namesAndValues.get(size), true)) {
                if (size == iB) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> g() {
            return this.namesAndValues;
        }

        public final a h(String name) {
            C3862t.g(name, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (Ub.n.t(name, this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a i(String name, String value) {
            C3862t.g(name, "name");
            C3862t.g(value, "value");
            Companion companion = u.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            h(name);
            d(name, value);
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Loc/u$b;", "", "<init>", "()V", "", "", "namesAndValues", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Loa/F;", "d", "(Ljava/lang/String;)V", "value", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Loc/u;", "g", "([Ljava/lang/String;)Loc/u;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.u$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(pc.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String value, String name) {
            int length = value.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = value.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(pc.d.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), name));
                    sb2.append(pc.d.H(name) ? "" : ": " + value);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iB = C5013c.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (!Ub.n.t(name, namesAndValues[length], true)) {
                if (length == iB) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        public final u g(String... namesAndValues) {
            C3862t.g(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = Ub.n.U0(str).toString();
            }
            int iB = C5013c.b(0, strArr.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == iB) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new u(strArr, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ u(String[] strArr, C3854k c3854k) {
        this(strArr);
    }

    public static final u j(String... strArr) {
        return INSTANCE.g(strArr);
    }

    public final String c(String name) {
        C3862t.g(name, "name");
        return INSTANCE.f(this.namesAndValues, name);
    }

    public boolean equals(Object other) {
        return (other instanceof u) && Arrays.equals(this.namesAndValues, ((u) other).namesAndValues);
    }

    public final String h(int index) {
        return this.namesAndValues[index * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final a i() {
        a aVar = new a();
        kotlin.collections.r.E(aVar.g(), this.namesAndValues);
        return aVar;
    }

    @Override // java.lang.Iterable
    public Iterator<C4170o<? extends String, ? extends String>> iterator() {
        int size = size();
        C4170o[] c4170oArr = new C4170o[size];
        for (int i10 = 0; i10 < size; i10++) {
            c4170oArr[i10] = oa.v.a(h(i10), w(i10));
        }
        return C3846c.a(c4170oArr);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strH = h(i10);
            String strW = w(i10);
            sb2.append(strH);
            sb2.append(": ");
            if (pc.d.H(strH)) {
                strW = "██";
            }
            sb2.append(strW);
            sb2.append("\n");
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String w(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List<String> x(String name) {
        C3862t.g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (Ub.n.t(name, h(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(w(i10));
            }
        }
        if (arrayList == null) {
            return kotlin.collections.r.m();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C3862t.f(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private u(String[] strArr) {
        this.namesAndValues = strArr;
    }
}
