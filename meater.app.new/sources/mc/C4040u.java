package mc;

import ic.InterfaceC3693a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import mc.InterfaceC4038s;

/* compiled from: InlineClassDescriptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "name", "Lic/a;", "primitiveSerializer", "Lkc/f;", "a", "(Ljava/lang/String;Lic/a;)Lkc/f;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4040u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: InlineClassDescriptor.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"mc/u$a", "Lmc/s;", "", "Lic/a;", "d", "()[Lic/a;", "Llc/c;", "encoder", "value", "Loa/F;", "a", "(Llc/c;Ljava/lang/Object;)V", "Lkc/f;", "c", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mc.u$a */
    public static final class a<T> implements InterfaceC4038s<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3693a<T> f45520a;

        a(InterfaceC3693a<T> interfaceC3693a) {
            this.f45520a = interfaceC3693a;
        }

        @Override // ic.InterfaceC3698f
        public void a(lc.c encoder, T value) {
            C3862t.g(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // mc.InterfaceC4038s
        public InterfaceC3693a<?>[] b() {
            return InterfaceC4038s.a.a(this);
        }

        @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
        public kc.f c() {
            throw new IllegalStateException("unsupported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mc.InterfaceC4038s
        public InterfaceC3693a<?>[] d() {
            return new InterfaceC3693a[]{this.f45520a};
        }
    }

    public static final <T> kc.f a(String name, InterfaceC3693a<T> primitiveSerializer) {
        C3862t.g(name, "name");
        C3862t.g(primitiveSerializer, "primitiveSerializer");
        return new C4039t(name, new a(primitiveSerializer));
    }
}
