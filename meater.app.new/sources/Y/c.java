package Y;

import Y.g;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.R0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BG\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"LY/c;", "T", "LY/l;", "LO/R0;", "LY/j;", "", "saver", "LY/g;", "registry", "", "key", "value", "", "inputs", "<init>", "(LY/j;LY/g;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "Loa/F;", "h", "()V", "i", "", "a", "(Ljava/lang/Object;)Z", "d", "c", "b", "g", "([Ljava/lang/Object;)Ljava/lang/Object;", "B", "LY/j;", "C", "LY/g;", "D", "Ljava/lang/String;", "E", "Ljava/lang/Object;", "F", "[Ljava/lang/Object;", "LY/g$a;", "G", "LY/g$a;", "entry", "Lkotlin/Function0;", "H", "LBa/a;", "valueProvider", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c<T> implements l, R0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private j<T, Object> saver;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private g registry;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String key;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private T value;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Object[] inputs;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private g.a entry;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<Object> valueProvider = new a(this);

    /* compiled from: RememberSaveable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements Ba.a<Object> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c<T> f19149B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar) {
            super(0);
            this.f19149B = cVar;
        }

        @Override // Ba.a
        public final Object invoke() {
            j jVar = ((c) this.f19149B).saver;
            c<T> cVar = this.f19149B;
            Object obj = ((c) cVar).value;
            if (obj != null) {
                return jVar.b(cVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public c(j<T, Object> jVar, g gVar, String str, T t10, Object[] objArr) {
        this.saver = jVar;
        this.registry = gVar;
        this.key = str;
        this.value = t10;
        this.inputs = objArr;
    }

    private final void h() {
        g gVar = this.registry;
        if (this.entry == null) {
            if (gVar != null) {
                b.d(gVar, this.valueProvider.invoke());
                this.entry = gVar.d(this.key, this.valueProvider);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    }

    @Override // Y.l
    public boolean a(Object value) {
        g gVar = this.registry;
        return gVar == null || gVar.a(value);
    }

    @Override // kotlin.R0
    public void b() {
        g.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // kotlin.R0
    public void c() {
        g.a aVar = this.entry;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // kotlin.R0
    public void d() {
        h();
    }

    public final T g(Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }

    public final void i(j<T, Object> saver, g registry, String key, T value, Object[] inputs) {
        boolean z10;
        boolean z11 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z10 = true;
        } else {
            z10 = false;
        }
        if (C3862t.b(this.key, key)) {
            z11 = z10;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        g.a aVar = this.entry;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.entry = null;
        h();
    }
}
