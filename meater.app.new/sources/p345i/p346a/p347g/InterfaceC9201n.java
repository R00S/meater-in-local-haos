package p345i.p346a.p347g;

import java.net.InetAddress;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: NameRegister.java */
/* renamed from: i.a.g.n */
/* loaded from: classes2.dex */
public interface InterfaceC9201n {

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35434a;

        static {
            int[] iArr = new int[d.values().length];
            f35434a = iArr;
            try {
                iArr[d.HOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35434a[d.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$b */
    public static abstract class b implements InterfaceC9201n {
        /* renamed from: b */
        protected String m29707b(String str) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int iIndexOf = str.indexOf(".local.");
            int iLastIndexOf = str.lastIndexOf(45);
            int i2 = 1;
            if (iLastIndexOf < 0) {
                sb.append(str.substring(0, iIndexOf));
            } else {
                try {
                    int i3 = Integer.parseInt(str.substring(iLastIndexOf + 1, iIndexOf)) + 1;
                    sb.append(str.substring(0, iLastIndexOf));
                    i2 = i3;
                } catch (Exception unused) {
                    sb.append(str.substring(0, iIndexOf));
                }
            }
            sb.append('-');
            sb.append(i2);
            sb.append(".local.");
            return sb.toString();
        }

        /* renamed from: c */
        protected String m29708c(String str) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int iLastIndexOf = str.lastIndexOf(40);
            int iLastIndexOf2 = str.lastIndexOf(41);
            if (iLastIndexOf < 0 || iLastIndexOf >= iLastIndexOf2) {
                sb.append(str);
                sb.append(" (2)");
            } else {
                try {
                    sb.append(str.substring(0, iLastIndexOf));
                    sb.append('(');
                    sb.append(Integer.parseInt(str.substring(iLastIndexOf + 1, iLastIndexOf2)) + 1);
                    sb.append(')');
                } catch (NumberFormatException unused) {
                    sb.setLength(0);
                    sb.append(str);
                    sb.append(" (2)");
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$c */
    public static class c {

        /* renamed from: a */
        private static volatile InterfaceC9201n f35435a;

        /* renamed from: a */
        public static InterfaceC9201n m29709a() {
            if (f35435a == null) {
                f35435a = new e();
            }
            return f35435a;
        }
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$d */
    public enum d {
        HOST,
        SERVICE
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$e */
    public static class e extends b {

        /* renamed from: a */
        private final ConcurrentMap<InetAddress, String> f35439a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<InetAddress, Set<String>> f35440b = new ConcurrentHashMap();

        @Override // p345i.p346a.p347g.InterfaceC9201n
        /* renamed from: a */
        public String mo29706a(InetAddress inetAddress, String str, d dVar) {
            int i2 = a.f35434a[dVar.ordinal()];
            return i2 != 1 ? i2 != 2 ? str : m29708c(str) : m29707b(str);
        }
    }

    /* renamed from: a */
    String mo29706a(InetAddress inetAddress, String str, d dVar);
}
