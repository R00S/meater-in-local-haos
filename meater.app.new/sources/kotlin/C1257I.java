package kotlin;

import h0.C3476g;
import kotlin.InterfaceC4753i;
import kotlin.InterfaceC4787z;
import kotlin.Metadata;
import t0.InterfaceC4536a;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"LK/I;", "LK/c0;", "LK/d0;", "state", "Lkotlin/Function0;", "", "canScroll", "<init>", "(LK/d0;LBa/a;)V", "a", "LK/d0;", "getState", "()LK/d0;", "b", "LBa/a;", "d", "()LBa/a;", "c", "Z", "()Z", "isPinned", "Lv/i;", "", "Lv/i;", "()Lv/i;", "snapAnimationSpec", "Lv/z;", "e", "Lv/z;", "()Lv/z;", "flingAnimationSpec", "Lt0/a;", "f", "Lt0/a;", "getNestedScrollConnection", "()Lt0/a;", "setNestedScrollConnection", "(Lt0/a;)V", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1257I implements InterfaceC1279c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1281d0 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<Boolean> canScroll;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4753i<Float> snapAnimationSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4787z<Float> flingAnimationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isPinned = true;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4536a nestedScrollConnection = new a();

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"K/I$a", "Lt0/a;", "Lh0/g;", "consumed", "available", "Lt0/e;", "source", "u1", "(JJI)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.I$a */
    public static final class a implements InterfaceC4536a {
        a() {
        }

        @Override // t0.InterfaceC4536a
        public long u1(long consumed, long available, int source) {
            if (!C1257I.this.d().invoke().booleanValue()) {
                return C3476g.INSTANCE.c();
            }
            if (C3476g.n(consumed) != 0.0f || C3476g.n(available) <= 0.0f) {
                C1281d0 state = C1257I.this.getState();
                state.g(state.c() + C3476g.n(consumed));
            } else {
                C1257I.this.getState().g(0.0f);
            }
            return C3476g.INSTANCE.c();
        }
    }

    public C1257I(C1281d0 c1281d0, Ba.a<Boolean> aVar) {
        this.state = c1281d0;
        this.canScroll = aVar;
    }

    @Override // kotlin.InterfaceC1279c0
    public InterfaceC4787z<Float> a() {
        return this.flingAnimationSpec;
    }

    @Override // kotlin.InterfaceC1279c0
    public InterfaceC4753i<Float> b() {
        return this.snapAnimationSpec;
    }

    @Override // kotlin.InterfaceC1279c0
    /* renamed from: c, reason: from getter */
    public boolean getIsPinned() {
        return this.isPinned;
    }

    public final Ba.a<Boolean> d() {
        return this.canScroll;
    }

    @Override // kotlin.InterfaceC1279c0
    public C1281d0 getState() {
        return this.state;
    }
}
