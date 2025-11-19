package g0;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FocusState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lg0/p;", "", "Lg0/o;", "<init>", "(Ljava/lang/String;I)V", "", "j", "()Z", "isFocused", "c", "hasFocus", "B", "C", "D", "E", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum p implements o {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* compiled from: FocusState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41540a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41540a = iArr;
        }
    }

    @Override // g0.o
    public boolean c() {
        int i10 = a.f41540a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // g0.o
    public boolean j() {
        int i10 = a.f41540a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
