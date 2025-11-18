package j4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import p4.WatchedVideos;
import q4.InterfaceC4289e;
import t4.InterfaceC4554d;
import ta.InterfaceC4588d;

/* compiled from: GetWatchedVideosUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096B¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lj4/d;", "Lt4/d;", "Lq4/e;", "userRepository", "<init>", "(Lq4/e;)V", "Ll4/b;", "Lp4/n;", "a", "(Lta/d;)Ljava/lang/Object;", "Lq4/e;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: j4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3742d implements InterfaceC4554d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4289e userRepository;

    public C3742d(InterfaceC4289e userRepository) {
        C3862t.g(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    @Override // t4.InterfaceC4554d
    public Object a(InterfaceC4588d<? super AbstractC3900b<WatchedVideos>> interfaceC4588d) {
        return this.userRepository.a(interfaceC4588d);
    }
}
