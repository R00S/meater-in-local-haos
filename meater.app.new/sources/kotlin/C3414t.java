package kotlin;

import Ba.a;
import Ba.l;
import Tb.h;
import Tb.k;
import Ub.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import h3.C3487a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C3412r;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.InterfaceC4164i;
import s.Y;
import s.a0;

/* compiled from: NavDestination.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 52\u00020\u0001:\u0002mnB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020&2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0017¢\u0006\u0004\b,\u0010-J\u0019\u00101\u001a\u0004\u0018\u0001002\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00172\b\b\u0001\u00103\u001a\u00020.2\u0006\u00104\u001a\u000200¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u000e¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u0004\u0018\u00010)2\b\u0010;\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0002H\u0016¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020.H\u0016¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010?R.\u0010P\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR$\u0010X\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u0002000]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010^R\"\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010aR,\u0010/\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020.8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010#\u001a\u0004\bE\u0010D\"\u0004\bc\u0010dR.\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010F\u001a\u0004\bZ\u0010?\"\u0004\be\u0010\u0005R\u001e\u0010h\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010gR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010?¨\u0006o"}, d2 = {"Lg3/t;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Lg3/F;", "navigator", "(Lg3/F;)V", "Lg3/r;", "deepLink", "Landroid/net/Uri;", "uri", "", "Lg3/k;", "arguments", "", "G", "(Lg3/r;Landroid/net/Uri;Ljava/util/Map;)Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Loa/F;", "K", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navDeepLink", "i", "(Lg3/r;)V", "route", "Lg3/t$b;", "J", "(Ljava/lang/String;)Lg3/t$b;", "Lg3/s;", "navDeepLinkRequest", "I", "(Lg3/s;)Lg3/t$b;", "previousDestination", "", "w", "(Lg3/t;)[I", "Landroid/os/Bundle;", "H", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "R", "()Z", "", "id", "Lg3/g;", "y", "(I)Lg3/g;", "actionId", "action", "L", "(ILg3/g;)V", "argumentName", "argument", "h", "(Ljava/lang/String;Lg3/k;)V", "args", "j", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "B", "Ljava/lang/String;", "D", "Lg3/v;", "<set-?>", "C", "Lg3/v;", "E", "()Lg3/v;", "O", "(Lg3/v;)V", "parent", "idName", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "F", "Ljava/util/List;", "deepLinks", "Ls/Y;", "Ls/Y;", "actions", "", "Ljava/util/Map;", "_arguments", "M", "(I)V", "Q", "Loa/i;", "Loa/i;", "routeDeepLink", "z", "()Ljava/util/Map;", "A", "displayName", "a", "b", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3414t {

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: M, reason: collision with root package name */
    private static final Map<String, Class<?>> f41783M = new LinkedHashMap();

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String navigatorName;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private C3416v parent;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String idName;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final List<C3412r> deepLinks;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Y<C3401g> actions;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Map<String, C3405k> _arguments;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private String route;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4164i<C3412r> routeDeepLink;

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lg3/t$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "id", "", "b", "(Landroid/content/Context;I)Ljava/lang/String;", "route", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lg3/t;", "LTb/h;", "c", "(Lg3/t;)LTb/h;", "getHierarchy$annotations", "(Lg3/t;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: NavDestination.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/t;", "it", "a", "(Lg3/t;)Lg3/t;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g3.t$a$a, reason: collision with other inner class name */
        static final class C0528a extends AbstractC3864v implements l<C3414t, C3414t> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0528a f41794B = new C0528a();

            C0528a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3414t invoke(C3414t it) {
                C3862t.g(it, "it");
                return it.getParent();
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        public final String b(Context context, int id2) throws Resources.NotFoundException {
            String strValueOf;
            C3862t.g(context, "context");
            if (id2 <= 16777215) {
                return String.valueOf(id2);
            }
            try {
                strValueOf = context.getResources().getResourceName(id2);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(id2);
            }
            C3862t.f(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        public final h<C3414t> c(C3414t c3414t) {
            C3862t.g(c3414t, "<this>");
            return k.i(c3414t, C0528a.f41794B);
        }

        private Companion() {
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lg3/t$b;", "", "Lg3/t;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Lg3/t;Landroid/os/Bundle;ZIZI)V", "other", "c", "(Lg3/t$b;)I", "arguments", "p", "(Landroid/os/Bundle;)Z", "B", "Lg3/t;", "j", "()Lg3/t;", "C", "Landroid/os/Bundle;", "n", "()Landroid/os/Bundle;", "D", "Z", "E", "I", "F", "G", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.t$b */
    public static final class b implements Comparable<b> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final C3414t destination;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final Bundle matchingArgs;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final boolean isExactDeepLink;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final int matchingPathSegments;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMatchingAction;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final int mimeTypeMatchLevel;

        public b(C3414t destination, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            C3862t.g(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z10;
            this.matchingPathSegments = i10;
            this.hasMatchingAction = z11;
            this.mimeTypeMatchLevel = i11;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            C3862t.g(other, "other");
            boolean z10 = this.isExactDeepLink;
            if (z10 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z10 && other.isExactDeepLink) {
                return -1;
            }
            int i10 = this.matchingPathSegments - other.matchingPathSegments;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                C3862t.d(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.hasMatchingAction;
            if (z11 && !other.hasMatchingAction) {
                return 1;
            }
            if (z11 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        /* renamed from: j, reason: from getter */
        public final C3414t getDestination() {
            return this.destination;
        }

        /* renamed from: n, reason: from getter */
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean p(Bundle arguments) {
            Bundle bundle;
            Object objA;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            C3862t.f(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!arguments.containsKey(key)) {
                    return false;
                }
                C3405k c3405k = (C3405k) this.destination._arguments.get(key);
                Object objA2 = null;
                AbstractC3386C<Object> abstractC3386CA = c3405k != null ? c3405k.a() : null;
                if (abstractC3386CA != null) {
                    Bundle bundle2 = this.matchingArgs;
                    C3862t.f(key, "key");
                    objA = abstractC3386CA.a(bundle2, key);
                } else {
                    objA = null;
                }
                if (abstractC3386CA != null) {
                    C3862t.f(key, "key");
                    objA2 = abstractC3386CA.a(arguments, key);
                }
                if (abstractC3386CA != null && !abstractC3386CA.j(objA, objA2)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.t$c */
    static final class c extends AbstractC3864v implements l<String, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3412r f41801B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3412r c3412r) {
            super(1);
            this.f41801B = c3412r;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            C3862t.g(key, "key");
            return Boolean.valueOf(!this.f41801B.j().contains(key));
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.t$d */
    static final class d extends AbstractC3864v implements l<String, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Bundle f41802B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f41802B = bundle;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            C3862t.g(key, "key");
            return Boolean.valueOf(!this.f41802B.containsKey(key));
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg3/r;", "a", "()Lg3/r;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.t$e */
    static final class e extends AbstractC3864v implements a<C3412r> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f41803B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f41803B = str;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3412r invoke() {
            return new C3412r.a().d(this.f41803B).a();
        }
    }

    /* compiled from: NavDestination.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.t$f */
    static final class f extends AbstractC3864v implements l<String, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3412r f41804B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3412r c3412r) {
            super(1);
            this.f41804B = c3412r;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            C3862t.g(key, "key");
            return Boolean.valueOf(!this.f41804B.j().contains(key));
        }
    }

    public C3414t(String navigatorName) {
        C3862t.g(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new Y<>(0, 1, null);
        this._arguments = new LinkedHashMap();
    }

    private final boolean G(C3412r deepLink, Uri uri, Map<String, C3405k> arguments) {
        return C3406l.a(arguments, new d(deepLink.p(uri, arguments))).isEmpty();
    }

    public static /* synthetic */ int[] x(C3414t c3414t, C3414t c3414t2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            c3414t2 = null;
        }
        return c3414t.w(c3414t2);
    }

    public String A() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    /* renamed from: B, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: D, reason: from getter */
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    /* renamed from: E, reason: from getter */
    public final C3416v getParent() {
        return this.parent;
    }

    /* renamed from: F, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final boolean H(String route, Bundle arguments) {
        C3862t.g(route, "route");
        if (C3862t.b(this.route, route)) {
            return true;
        }
        b bVarJ = J(route);
        if (C3862t.b(this, bVarJ != null ? bVarJ.getDestination() : null)) {
            return bVarJ.p(arguments);
        }
        return false;
    }

    public b I(C3413s navDeepLinkRequest) {
        C3862t.g(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (C3412r c3412r : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle bundleO = uri != null ? c3412r.o(uri, this._arguments) : null;
            int iH = c3412r.h(uri);
            String action = navDeepLinkRequest.getAction();
            boolean z10 = action != null && C3862t.b(action, c3412r.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int iU = mimeType != null ? c3412r.u(mimeType) : -1;
            if (bundleO == null) {
                if (z10 || iU > -1) {
                    if (G(c3412r, uri, this._arguments)) {
                    }
                }
            }
            b bVar2 = new b(this, bundleO, c3412r.getIsExactDeepLink(), iH, z10, iU);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public final b J(String route) {
        C3412r value;
        C3862t.g(route, "route");
        InterfaceC4164i<C3412r> interfaceC4164i = this.routeDeepLink;
        if (interfaceC4164i == null || (value = interfaceC4164i.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(INSTANCE.a(route));
        C3862t.c(uri, "Uri.parse(this)");
        Bundle bundleO = value.o(uri, this._arguments);
        if (bundleO == null) {
            return null;
        }
        return new b(this, bundleO, value.getIsExactDeepLink(), value.h(uri), false, -1);
    }

    public void K(Context context, AttributeSet attrs) {
        C3862t.g(context, "context");
        C3862t.g(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C3487a.f42332x);
        C3862t.f(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        Q(typedArrayObtainAttributes.getString(C3487a.f42308A));
        int i10 = C3487a.f42334z;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            M(typedArrayObtainAttributes.getResourceId(i10, 0));
            this.idName = INSTANCE.b(context, this.id);
        }
        this.label = typedArrayObtainAttributes.getText(C3487a.f42333y);
        C4153F c4153f = C4153F.f46609a;
        typedArrayObtainAttributes.recycle();
    }

    public final void L(int actionId, C3401g action) {
        C3862t.g(action, "action");
        if (R()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.n(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void M(int i10) {
        this.id = i10;
        this.idName = null;
    }

    public final void O(C3416v c3416v) {
        this.parent = c3416v;
    }

    public final void Q(String str) {
        if (str == null) {
            M(0);
        } else {
            if (n.a0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strA = INSTANCE.a(str);
            List<String> listA = C3406l.a(this._arguments, new f(new C3412r.a().d(strA).a()));
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listA).toString());
            }
            this.routeDeepLink = C4165j.a(new e(strA));
            M(strA.hashCode());
        }
        this.route = str;
    }

    public boolean R() {
        return true;
    }

    public boolean equals(Object other) {
        boolean z10;
        boolean z11;
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C3414t)) {
            return false;
        }
        C3414t c3414t = (C3414t) other;
        boolean zB = C3862t.b(this.deepLinks, c3414t.deepLinks);
        if (this.actions.q() != c3414t.actions.q()) {
            z10 = false;
            break;
        }
        Iterator it = k.c(a0.a(this.actions)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!C3862t.b(this.actions.g(iIntValue), c3414t.actions.g(iIntValue))) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (this._arguments.size() != c3414t._arguments.size()) {
            z11 = false;
            break;
        }
        for (Map.Entry entry : M.u(this._arguments)) {
            if (!c3414t._arguments.containsKey(entry.getKey()) || !C3862t.b(c3414t._arguments.get(entry.getKey()), entry.getValue())) {
                z11 = false;
                break;
            }
        }
        z11 = true;
        return this.id == c3414t.id && C3862t.b(this.route, c3414t.route) && zB && z10 && z11;
    }

    public final void h(String argumentName, C3405k argument) {
        C3862t.g(argumentName, "argumentName");
        C3862t.g(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.id * 31;
        String str = this.route;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (C3412r c3412r : this.deepLinks) {
            int i11 = iHashCode * 31;
            String strY = c3412r.getUriPattern();
            int iHashCode2 = (i11 + (strY != null ? strY.hashCode() : 0)) * 31;
            String strI = c3412r.getAction();
            int iHashCode3 = (iHashCode2 + (strI != null ? strI.hashCode() : 0)) * 31;
            String strT = c3412r.getMimeType();
            iHashCode = iHashCode3 + (strT != null ? strT.hashCode() : 0);
        }
        Iterator itB = a0.b(this.actions);
        while (itB.hasNext()) {
            C3401g c3401g = (C3401g) itB.next();
            int iB = ((iHashCode * 31) + c3401g.getDestinationId()) * 31;
            C3420z c3420zC = c3401g.getNavOptions();
            iHashCode = iB + (c3420zC != null ? c3420zC.hashCode() : 0);
            Bundle bundleA = c3401g.getDefaultArguments();
            if (bundleA != null && (setKeySet = bundleA.keySet()) != null) {
                C3862t.f(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i12 = iHashCode * 31;
                    Bundle bundleA2 = c3401g.getDefaultArguments();
                    C3862t.d(bundleA2);
                    Object obj = bundleA2.get(str2);
                    iHashCode = i12 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            C3405k c3405k = this._arguments.get(str3);
            iHashCode = iHashCode4 + (c3405k != null ? c3405k.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(C3412r navDeepLink) {
        C3862t.g(navDeepLink, "navDeepLink");
        List<String> listA = C3406l.a(this._arguments, new c(navDeepLink));
        if (listA.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public final Bundle j(Bundle args) {
        if (args == null && this._arguments.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, C3405k> entry : this._arguments.entrySet()) {
            entry.getValue().e(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, C3405k> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                C3405k value = entry2.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.f(key, bundle)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.a().getName() + " expected.").toString());
                }
            }
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.idName;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.id));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.route;
        if (str2 != null && !n.a0(str2)) {
            sb2.append(" route=");
            sb2.append(this.route);
        }
        if (this.label != null) {
            sb2.append(" label=");
            sb2.append(this.label);
        }
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] w(kotlin.C3414t r6) {
        /*
            r5 = this;
            kotlin.collections.k r0 = new kotlin.collections.k
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.C3862t.d(r1)
            g3.v r2 = r1.parent
            if (r6 == 0) goto L10
            g3.v r3 = r6.parent
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L24
            g3.v r3 = r6.parent
            kotlin.jvm.internal.C3862t.d(r3)
            int r4 = r1.id
            g3.t r3 = r3.T(r4)
            if (r3 != r1) goto L24
            r0.addFirst(r1)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            int r3 = r2.getStartDestId()
            int r4 = r1.id
            if (r3 == r4) goto L31
        L2e:
            r0.addFirst(r1)
        L31:
            boolean r1 = kotlin.jvm.internal.C3862t.b(r2, r6)
            if (r1 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r6 = kotlin.collections.r.W0(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.r.x(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            g3.t r1 = (kotlin.C3414t) r1
            int r1 = r1.id
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4f
        L65:
            int[] r6 = kotlin.collections.r.V0(r0)
            return r6
        L6a:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C3414t.w(g3.t):int[]");
    }

    public final C3401g y(int id2) {
        C3401g c3401gG = this.actions.h() ? null : this.actions.g(id2);
        if (c3401gG != null) {
            return c3401gG;
        }
        C3416v c3416v = this.parent;
        if (c3416v != null) {
            return c3416v.y(id2);
        }
        return null;
    }

    public final Map<String, C3405k> z() {
        return M.r(this._arguments);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3414t(AbstractC3389F<? extends C3414t> navigator) {
        this(C3390G.INSTANCE.a(navigator.getClass()));
        C3862t.g(navigator, "navigator");
    }
}
