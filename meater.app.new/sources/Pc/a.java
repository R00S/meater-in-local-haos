package Pc;

import ad.b;
import ad.c;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidLogger.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LPc/a;", "Lad/c;", "Lad/b;", "level", "<init>", "(Lad/b;)V", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Loa/F;", "b", "(Lad/b;Ljava/lang/String;)V", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends c {

    /* compiled from: AndroidLogger.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Pc.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0209a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14175a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f20456B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f20457C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f20458D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f20459E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14175a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b level) {
        super(level);
        C3862t.g(level, "level");
    }

    @Override // ad.c
    public void b(b level, String msg) {
        C3862t.g(level, "level");
        C3862t.g(msg, "msg");
        int i10 = C0209a.f14175a[level.ordinal()];
        if (i10 == 1) {
            Log.d("[Koin]", msg);
            return;
        }
        if (i10 == 2) {
            Log.i("[Koin]", msg);
            return;
        }
        if (i10 == 3) {
            Log.w("[Koin]", msg);
        } else if (i10 != 4) {
            Log.e("[Koin]", msg);
        } else {
            Log.e("[Koin]", msg);
        }
    }
}
