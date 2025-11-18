package kotlin;

import Ba.l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010$R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b%\u0010*R\u001a\u0010.\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b-\u0010,\u001a\u0004\b\u001d\u0010*R\u0014\u00100\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010$¨\u00061"}, d2 = {"LO/H0;", "T", "", "LO/u;", "compositionLocal", "value", "", "explicitNull", "LO/l1;", "mutationPolicy", "LO/p0;", "state", "Lkotlin/Function1;", "LO/v;", "compute", "isDynamic", "<init>", "(LO/u;Ljava/lang/Object;ZLO/l1;LO/p0;LBa/l;Z)V", "h", "()LO/H0;", "a", "LO/u;", "b", "()LO/u;", "Z", "c", "LO/l1;", "e", "()LO/l1;", "d", "LO/p0;", "f", "()LO/p0;", "LBa/l;", "()LBa/l;", "i", "()Z", "g", "Ljava/lang/Object;", "providedValue", "<set-?>", "canOverride", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "j", "isStatic", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.H0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503H0<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f12626i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1572u<T> compositionLocal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean explicitNull;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l1<T> mutationPolicy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<T> state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<InterfaceC1574v, T> compute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isDynamic;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T providedValue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean canOverride = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1503H0(AbstractC1572u<T> abstractC1572u, T t10, boolean z10, l1<T> l1Var, InterfaceC1563p0<T> interfaceC1563p0, l<? super InterfaceC1574v, ? extends T> lVar, boolean z11) {
        this.compositionLocal = abstractC1572u;
        this.explicitNull = z10;
        this.mutationPolicy = l1Var;
        this.state = interfaceC1563p0;
        this.compute = lVar;
        this.isDynamic = z11;
        this.providedValue = t10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final AbstractC1572u<T> b() {
        return this.compositionLocal;
    }

    public final l<InterfaceC1574v, T> c() {
        return this.compute;
    }

    public final T d() {
        if (this.explicitNull) {
            return null;
        }
        InterfaceC1563p0<T> interfaceC1563p0 = this.state;
        if (interfaceC1563p0 != null) {
            return interfaceC1563p0.getValue();
        }
        T t10 = this.providedValue;
        if (t10 != null) {
            return t10;
        }
        C1560o.t("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final l1<T> e() {
        return this.mutationPolicy;
    }

    public final InterfaceC1563p0<T> f() {
        return this.state;
    }

    public final T g() {
        return this.providedValue;
    }

    public final C1503H0<T> h() {
        this.canOverride = false;
        return this;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final boolean j() {
        return (this.explicitNull || g() != null) && !this.isDynamic;
    }
}
