package eb;

import hb.InterfaceC3521n;
import hb.InterfaceC3525r;
import hb.InterfaceC3530w;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: DeclaredMemberIndex.kt */
/* renamed from: eb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3271c {

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: eb.c$a */
    public static final class a implements InterfaceC3271c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40886a = new a();

        private a() {
        }

        @Override // eb.InterfaceC3271c
        public Set<qb.f> a() {
            return kotlin.collections.V.d();
        }

        @Override // eb.InterfaceC3271c
        public InterfaceC3530w b(qb.f name) {
            C3862t.g(name, "name");
            return null;
        }

        @Override // eb.InterfaceC3271c
        public InterfaceC3521n d(qb.f name) {
            C3862t.g(name, "name");
            return null;
        }

        @Override // eb.InterfaceC3271c
        public Set<qb.f> e() {
            return kotlin.collections.V.d();
        }

        @Override // eb.InterfaceC3271c
        public Set<qb.f> f() {
            return kotlin.collections.V.d();
        }

        @Override // eb.InterfaceC3271c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<InterfaceC3525r> c(qb.f name) {
            C3862t.g(name, "name");
            return kotlin.collections.r.m();
        }
    }

    Set<qb.f> a();

    InterfaceC3530w b(qb.f fVar);

    Collection<InterfaceC3525r> c(qb.f fVar);

    InterfaceC3521n d(qb.f fVar);

    Set<qb.f> e();

    Set<qb.f> f();
}
