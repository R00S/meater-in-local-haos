package kotlin;

import Ub.C1786a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavType.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b&\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006'()*+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010 ¨\u0006-"}, d2 = {"Lg3/C;", "T", "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "g", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "e", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "other", "j", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Z", "c", "()Z", "b", "Ljava/lang/String;", "name", "q", "r", "s", "t", "u", "v", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3386C<T> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC3386C<Integer> f41563d = new i();

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC3386C<Integer> f41564e = new m();

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC3386C<int[]> f41565f = new g();

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC3386C<List<Integer>> f41566g = new h();

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC3386C<Long> f41567h = new l();

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC3386C<long[]> f41568i = new j();

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC3386C<List<Long>> f41569j = new k();

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC3386C<Float> f41570k = new f();

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC3386C<float[]> f41571l = new d();

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC3386C<List<Float>> f41572m = new e();

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC3386C<Boolean> f41573n = new c();

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC3386C<boolean[]> f41574o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC3386C<List<Boolean>> f41575p = new b();

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC3386C<String> f41576q = new p();

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC3386C<String[]> f41577r = new n();

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC3386C<List<String>> f41578s = new o();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullableAllowed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name = "nav_type";

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$a", "Lg3/e;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "o", "(Ljava/lang/String;)[Z", "previousValue", "p", "(Ljava/lang/String;[Z)[Z", "other", "", "s", "([Z[Z)Z", "", "r", "([Z)Ljava/util/List;", "m", "()[Z", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$a */
    public static final class a extends AbstractC3399e<boolean[]> {
        a() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "boolean[]";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean[] k() {
            return new boolean[0];
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean[] l(String value) {
            C3862t.g(value, "value");
            return new boolean[]{AbstractC3386C.f41573n.l(value).booleanValue()};
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean[] g(String value, boolean[] previousValue) {
            boolean[] zArrE;
            C3862t.g(value, "value");
            return (previousValue == null || (zArrE = C3831l.E(previousValue, f(value))) == null) ? f(value) : zArrE;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, boolean[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putBooleanArray(key, value);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(boolean[] value) {
            List<Boolean> listK0;
            if (value == null || (listK0 = C3831l.K0(value)) == null) {
                return kotlin.collections.r.m();
            }
            List<Boolean> list = listK0;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(boolean[] value, boolean[] other) {
            return C3831l.c(value != null ? C3831l.J(value) : null, other != null ? C3831l.J(other) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"g3/C$b", "Lg3/e;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$b */
    public static final class b extends AbstractC3399e<List<? extends Boolean>> {
        b() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "List<Boolean>";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Boolean> k() {
            return kotlin.collections.r.m();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Boolean> a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return C3831l.K0(zArr);
            }
            return null;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Boolean> l(String value) {
            C3862t.g(value, "value");
            return kotlin.collections.r.e(AbstractC3386C.f41573n.l(value));
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Boolean> g(String value, List<Boolean> previousValue) {
            List<Boolean> listF0;
            C3862t.g(value, "value");
            return (previousValue == null || (listF0 = kotlin.collections.r.F0(previousValue, f(value))) == null) ? f(value) : listF0;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Boolean> value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putBooleanArray(key, value != null ? kotlin.collections.r.R0(value) : null);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Boolean> value) {
            if (value == null) {
                return kotlin.collections.r.m();
            }
            List<Boolean> list = value;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Boolean> value, List<Boolean> other) {
            return C3831l.c(value != null ? (Boolean[]) value.toArray(new Boolean[0]) : null, other != null ? (Boolean[]) other.toArray(new Boolean[0]) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/C$c", "Lg3/C;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "l", "(Ljava/lang/String;)Ljava/lang/Boolean;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$c */
    public static final class c extends AbstractC3386C<Boolean> {
        c() {
            super(false);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "boolean";
        }

        @Override // kotlin.AbstractC3386C
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Boolean bool) {
            m(bundle, str, bool.booleanValue());
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Boolean l(String value) {
            boolean z10;
            C3862t.g(value, "value");
            if (C3862t.b(value, "true")) {
                z10 = true;
            } else {
                if (!C3862t.b(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        public void m(Bundle bundle, String key, boolean value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putBoolean(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$d", "Lg3/e;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "o", "(Ljava/lang/String;)[F", "previousValue", "p", "(Ljava/lang/String;[F)[F", "other", "", "s", "([F[F)Z", "", "r", "([F)Ljava/util/List;", "m", "()[F", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$d */
    public static final class d extends AbstractC3399e<float[]> {
        d() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "float[]";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public float[] k() {
            return new float[0];
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public float[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public float[] l(String value) {
            C3862t.g(value, "value");
            return new float[]{AbstractC3386C.f41570k.l(value).floatValue()};
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public float[] g(String value, float[] previousValue) {
            float[] fArrY;
            C3862t.g(value, "value");
            return (previousValue == null || (fArrY = C3831l.y(previousValue, f(value))) == null) ? f(value) : fArrY;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, float[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putFloatArray(key, value);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(float[] value) {
            List<Float> listF0;
            if (value == null || (listF0 = C3831l.F0(value)) == null) {
                return kotlin.collections.r.m();
            }
            List<Float> list = listF0;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(float[] value, float[] other) {
            return C3831l.c(value != null ? C3831l.K(value) : null, other != null ? C3831l.K(other) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$e", "Lg3/e;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$e */
    public static final class e extends AbstractC3399e<List<? extends Float>> {
        e() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "List<Float>";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Float> k() {
            return kotlin.collections.r.m();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Float> a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return C3831l.F0(fArr);
            }
            return null;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Float> l(String value) {
            C3862t.g(value, "value");
            return kotlin.collections.r.e(AbstractC3386C.f41570k.l(value));
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Float> g(String value, List<Float> previousValue) {
            List<Float> listF0;
            C3862t.g(value, "value");
            return (previousValue == null || (listF0 = kotlin.collections.r.F0(previousValue, f(value))) == null) ? f(value) : listF0;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Float> value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putFloatArray(key, value != null ? kotlin.collections.r.T0(value) : null);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Float> value) {
            if (value == null) {
                return kotlin.collections.r.m();
            }
            List<Float> list = value;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Float> value, List<Float> other) {
            return C3831l.c(value != null ? (Float[]) value.toArray(new Float[0]) : null, other != null ? (Float[]) other.toArray(new Float[0]) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/C$f", "Lg3/C;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "l", "(Ljava/lang/String;)Ljava/lang/Float;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$f */
    public static final class f extends AbstractC3386C<Float> {
        f() {
            super(false);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "float";
        }

        @Override // kotlin.AbstractC3386C
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Float f10) {
            m(bundle, str, f10.floatValue());
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            Object obj = bundle.get(key);
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Float l(String value) {
            C3862t.g(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void m(Bundle bundle, String key, float value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putFloat(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$g", "Lg3/e;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "o", "(Ljava/lang/String;)[I", "previousValue", "p", "(Ljava/lang/String;[I)[I", "other", "", "s", "([I[I)Z", "", "r", "([I)Ljava/util/List;", "m", "()[I", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$g */
    public static final class g extends AbstractC3399e<int[]> {
        g() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "integer[]";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int[] k() {
            return new int[0];
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public int[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int[] l(String value) {
            C3862t.g(value, "value");
            return new int[]{AbstractC3386C.f41563d.l(value).intValue()};
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int[] g(String value, int[] previousValue) {
            int[] iArrA;
            C3862t.g(value, "value");
            return (previousValue == null || (iArrA = C3831l.A(previousValue, f(value))) == null) ? f(value) : iArrA;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, int[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putIntArray(key, value);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(int[] value) {
            List<Integer> listG0;
            if (value == null || (listG0 = C3831l.G0(value)) == null) {
                return kotlin.collections.r.m();
            }
            List<Integer> list = listG0;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(int[] value, int[] other) {
            return C3831l.c(value != null ? C3831l.L(value) : null, other != null ? C3831l.L(other) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$h", "Lg3/e;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$h */
    public static final class h extends AbstractC3399e<List<? extends Integer>> {
        h() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "List<Int>";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Integer> k() {
            return kotlin.collections.r.m();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Integer> a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return C3831l.G0(iArr);
            }
            return null;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Integer> l(String value) {
            C3862t.g(value, "value");
            return kotlin.collections.r.e(AbstractC3386C.f41563d.l(value));
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Integer> g(String value, List<Integer> previousValue) {
            List<Integer> listF0;
            C3862t.g(value, "value");
            return (previousValue == null || (listF0 = kotlin.collections.r.F0(previousValue, f(value))) == null) ? f(value) : listF0;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Integer> value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putIntArray(key, value != null ? kotlin.collections.r.V0(value) : null);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Integer> value) {
            if (value == null) {
                return kotlin.collections.r.m();
            }
            List<Integer> list = value;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Integer> value, List<Integer> other) {
            return C3831l.c(value != null ? (Integer[]) value.toArray(new Integer[0]) : null, other != null ? (Integer[]) other.toArray(new Integer[0]) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/C$i", "Lg3/C;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "l", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$i */
    public static final class i extends AbstractC3386C<Integer> {
        i() {
            super(false);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "integer";
        }

        @Override // kotlin.AbstractC3386C
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Integer num) {
            m(bundle, str, num.intValue());
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            Object obj = bundle.get(key);
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) throws NumberFormatException {
            int i10;
            C3862t.g(value, "value");
            if (Ub.n.G(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                C3862t.f(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, C1786a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String key, int value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putInt(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$j", "Lg3/e;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "o", "(Ljava/lang/String;)[J", "previousValue", "p", "(Ljava/lang/String;[J)[J", "other", "", "s", "([J[J)Z", "", "r", "([J)Ljava/util/List;", "m", "()[J", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$j */
    public static final class j extends AbstractC3399e<long[]> {
        j() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "long[]";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public long[] k() {
            return new long[0];
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public long[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public long[] l(String value) {
            C3862t.g(value, "value");
            return new long[]{AbstractC3386C.f41567h.l(value).longValue()};
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public long[] g(String value, long[] previousValue) {
            long[] jArrB;
            C3862t.g(value, "value");
            return (previousValue == null || (jArrB = C3831l.B(previousValue, f(value))) == null) ? f(value) : jArrB;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, long[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putLongArray(key, value);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(long[] value) {
            List<Long> listH0;
            if (value == null || (listH0 = C3831l.H0(value)) == null) {
                return kotlin.collections.r.m();
            }
            List<Long> list = listH0;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(long[] value, long[] other) {
            return C3831l.c(value != null ? C3831l.M(value) : null, other != null ? C3831l.M(other) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$k", "Lg3/e;", "", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$k */
    public static final class k extends AbstractC3399e<List<? extends Long>> {
        k() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "List<Long>";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<Long> k() {
            return kotlin.collections.r.m();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<Long> a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return C3831l.H0(jArr);
            }
            return null;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<Long> l(String value) {
            C3862t.g(value, "value");
            return kotlin.collections.r.e(AbstractC3386C.f41567h.l(value));
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<Long> g(String value, List<Long> previousValue) {
            List<Long> listF0;
            C3862t.g(value, "value");
            return (previousValue == null || (listF0 = kotlin.collections.r.F0(previousValue, f(value))) == null) ? f(value) : listF0;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<Long> value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putLongArray(key, value != null ? kotlin.collections.r.X0(value) : null);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<Long> value) {
            if (value == null) {
                return kotlin.collections.r.m();
            }
            List<Long> list = value;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<Long> value, List<Long> other) {
            return C3831l.c(value != null ? (Long[]) value.toArray(new Long[0]) : null, other != null ? (Long[]) other.toArray(new Long[0]) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/C$l", "Lg3/C;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "l", "(Ljava/lang/String;)Ljava/lang/Long;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$l */
    public static final class l extends AbstractC3386C<Long> {
        l() {
            super(false);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "long";
        }

        @Override // kotlin.AbstractC3386C
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Long l10) {
            m(bundle, str, l10.longValue());
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            Object obj = bundle.get(key);
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long l(String value) throws NumberFormatException {
            String strSubstring;
            long j10;
            C3862t.g(value, "value");
            if (Ub.n.s(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                C3862t.f(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (Ub.n.G(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                C3862t.f(strSubstring2, "substring(...)");
                j10 = Long.parseLong(strSubstring2, C1786a.a(16));
            } else {
                j10 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j10);
        }

        public void m(Bundle bundle, String key, long value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putLong(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/C$m", "Lg3/C;", "", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "l", "(Ljava/lang/String;)Ljava/lang/Integer;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$m */
    public static final class m extends AbstractC3386C<Integer> {
        m() {
            super(false);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "reference";
        }

        @Override // kotlin.AbstractC3386C
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Integer num) {
            m(bundle, str, num.intValue());
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            Object obj = bundle.get(key);
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer l(String value) throws NumberFormatException {
            int i10;
            C3862t.g(value, "value");
            if (Ub.n.G(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                C3862t.f(strSubstring, "substring(...)");
                i10 = Integer.parseInt(strSubstring, C1786a.a(16));
            } else {
                i10 = Integer.parseInt(value);
            }
            return Integer.valueOf(i10);
        }

        public void m(Bundle bundle, String key, int value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putInt(key, value);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"g3/C$n", "Lg3/e;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "o", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "p", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "other", "", "s", "([Ljava/lang/String;[Ljava/lang/String;)Z", "", "r", "([Ljava/lang/String;)Ljava/util/List;", "m", "()[Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$n */
    public static final class n extends AbstractC3399e<String[]> {
        n() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "string[]";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String[] k() {
            return new String[0];
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String[] l(String value) {
            C3862t.g(value, "value");
            return new String[]{value};
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] g(String value, String[] previousValue) {
            String[] strArr;
            C3862t.g(value, "value");
            return (previousValue == null || (strArr = (String[]) C3831l.D(previousValue, f(value))) == null) ? f(value) : strArr;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putStringArray(key, value);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(String[] value) {
            if (value == null) {
                return kotlin.collections.r.m();
            }
            ArrayList arrayList = new ArrayList(value.length);
            for (String str : value) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(String[] value, String[] other) {
            return C3831l.c(value, other);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"g3/C$o", "Lg3/e;", "", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Loa/F;", "q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "n", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "o", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "p", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "s", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "m", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$o */
    public static final class o extends AbstractC3399e<List<? extends String>> {
        o() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "List<String>";
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List<String> k() {
            return kotlin.collections.r.m();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<String> a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return C3831l.I0(strArr);
            }
            return null;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List<String> l(String value) {
            C3862t.g(value, "value");
            return kotlin.collections.r.e(value);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<String> g(String value, List<String> previousValue) {
            List<String> listF0;
            C3862t.g(value, "value");
            return (previousValue == null || (listF0 = kotlin.collections.r.F0(previousValue, f(value))) == null) ? f(value) : listF0;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, List<String> value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putStringArray(key, value != null ? (String[]) value.toArray(new String[0]) : null);
        }

        @Override // kotlin.AbstractC3399e
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<String> l(List<String> value) {
            if (value == null) {
                return kotlin.collections.r.m();
            }
            List<String> list = value;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean j(List<String> value, List<String> other) {
            return C3831l.c(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/C$p", "Lg3/C;", "", "Landroid/os/Bundle;", "bundle", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "l", "(Ljava/lang/String;)Ljava/lang/String;", "n", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$p */
    public static final class p extends AbstractC3386C<String> {
        p() {
            super(true);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            return "string";
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (String) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public String l(String value) {
            C3862t.g(value, "value");
            if (C3862t.b(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            bundle.putString(key, value);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String i(String value) {
            String strEncode = value != null ? Uri.encode(value) : null;
            return strEncode == null ? "null" : strEncode;
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0017R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0017R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010+0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0017R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lg3/C$q;", "", "<init>", "()V", "", "type", "packageName", "Lg3/C;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lg3/C;", "Ljava/lang/Class;", "clazz", "", "isArray", "d", "(Ljava/lang/Class;Z)Lg3/C;", "value", "b", "(Ljava/lang/String;)Lg3/C;", "c", "(Ljava/lang/Object;)Lg3/C;", "", "BoolArrayType", "Lg3/C;", "", "BoolListType", "BoolType", "", "FloatArrayType", "", "FloatListType", "FloatType", "", "IntArrayType", "", "IntListType", "IntType", "", "LongArrayType", "", "LongListType", "LongType", "ReferenceType", "", "StringArrayType", "StringListType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$q, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public AbstractC3386C<?> a(String type, String packageName) throws ClassNotFoundException {
            String strSubstring;
            AbstractC3386C<Integer> abstractC3386C = AbstractC3386C.f41563d;
            if (C3862t.b(abstractC3386C.getName(), type)) {
                return abstractC3386C;
            }
            AbstractC3386C abstractC3386C2 = AbstractC3386C.f41565f;
            if (C3862t.b(abstractC3386C2.getName(), type)) {
                return abstractC3386C2;
            }
            AbstractC3386C<List<Integer>> abstractC3386C3 = AbstractC3386C.f41566g;
            if (C3862t.b(abstractC3386C3.getName(), type)) {
                return abstractC3386C3;
            }
            AbstractC3386C<Long> abstractC3386C4 = AbstractC3386C.f41567h;
            if (C3862t.b(abstractC3386C4.getName(), type)) {
                return abstractC3386C4;
            }
            AbstractC3386C abstractC3386C5 = AbstractC3386C.f41568i;
            if (C3862t.b(abstractC3386C5.getName(), type)) {
                return abstractC3386C5;
            }
            AbstractC3386C<List<Long>> abstractC3386C6 = AbstractC3386C.f41569j;
            if (C3862t.b(abstractC3386C6.getName(), type)) {
                return abstractC3386C6;
            }
            AbstractC3386C<Boolean> abstractC3386C7 = AbstractC3386C.f41573n;
            if (C3862t.b(abstractC3386C7.getName(), type)) {
                return abstractC3386C7;
            }
            AbstractC3386C abstractC3386C8 = AbstractC3386C.f41574o;
            if (C3862t.b(abstractC3386C8.getName(), type)) {
                return abstractC3386C8;
            }
            AbstractC3386C<List<Boolean>> abstractC3386C9 = AbstractC3386C.f41575p;
            if (C3862t.b(abstractC3386C9.getName(), type)) {
                return abstractC3386C9;
            }
            AbstractC3386C<String> abstractC3386C10 = AbstractC3386C.f41576q;
            if (C3862t.b(abstractC3386C10.getName(), type)) {
                return abstractC3386C10;
            }
            AbstractC3386C abstractC3386C11 = AbstractC3386C.f41577r;
            if (C3862t.b(abstractC3386C11.getName(), type)) {
                return abstractC3386C11;
            }
            AbstractC3386C<List<String>> abstractC3386C12 = AbstractC3386C.f41578s;
            if (C3862t.b(abstractC3386C12.getName(), type)) {
                return abstractC3386C12;
            }
            AbstractC3386C<Float> abstractC3386C13 = AbstractC3386C.f41570k;
            if (C3862t.b(abstractC3386C13.getName(), type)) {
                return abstractC3386C13;
            }
            AbstractC3386C abstractC3386C14 = AbstractC3386C.f41571l;
            if (C3862t.b(abstractC3386C14.getName(), type)) {
                return abstractC3386C14;
            }
            AbstractC3386C<List<Float>> abstractC3386C15 = AbstractC3386C.f41572m;
            if (C3862t.b(abstractC3386C15.getName(), type)) {
                return abstractC3386C15;
            }
            AbstractC3386C<Integer> abstractC3386C16 = AbstractC3386C.f41564e;
            if (C3862t.b(abstractC3386C16.getName(), type)) {
                return abstractC3386C16;
            }
            if (type == null || type.length() == 0) {
                return abstractC3386C10;
            }
            try {
                if (!Ub.n.G(type, ".", false, 2, null) || packageName == null) {
                    strSubstring = type;
                } else {
                    strSubstring = packageName + type;
                }
                boolean zS = Ub.n.s(type, "[]", false, 2, null);
                if (zS) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    C3862t.f(strSubstring, "substring(...)");
                }
                Class<?> clazz = Class.forName(strSubstring);
                C3862t.f(clazz, "clazz");
                AbstractC3386C<?> abstractC3386CD = d(clazz, zS);
                if (abstractC3386CD != null) {
                    return abstractC3386CD;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        public final AbstractC3386C<Object> b(String value) {
            C3862t.g(value, "value");
            try {
                try {
                    try {
                        try {
                            AbstractC3386C<Integer> abstractC3386C = AbstractC3386C.f41563d;
                            abstractC3386C.l(value);
                            C3862t.e(abstractC3386C, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return abstractC3386C;
                        } catch (IllegalArgumentException unused) {
                            AbstractC3386C<Float> abstractC3386C2 = AbstractC3386C.f41570k;
                            abstractC3386C2.l(value);
                            C3862t.e(abstractC3386C2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return abstractC3386C2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        AbstractC3386C<String> abstractC3386C3 = AbstractC3386C.f41576q;
                        C3862t.e(abstractC3386C3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return abstractC3386C3;
                    }
                } catch (IllegalArgumentException unused3) {
                    AbstractC3386C<Long> abstractC3386C4 = AbstractC3386C.f41567h;
                    abstractC3386C4.l(value);
                    C3862t.e(abstractC3386C4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return abstractC3386C4;
                }
            } catch (IllegalArgumentException unused4) {
                AbstractC3386C<Boolean> abstractC3386C5 = AbstractC3386C.f41573n;
                abstractC3386C5.l(value);
                C3862t.e(abstractC3386C5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC3386C5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.AbstractC3386C<java.lang.Object> c(java.lang.Object r4) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC3386C.Companion.c(java.lang.Object):g3.C");
        }

        public final AbstractC3386C<?> d(Class<?> clazz, boolean isArray) {
            C3862t.g(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return isArray ? new s(clazz) : new t(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !isArray) {
                return new r(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return isArray ? new u(clazz) : new v(clazz);
            }
            return null;
        }

        private Companion() {
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lg3/C$r;", "", "D", "Lg3/C$v;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "n", "(Ljava/lang/String;)Ljava/lang/Enum;", "u", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$r */
    public static final class r<D extends Enum<?>> extends v<D> {

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Class<D> type) {
            super(false, type);
            C3862t.g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // kotlin.AbstractC3386C.v, kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            String name = this.type.getName();
            C3862t.f(name, "type.name");
            return name;
        }

        @Override // kotlin.AbstractC3386C.v
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D l(String value) {
            D d10;
            C3862t.g(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            C3862t.f(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (Ub.n.t(d10.name(), value, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lg3/C$s;", "Landroid/os/Parcelable;", "D", "Lg3/C;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "l", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "n", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "t", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$s */
    public static final class s<D extends Parcelable> extends AbstractC3386C<D[]> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Class<D> type) {
            super(true);
            C3862t.g(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                C3862t.e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            String name = this.arrayType.getName();
            C3862t.f(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !C3862t.b(s.class, other.getClass())) {
                return false;
            }
            return C3862t.b(this.arrayType, ((s) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public D[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // kotlin.AbstractC3386C
        public D[] l(String value) {
            C3862t.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, D[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(D[] value, D[] other) {
            return C3831l.c(value, other);
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lg3/C$t;", "D", "Lg3/C;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "h", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "a", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$t */
    public static final class t<D> extends AbstractC3386C<D> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Class<D> type) {
            super(true);
            C3862t.g(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // kotlin.AbstractC3386C
        public D a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            String name = this.type.getName();
            C3862t.f(name, "type.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !C3862t.b(t.class, other.getClass())) {
                return false;
            }
            return C3862t.b(this.type, ((t) other).type);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: f */
        public D l(String value) {
            C3862t.g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // kotlin.AbstractC3386C
        public void h(Bundle bundle, String key, D value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }

        public int hashCode() {
            return this.type.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lg3/C$u;", "Ljava/io/Serializable;", "D", "Lg3/C;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "l", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "n", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "t", "Ljava/lang/Class;", "arrayType", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$u */
    public static final class u<D extends Serializable> extends AbstractC3386C<D[]> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Class<D> type) {
            super(true);
            C3862t.g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                C3862t.e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            String name = this.arrayType.getName();
            C3862t.f(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !C3862t.b(u.class, other.getClass())) {
                return false;
            }
            return C3862t.b(this.arrayType, ((u) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public D[] a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // kotlin.AbstractC3386C
        public D[] l(String value) {
            C3862t.g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.AbstractC3386C
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, D[] value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            this.arrayType.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean j(D[] value, D[] other) {
            return C3831l.c(value, other);
        }
    }

    public AbstractC3386C(boolean z10) {
        this.isNullableAllowed = z10;
    }

    public abstract T a(Bundle bundle, String key);

    /* renamed from: b, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final T d(Bundle bundle, String key, String value) {
        C3862t.g(bundle, "bundle");
        C3862t.g(key, "key");
        C3862t.g(value, "value");
        T tL = l(value);
        h(bundle, key, tL);
        return tL;
    }

    public final T e(Bundle bundle, String key, String value, T previousValue) {
        C3862t.g(bundle, "bundle");
        C3862t.g(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (value == null) {
            return previousValue;
        }
        T tG = g(value, previousValue);
        h(bundle, key, tG);
        return tG;
    }

    /* renamed from: f */
    public abstract T l(String value);

    public T g(String value, T previousValue) {
        C3862t.g(value, "value");
        return l(value);
    }

    public abstract void h(Bundle bundle, String key, T value);

    public String i(T value) {
        return String.valueOf(value);
    }

    public boolean j(T value, T other) {
        return C3862t.b(value, other);
    }

    public String toString() {
        return getName();
    }

    /* compiled from: NavType.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lg3/C$v;", "Ljava/io/Serializable;", "D", "Lg3/C;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "Loa/F;", "m", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "k", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "l", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "Ljava/lang/Class;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.C$v */
    public static class v<D extends Serializable> extends AbstractC3386C<D> {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Class<D> type) {
            super(true);
            C3862t.g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: b */
        public String getName() {
            String name = this.type.getName();
            C3862t.f(name, "type.name");
            return name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof v) {
                return C3862t.b(this.type, ((v) other).type);
            }
            return false;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public D a(Bundle bundle, String key) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // kotlin.AbstractC3386C
        public D l(String value) {
            C3862t.g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // kotlin.AbstractC3386C
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, D value) {
            C3862t.g(bundle, "bundle");
            C3862t.g(key, "key");
            C3862t.g(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, Class<D> type) {
            super(z10);
            C3862t.g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
