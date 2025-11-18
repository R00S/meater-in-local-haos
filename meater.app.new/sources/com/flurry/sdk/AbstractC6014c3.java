package com.flurry.sdk;

import com.flurry.sdk.C6068i2;
import com.flurry.sdk.InterfaceC6197x2;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.flurry.sdk.c3 */
/* loaded from: classes2.dex */
public abstract class AbstractC6014c3 extends C6095l2 implements InterfaceC6197x2 {

    /* renamed from: o */
    private InterfaceC6197x2 f15721o;

    /* renamed from: p */
    volatile int f15722p;

    /* renamed from: q */
    protected Queue<InterfaceC6177u6> f15723q;

    /* renamed from: r */
    protected InterfaceC6205y2 f15724r;

    /* renamed from: com.flurry.sdk.c3$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15725a;

        static {
            int[] iArr = new int[c.m13004g().length];
            f15725a = iArr;
            try {
                iArr[c.f15729f - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15725a[c.f15733j - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15725a[c.f15730g - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15725a[c.f15731h - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15725a[c.f15732i - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.c3$b */
    class b implements InterfaceC6205y2 {

        /* renamed from: com.flurry.sdk.c3$b$a */
        final class a extends AbstractRunnableC6041f2 {

            /* renamed from: com.flurry.sdk.c3$b$a$a, reason: collision with other inner class name */
            final class C11466a extends AbstractRunnableC6041f2 {
                C11466a() {
                }

                @Override // com.flurry.sdk.AbstractRunnableC6041f2
                /* renamed from: a */
                public final void mo12950a() {
                    InterfaceC6205y2 interfaceC6205y2 = AbstractC6014c3.this.f15724r;
                    if (interfaceC6205y2 != null) {
                        interfaceC6205y2.mo13003a();
                    }
                }
            }

            a() {
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() {
                AbstractC6014c3.this.m13001v();
                AbstractC6014c3.this.f15722p = c.f15732i;
                AbstractC6014c3.this.mo13007m(new C11466a());
            }
        }

        private b() {
        }

        @Override // com.flurry.sdk.InterfaceC6205y2
        /* renamed from: a */
        public final void mo13003a() {
            AbstractC6014c3.this.mo13007m(new a());
        }

        /* synthetic */ b(AbstractC6014c3 abstractC6014c3, byte b2) {
            this();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.flurry.sdk.c3$c */
    public static final class c {

        /* renamed from: f */
        public static final int f15729f = 1;

        /* renamed from: g */
        public static final int f15730g = 2;

        /* renamed from: h */
        public static final int f15731h = 3;

        /* renamed from: i */
        public static final int f15732i = 4;

        /* renamed from: j */
        public static final int f15733j = 5;

        /* renamed from: k */
        private static final /* synthetic */ int[] f15734k = {1, 2, 3, 4, 5};

        /* renamed from: g */
        public static int[] m13004g() {
            return (int[]) f15734k.clone();
        }
    }

    AbstractC6014c3(String str, InterfaceC6197x2 interfaceC6197x2) {
        super(str, C6068i2.m13111a(C6068i2.b.CORE));
        this.f15722p = c.f15729f;
        this.f15721o = interfaceC6197x2;
        this.f15723q = new ConcurrentLinkedQueue();
        this.f15722p = c.f15730g;
    }

    /* renamed from: b */
    protected abstract void mo12956b(InterfaceC6177u6 interfaceC6177u6);

    /* renamed from: c */
    public InterfaceC6197x2.a mo12957c(InterfaceC6177u6 interfaceC6177u6) {
        InterfaceC6197x2.a aVar = InterfaceC6197x2.a.ERROR;
        InterfaceC6197x2 interfaceC6197x2 = this.f15721o;
        return interfaceC6197x2 != null ? interfaceC6197x2.mo12957c(interfaceC6177u6) : aVar;
    }

    @Override // com.flurry.sdk.InterfaceC6197x2
    /* renamed from: g */
    public final void mo12998g(InterfaceC6205y2 interfaceC6205y2) {
        this.f15722p = c.f15731h;
        this.f15724r = interfaceC6205y2;
        mo13000t();
        InterfaceC6197x2 interfaceC6197x2 = this.f15721o;
        if (interfaceC6197x2 != null) {
            interfaceC6197x2.mo12998g(new b(this, (byte) 0));
            return;
        }
        if (interfaceC6205y2 != null) {
            interfaceC6205y2.mo13003a();
        }
        this.f15722p = c.f15732i;
    }

    @Override // com.flurry.sdk.InterfaceC6197x2
    /* renamed from: j */
    public final InterfaceC6197x2.a mo12999j(InterfaceC6177u6 interfaceC6177u6) {
        InterfaceC6197x2.a aVar = InterfaceC6197x2.a.ERROR;
        int i2 = a.f15725a[this.f15722p - 1];
        if (i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                return aVar;
            }
            InterfaceC6197x2.a aVar2 = InterfaceC6197x2.a.QUEUED;
            mo12956b(interfaceC6177u6);
            return aVar2;
        }
        InterfaceC6197x2.a aVar3 = InterfaceC6197x2.a.DEFERRED;
        this.f15723q.add(interfaceC6177u6);
        C6021d1.m13030c(4, "StreamingCoreModule", "Adding frame to deferred queue:" + interfaceC6177u6.mo13296d());
        return aVar3;
    }

    /* renamed from: t */
    protected void mo13000t() {
    }

    /* renamed from: v */
    protected final void m13001v() {
        while (this.f15723q.peek() != null) {
            InterfaceC6177u6 interfaceC6177u6Poll = this.f15723q.poll();
            C6021d1.m13030c(4, "StreamingCoreModule", "Processing deferred message status for module: " + interfaceC6177u6Poll.mo13296d());
            mo12956b(interfaceC6177u6Poll);
        }
    }

    /* renamed from: w */
    public final void m13002w(InterfaceC6177u6 interfaceC6177u6) {
        InterfaceC6197x2 interfaceC6197x2 = this.f15721o;
        if (interfaceC6197x2 != null) {
            C6021d1.m13030c(4, "StreamingCoreModule", "Enqueue message status for module: " + this.f15721o + " is: " + interfaceC6197x2.mo12999j(interfaceC6177u6));
        }
    }
}
