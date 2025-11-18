package N8;

import S8.p;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LN8/e;", "LH9/f;", "LS8/p;", "userMetadata", "<init>", "(LS8/p;)V", "LH9/e;", "rolloutsState", "Loa/F;", "a", "(LH9/e;)V", "LS8/p;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e implements H9.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p userMetadata;

    public e(p userMetadata) {
        C3862t.g(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // H9.f
    public void a(H9.e rolloutsState) {
        C3862t.g(rolloutsState, "rolloutsState");
        p pVar = this.userMetadata;
        Set<H9.d> setB = rolloutsState.b();
        C3862t.f(setB, "rolloutsState.rolloutAssignments");
        Set<H9.d> set = setB;
        ArrayList arrayList = new ArrayList(r.x(set, 10));
        for (H9.d dVar : set) {
            arrayList.add(S8.j.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        pVar.s(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
