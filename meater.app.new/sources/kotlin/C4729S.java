package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import s.C4379A;
import s.C4380B;

/* compiled from: AnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u000e\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lv/S;", "T", "Lv/C;", "Lv/S$b;", "config", "<init>", "(Lv/S$b;)V", "Lv/q;", "V", "Lv/q0;", "converter", "Lv/C0;", "f", "(Lv/q0;)Lv/C0;", "a", "Lv/S$b;", "getConfig", "()Lv/S$b;", "b", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4729S<T> implements InterfaceC4710C<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<T> config;

    /* compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lv/S$a;", "T", "Lv/Q;", "value", "Lv/D;", "easing", "Lv/t;", "arcMode", "<init>", "(Ljava/lang/Object;Lv/D;ILkotlin/jvm/internal/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "I", "d", "setArcMode-Rur9ykg$animation_core_release", "(I)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.S$a */
    public static final class a<T> extends AbstractC4728Q<T> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int arcMode;

        public /* synthetic */ a(Object obj, InterfaceC4712D interfaceC4712D, int i10, C3854k c3854k) {
            this(obj, interfaceC4712D, i10);
        }

        /* renamed from: d, reason: from getter */
        public final int getArcMode() {
            return this.arcMode;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return C3862t.b(aVar.b(), b()) && C3862t.b(aVar.getEasing(), getEasing()) && C4775t.c(aVar.arcMode, this.arcMode);
        }

        public int hashCode() {
            T tB = b();
            return ((((tB != null ? tB.hashCode() : 0) * 31) + C4775t.d(this.arcMode)) * 31) + getEasing().hashCode();
        }

        public /* synthetic */ a(Object obj, InterfaceC4712D interfaceC4712D, int i10, int i11, C3854k c3854k) {
            this(obj, (i11 & 2) != 0 ? C4716F.e() : interfaceC4712D, (i11 & 4) != 0 ? C4775t.INSTANCE.a() : i10, null);
        }

        private a(T t10, InterfaceC4712D interfaceC4712D, int i10) {
            super(t10, interfaceC4712D, null);
            this.arcMode = i10;
        }
    }

    /* compiled from: AnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0096\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv/S$b;", "T", "Lv/T;", "Lv/S$a;", "<init>", "()V", "", "timeStamp", "f", "(Ljava/lang/Object;I)Lv/S$a;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.S$b */
    public static final class b<T> extends AbstractC4730T<T, a<T>> {
        public b() {
            super(null);
        }

        public a<T> f(T t10, int i10) {
            a<T> aVar = new a<>(t10, null, 0, 6, null);
            c().t(i10, aVar);
            return aVar;
        }
    }

    public C4729S(b<T> bVar) {
        this.config = bVar;
    }

    @Override // kotlin.InterfaceC4710C, kotlin.InterfaceC4753i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC4769q> C4711C0<V> a(InterfaceC4770q0<T, V> converter) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i10;
        C4379A c4379a = new C4379A(this.config.c().get_size() + 2);
        C4380B c4380b = new C4380B(this.config.c().get_size());
        C4380B<a<T>> c4380bC = this.config.c();
        int[] iArr3 = c4380bC.keys;
        Object[] objArr = c4380bC.values;
        long[] jArr3 = c4380bC.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            c4379a.i(i16);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            c4380b.t(i16, new VectorizedKeyframeSpecElementInfo(converter.a().invoke(aVar.b()), aVar.getEasing(), aVar.getArcMode(), null));
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.config.c().a(0)) {
            c4379a.h(0, 0);
        }
        if (!this.config.c().a(this.config.getDurationMillis())) {
            c4379a.i(this.config.getDurationMillis());
        }
        c4379a.p();
        return new C4711C0<>(c4379a, c4380b, this.config.getDurationMillis(), this.config.getDelayMillis(), C4716F.e(), C4775t.INSTANCE.a(), null);
    }
}
