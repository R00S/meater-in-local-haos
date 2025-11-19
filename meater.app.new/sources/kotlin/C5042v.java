package kotlin;

import A0.A0;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lx/v;", "Lb0/i$c;", "LA0/A0;", "", "enabled", "<init>", "(Z)V", "Loa/F;", "k2", "", "O", "Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "traverseKey", "<set-?>", "P", "Z", "j2", "()Z", "Q", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5042v extends i.c implements A0 {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: R, reason: collision with root package name */
    public static final int f52506R = 8;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx/v$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.v$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    public C5042v(boolean z10) {
        this.enabled = z10;
    }

    @Override // A0.A0
    /* renamed from: U, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* renamed from: j2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void k2(boolean enabled) {
        this.enabled = enabled;
    }
}
