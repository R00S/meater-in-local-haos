package Xb;

import dc.C3102a;
import dc.C3103b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ta.InterfaceC4588d;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoroutineStart.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"LXb/K;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lta/d;", "", "block", "receiver", "completion", "Loa/F;", "j", "(LBa/p;Ljava/lang/Object;Lta/d;)V", "", "n", "()Z", "isLazy$annotations", "()V", "isLazy", "B", "C", "D", "E", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class K {

    /* renamed from: B, reason: collision with root package name */
    public static final K f19030B = new K("DEFAULT", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final K f19031C = new K("LAZY", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final K f19032D = new K("ATOMIC", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final K f19033E = new K("UNDISPATCHED", 3);

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ K[] f19034F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f19035G;

    /* compiled from: CoroutineStart.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19036a;

        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[K.f19030B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.f19032D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.f19033E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K.f19031C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19036a = iArr;
        }
    }

    static {
        K[] kArrC = c();
        f19034F = kArrC;
        f19035G = C4929b.a(kArrC);
    }

    private K(String str, int i10) {
    }

    private static final /* synthetic */ K[] c() {
        return new K[]{f19030B, f19031C, f19032D, f19033E};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f19034F.clone();
    }

    public final <R, T> void j(Ba.p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> block, R receiver, InterfaceC4588d<? super T> completion) throws Throwable {
        int i10 = a.f19036a[ordinal()];
        if (i10 == 1) {
            C3102a.d(block, receiver, completion, null, 4, null);
            return;
        }
        if (i10 == 2) {
            ta.f.b(block, receiver, completion);
        } else if (i10 == 3) {
            C3103b.a(block, receiver, completion);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean n() {
        return this == f19031C;
    }
}
