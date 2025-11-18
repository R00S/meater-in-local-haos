package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g */
/* loaded from: classes2.dex */
public interface InterfaceC10620g extends Iterable<InterfaceC10616c>, KMappedMarker {

    /* renamed from: c */
    public static final a f40808c = a.f40809a;

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f40809a = new a();

        /* renamed from: b */
        private static final InterfaceC10620g f40810b = new C11578a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$a$a, reason: collision with other inner class name */
        public static final class C11578a implements InterfaceC10620g {
            C11578a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
            /* renamed from: R0 */
            public boolean mo33270R0(C10160c c10160c) {
                return b.m37738b(this, c10160c);
            }

            /* renamed from: c */
            public Void m37736c(C10160c c10160c) {
                C9801m.m32346f(c10160c, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<InterfaceC10616c> iterator() {
                return C10817u.m38888j().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g
            /* renamed from: l */
            public /* bridge */ /* synthetic */ InterfaceC10616c mo33271l(C10160c c10160c) {
                return (InterfaceC10616c) m37736c(c10160c);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC10620g m37734a(List<? extends InterfaceC10616c> list) {
            C9801m.m32346f(list, "annotations");
            return list.isEmpty() ? f40810b : new C10621h(list);
        }

        /* renamed from: b */
        public final InterfaceC10620g m37735b() {
            return f40810b;
        }
    }

    /* compiled from: Annotations.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.g$b */
    public static final class b {
        /* renamed from: a */
        public static InterfaceC10616c m37737a(InterfaceC10620g interfaceC10620g, C10160c c10160c) {
            InterfaceC10616c next;
            C9801m.m32346f(c10160c, "fqName");
            Iterator<InterfaceC10616c> it = interfaceC10620g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C9801m.m32341a(next.mo33162d(), c10160c)) {
                    break;
                }
            }
            return next;
        }

        /* renamed from: b */
        public static boolean m37738b(InterfaceC10620g interfaceC10620g, C10160c c10160c) {
            C9801m.m32346f(c10160c, "fqName");
            return interfaceC10620g.mo33271l(c10160c) != null;
        }
    }

    /* renamed from: R0 */
    boolean mo33270R0(C10160c c10160c);

    boolean isEmpty();

    /* renamed from: l */
    InterfaceC10616c mo33271l(C10160c c10160c);
}
