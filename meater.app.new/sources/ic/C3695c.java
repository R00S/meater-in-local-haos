package ic;

import Ba.l;
import java.lang.annotation.Annotation;
import java.util.List;
import jc.C3780a;
import kc.C3817a;
import kc.C3818b;
import kc.d;
import kc.i;
import kc.j;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import mc.AbstractC4022b;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: PolymorphicSerializer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lic/c;", "", "T", "Lmc/b;", "LIa/d;", "baseClass", "<init>", "(LIa/d;)V", "", "toString", "()Ljava/lang/String;", "a", "LIa/d;", "f", "()LIa/d;", "", "", "b", "Ljava/util/List;", "_annotations", "Lkc/f;", "c", "Loa/i;", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ic.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3695c<T> extends AbstractC4022b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ia.d<T> baseClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i descriptor;

    /* compiled from: PolymorphicSerializer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkc/f;", "a", "()Lkc/f;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ic.c$a */
    static final class a extends AbstractC3864v implements Ba.a<kc.f> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3695c<T> f43307B;

        /* compiled from: PolymorphicSerializer.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkc/a;", "Loa/F;", "a", "(Lkc/a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ic.c$a$a, reason: collision with other inner class name */
        static final class C0552a extends AbstractC3864v implements l<C3817a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C3695c<T> f43308B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0552a(C3695c<T> c3695c) {
                super(1);
                this.f43308B = c3695c;
            }

            public final void a(C3817a buildSerialDescriptor) {
                C3862t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C3817a.b(buildSerialDescriptor, "type", C3780a.w(V.f43983a).getDescriptor(), null, false, 12, null);
                C3817a.b(buildSerialDescriptor, "value", i.b("kotlinx.serialization.Polymorphic<" + this.f43308B.f().r() + '>', j.a.f43917a, new kc.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(((C3695c) this.f43308B)._annotations);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C3817a c3817a) {
                a(c3817a);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3695c<T> c3695c) {
            super(0);
            this.f43307B = c3695c;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kc.f invoke() {
            return C3818b.a(i.a("kotlinx.serialization.Polymorphic", d.a.f43886a, new kc.f[0], new C0552a(this.f43307B)), this.f43307B.f());
        }
    }

    public C3695c(Ia.d<T> baseClass) {
        C3862t.g(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = r.m();
        this.descriptor = C4165j.b(EnumC4168m.f46627C, new a(this));
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    /* renamed from: c */
    public kc.f getDescriptor() {
        return (kc.f) this.descriptor.getValue();
    }

    @Override // mc.AbstractC4022b
    public Ia.d<T> f() {
        return this.baseClass;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + f() + ')';
    }
}
