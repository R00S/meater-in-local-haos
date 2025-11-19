package e;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.M;
import g.InterfaceC3374f;
import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le/e;", "", "<init>", "()V", "LO/G0;", "Lg/f;", "b", "LO/G0;", "LocalComposition", "a", "(LO/l;I)Lg/f;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3108e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3108e f39937a = new C3108e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AbstractC1501G0<InterfaceC3374f> LocalComposition = C1576w.d(null, a.f39939B, 1, null);

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg/f;", "a", "()Lg/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.e$a */
    static final class a extends AbstractC3864v implements Ba.a<InterfaceC3374f> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f39939B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3374f invoke() {
            return null;
        }
    }

    private C3108e() {
    }

    public final InterfaceC3374f a(InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.e(1418020823);
        InterfaceC3374f interfaceC3374f = (InterfaceC3374f) interfaceC1554l.o(LocalComposition);
        if (interfaceC3374f == null) {
            Object baseContext = (Context) interfaceC1554l.o(M.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC3374f) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC3374f = (InterfaceC3374f) baseContext;
        }
        interfaceC1554l.O();
        return interfaceC3374f;
    }
}
