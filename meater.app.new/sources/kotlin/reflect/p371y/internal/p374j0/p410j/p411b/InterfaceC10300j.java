package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.Pair;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;

/* compiled from: ContractDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.j */
/* loaded from: classes3.dex */
public interface InterfaceC10300j {

    /* renamed from: a */
    public static final a f39908a = a.f39909a;

    /* compiled from: ContractDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.j$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f39909a = new a();

        /* renamed from: b */
        private static final InterfaceC10300j f39910b = new C11568a();

        /* compiled from: ContractDeserializer.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.j$a$a, reason: collision with other inner class name */
        public static final class C11568a implements InterfaceC10300j {
            C11568a() {
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10300j
            /* renamed from: a */
            public Pair mo36414a(C10130i c10130i, InterfaceC10738y interfaceC10738y, C10155g c10155g, C10275d0 c10275d0) {
                C9801m.m32346f(c10130i, "proto");
                C9801m.m32346f(interfaceC10738y, "ownerFunction");
                C9801m.m32346f(c10155g, "typeTable");
                C9801m.m32346f(c10275d0, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC10300j m36415a() {
            return f39910b;
        }
    }

    /* renamed from: a */
    Pair<InterfaceC10573a.a<?>, Object> mo36414a(C10130i c10130i, InterfaceC10738y interfaceC10738y, C10155g c10155g, C10275d0 c10275d0);
}
