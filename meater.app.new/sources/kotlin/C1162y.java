package kotlin;

import Ba.a;
import Ba.p;
import U0.d;
import Y.j;
import Y.k;
import Y.l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LI/y;", "", "LI/z;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(LI/z;LBa/l;)V", "LU0/d;", "f", "()LU0/d;", "Loa/F;", "b", "(Lta/d;)Ljava/lang/Object;", "", "g", "()F", "LI/c;", "a", "LI/c;", "c", "()LI/c;", "anchoredDraggableState", "LU0/d;", "getDensity$material_release", "h", "(LU0/d;)V", "density", "e", "()Z", "isOpen", "d", "()LI/z;", "currentValue", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162y {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1140c<EnumC1163z> anchoredDraggableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private d density;

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LI/y$a;", "", "<init>", "()V", "Lkotlin/Function1;", "LI/z;", "", "confirmStateChange", "LY/j;", "LI/y;", "a", "(LBa/l;)LY/j;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.y$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LI/y;", "it", "LI/z;", "a", "(LY/l;LI/y;)LI/z;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.y$a$a, reason: collision with other inner class name */
        static final class C0130a extends AbstractC3864v implements p<l, C1162y, EnumC1163z> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0130a f6546B = new C0130a();

            C0130a() {
                super(2);
            }

            @Override // Ba.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC1163z invoke(l lVar, C1162y c1162y) {
                return c1162y.d();
            }
        }

        /* compiled from: Drawer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI/z;", "it", "LI/y;", "a", "(LI/z;)LI/y;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.y$a$b */
        static final class b extends AbstractC3864v implements Ba.l<EnumC1163z, C1162y> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Ba.l<EnumC1163z, Boolean> f6547B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Ba.l<? super EnumC1163z, Boolean> lVar) {
                super(1);
                this.f6547B = lVar;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1162y invoke(EnumC1163z enumC1163z) {
                return new C1162y(enumC1163z, this.f6547B);
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j<C1162y, EnumC1163z> a(Ba.l<? super EnumC1163z, Boolean> confirmStateChange) {
            return k.a(C0130a.f6546B, new b(confirmStateChange));
        }

        private Companion() {
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.y$b */
    static final class b extends AbstractC3864v implements Ba.l<Float, Float> {
        b() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(C1162y.this.f().X0(C1161x.f6478b));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.y$c */
    static final class c extends AbstractC3864v implements a<Float> {
        c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(C1162y.this.f().X0(C1161x.f6479c));
        }
    }

    public C1162y(EnumC1163z enumC1163z, Ba.l<? super EnumC1163z, Boolean> lVar) {
        this.anchoredDraggableState = new C1140c<>(enumC1163z, new b(), new c(), C1161x.f6480d, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d f() {
        d dVar = this.density;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objG = C1139b.g(this.anchoredDraggableState, EnumC1163z.Closed, 0.0f, interfaceC4588d, 2, null);
        return objG == C4696b.e() ? objG : C4153F.f46609a;
    }

    public final C1140c<EnumC1163z> c() {
        return this.anchoredDraggableState;
    }

    public final EnumC1163z d() {
        return this.anchoredDraggableState.r();
    }

    public final boolean e() {
        return d() == EnumC1163z.Open;
    }

    public final float g() {
        return this.anchoredDraggableState.z();
    }

    public final void h(d dVar) {
        this.density = dVar;
    }
}
