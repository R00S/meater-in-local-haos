package k3;

import java.util.HashSet;
import java.util.Set;
import kotlin.C3416v;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import z1.InterfaceC5167c;

/* compiled from: AppBarConfiguration.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u000b\u000fB+\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lk3/a;", "", "", "", "topLevelDestinations", "Lz1/c;", "openableLayout", "Lk3/a$b;", "fallbackOnNavigateUpListener", "<init>", "(Ljava/util/Set;Lz1/c;Lk3/a$b;)V", "a", "Ljava/util/Set;", "getTopLevelDestinations", "()Ljava/util/Set;", "b", "Lk3/a$b;", "getFallbackOnNavigateUpListener", "()Lk3/a$b;", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3790a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> topLevelDestinations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b fallbackOnNavigateUpListener;

    /* compiled from: AppBarConfiguration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lk3/a$b;", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k3.a$b */
    public interface b {
    }

    public /* synthetic */ C3790a(Set set, InterfaceC5167c interfaceC5167c, b bVar, C3854k c3854k) {
        this(set, interfaceC5167c, bVar);
    }

    private C3790a(Set<Integer> set, InterfaceC5167c interfaceC5167c, b bVar) {
        this.topLevelDestinations = set;
        this.fallbackOnNavigateUpListener = bVar;
    }

    /* compiled from: AppBarConfiguration.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lk3/a$a;", "", "Lg3/v;", "navGraph", "<init>", "(Lg3/v;)V", "Lz1/c;", "openableLayout", "c", "(Lz1/c;)Lk3/a$a;", "Lk3/a$b;", "fallbackOnNavigateUpListener", "b", "(Lk3/a$b;)Lk3/a$a;", "Lk3/a;", "a", "()Lk3/a;", "", "", "Ljava/util/Set;", "topLevelDestinations", "Lk3/a$b;", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k3.a$a, reason: collision with other inner class name */
    public static final class C0568a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<Integer> topLevelDestinations;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private b fallbackOnNavigateUpListener;

        public C0568a(C3416v navGraph) {
            C3862t.g(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.add(Integer.valueOf(C3416v.INSTANCE.b(navGraph).getId()));
        }

        public final C3790a a() {
            return new C3790a(this.topLevelDestinations, null, this.fallbackOnNavigateUpListener, 0 == true ? 1 : 0);
        }

        public final C0568a b(b fallbackOnNavigateUpListener) {
            this.fallbackOnNavigateUpListener = fallbackOnNavigateUpListener;
            return this;
        }

        public final C0568a c(InterfaceC5167c openableLayout) {
            return this;
        }
    }
}
