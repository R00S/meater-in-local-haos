package mc;

import ic.InterfaceC3693a;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlinx.serialization.SerializationException;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: Enums.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lmc/p;", "", "T", "Lic/a;", "", "serialName", "", "values", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "Lkc/f;", "g", "(Ljava/lang/String;)Lkc/f;", "Llc/c;", "encoder", "value", "Loa/F;", "h", "(Llc/c;Ljava/lang/Enum;)V", "toString", "()Ljava/lang/String;", "a", "[Ljava/lang/Enum;", "b", "Lkc/f;", "overriddenDescriptor", "c", "Loa/i;", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4036p<T extends Enum<T>> implements InterfaceC3693a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T[] values;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private kc.f overriddenDescriptor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i descriptor;

    /* compiled from: Enums.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkc/f;", "a", "()Lkc/f;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc.p$a */
    static final class a extends AbstractC3864v implements Ba.a<kc.f> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4036p<T> f45514B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f45515C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4036p<T> c4036p, String str) {
            super(0);
            this.f45514B = c4036p;
            this.f45515C = str;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kc.f invoke() {
            kc.f fVar = ((C4036p) this.f45514B).overriddenDescriptor;
            return fVar == null ? this.f45514B.g(this.f45515C) : fVar;
        }
    }

    public C4036p(String serialName, T[] values) {
        C3862t.g(serialName, "serialName");
        C3862t.g(values, "values");
        this.values = values;
        this.descriptor = C4165j.a(new a(this, serialName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kc.f g(String serialName) {
        C4035o c4035o = new C4035o(serialName, this.values.length);
        for (T t10 : this.values) {
            H.j(c4035o, t10.name(), false, 2, null);
        }
        return c4035o;
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    /* renamed from: c */
    public kc.f getDescriptor() {
        return (kc.f) this.descriptor.getValue();
    }

    @Override // ic.InterfaceC3698f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(lc.c encoder, T value) {
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        int iI0 = C3831l.i0(this.values, value);
        if (iI0 != -1) {
            encoder.s(getDescriptor(), iI0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().getSerialName());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.values);
        C3862t.f(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }
}
