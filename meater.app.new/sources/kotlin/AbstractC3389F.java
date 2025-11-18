package kotlin;

import Ba.l;
import Tb.k;
import android.os.Bundle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.C3414t;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Navigator.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u000b,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0014\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R$\u0010/\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lg3/F;", "Lg3/t;", "D", "", "<init>", "()V", "Lg3/H;", "state", "Loa/F;", "f", "(Lg3/H;)V", "a", "()Lg3/t;", "", "Lg3/m;", "entries", "Lg3/z;", "navOptions", "Lg3/F$a;", "navigatorExtras", "e", "(Ljava/util/List;Lg3/z;Lg3/F$a;)V", "backStackEntry", "g", "(Lg3/m;)V", "destination", "Landroid/os/Bundle;", "args", "d", "(Lg3/t;Landroid/os/Bundle;Lg3/z;Lg3/F$a;)Lg3/t;", "popUpTo", "", "savedState", "j", "(Lg3/m;Z)V", "k", "()Z", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "Lg3/H;", "_state", "<set-?>", "b", "Z", "c", "isAttached", "()Lg3/H;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3389F<D extends C3414t> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC3391H _state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lg3/F$a;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.F$a */
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg3/F$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: g3.F$b */
    public @interface b {
        String value();
    }

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg3/t;", "D", "Lg3/m;", "backStackEntry", "a", "(Lg3/m;)Lg3/m;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.F$c */
    static final class c extends AbstractC3864v implements l<C3407m, C3407m> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC3389F<D> f41591B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3420z f41592C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ a f41593D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC3389F<D> abstractC3389F, C3420z c3420z, a aVar) {
            super(1);
            this.f41591B = abstractC3389F;
            this.f41592C = c3420z;
            this.f41593D = aVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3407m invoke(C3407m backStackEntry) {
            C3414t c3414tD;
            C3862t.g(backStackEntry, "backStackEntry");
            C3414t destination = backStackEntry.getDestination();
            if (destination == null) {
                destination = null;
            }
            if (destination != null && (c3414tD = this.f41591B.d(destination, backStackEntry.d(), this.f41592C, this.f41593D)) != null) {
                return C3862t.b(c3414tD, destination) ? backStackEntry : this.f41591B.b().a(c3414tD, c3414tD.j(backStackEntry.d()));
            }
            return null;
        }
    }

    /* compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg3/t;", "D", "Lg3/A;", "Loa/F;", "a", "(Lg3/A;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.F$d */
    static final class d extends AbstractC3864v implements l<C3384A, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f41594B = new d();

        d() {
            super(1);
        }

        public final void a(C3384A navOptions) {
            C3862t.g(navOptions, "$this$navOptions");
            navOptions.d(true);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3384A c3384a) {
            a(c3384a);
            return C4153F.f46609a;
        }
    }

    public abstract D a();

    protected final AbstractC3391H b() {
        AbstractC3391H abstractC3391H = this._state;
        if (abstractC3391H != null) {
            return abstractC3391H;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public C3414t d(D destination, Bundle args, C3420z navOptions, a navigatorExtras) {
        C3862t.g(destination, "destination");
        return destination;
    }

    public void e(List<C3407m> entries, C3420z navOptions, a navigatorExtras) {
        C3862t.g(entries, "entries");
        Iterator it = k.s(k.A(r.Z(entries), new c(this, navOptions, navigatorExtras))).iterator();
        while (it.hasNext()) {
            b().k((C3407m) it.next());
        }
    }

    public void f(AbstractC3391H state) {
        C3862t.g(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void g(C3407m backStackEntry) {
        C3862t.g(backStackEntry, "backStackEntry");
        C3414t destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        d(destination, null, C3385B.a(d.f41594B), null);
        b().f(backStackEntry);
    }

    public void h(Bundle savedState) {
        C3862t.g(savedState, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(C3407m popUpTo, boolean savedState) {
        C3862t.g(popUpTo, "popUpTo");
        List<C3407m> value = b().b().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<C3407m> listIterator = value.listIterator(value.size());
        C3407m c3407mPrevious = null;
        while (k()) {
            c3407mPrevious = listIterator.previous();
            if (C3862t.b(c3407mPrevious, popUpTo)) {
                break;
            }
        }
        if (c3407mPrevious != null) {
            b().h(c3407mPrevious, savedState);
        }
    }

    public boolean k() {
        return true;
    }
}
