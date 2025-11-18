package I9;

import e9.InterfaceC3262f;
import kotlin.Metadata;

/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LI9/t;", "", "Le9/f;", "", "number", "<init>", "(Ljava/lang/String;II)V", "B", "I", "e", "()I", "C", "D", "E", "F", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum t implements InterfaceC3262f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int number;

    t(int i10) {
        this.number = i10;
    }

    @Override // e9.InterfaceC3262f
    /* renamed from: e, reason: from getter */
    public int getNumber() {
        return this.number;
    }
}
