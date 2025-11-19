package kotlin;

import Ba.l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LO/C;", "T", "LO/G0;", "Lkotlin/Function1;", "LO/v;", "defaultComputation", "<init>", "(LBa/l;)V", "value", "LO/H0;", "c", "(Ljava/lang/Object;)LO/H0;", "LO/D;", "b", "LO/D;", "g", "()LO/D;", "defaultValueHolder", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492C<T> extends AbstractC1501G0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComputedValueHolder<T> defaultValueHolder;

    /* compiled from: CompositionLocal.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.C$a */
    static final class a extends AbstractC3864v implements Ba.a<T> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f12600B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        public final T invoke() {
            C1560o.t("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public C1492C(l<? super InterfaceC1574v, ? extends T> lVar) {
        super(a.f12600B);
        this.defaultValueHolder = new ComputedValueHolder<>(lVar);
    }

    @Override // kotlin.AbstractC1501G0
    public C1503H0<T> c(T value) {
        return new C1503H0<>(this, value, value == null, null, null, null, true);
    }

    @Override // kotlin.AbstractC1572u
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ComputedValueHolder<T> a() {
        return this.defaultValueHolder;
    }
}
