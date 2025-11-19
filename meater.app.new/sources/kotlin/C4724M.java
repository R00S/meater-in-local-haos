package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lv/M;", "T", "Lv/i;", "Lv/C;", "animation", "Lv/a0;", "repeatMode", "Lv/i0;", "initialStartOffset", "<init>", "(Lv/C;Lv/a0;JLkotlin/jvm/internal/k;)V", "Lv/q;", "V", "Lv/q0;", "converter", "Lv/t0;", "a", "(Lv/q0;)Lv/t0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lv/C;", "getAnimation", "()Lv/C;", "b", "Lv/a0;", "getRepeatMode", "()Lv/a0;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4724M<T> implements InterfaceC4753i<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f50604d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4710C<T> animation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC4738a0 repeatMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ C4724M(InterfaceC4710C interfaceC4710C, EnumC4738a0 enumC4738a0, long j10, C3854k c3854k) {
        this(interfaceC4710C, enumC4738a0, j10);
    }

    @Override // kotlin.InterfaceC4753i
    public <V extends AbstractC4769q> InterfaceC4776t0<V> a(InterfaceC4770q0<T, V> converter) {
        return new C4707A0(this.animation.a((InterfaceC4770q0) converter), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if (!(other instanceof C4724M)) {
            return false;
        }
        C4724M c4724m = (C4724M) other;
        return C3862t.b(c4724m.animation, this.animation) && c4724m.repeatMode == this.repeatMode && C4754i0.d(c4724m.initialStartOffset, this.initialStartOffset);
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + C4754i0.e(this.initialStartOffset);
    }

    private C4724M(InterfaceC4710C<T> interfaceC4710C, EnumC4738a0 enumC4738a0, long j10) {
        this.animation = interfaceC4710C;
        this.repeatMode = enumC4738a0;
        this.initialStartOffset = j10;
    }
}
