package mc;

import ic.InterfaceC3693a;
import java.lang.annotation.Annotation;
import java.util.List;
import kc.C3817a;
import kc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: ObjectSerializer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmc/E;", "", "T", "Lic/a;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Llc/c;", "encoder", "value", "Loa/F;", "a", "(Llc/c;Ljava/lang/Object;)V", "Ljava/lang/Object;", "", "", "b", "Ljava/util/List;", "_annotations", "Lkc/f;", "c", "Loa/i;", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class E<T> implements InterfaceC3693a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T objectInstance;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends Annotation> _annotations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i descriptor;

    /* compiled from: ObjectSerializer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkc/f;", "a", "()Lkc/f;"}, k = 3, mv = {1, 9, 0})
    static final class a extends AbstractC3864v implements Ba.a<kc.f> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f45447B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ E<T> f45448C;

        /* compiled from: ObjectSerializer.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkc/a;", "Loa/F;", "a", "(Lkc/a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: mc.E$a$a, reason: collision with other inner class name */
        static final class C0616a extends AbstractC3864v implements Ba.l<C3817a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ E<T> f45449B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0616a(E<T> e10) {
                super(1);
                this.f45449B = e10;
            }

            public final void a(C3817a buildSerialDescriptor) {
                C3862t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(((E) this.f45449B)._annotations);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C3817a c3817a) {
                a(c3817a);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, E<T> e10) {
            super(0);
            this.f45447B = str;
            this.f45448C = e10;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kc.f invoke() {
            return kc.i.a(this.f45447B, k.c.f43921a, new kc.f[0], new C0616a(this.f45448C));
        }
    }

    public E(String serialName, T objectInstance) {
        C3862t.g(serialName, "serialName");
        C3862t.g(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = kotlin.collections.r.m();
        this.descriptor = C4165j.b(EnumC4168m.f46627C, new a(serialName, this));
    }

    @Override // ic.InterfaceC3698f
    public void a(lc.c encoder, T value) {
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        encoder.b(c()).p(c());
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    public kc.f c() {
        return (kc.f) this.descriptor.getValue();
    }
}
