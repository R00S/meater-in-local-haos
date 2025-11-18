package j4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import p4.CurrentOffers;
import p4.CurrentOffersRequestInput;
import q4.InterfaceC4289e;
import t4.InterfaceC4552b;
import ta.InterfaceC4588d;

/* compiled from: CurrentOffersUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lj4/b;", "Lt4/b;", "Lq4/e;", "userRepository", "<init>", "(Lq4/e;)V", "Lp4/d;", "input", "Ll4/b;", "Lp4/c;", "a", "(Lp4/d;Lta/d;)Ljava/lang/Object;", "Lq4/e;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3740b implements InterfaceC4552b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4289e userRepository;

    public C3740b(InterfaceC4289e userRepository) {
        C3862t.g(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    @Override // t4.InterfaceC4552b
    public Object a(CurrentOffersRequestInput currentOffersRequestInput, InterfaceC4588d<? super AbstractC3900b<CurrentOffers>> interfaceC4588d) {
        return this.userRepository.d(currentOffersRequestInput, interfaceC4588d);
    }
}
