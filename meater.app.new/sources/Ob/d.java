package Ob;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC3821b;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArrayMap.kt */
/* loaded from: classes3.dex */
public final class d<T> extends c<T> {

    /* renamed from: D, reason: collision with root package name */
    public static final a f13524D = new a(null);

    /* renamed from: B, reason: collision with root package name */
    private Object[] f13525B;

    /* renamed from: C, reason: collision with root package name */
    private int f13526C;

    /* compiled from: ArrayMap.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: ArrayMap.kt */
    public static final class b extends AbstractC3821b<T> {

        /* renamed from: D, reason: collision with root package name */
        private int f13527D = -1;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d<T> f13528E;

        b(d<T> dVar) {
            this.f13528E = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC3821b
        protected void b() {
            do {
                int i10 = this.f13527D + 1;
                this.f13527D = i10;
                if (i10 >= ((d) this.f13528E).f13525B.length) {
                    break;
                }
            } while (((d) this.f13528E).f13525B[this.f13527D] == null);
            if (this.f13527D >= ((d) this.f13528E).f13525B.length) {
                d();
                return;
            }
            Object obj = ((d) this.f13528E).f13525B[this.f13527D];
            C3862t.e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            g(obj);
        }
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f13525B = objArr;
        this.f13526C = i10;
    }

    private final void j(int i10) {
        Object[] objArr = this.f13525B;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f13525B, length);
        C3862t.f(objArrCopyOf, "copyOf(...)");
        this.f13525B = objArrCopyOf;
    }

    @Override // Ob.c
    public int c() {
        return this.f13526C;
    }

    @Override // Ob.c
    public T get(int i10) {
        return (T) C3831l.e0(this.f13525B, i10);
    }

    @Override // Ob.c
    public void h(int i10, T value) {
        C3862t.g(value, "value");
        j(i10);
        if (this.f13525B[i10] == null) {
            this.f13526C = c() + 1;
        }
        this.f13525B[i10] = value;
    }

    @Override // Ob.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
